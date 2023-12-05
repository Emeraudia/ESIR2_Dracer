import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        Ex3_1Lexer lex = new Ex3_1Lexer(new ANTLRFileStream("/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        Ex3_1Parser g = new Ex3_1Parser(tokens, 49100, null);
        try {
            g.input();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}