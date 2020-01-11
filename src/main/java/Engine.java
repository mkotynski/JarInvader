import javassist.NotFoundException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

import java.io.IOException;

public class Engine {

    public static MyJar myJar = new MyJar();

    public void start(String args[]) throws IOException, NotFoundException {
        String line = "";
        CodePointCharStream input;
        for(int i = 1; i <= args.length; i++) {
            line += args[i-1];
            input = CharStreams.fromString(line);
            if(i%2 == 1) line+=" ";
            if(i%2 == 0){
                System.out.println(line);
                Interpreter.parse(input);
                line="";
            }
            if(args.length%2!=0){
                if(i == args.length) Interpreter.parse(input);
            }
        }
    }

}
