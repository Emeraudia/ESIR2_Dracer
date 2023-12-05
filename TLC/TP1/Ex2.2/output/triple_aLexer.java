// $ANTLR 3.5.1 /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g 2023-10-27 15:59:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class triple_aLexer extends Lexer {
	public static final int EOF=-1;
	public static final int S=4;
	public static final int T=5;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public triple_aLexer() {} 
	public triple_aLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public triple_aLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g"; }

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:3:12: ( ( 'b' )* 'a' )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:3:14: ( 'b' )* 'a'
			{
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:3:14: ( 'b' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='b') ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:3:14: 'b'
					{
					match('b'); 
					}
					break;

				default :
					break loop1;
				}
			}

			match('a'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			int _type = T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:4:3: ( S S S ( 'a' | 'b' )* )
			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:4:5: S S S ( 'a' | 'b' )*
			{
			mS(); 

			mS(); 

			mS(); 

			// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:4:10: ( 'a' | 'b' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= 'a' && LA2_0 <= 'b')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:
					{
					if ( (input.LA(1) >= 'a' && input.LA(1) <= 'b') ) {
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	@Override
	public void mTokens() throws RecognitionException {
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:1:8: ( T )
		// /mnt/DATA/cours/ESIR2_GIT/TLC/TP1/Ex2.2/triple_a.g:1:10: T
		{
		mT(); 

		}

	}



}
