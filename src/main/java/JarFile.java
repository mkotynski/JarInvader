import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.jar.*;

public class JarFile {
    public static ArrayList<String> packageList = new ArrayList<>();
    public static List<MyClass> classList = new ArrayList<>();
    public static List<String> fileList = new ArrayList<>();
    public static ClassPool classPool;
    URL jarUrl;
    File file;

    public void load(String filePath) throws IOException, NotFoundException {

        try {
            jarUrl = new File(filePath).toURI().toURL();
            file = new File(filePath);
        } catch (Exception e) {
            System.out.println("Nie wczytano jara");
            return;
        }
        URLClassLoader classLoader = new URLClassLoader(new URL[]{jarUrl});
        FileInputStream fis = new FileInputStream(file);
        JarInputStream jis = new JarInputStream(fis);
        JarEntry je;
        while ((je = jis.getNextJarEntry()) != null) {
            String fileName = je.getName();
            if (fileName.endsWith("MANISFEST.MF")) continue;
            if (!fileName.substring(fileName.lastIndexOf("\\") + 1).trim().contains(".")) continue;

            if (fileName.endsWith(".class")) {
                String className = fileName.replace("/", ".").substring(0, fileName.length() - 6);
                //Class<?> c = null;
                MyClass myClass = new MyClass(null,false);
                try {
                    myClass.setxClass(classLoader.loadClass(className));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                classList.add(myClass);
            }
            fileList.add(fileName);
        }
        System.out.println("Wczytano jara " + filePath);
        jis.close();

        classPool = new ClassPool(ClassPool.getDefault());
        classPool.appendClassPath(filePath);
    }

    public void makeJar(String jarOutputName) throws IOException, NotFoundException {


        String version = "1.0.0";
        String author = "ArturKisicki";
        Manifest manifest = new Manifest();
        Attributes global = manifest.getMainAttributes();
        global.put(Attributes.Name.MANIFEST_VERSION, version);

        global.put(Attributes.Name.MAIN_CLASS, "com.diamond.iain.javagame.Game");

        JarOutputStream target = null;
        try {
            File jarFile = new File(jarOutputName);
            OutputStream os = new FileOutputStream(jarFile);
            target = new JarOutputStream(os, manifest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int len = 0;
        byte[] buffer = new byte[1024];

        String jarName = "Invaders.jar";

        for (String name : fileList) {

            JarEntry je = new JarEntry(name);

            File file = new File(jarName + "!/" + name);
            je.setComment("Craeting Jar");
            je.setTime(Calendar.getInstance().getTimeInMillis());
            target.putNextEntry(je);

            URL url = file.toURI().toURL();
            url = new URL("jar:" + url.toString());

            InputStream is = url.openStream();
            while ((len = is.read(buffer, 0, buffer.length)) != -1) {
                target.write(buffer, 0, len);
            }
            is.close();
            target.closeEntry();
        }
        for (String s : packageList) {
            JarEntry je = new JarEntry(s);
            target.putNextEntry(je);
        }

        for (MyClass aClass : classList) {
            if(aClass.isAdded()) {
                String entry = aClass.getxClass().getName().replace('.', '/');
                entry += ".class";
                JarEntry je = new JarEntry(entry);
                je.setComment("Craeting Jar");
                je.setTime(Calendar.getInstance().getTimeInMillis());
                target.putNextEntry(je);
                //write the bytes of file into jar
                CtClass ctClass = classPool.get(aClass.getxClass().getName());

                try {
                    target.write(ctClass.toBytecode());
                } catch (CannotCompileException e) {
                    e.printStackTrace();
                }

                target.closeEntry();
            }
        }

        target.close();
        System.out.println("Plik zostal zapisany");

        target.close();
    }

}
