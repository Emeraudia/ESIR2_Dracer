import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        dateLexer lex = new dateLexer(new ANTLRFileStream("/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        dateParser g = new dateParser(tokens, 49100, null);
        try {
            g.rule();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}