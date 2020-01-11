import javassist.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Adding {

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
        if (!JarFile.packageList.contains(aPackage))
            JarFile.packageList.add(name.replace(".", "/") + "/");
    }

    public static void addClass(String name) throws CannotCompileException {
        CtClass ctClass = JarFile.classPool.makeClass(name);
        JarFile.classList.put(ctClass.toClass(),true);
    }

    public static void addInterface(String name) throws CannotCompileException {
        CtClass ctClass = JarFile.classPool.makeInterface(name);
        JarFile.classList.put(ctClass.toClass(),true);
    }

    public static void addMethod(String name, String declaration) throws NotFoundException, CannotCompileException {
        CtClass aClass = JarFile.classPool.get(name);
        String[] params = declaration.split(" ");
        declaration = cutDeclaration(declaration);
        declaration += "{ }";
        CtMethod method = CtMethod.make(declaration, aClass);
        JarFile.classPool.get(name).addMethod(method);
    }

    public static void addConstructor(String name, String declaration) throws NotFoundException, CannotCompileException {
        String ctorName = name.substring(name.lastIndexOf(".") + 1, name.length());
        declaration = cutDeclaration(declaration);
        declaration += "{ }";
        CtClass aClass = JarFile.classPool.get(name);
        StringBuilder src = new StringBuilder();
        src.append(ctorName);
        src.append(declaration);
        CtConstructor c = CtNewConstructor.make(src.toString(), aClass);
        aClass.addConstructor(c);
    }

    public static void addField(String name, String declaration) throws NotFoundException, CannotCompileException {
        CtClass aClass = JarFile.classPool.get(name);
        declaration = cutDeclaration(declaration);
        CtField ctField = CtField.make(declaration, aClass);
        aClass.addField(ctField);
    }

    public static void addMethodBody(String name, String srcFile, boolean before) throws NotFoundException, IOException, CannotCompileException {
        CtClass aClass = JarFile.classPool.get(name);
        String body = readFile(srcFile);
        for (CtMethod method : aClass.getDeclaredMethods()) {
            if (method.getLongName().equals(name)) {
                if(before) method.insertBefore(body);
                else method.insertAfter(body);
            }
        }
    }

    public static void setMethodBody(String name, String srcFile) throws IOException, NotFoundException, CannotCompileException {
        CtClass aClass = JarFile.classPool.get(name);
        String body = readFile(srcFile);
        for (CtMethod method : aClass.getDeclaredMethods()) {
            if (method.getLongName().equals(name)) method.setBody(body);
        }
    }

    public static void setConstructorBody(String name, String srcFile) throws IOException, NotFoundException, CannotCompileException {
        CtClass aClass = JarFile.classPool.get(name);
        String body = readFile(srcFile);
        for (CtConstructor constructor : aClass.getDeclaredConstructors()) {
            if (constructor.getLongName().equals(name)) constructor.setBody(body);
        }
    }
}
