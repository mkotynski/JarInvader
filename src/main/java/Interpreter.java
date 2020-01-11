import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Interpreter {
    static gramaLexer lexer;
    static CommonTokenStream tokenStream;
    static gramaParser parser;
    static InterpreterMethod engine = new InterpreterMethod();
    static CodePointCharStream input;

    public static void parse(CodePointCharStream in)
    {
        input = in;
        setLexer();
        setParser();

        try {
            engine.visitBegin(parser.begin());
        } catch (Exception e1)
        {
            e1.printStackTrace();
        }
    }

    private static void setLexer()
    {
        lexer = new gramaLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        tokenStream = new CommonTokenStream(lexer);
    }

    private static void setParser()
    {
        parser = new gramaParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);
    }
}
