// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g 2023-10-27 15:50:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class voyellesLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public voyellesLexer() {} 
	public voyellesLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public voyellesLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g"; }

	// $ANTLR start "ALP"
	public final void mALP() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:3:15: ( 'a' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP"

	// $ANTLR start "ALP_a"
	public final void mALP_a() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:4:17: ( 'b' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'b' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP_a"

	// $ANTLR start "ALP_e"
	public final void mALP_e() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:5:17: ( 'a' .. 'd' | 'f' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'd')||(input.LA(1) >= 'f' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP_e"

	// $ANTLR start "ALP_i"
	public final void mALP_i() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:6:17: ( 'a' .. 'h' | 'j' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'h')||(input.LA(1) >= 'j' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP_i"

	// $ANTLR start "ALP_o"
	public final void mALP_o() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:7:17: ( 'a' .. 'n' | 'p' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'n')||(input.LA(1) >= 'p' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP_o"

	// $ANTLR start "ALP_u"
	public final void mALP_u() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:8:17: ( 'a' .. 't' | 'v' .. 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 't')||(input.LA(1) >= 'v' && input.LA(1) <= 'z') ) {
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
	// $ANTLR end "ALP_u"

	// $ANTLR start "ALP_y"
	public final void mALP_y() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:9:17: ( 'a' .. 'x' | 'z' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'x')||input.LA(1)=='z' ) {
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
	// $ANTLR end "ALP_y"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			int _type = S;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:5: ( ( ALP_a )* 'a' ( ALP_e )* 'e' ( ALP_i )* 'i' ( ALP_o )* 'o' ( ALP_u )* 'u' ( ALP_y )* 'y' ( ALP )* )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:7: ( ALP_a )* 'a' ( ALP_e )* 'e' ( ALP_i )* 'i' ( ALP_o )* 'o' ( ALP_u )* 'u' ( ALP_y )* 'y' ( ALP )*
			{
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:7: ( ALP_a )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'b' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'b' && input.LA(1) <= 'z') ) {
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

			match('a'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:16: ( ALP_e )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'a' && LA2_0 <= 'd')||(LA2_0 >= 'f' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'd')||(input.LA(1) >= 'f' && input.LA(1) <= 'z') ) {
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
					break loop2;
				}
			}

			match('e'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:25: ( ALP_i )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= 'a' && LA3_0 <= 'h')||(LA3_0 >= 'j' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'h')||(input.LA(1) >= 'j' && input.LA(1) <= 'z') ) {
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
					break loop3;
				}
			}

			match('i'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:34: ( ALP_o )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'a' && LA4_0 <= 'n')||(LA4_0 >= 'p' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'n')||(input.LA(1) >= 'p' && input.LA(1) <= 'z') ) {
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

			match('o'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:43: ( ALP_u )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= 'a' && LA5_0 <= 't')||(LA5_0 >= 'v' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 't')||(input.LA(1) >= 'v' && input.LA(1) <= 'z') ) {
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
					break loop5;
				}
			}

			match('u'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:52: ( ALP_y )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= 'a' && LA6_0 <= 'x')||LA6_0=='z') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'x')||input.LA(1)=='z' ) {
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
					break loop6;
				}
			}

			match('y'); 
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:11:61: ( ALP )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop7;
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
	// $ANTLR end "S"

	@Override
	public void mTokens() throws RecognitionException {
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:1:8: ( S )
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.1/voyelles.g:1:10: S
		{
		mS(); 

		}

	}



}
