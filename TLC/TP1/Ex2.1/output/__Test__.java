import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        voyellesLexer lex = new voyellesLexer(new ANTLRFileStream("/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        voyellesParser g = new voyellesParser(tokens, 49100, null);
        try {
            g.axiome();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}