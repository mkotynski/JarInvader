import types.MyClass;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.*;
import java.util.jar.*;

public class MyJar {
    public ArrayList<String> packageList = new ArrayList<>();
    public List<MyClass> classList = new ArrayList<>();
    public List<String> fileList = new ArrayList<>();
    public ClassPool classPool;
    private URL jarUrl;
    public static String jarName;

    public void load(String filePath) throws NotFoundException {
        JarFile jarFile = null;
        jarName = filePath;
        System.out.println(getNameJar());
        try {
            jarFile = new java.util.jar.JarFile(filePath);
            jarUrl = new File(filePath).toURI().toURL();
        } catch (IOException e) {
            System.out.println("Bledna sciezka");
            return;
        }

        URLClassLoader loader = new URLClassLoader(new URL[]{jarUrl});

        for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements(); ) {
            JarEntry entry = entries.nextElement();
            String file = entry.getName();
            if (file.endsWith("MANIFEST.MF")) {
                continue;
            }
            if (!file.substring(file.lastIndexOf("\\") + 1).trim().contains(".")) {
                continue;
            }

            if (file.endsWith(".class")) {
                String className = file.replace('/', '.').substring(0, file.length() - 6);
                MyClass myClass = new MyClass(null, false);
                try {
                    myClass.setxClass(loader.loadClass(className));
                    classList.add(myClass);
                } catch (Throwable e) {
                    e.printStackTrace();
                }
            } else {
                fileList.add(file);
            }

        }

        System.out.println("Wczytano jara " + filePath);

        classPool = new ClassPool(ClassPool.getDefault());
        classPool.appendClassPath(filePath);
    }

    public void makeJar(String jarOutputName) throws IOException, NotFoundException {

        Manifest manifest = new JarFile(jarName).getManifest();
        Attributes global = manifest.getMainAttributes();
        global.put(Attributes.Name.MANIFEST_VERSION, global.getValue(Attributes.Name.MANIFEST_VERSION));
        global.put(Attributes.Name.MAIN_CLASS, global.getValue(Attributes.Name.MAIN_CLASS));

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

        for (String name : fileList) {
            JarEntry je = new JarEntry(name);

            File file = new File(getNameJar() + "!/" + name);
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

            String entry = aClass.getxClass().getName().replace('.', '/');
            entry += ".class";
            JarEntry je = new JarEntry(entry);
            target.putNextEntry(je);
            CtClass ctClass = classPool.get(aClass.getxClass().getName());

            try {
                target.write(ctClass.toBytecode());
            } catch (CannotCompileException e) {
                e.printStackTrace();
            }

            target.closeEntry();
        }

        target.close();
        System.out.println("Utworzono nowy plik");

        target.close();
    }

    public void replaceClass(String jarName, byte[] fileByteCode, String fileName) throws IOException {
        int bytesRead;
        byte[] buffer = new byte[1024];

        File jarFile = new File(jarName);
        File tempJarFile = new File(jarName + ".tmp");

        JarFile jar = new JarFile(jarFile);
        JarEntry entry = new JarEntry(fileName);
        JarOutputStream tempJar = new JarOutputStream(new FileOutputStream(tempJarFile));

        tempJar.putNextEntry(entry);
        tempJar.write(fileByteCode);

        InputStream entryStream = null;
        Enumeration<JarEntry> entries = jar.entries();

        while (entries.hasMoreElements()) {
            entry = entries.nextElement();
            if (!entry.getName().equals(fileName)) {
                entryStream = jar.getInputStream(entry);
                tempJar.putNextEntry(entry);

                while ((bytesRead = entryStream.read(buffer)) != -1) {
                    tempJar.write(buffer, 0, bytesRead);
                }
            }
        }

        if (entryStream != null) {
            entryStream.close();
        }
        tempJar.close();
        jar.close();
        jarFile.delete();
        tempJarFile.renameTo(jarFile);
    }

    public void updateJar(CtClass c, String fullName) throws Exception {
        File file = new File(jarName);
        fullName = fullName.replace('.', '/') + ".class";
        replaceClass(file.getAbsolutePath(), c.toBytecode(), fullName);
        c.defrost();
    }

    private String getNameJar(){
        String jn = jarName;
        if(jn.lastIndexOf("/") != -1) jn = jn.substring(jn.lastIndexOf("/")+1,jn.length());
        return jn;
    }


}
