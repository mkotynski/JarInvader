import types.MyClass;
import javassist.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModifyJar {

    private static CtClass getClass(String className) throws NotFoundException {
        CtClass aClass = Engine.myJar.classPool.get(className);
        return aClass;
    }

    private static CtMethod getMethod(CtClass aClass, String methodName) throws Exception
    {
        for (CtMethod method : aClass.getDeclaredMethods()) {
            if (method.getLongName().equals(methodName)) {
                return method;
            }
        }
        return null;
    }

    private static CtConstructor getConstructor(CtClass aClass, String methodName){
        for (CtConstructor constructor : aClass.getDeclaredConstructors()) {
            if (constructor.getLongName().equals(methodName))
                return constructor;
        }
        return null;
    }

    private static CtField getField(CtClass aClass, String fieldName) throws Exception
    {
        for (CtField field : aClass.getDeclaredFields()) {
            System.out.println(field.getName());
            if (field.getName().equals(fieldName))
                return field;
        }
        return null;
    }


    private static String cutDeclaration(String declaration) {
        declaration = declaration.substring(declaration.lastIndexOf("[") + 1, declaration.length());
        declaration = declaration.substring(0, declaration.lastIndexOf("]"));
        return declaration;
    }

    private static String readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        try {
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(ls);
            }

            return stringBuilder.toString();
        } finally {
            reader.close();
        }
    }

    public static void addPackage(String name) {
        String aPackage = name.replace(".", "/") + "/";
        if (!Engine.myJar.packageList.contains(aPackage))
            Engine.myJar.packageList.add(name.replace(".", "/") + "/");
    }

    public void addClass(String name) throws Exception {
        CtClass aClass = Engine.myJar.classPool.makeClass(name);
        MyClass myClass = new MyClass(aClass.toClass(),true);
        Engine.myJar.classList.add(myClass);
        Engine.myJar.updateJar(aClass, name);
    }

    public void addInterface(String name) throws Exception {
        CtClass aClass = Engine.myJar.classPool.makeInterface(name);
        MyClass myClass = new MyClass(aClass.toClass(),true);
        Engine.myJar.classList.add(myClass);
        Engine.myJar.updateJar(aClass, name);
    }

    public void addMethod(String name, String declaration) throws Exception {
        CtClass aClass = Engine.myJar.classPool.get(name);
        declaration = cutDeclaration(declaration);
        declaration += "{ }";
        CtMethod method = CtMethod.make(declaration, aClass);
        Engine.myJar.classPool.get(name).addMethod(method);
        Engine.myJar.updateJar(aClass, name);
    }

    public void addConstructor(String name, String declaration) throws Exception {
        String ctorName = name.substring(name.lastIndexOf(".") + 1, name.length());
        declaration = cutDeclaration(declaration);
        declaration += "{ }";
        CtClass aClass = Engine.myJar.classPool.get(name);
        StringBuilder src = new StringBuilder();
        src.append(ctorName);
        src.append(declaration);
        CtConstructor c = CtNewConstructor.make(src.toString(), aClass);
        aClass.addConstructor(c);
        Engine.myJar.updateJar(aClass, name);
    }

    public void addField(String name, String declaration) throws Exception {
        CtClass aClass = Engine.myJar.classPool.get(name);
        declaration = cutDeclaration(declaration);
        CtField ctField = CtField.make(declaration, aClass);
        aClass.addField(ctField);
        Engine.myJar.updateJar(aClass, name);
    }

    public void addMethodBody(String name, String srcFile, boolean before) throws Exception {
        String className = name.substring(0,name.lastIndexOf("("));
        className = className.substring(0,className.lastIndexOf("."));
        CtClass aClass = Engine.myJar.classPool.get(className);
        String body = readFile(cutDeclaration(srcFile));

        CtMethod m = getMethod(aClass, name);
        aClass.removeMethod(m);
        if(before) m.insertBefore(body);
        else m.insertAfter(body);
        aClass.addMethod(m);
        Engine.myJar.updateJar(aClass, className);
    }

    public void setMethodBody(String name, String srcFile) throws Exception {
        String className = name.substring(0,name.lastIndexOf("("));
        className = className.substring(0,className.lastIndexOf("."));
        CtClass aClass = Engine.myJar.classPool.get(className);
        String body = readFile(cutDeclaration(srcFile));

        CtMethod m = getMethod(aClass, name);
        aClass.removeMethod(m);
        m.setBody(body);
        aClass.addMethod(m);
        Engine.myJar.updateJar(aClass, className);
    }

    public void setConstructorBody(String name, String srcFile) throws Exception {
        String className = name.substring(0,name.lastIndexOf("("));
        CtClass aClass = Engine.myJar.classPool.get(className);
        String body = readFile(cutDeclaration(srcFile));

        CtConstructor constructor = getConstructor(aClass, name);
        aClass.removeConstructor(constructor);
        constructor.setBody(body);
        aClass.addConstructor(constructor);
        Engine.myJar.updateJar(aClass, className);
    }

    public void removeMethod(String methodName) throws Exception
    {
        String className = methodName.substring(0,methodName.lastIndexOf("("));
        className = className.substring(0,className.lastIndexOf("."));
        CtClass aClass = getClass(className);
        CtMethod m = getMethod(aClass, methodName);
        aClass.removeMethod(m);
        Engine.myJar.updateJar(aClass, className);
    }

    public void removeConstructor(String constructorName) throws Exception
    {
        String className = constructorName.substring(0,constructorName.lastIndexOf("("));
        CtClass aClass = getClass(className);
        CtConstructor constructor = getConstructor(aClass, constructorName);
        aClass.removeConstructor(constructor);
        Engine.myJar.updateJar(aClass, className);
    }

    public void removeField(String className, String fieldName) throws Exception
    {
        CtClass aClass =  Engine.myJar.classPool.get(className);
        CtClass c = getClass(className);
        CtField f = getField(aClass, fieldName);
        aClass.removeField(f);
        Engine.myJar.updateJar(aClass, className);
    }

    public void removePackage(String name) throws Exception {

        boolean bool = Engine.myJar.packageList.remove(name.replace(".", "/") + "/");

        if(!bool) throw new Exception("Nie ma takiego pakietu mozliwego do usuniecia");

        List<MyClass> operatedList = new ArrayList<>();
        Engine.myJar.classList.stream().
                filter(aClass -> aClass.getxClass().getName().startsWith(name))
                .forEach(clz -> {
                    operatedList.add(clz);
                });
        Engine.myJar.classList.removeAll(operatedList);
    }

    public void removeClass(String className) {
        Class xClass = Engine.myJar.classList.stream()
            .filter(aClass -> aClass.getxClass().getName())
                .findAny()
                .orElse(null);

        if (clazz == null) {
            System.out.println("Nie ma takiej klasy");
            return;
        }

        boolean removed = JarController.classes.remove(clazz, true);

        if (removed) {
            System.out.println("usunieto");
        } else {
            System.out.println("nie mozesz usunac tej klasy");
        }

    }

}
