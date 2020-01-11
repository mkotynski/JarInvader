import javassist.*;

import java.util.ArrayList;
import java.util.List;

public class Listing {

    public static void packageList() {
        List<String> packages = new ArrayList<>();
        String packageName;
        for (Class<?> aClass : JarFile.classList.keySet()) {
            packageName = aClass.getName().substring(0, aClass.getName().lastIndexOf("."));
            if (!packages.contains(packageName)) packages.add(packageName);
        }
        for(String aPackage : JarFile.packageList){
            if (!packages.contains(aPackage)) {
                aPackage = aPackage.replace("/",".");
                packages.add(aPackage.substring(0, aPackage.lastIndexOf(".")));
            }
        }
        packages.forEach(System.out::println);
    }

    public static void classList() {
        for (Class<?> aClass : JarFile.classList.keySet()) {
            if ((!aClass.getSimpleName().equals("")) && aClass.getName().lastIndexOf("$") == -1) System.out.println(aClass.getName());
        }
    }

    public static void methodList(String className) throws NotFoundException {
        CtClass ct = JarFile.classPool.get(className);
        for(CtMethod method : ct.getDeclaredMethods()){
            System.out.println(method.getReturnType().getName() + " " + method.getLongName());
        }
    }

    public static void fieldList(String className) throws NotFoundException {
        CtClass ct = JarFile.classPool.get(className);
        for(CtField field : ct.getDeclaredFields()){
            System.out.println(field.getName());
        }
    }

    public static void constructorList(String className) throws NotFoundException {
        CtClass ct = JarFile.classPool.get(className);
        for (CtConstructor constructor : ct.getDeclaredConstructors()) {
            System.out.println(constructor.getLongName());
        }
    }
}
