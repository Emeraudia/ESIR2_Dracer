// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g 2023-10-27 16:28:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class dateLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public dateLexer() {} 
	public dateLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public dateLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g"; }

	// $ANTLR start "Date31"
	public final void mDate31() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:2: ( ( '0' '1' .. '9' ) | ( '1' .. '2' ) ( '0' .. '9' ) | ( '3' ( '0' | '1' ) ) )
			int alt1=3;
			switch ( input.LA(1) ) {
			case '0':
				{
				alt1=1;
				}
				break;
			case '1':
			case '2':
				{
				alt1=2;
				}
				break;
			case '3':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:4: ( '0' '1' .. '9' )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:4: ( '0' '1' .. '9' )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:5: '0' '1' .. '9'
					{
					match('0'); 
					matchRange('1','9'); 
					}

					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:19: ( '1' .. '2' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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
				case 3 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:40: ( '3' ( '0' | '1' ) )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:40: ( '3' ( '0' | '1' ) )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:4:41: '3' ( '0' | '1' )
					{
					match('3'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '1') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Date31"

	// $ANTLR start "Date30"
	public final void mDate30() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:2: ( ( '0' '1' .. '9' ) | ( '1' .. '2' ) ( '0' .. '9' ) | ( '3' '0' ) )
			int alt2=3;
			switch ( input.LA(1) ) {
			case '0':
				{
				alt2=1;
				}
				break;
			case '1':
			case '2':
				{
				alt2=2;
				}
				break;
			case '3':
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:4: ( '0' '1' .. '9' )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:4: ( '0' '1' .. '9' )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:5: '0' '1' .. '9'
					{
					match('0'); 
					matchRange('1','9'); 
					}

					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:19: ( '1' .. '2' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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
				case 3 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:40: ( '3' '0' )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:40: ( '3' '0' )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:7:41: '3' '0'
					{
					match('3'); 
					match('0'); 
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Date30"

	// $ANTLR start "Date29"
	public final void mDate29() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:10:2: ( ( '0' '1' .. '9' ) | ( '1' .. '2' ) ( '0' .. '9' ) )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '2')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:10:4: ( '0' '1' .. '9' )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:10:4: ( '0' '1' .. '9' )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:10:5: '0' '1' .. '9'
					{
					match('0'); 
					matchRange('1','9'); 
					}

					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:10:19: ( '1' .. '2' ) ( '0' .. '9' )
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '2') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
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

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Date29"

	// $ANTLR start "Mois31"
	public final void mMois31() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:13:2: ( '0' ( '1' | '3' | '5' | '7' | '8' ) | '10' | '12' )
			int alt4=3;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='0') ) {
				alt4=1;
			}
			else if ( (LA4_0=='1') ) {
				int LA4_2 = input.LA(2);
				if ( (LA4_2=='0') ) {
					alt4=2;
				}
				else if ( (LA4_2=='2') ) {
					alt4=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:13:4: '0' ( '1' | '3' | '5' | '7' | '8' )
					{
					match('0'); 
					if ( input.LA(1)=='1'||input.LA(1)=='3'||input.LA(1)=='5'||(input.LA(1) >= '7' && input.LA(1) <= '8') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:13:30: '10'
					{
					match("10"); 

					}
					break;
				case 3 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:13:35: '12'
					{
					match("12"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Mois31"

	// $ANTLR start "Mois30"
	public final void mMois30() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:16:2: ( '0' ( '4' | '6' | '9' ) | '11' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='0') ) {
				alt5=1;
			}
			else if ( (LA5_0=='1') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:16:4: '0' ( '4' | '6' | '9' )
					{
					match('0'); 
					if ( input.LA(1)=='4'||input.LA(1)=='6'||input.LA(1)=='9' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:16:22: '11'
					{
					match("11"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Mois30"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:19:2: ( '0' .. '9' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:
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

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "Annee"
	public final void mAnnee() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:22:2: ( INT INT INT INT )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:22:4: INT INT INT INT
			{
			mINT(); 

			mINT(); 

			mINT(); 

			mINT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Annee"

	// $ANTLR start "Date"
	public final void mDate() throws RecognitionException {
		try {
			int _type = Date;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:6: ( ( Date31 '/' Mois31 '/' Annee ) | ( Date30 '/' Mois30 '/' Annee ) | Date29 '/02/' Annee )
			int alt6=3;
			switch ( input.LA(1) ) {
			case '0':
				{
				int LA6_1 = input.LA(2);
				if ( ((LA6_1 >= '1' && LA6_1 <= '9')) ) {
					int LA6_4 = input.LA(3);
					if ( (LA6_4=='/') ) {
						int LA6_8 = input.LA(4);
						if ( (LA6_8=='0') ) {
							switch ( input.LA(5) ) {
							case '2':
								{
								alt6=3;
								}
								break;
							case '1':
							case '3':
							case '5':
							case '7':
							case '8':
								{
								alt6=1;
								}
								break;
							case '4':
							case '6':
							case '9':
								{
								alt6=2;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA6_8=='1') ) {
							int LA6_11 = input.LA(5);
							if ( (LA6_11=='0'||LA6_11=='2') ) {
								alt6=1;
							}
							else if ( (LA6_11=='1') ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '1':
			case '2':
				{
				int LA6_2 = input.LA(2);
				if ( ((LA6_2 >= '0' && LA6_2 <= '9')) ) {
					int LA6_5 = input.LA(3);
					if ( (LA6_5=='/') ) {
						int LA6_8 = input.LA(4);
						if ( (LA6_8=='0') ) {
							switch ( input.LA(5) ) {
							case '2':
								{
								alt6=3;
								}
								break;
							case '1':
							case '3':
							case '5':
							case '7':
							case '8':
								{
								alt6=1;
								}
								break;
							case '4':
							case '6':
							case '9':
								{
								alt6=2;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA6_8=='1') ) {
							int LA6_11 = input.LA(5);
							if ( (LA6_11=='0'||LA6_11=='2') ) {
								alt6=1;
							}
							else if ( (LA6_11=='1') ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case '3':
				{
				int LA6_3 = input.LA(2);
				if ( (LA6_3=='0') ) {
					int LA6_6 = input.LA(3);
					if ( (LA6_6=='/') ) {
						int LA6_9 = input.LA(4);
						if ( (LA6_9=='0') ) {
							int LA6_12 = input.LA(5);
							if ( (LA6_12=='1'||LA6_12=='3'||LA6_12=='5'||(LA6_12 >= '7' && LA6_12 <= '8')) ) {
								alt6=1;
							}
							else if ( (LA6_12=='4'||LA6_12=='6'||LA6_12=='9') ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 12, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA6_9=='1') ) {
							int LA6_11 = input.LA(5);
							if ( (LA6_11=='0'||LA6_11=='2') ) {
								alt6=1;
							}
							else if ( (LA6_11=='1') ) {
								alt6=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 6, 11, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 9, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA6_3=='1') ) {
					alt6=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:8: ( Date31 '/' Mois31 '/' Annee )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:8: ( Date31 '/' Mois31 '/' Annee )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:9: Date31 '/' Mois31 '/' Annee
					{
					mDate31(); 

					match('/'); 
					mMois31(); 

					match('/'); 
					mAnnee(); 

					}

					}
					break;
				case 2 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:36: ( Date30 '/' Mois30 '/' Annee )
					{
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:36: ( Date30 '/' Mois30 '/' Annee )
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:37: Date30 '/' Mois30 '/' Annee
					{
					mDate30(); 

					match('/'); 
					mMois30(); 

					match('/'); 
					mAnnee(); 

					}

					}
					break;
				case 3 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:24:64: Date29 '/02/' Annee
					{
					mDate29(); 

					match("/02/"); 

					mAnnee(); 

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
	// $ANTLR end "Date"

	@Override
	public void mTokens() throws RecognitionException {
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:1:8: ( Date )
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.3/date.g:1:10: Date
		{
		mDate(); 

		}

	}



}
