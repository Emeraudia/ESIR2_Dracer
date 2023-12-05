// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g 2023-10-27 15:50:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class voyellesParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALP", "ALP_a", "ALP_e", "ALP_i", 
		"ALP_o", "ALP_u", "ALP_y", "S"
	};
	public static final int EOF=-1;
	public static final int ALP=4;
	public static final int ALP_a=5;
	public static final int ALP_e=6;
	public static final int ALP_i=7;
	public static final int ALP_o=8;
	public static final int ALP_u=9;
	public static final int ALP_y=10;
	public static final int S=11;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "axiome"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public voyellesParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public voyellesParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public voyellesParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return voyellesParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g"; }



	// $ANTLR start "axiome"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:13:1: axiome : S ;
	public final void axiome() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "axiome");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:13:8: ( S )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:13:10: S
			{
			dbg.location(13,10);
			match(input,S,FOLLOW_S_in_axiome149); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "axiome");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "axiome"

	// Delegated rules



	public static final BitSet FOLLOW_S_in_axiome149 = new BitSet(new long[]{0x0000000000000002L});
}
