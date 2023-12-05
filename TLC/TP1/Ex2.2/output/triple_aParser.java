// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g 2023-10-27 15:59:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class triple_aParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "S", "T"
	};
	public static final int EOF=-1;
	public static final int S=4;
	public static final int T=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "rule"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public triple_aParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public triple_aParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public triple_aParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return triple_aParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g"; }



	// $ANTLR start "rule"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:6:1: rule : T ;
	public final void rule() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(6, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:6:7: ( T )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:6:10: T
			{
			dbg.location(6,10);
			match(input,T,FOLLOW_T_in_rule41); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(6, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule"

	// Delegated rules



	public static final BitSet FOLLOW_T_in_rule41 = new BitSet(new long[]{0x0000000000000002L});
}
