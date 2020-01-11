import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {//--i Invaders.jar
//        Engine program = new Engine();
//        program.start(args);

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