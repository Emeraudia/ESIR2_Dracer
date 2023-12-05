// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g 2023-10-27 16:28:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class dateParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Annee", "Date", "Date29", "Date30", 
		"Date31", "INT", "Mois30", "Mois31"
	};
	public static final int EOF=-1;
	public static final int Annee=4;
	public static final int Date=5;
	public static final int Date29=6;
	public static final int Date30=7;
	public static final int Date31=8;
	public static final int INT=9;
	public static final int Mois30=10;
	public static final int Mois31=11;

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
	public dateParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public dateParser(TokenStream input, int port, RecognizerSharedState state) {
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

	public dateParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return dateParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g"; }



	// $ANTLR start "rule"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:26:1: rule : Date ;
	public final void rule() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rule");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(26, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:26:7: ( Date )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:26:9: Date
			{
			dbg.location(26,9);
			match(input,Date,FOLLOW_Date_in_rule226); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 12);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule"

	// Delegated rules



	public static final BitSet FOLLOW_Date_in_rule226 = new BitSet(new long[]{0x0000000000000002L});
}
