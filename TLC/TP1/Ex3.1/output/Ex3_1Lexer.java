// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g 2023-11-07 14:18:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Ex3_1Lexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Ex3_1Lexer() {} 
	public Ex3_1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Ex3_1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:2:7: ( '(' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:3:7: ( ')' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:4:7: ( '*' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:5:7: ( '+' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:6:7: ( '-' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:6:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:7:7: ( '/' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:7:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:8:7: ( ';' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:9:7: ( '=' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:9:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:10:7: ( 'set' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:10:9: 'set'
			{
			match("set"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:9:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:9:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:9:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:12:5: ( ( '0' .. '9' )+ )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:12:7: ( '0' .. '9' )+
			{
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:12:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:16:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:17:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:17:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:17:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:17:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:18:9: ( '0' .. '9' )+ EXPONENT
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:18:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:22:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:22:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:22:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:22:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:22:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:23:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:23:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:23:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:26:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:26:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:36:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:36:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:36:22: ( '+' | '-' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='+'||LA14_0=='-') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:36:33: ( '0' .. '9' )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | ID | INT | FLOAT | COMMENT | WS )
		int alt16=14;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:64: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:67: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:71: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 13 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:77: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 14 :
				// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex3.1/Ex3_1.g:1:85: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "15:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA16_eotS =
		"\6\uffff\1\17\2\uffff\1\12\1\uffff\1\21\4\uffff\1\12\1\uffff\1\23\1\uffff";
	static final String DFA16_eofS =
		"\24\uffff";
	static final String DFA16_minS =
		"\1\11\5\uffff\1\52\2\uffff\1\145\1\uffff\1\56\4\uffff\1\164\1\uffff\1"+
		"\60\1\uffff";
	static final String DFA16_maxS =
		"\1\172\5\uffff\1\57\2\uffff\1\145\1\uffff\1\145\4\uffff\1\164\1\uffff"+
		"\1\172\1\uffff";
	static final String DFA16_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\1\uffff\1\14"+
		"\1\16\1\15\1\6\1\uffff\1\13\1\uffff\1\11";
	static final String DFA16_specialS =
		"\24\uffff}>";
	static final String[] DFA16_transitionS = {
			"\2\15\2\uffff\1\15\22\uffff\1\15\7\uffff\1\1\1\2\1\3\1\4\1\uffff\1\5"+
			"\1\14\1\6\12\13\1\uffff\1\7\1\uffff\1\10\3\uffff\32\12\4\uffff\1\12\1"+
			"\uffff\22\12\1\11\7\12",
			"",
			"",
			"",
			"",
			"",
			"\1\16\4\uffff\1\16",
			"",
			"",
			"\1\20",
			"",
			"\1\14\1\uffff\12\13\13\uffff\1\14\37\uffff\1\14",
			"",
			"",
			"",
			"",
			"\1\22",
			"",
			"\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | ID | INT | FLOAT | COMMENT | WS );";
		}
	}

}
