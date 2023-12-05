// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g 2023-11-07 14:18:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class Ex3_1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "EXPONENT", "FLOAT", 
		"ID", "INT", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'/'", "';'", "'='", 
		"'set'"
	};
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int COMMENT=4;
	public static final int EXPONENT=5;
	public static final int FLOAT=6;
	public static final int ID=7;
	public static final int INT=8;
	public static final int WS=9;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mul", "div", "num", "uni", "ope", "add", "ex3_1", "opeExp", 
		"declaration", "divExp", "minus", "mulExp", "addExp", "minusExp", "uniExp", 
		"input"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public Ex3_1Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public Ex3_1Parser(TokenStream input, int port, RecognizerSharedState state) {
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

	public Ex3_1Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return Ex3_1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g"; }

	 
		java.util.Map<String,Double> variables = new java.util.HashMap(); 



	// $ANTLR start "add"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:39:1: add : minus ( '+' add )? ;
	public final void add() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "add");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:39:5: ( minus ( '+' add )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:39:7: minus ( '+' add )?
			{
			dbg.location(39,7);
			pushFollow(FOLLOW_minus_in_add315);
			minus();
			state._fsp--;
			dbg.location(39,12);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:39:12: ( '+' add )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==13) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:39:13: '+' add
					{
					dbg.location(39,13);
					match(input,13,FOLLOW_13_in_add317); dbg.location(39,16);
					pushFollow(FOLLOW_add_in_add318);
					add();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(39, 20);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "add");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "add"



	// $ANTLR start "minus"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:41:1: minus : mul ( '-' minus )? ;
	public final void minus() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "minus");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:41:7: ( mul ( '-' minus )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:41:9: mul ( '-' minus )?
			{
			dbg.location(41,9);
			pushFollow(FOLLOW_mul_in_minus329);
			mul();
			state._fsp--;
			dbg.location(41,12);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:41:12: ( '-' minus )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==14) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:41:13: '-' minus
					{
					dbg.location(41,13);
					match(input,14,FOLLOW_14_in_minus331); dbg.location(41,16);
					pushFollow(FOLLOW_minus_in_minus332);
					minus();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "minus");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "minus"



	// $ANTLR start "mul"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:43:1: mul : div ( '*' mul )? ;
	public final void mul() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "mul");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:43:5: ( div ( '*' mul )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:43:7: div ( '*' mul )?
			{
			dbg.location(43,7);
			pushFollow(FOLLOW_div_in_mul342);
			div();
			state._fsp--;
			dbg.location(43,10);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:43:10: ( '*' mul )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==12) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:43:11: '*' mul
					{
					dbg.location(43,11);
					match(input,12,FOLLOW_12_in_mul344); dbg.location(43,14);
					pushFollow(FOLLOW_mul_in_mul345);
					mul();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mul");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "mul"



	// $ANTLR start "div"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:45:1: div : uni ( '/' div )? ;
	public final void div() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "div");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:45:5: ( uni ( '/' div )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:45:7: uni ( '/' div )?
			{
			dbg.location(45,7);
			pushFollow(FOLLOW_uni_in_div356);
			uni();
			state._fsp--;
			dbg.location(45,10);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:45:10: ( '/' div )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==15) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:45:11: '/' div
					{
					dbg.location(45,11);
					match(input,15,FOLLOW_15_in_div358); dbg.location(45,14);
					pushFollow(FOLLOW_div_in_div359);
					div();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(45, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "div");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "div"



	// $ANTLR start "uni"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:47:1: uni : ( '-' )? ope ;
	public final void uni() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "uni");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:47:5: ( ( '-' )? ope )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:47:7: ( '-' )? ope
			{
			dbg.location(47,7);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:47:7: ( '-' )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==14) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:47:7: '-'
					{
					dbg.location(47,7);
					match(input,14,FOLLOW_14_in_uni369); 
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(47,11);
			pushFollow(FOLLOW_ope_in_uni371);
			ope();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(47, 13);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "uni");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "uni"



	// $ANTLR start "ope"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:1: ope : ( ( WS )* ( INT | FLOAT ) ( WS )* | '(' add ')' );
	public final void ope() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ope");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:5: ( ( WS )* ( INT | FLOAT ) ( WS )* | '(' add ')' )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==FLOAT||(LA8_0 >= INT && LA8_0 <= WS)) ) {
				alt8=1;
			}
			else if ( (LA8_0==10) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:7: ( WS )* ( INT | FLOAT ) ( WS )*
					{
					dbg.location(49,7);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:7: ( WS )*
					try { dbg.enterSubRule(6);

					loop6:
					while (true) {
						int alt6=2;
						try { dbg.enterDecision(6, decisionCanBacktrack[6]);

						int LA6_0 = input.LA(1);
						if ( (LA6_0==WS) ) {
							alt6=1;
						}

						} finally {dbg.exitDecision(6);}

						switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:7: WS
							{
							dbg.location(49,7);
							match(input,WS,FOLLOW_WS_in_ope379); 
							}
							break;

						default :
							break loop6;
						}
					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(49,11);
					if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(49,23);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:23: ( WS )*
					try { dbg.enterSubRule(7);

					loop7:
					while (true) {
						int alt7=2;
						try { dbg.enterDecision(7, decisionCanBacktrack[7]);

						int LA7_0 = input.LA(1);
						if ( (LA7_0==WS) ) {
							alt7=1;
						}

						} finally {dbg.exitDecision(7);}

						switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:23: WS
							{
							dbg.location(49,23);
							match(input,WS,FOLLOW_WS_in_ope388); 
							}
							break;

						default :
							break loop7;
						}
					}
					} finally {dbg.exitSubRule(7);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:49:29: '(' add ')'
					{
					dbg.location(49,29);
					match(input,10,FOLLOW_10_in_ope393); dbg.location(49,33);
					pushFollow(FOLLOW_add_in_ope395);
					add();
					state._fsp--;
					dbg.location(49,37);
					match(input,11,FOLLOW_11_in_ope397); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ope");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ope"



	// $ANTLR start "ex3_1"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:51:1: ex3_1 : add ;
	public final void ex3_1() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "ex3_1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:51:7: ( add )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:51:9: add
			{
			dbg.location(51,9);
			pushFollow(FOLLOW_add_in_ex3_1406);
			add();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(51, 11);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ex3_1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "ex3_1"



	// $ANTLR start "num"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:54:1: num returns [Double val] : ( ( WS )* (var= ID ) ( WS )* |a= ( ( WS )* ( INT | FLOAT ) ( WS )* ) | ( '(' x= addExp ')' ) );
	public final Double num() throws RecognitionException {
		Double val = null;


		Token var=null;
		Token a=null;
		Double x =null;

		try { dbg.enterRule(getGrammarFileName(), "num");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:54:26: ( ( WS )* (var= ID ) ( WS )* |a= ( ( WS )* ( INT | FLOAT ) ( WS )* ) | ( '(' x= addExp ')' ) )
			int alt13=3;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			try {
				isCyclicDecision = true;
				alt13 = dfa13.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:3: ( WS )* (var= ID ) ( WS )*
					{
					dbg.location(55,3);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:3: ( WS )*
					try { dbg.enterSubRule(9);

					loop9:
					while (true) {
						int alt9=2;
						try { dbg.enterDecision(9, decisionCanBacktrack[9]);

						int LA9_0 = input.LA(1);
						if ( (LA9_0==WS) ) {
							alt9=1;
						}

						} finally {dbg.exitDecision(9);}

						switch (alt9) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:3: WS
							{
							dbg.location(55,3);
							match(input,WS,FOLLOW_WS_in_num422); 
							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(55,6);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:6: (var= ID )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:7: var= ID
					{
					dbg.location(55,11);
					var=(Token)match(input,ID,FOLLOW_ID_in_num429); 
					}
					dbg.location(55,16);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:16: ( WS )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==WS) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:55:16: WS
							{
							dbg.location(55,16);
							match(input,WS,FOLLOW_WS_in_num431); 
							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(55,20);
					val = variables.get((var!=null?var.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:4: a= ( ( WS )* ( INT | FLOAT ) ( WS )* )
					{
					dbg.location(56,5);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:7: ( ( WS )* ( INT | FLOAT ) ( WS )* )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:8: ( WS )* ( INT | FLOAT ) ( WS )*
					{
					dbg.location(56,8);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:8: ( WS )*
					try { dbg.enterSubRule(11);

					loop11:
					while (true) {
						int alt11=2;
						try { dbg.enterDecision(11, decisionCanBacktrack[11]);

						int LA11_0 = input.LA(1);
						if ( (LA11_0==WS) ) {
							alt11=1;
						}

						} finally {dbg.exitDecision(11);}

						switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:8: WS
							{
							dbg.location(56,8);
							a=(Token)match(input,WS,FOLLOW_WS_in_num443); 
							}
							break;

						default :
							break loop11;
						}
					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(56,12);
					a=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(56,24);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:24: ( WS )*
					try { dbg.enterSubRule(12);

					loop12:
					while (true) {
						int alt12=2;
						try { dbg.enterDecision(12, decisionCanBacktrack[12]);

						int LA12_0 = input.LA(1);
						if ( (LA12_0==WS) ) {
							alt12=1;
						}

						} finally {dbg.exitDecision(12);}

						switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:56:24: WS
							{
							dbg.location(56,24);
							a=(Token)match(input,WS,FOLLOW_WS_in_num452); 
							}
							break;

						default :
							break loop12;
						}
					}
					} finally {dbg.exitSubRule(12);}

					}
					dbg.location(56,29);
					 val = Double.parseDouble((a!=null?a.getText():null)); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:57:5: ( '(' x= addExp ')' )
					{
					dbg.location(57,5);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:57:5: ( '(' x= addExp ')' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:57:6: '(' x= addExp ')'
					{
					dbg.location(57,6);
					match(input,10,FOLLOW_10_in_num464); dbg.location(57,11);
					pushFollow(FOLLOW_addExp_in_num469);
					x=addExp();
					state._fsp--;
					dbg.location(57,19);
					val = x; dbg.location(57,37);
					match(input,11,FOLLOW_11_in_num472); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "num");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "num"



	// $ANTLR start "uniExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:60:1: uniExp returns [Double val] : ( (a= num ) | ( '-' x= num ) );
	public final Double uniExp() throws RecognitionException {
		Double val = null;


		Double a =null;
		Double x =null;

		try { dbg.enterRule(getGrammarFileName(), "uniExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:60:29: ( (a= num ) | ( '-' x= num ) )
			int alt14=2;
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( ((LA14_0 >= FLOAT && LA14_0 <= 10)) ) {
				alt14=1;
			}
			else if ( (LA14_0==14) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:61:2: (a= num )
					{
					dbg.location(61,2);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:61:2: (a= num )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:61:4: a= num
					{
					dbg.location(61,5);
					pushFollow(FOLLOW_num_in_uniExp496);
					a=num();
					state._fsp--;
					dbg.location(61,11);
					 val = a;  
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:62:5: ( '-' x= num )
					{
					dbg.location(62,5);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:62:5: ( '-' x= num )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:62:6: '-' x= num
					{
					dbg.location(62,6);
					match(input,14,FOLLOW_14_in_uniExp507); dbg.location(62,11);
					pushFollow(FOLLOW_num_in_uniExp512);
					x=num();
					state._fsp--;
					dbg.location(62,16);
					val -= x; 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "uniExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "uniExp"



	// $ANTLR start "divExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:65:1: divExp returns [Double val] : (b= uniExp ) ( '/' (c= uniExp ) )* ;
	public final Double divExp() throws RecognitionException {
		Double val = null;


		Double b =null;
		Double c =null;

		try { dbg.enterRule(getGrammarFileName(), "divExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:65:28: ( (b= uniExp ) ( '/' (c= uniExp ) )* )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:66:2: (b= uniExp ) ( '/' (c= uniExp ) )*
			{
			dbg.location(66,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:66:2: (b= uniExp )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:66:3: b= uniExp
			{
			dbg.location(66,5);
			pushFollow(FOLLOW_uniExp_in_divExp533);
			b=uniExp();
			state._fsp--;

			}
			dbg.location(66,15);
			val = b;dbg.location(67,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:67:2: ( '/' (c= uniExp ) )*
			try { dbg.enterSubRule(15);

			loop15:
			while (true) {
				int alt15=2;
				try { dbg.enterDecision(15, decisionCanBacktrack[15]);

				int LA15_0 = input.LA(1);
				if ( (LA15_0==15) ) {
					alt15=1;
				}

				} finally {dbg.exitDecision(15);}

				switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:68:3: '/' (c= uniExp )
					{
					dbg.location(68,3);
					match(input,15,FOLLOW_15_in_divExp543); dbg.location(68,6);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:68:6: (c= uniExp )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:68:7: c= uniExp
					{
					dbg.location(68,8);
					pushFollow(FOLLOW_uniExp_in_divExp547);
					c=uniExp();
					state._fsp--;

					}
					dbg.location(68,17);
					 val /= c; 
					}
					break;

				default :
					break loop15;
				}
			}
			} finally {dbg.exitSubRule(15);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "divExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "divExp"



	// $ANTLR start "mulExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:71:1: mulExp returns [Double val] : (b= divExp ) ( '*' (c= divExp ) )* ;
	public final Double mulExp() throws RecognitionException {
		Double val = null;


		Double b =null;
		Double c =null;

		try { dbg.enterRule(getGrammarFileName(), "mulExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:71:28: ( (b= divExp ) ( '*' (c= divExp ) )* )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:72:2: (b= divExp ) ( '*' (c= divExp ) )*
			{
			dbg.location(72,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:72:2: (b= divExp )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:72:3: b= divExp
			{
			dbg.location(72,5);
			pushFollow(FOLLOW_divExp_in_mulExp573);
			b=divExp();
			state._fsp--;

			}
			dbg.location(72,15);
			val = b;dbg.location(73,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:73:2: ( '*' (c= divExp ) )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==12) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:74:3: '*' (c= divExp )
					{
					dbg.location(74,3);
					match(input,12,FOLLOW_12_in_mulExp583); dbg.location(74,6);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:74:6: (c= divExp )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:74:7: c= divExp
					{
					dbg.location(74,8);
					pushFollow(FOLLOW_divExp_in_mulExp587);
					c=divExp();
					state._fsp--;

					}
					dbg.location(74,17);
					 val *= c; 
					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mulExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "mulExp"



	// $ANTLR start "minusExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:77:1: minusExp returns [Double val] : (b= mulExp ) ( '-' (c= mulExp ) )* ;
	public final Double minusExp() throws RecognitionException {
		Double val = null;


		Double b =null;
		Double c =null;

		try { dbg.enterRule(getGrammarFileName(), "minusExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:77:30: ( (b= mulExp ) ( '-' (c= mulExp ) )* )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:78:2: (b= mulExp ) ( '-' (c= mulExp ) )*
			{
			dbg.location(78,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:78:2: (b= mulExp )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:78:3: b= mulExp
			{
			dbg.location(78,5);
			pushFollow(FOLLOW_mulExp_in_minusExp612);
			b=mulExp();
			state._fsp--;

			}
			dbg.location(78,15);
			val = b;dbg.location(79,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:79:2: ( '-' (c= mulExp ) )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==14) ) {
					alt17=1;
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:80:3: '-' (c= mulExp )
					{
					dbg.location(80,3);
					match(input,14,FOLLOW_14_in_minusExp622); dbg.location(80,6);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:80:6: (c= mulExp )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:80:7: c= mulExp
					{
					dbg.location(80,8);
					pushFollow(FOLLOW_mulExp_in_minusExp626);
					c=mulExp();
					state._fsp--;

					}
					dbg.location(80,17);
					 val -= c; 
					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(81, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "minusExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "minusExp"



	// $ANTLR start "addExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:83:1: addExp returns [Double val] : (b= minusExp ) ( '+' (c= minusExp ) )* ;
	public final Double addExp() throws RecognitionException {
		Double val = null;


		Double b =null;
		Double c =null;

		try { dbg.enterRule(getGrammarFileName(), "addExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:83:28: ( (b= minusExp ) ( '+' (c= minusExp ) )* )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:84:2: (b= minusExp ) ( '+' (c= minusExp ) )*
			{
			dbg.location(84,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:84:2: (b= minusExp )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:84:3: b= minusExp
			{
			dbg.location(84,5);
			pushFollow(FOLLOW_minusExp_in_addExp651);
			b=minusExp();
			state._fsp--;

			}
			dbg.location(84,17);
			val = b;dbg.location(85,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:85:2: ( '+' (c= minusExp ) )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==13) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:86:3: '+' (c= minusExp )
					{
					dbg.location(86,3);
					match(input,13,FOLLOW_13_in_addExp661); dbg.location(86,6);
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:86:6: (c= minusExp )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:86:7: c= minusExp
					{
					dbg.location(86,8);
					pushFollow(FOLLOW_minusExp_in_addExp665);
					c=minusExp();
					state._fsp--;

					}
					dbg.location(86,19);
					 val += c; 
					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 3);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "addExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return val;
	}
	// $ANTLR end "addExp"



	// $ANTLR start "opeExp"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:89:1: opeExp : v= addExp ';' ;
	public final void opeExp() throws RecognitionException {
		Double v =null;

		try { dbg.enterRule(getGrammarFileName(), "opeExp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:90:2: (v= addExp ';' )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:90:4: v= addExp ';'
			{
			dbg.location(90,6);
			pushFollow(FOLLOW_addExp_in_opeExp687);
			v=addExp();
			state._fsp--;
			dbg.location(90,15);
			 System.out.println("Résultat : " + v); dbg.location(90,62);
			match(input,16,FOLLOW_16_in_opeExp690); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(90, 64);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "opeExp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "opeExp"



	// $ANTLR start "input"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:93:1: input : ( declaration )* ( opeExp )* ;
	public final void input() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:94:2: ( ( declaration )* ( opeExp )* )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:95:2: ( declaration )* ( opeExp )*
			{
			dbg.location(95,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:95:2: ( declaration )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==18) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:95:2: declaration
					{
					dbg.location(95,2);
					pushFollow(FOLLOW_declaration_in_input704);
					declaration();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(96,2);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:96:2: ( opeExp )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= FLOAT && LA20_0 <= 10)||LA20_0==14) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:96:2: opeExp
					{
					dbg.location(96,2);
					pushFollow(FOLLOW_opeExp_in_input708);
					opeExp();
					state._fsp--;

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(98, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input"



	// $ANTLR start "declaration"
	// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:100:1: declaration : 'set' ( WS )* (varname= ID ) ( WS )* '=' ( WS )* (x= addExp ) ';' ;
	public final void declaration() throws RecognitionException {
		Token varname=null;
		Double x =null;

		try { dbg.enterRule(getGrammarFileName(), "declaration");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:101:2: ( 'set' ( WS )* (varname= ID ) ( WS )* '=' ( WS )* (x= addExp ) ';' )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:3: 'set' ( WS )* (varname= ID ) ( WS )* '=' ( WS )* (x= addExp ) ';'
			{
			dbg.location(102,3);
			match(input,18,FOLLOW_18_in_declaration725); dbg.location(102,9);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:9: ( WS )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:9: WS
					{
					dbg.location(102,9);
					match(input,WS,FOLLOW_WS_in_declaration727); 
					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(102,13);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:13: (varname= ID )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:14: varname= ID
			{
			dbg.location(102,22);
			varname=(Token)match(input,ID,FOLLOW_ID_in_declaration735); 
			}
			dbg.location(102,28);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:28: ( WS )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:28: WS
					{
					dbg.location(102,28);
					match(input,WS,FOLLOW_WS_in_declaration738); 
					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(102,32);
			match(input,17,FOLLOW_17_in_declaration741); dbg.location(102,36);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:36: ( WS )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:102:36: WS
					{
					dbg.location(102,36);
					match(input,WS,FOLLOW_WS_in_declaration743); 
					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(103,3);
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:103:3: (x= addExp )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:103:4: x= addExp
			{
			dbg.location(103,6);
			pushFollow(FOLLOW_addExp_in_declaration754);
			x=addExp();
			state._fsp--;
			dbg.location(103,15);

						variables.put((varname!=null?varname.getText():null),x);
					
			}
			dbg.location(105,5);
			match(input,16,FOLLOW_16_in_declaration758); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(106, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "declaration");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "declaration"

	// Delegated rules


	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA13_eotS =
		"\5\uffff";
	static final String DFA13_eofS =
		"\5\uffff";
	static final String DFA13_minS =
		"\2\6\3\uffff";
	static final String DFA13_maxS =
		"\1\12\1\11\3\uffff";
	static final String DFA13_acceptS =
		"\2\uffff\1\1\1\2\1\3";
	static final String DFA13_specialS =
		"\5\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\3\1\2\1\3\1\1\1\4",
			"\1\3\1\2\1\3\1\1",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "54:1: num returns [Double val] : ( ( WS )* (var= ID ) ( WS )* |a= ( ( WS )* ( INT | FLOAT ) ( WS )* ) | ( '(' x= addExp ')' ) );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_minus_in_add315 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_add317 = new BitSet(new long[]{0x0000000000004740L});
	public static final BitSet FOLLOW_add_in_add318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mul_in_minus329 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_minus331 = new BitSet(new long[]{0x0000000000004740L});
	public static final BitSet FOLLOW_minus_in_minus332 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_div_in_mul342 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_mul344 = new BitSet(new long[]{0x0000000000004740L});
	public static final BitSet FOLLOW_mul_in_mul345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uni_in_div356 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_div358 = new BitSet(new long[]{0x0000000000004740L});
	public static final BitSet FOLLOW_div_in_div359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_uni369 = new BitSet(new long[]{0x0000000000000740L});
	public static final BitSet FOLLOW_ope_in_uni371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_ope379 = new BitSet(new long[]{0x0000000000000340L});
	public static final BitSet FOLLOW_set_in_ope382 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_ope388 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_10_in_ope393 = new BitSet(new long[]{0x0000000000004740L});
	public static final BitSet FOLLOW_add_in_ope395 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_ope397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_add_in_ex3_1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_num422 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_ID_in_num429 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_num431 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_num443 = new BitSet(new long[]{0x0000000000000340L});
	public static final BitSet FOLLOW_set_in_num446 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_num452 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_10_in_num464 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_addExp_in_num469 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_num472 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_uniExp496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_uniExp507 = new BitSet(new long[]{0x00000000000007C0L});
	public static final BitSet FOLLOW_num_in_uniExp512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniExp_in_divExp533 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_15_in_divExp543 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_uniExp_in_divExp547 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_divExp_in_mulExp573 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_mulExp583 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_divExp_in_mulExp587 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_mulExp_in_minusExp612 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_14_in_minusExp622 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_mulExp_in_minusExp626 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_minusExp_in_addExp651 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_addExp661 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_minusExp_in_addExp665 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_addExp_in_opeExp687 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_opeExp690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_input704 = new BitSet(new long[]{0x00000000000447C2L});
	public static final BitSet FOLLOW_opeExp_in_input708 = new BitSet(new long[]{0x00000000000047C2L});
	public static final BitSet FOLLOW_18_in_declaration725 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_WS_in_declaration727 = new BitSet(new long[]{0x0000000000000280L});
	public static final BitSet FOLLOW_ID_in_declaration735 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_WS_in_declaration738 = new BitSet(new long[]{0x0000000000020200L});
	public static final BitSet FOLLOW_17_in_declaration741 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_WS_in_declaration743 = new BitSet(new long[]{0x00000000000047C0L});
	public static final BitSet FOLLOW_addExp_in_declaration754 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_declaration758 = new BitSet(new long[]{0x0000000000000002L});
}
