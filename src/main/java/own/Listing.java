package own;

import javassist.*;
import own.Jar;

import java.util.ArrayList;

import static own.Jar.classes;
import static own.Jar.classPool;
import static own.Jar.packages;

public class Listing {
    void getPackages() {
        ArrayList<String> localPackages = new ArrayList<>();
        String packagee;
        for (Class clz : Jar.classes.keySet()) {
            System.out.println("clz: " + clz.getName());
            packagee=clz.getName().substring(0, clz.getName().lastIndexOf("."));
            if (!localPackages.contains(packagee)) {
                localPackages.add(packagee);
            }
        }
        for(String s : packages){
            packagee = s.replace("/",".");
            packagee = packagee.substring(0, packagee.length() - 1);
            if (!localPackages.contains(packagee)) {
                localPackages.add(packagee);
            }
        }
        localPackages.forEach(System.out::println);
    }

    void getClasses() {
        for (Class aClass : classes.keySet()) {
            if(!aClass.getSimpleName().equals(""))
                System.out.println(aClass.getSimpleName());
        }
    }

    void getMethods(String className) throws NotFoundException {
        CtClass ct = classPool.get(className);
        for (CtMethod m : ct.getDeclaredMethods()) {
            System.out.println(m.getReturnType().getName() + " " + m.getLongName());
        }
    }

    void getFields(String className) throws NotFoundException {
        CtClass ct = classPool.get(className);
        for (CtField m : ct.getDeclaredFields()) {
            System.out.println(m.getName());
        }
    }

    void getCons(String className) throws NotFoundException {
        CtClass ct = classPool.get(className);
        for (CtConstructor c : ct.getDeclaredConstructors()) {
            System.out.println(c.getLongName());
        }
    }
}
