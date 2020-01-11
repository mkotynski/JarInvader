import javassist.ClassPool;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class Main {
    public static void main(String args[]) throws Exception {//--i Invaders.jar
        String line;
        Scanner scanString = new Scanner(System.in);
        CodePointCharStream input;
        while (scanString.hasNextLine()) {
            line = scanString.nextLine();
            input = CharStreams.fromString(line);
            Interpreter.parse(input);
        }
    }
}