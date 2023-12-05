import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        triple_aLexer lex = new triple_aLexer(new ANTLRFileStream("/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        triple_aParser g = new triple_aParser(tokens, 49100, null);
        try {
            g.rule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}