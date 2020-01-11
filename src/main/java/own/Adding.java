package own;

import javassist.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static own.Jar.classes;
import static own.Jar.classPool;
import static own.Jar.packages;

public class Adding {

    String getTextFromFile(String path) throws IOException {

        StringBuilder text = new StringBuilder();
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            text.append(st);

        return text.toString();
    }

    public void addToMethod(String objectName, Boolean after) throws NotFoundException, CannotCompileException, IOException {
        String clazzName = objectName.substring(0, objectName.lastIndexOf("("));
        clazzName = clazzName.substring(0, clazzName.lastIndexOf("."));
        CtClass clazz = classPool.get(clazzName);

        String path = objectName.split(" ")[1];
        String text = getTextFromFile(path);

        CtMethod ctMethod = null;
        for (CtMethod ct : clazz.getDeclaredMethods()) {
            if (ct.getLongName().equals(objectName.split(" ")[0]))
                ctMethod = ct;
        }

        if (after) {
            ctMethod.insertAfter(text);
        } else {
            ctMethod.insertBefore(text);
        }
    }

    public void addPackage(String objectName) {
        String packagee = objectName.replace(".", "/") + "/";
        if (!packages.contains(packagee))
            packages.add(objectName.replace(".", "/") + "/");
    }

    public void addField(String objectName) throws NotFoundException, CannotCompileException, IllegalAccessException, NoSuchFieldException {
        int length = objectName.split(" ").length;
        String className = objectName.split(" ")[0];
        String fieldType = objectName.split(" ")[1];
        String fieldName = objectName.split(" ")[2];
        CtField f1 = null;
        CtClass clazz = classPool.get(className);

        if (length == 3) {
            f1 = CtField.make(fieldType + " " + fieldName + ";", clazz);
        } else if (length == 4) {
            String value = objectName.split(" ")[3];
            f1 = CtField.make(fieldType + " " + fieldName + " = " + value + ";", clazz);
        } else if (length == 5) {
            String value = objectName.split(" ")[3];
            boolean isItStatic = objectName.split(" ")[4].equals("static");
            if (isItStatic) {
                f1 = CtField.make("public static " + fieldType + " " + fieldName + " = " + value + ";", clazz);
            }
        }
        clazz.addField(f1);
    }

    public void addConstructor(String objectName) throws NotFoundException, CannotCompileException {
        String className = objectName.split(" ")[0];
        String[] params = objectName.substring(objectName.indexOf(" ") + 1).split(" ");

        CtClass[] ctClasses = new CtClass[params.length];
        for (int i = 0; i < params.length; i++) {
            ctClasses[i] = classPool.get(params[i]);
        }
        CtClass clazz = classPool.get(className);
        CtConstructor c = new CtConstructor(ctClasses, clazz);
        classPool.get(className).addConstructor(c);
    }

    public void addMethod(String objectName) throws NotFoundException, CannotCompileException, IOException {
        String[] params = objectName.split(" ");
        String className = params[0];
        System.out.println(params[0]);
        String returnType = params[1];
        System.out.println(params[1]);

        String name = params[params.length - 1];
        String functionParams = "";

        for (int i = 2; i < params.length - 1; i++) {
            functionParams += params[i];
            functionParams += " ";
        }
        CtClass clazz = classPool.get(className);
        String function = returnType + " " + name + "(" + functionParams + " )" + "{ return null;}";
        CtMethod happyMethod = CtMethod.make(function, clazz);
        classPool.get(className).addMethod(happyMethod);
    }
    //add-method com.diamond.iain.javagame.Game.metoda()
    public void addClass(String objectName) throws CannotCompileException {
        String packageName = objectName.substring(0, objectName.lastIndexOf("."));
        Boolean newPackage = classes.keySet().stream().
                anyMatch(clz -> (clz.getName().substring(0, clz.getName().lastIndexOf(".")).equals(packageName)));
        if (!newPackage) {
            addPackage(packageName);
        }
        CtClass ctClass = classPool.makeClass(objectName);
        classes.put(ctClass.toClass(), true);
    }

    public void addInterface(String objectName) throws CannotCompileException {
        CtClass ctClass = classPool.makeInterface(objectName);
        classes.put(ctClass.toClass(), true);
    }
}
