import types.MyClass;
import javassist.*;

import java.util.ArrayList;
import java.util.List;

public class ListingJar {

    public void packageList() {
        List<String> packages = new ArrayList<>();
        String packageName;
        for (MyClass myClass : Engine.myJar.classList) {
            if(myClass.getxClass().getName().lastIndexOf(".") == -1) continue;
            packageName = myClass.getxClass().getName().substring(0, myClass.getxClass().getName().lastIndexOf("."));
            if (!packages.contains(packageName)) packages.add(packageName);
        }
//        for (String aPackage : MyJar.packageList) {
//            if (!packages.contains(aPackage)) {
//                aPackage = aPackage.replace("/", ".");
//                packages.add(aPackage.substring(0, aPackage.lastIndexOf(".")));
//            }
//        }
        packages.forEach(System.out::println);
    }

    public void classList() {
        for (MyClass myClass : Engine.myJar.classList) {
            if ((!myClass.getxClass().getSimpleName().equals("")) && myClass.getxClass().getName().lastIndexOf("$") == -1)
                System.out.println(myClass.getxClass().getName());
        }
    }

    public void methodList(String className) throws NotFoundException {
        CtClass ct = Engine.myJar.classPool.get(className);
        for (CtMethod method : ct.getDeclaredMethods()) {
            System.out.println(method.getReturnType().getName() + " " + method.getLongName());
        }
    }

    public void fieldList(String className) throws NotFoundException {
        CtClass ct = Engine.myJar.classPool.get(className);
        for (CtField field : ct.getDeclaredFields()) {
            System.out.println(field.getName());
        }
    }

    public void constructorList(String className) throws NotFoundException {
        CtClass ct = Engine.myJar.classPool.get(className);
        for (CtConstructor constructor : ct.getDeclaredConstructors()) {
            System.out.println(constructor.getLongName());
        }
    }
}
