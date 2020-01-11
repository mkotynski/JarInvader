package own;

import javassist.ClassPool;
import javassist.NotFoundException;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class Jar {

    static public Map<Class<?>, Boolean> classes;
    static ArrayList<String> files;
    private JarFile jarFile;
    static public ClassPool classPool;

    static public ArrayList<String> packages = new ArrayList<>();

    public void set(String name) throws IOException, NotFoundException {
        files = new ArrayList<>();
        classes = new HashMap<>();

        URL jarUrl;

        try {
            jarFile = new JarFile(name);
            jarUrl = new File(name).toURI().toURL();
        } catch (IOException e) {
            System.out.println("Bledna sciezka do pliku ziomek");
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

            System.out.println("file: "+file);
            if (file.endsWith(".class")) {
                String classname = file.replace('/', '.').substring(0, file.length() - 6);
                try {
                    Class<?> c = loader.loadClass(classname);
                    classes.put(c, false);
                } catch (Throwable e) {
                    System.out.println("WARNING: failed to instantiate " + classname + " from " + file);
                }
            } else {
                files.add(file);
            }
        }
        System.out.println("No i zajebioza - udalo ci sie zaladowac jarka :)");
        classPool = new ClassPool(ClassPool.getDefault());
        classPool.appendClassPath(name);
    }

}
