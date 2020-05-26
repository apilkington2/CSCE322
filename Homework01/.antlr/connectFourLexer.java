// Generated from c:\Users\Adrian\Desktop\Homework01\csce322assignment01part01.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class connectFourLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE_SYMBOL=1, GAME_SYMBOL=2, WHITESPACE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SECTION_BEGINNING", "SECTION_ENDING", "SECTION_TITLE", "MOVES_ENDING", 
		"MOVES_BEGINNING", "GAME_ENDING", "GAME_BEGINNING", "ROW_ENDING", "NUMBER", 
		"MOVE_SYMBOL", "GAME_SYMBOL", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MOVE_SYMBOL", "GAME_SYMBOL", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public connectFourLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322assignment01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\6\13:\n\13\r\13\16\13;\3\f\3\f\6\f@\n\f\r\f\16\fA\3\r\3\r\6\rF\n\r"+
		"\r\r\16\rG\2\2\16\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\3\27\4\31"+
		"\5\3\2\2\2E\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\36\3"+
		"\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\21"+
		"\64\3\2\2\2\23\66\3\2\2\2\259\3\2\2\2\27?\3\2\2\2\31E\3\2\2\2\33\34\7"+
		"\61\2\2\34\35\7,\2\2\35\4\3\2\2\2\36\37\7,\2\2\37 \7\61\2\2 \6\3\2\2\2"+
		"!\"\7i\2\2\"#\7c\2\2#$\7o\2\2$+\7g\2\2%&\7o\2\2&\'\7q\2\2\'(\7x\2\2()"+
		"\7g\2\2)+\7u\2\2*!\3\2\2\2*%\3\2\2\2+\b\3\2\2\2,-\7\177\2\2-\n\3\2\2\2"+
		"./\7}\2\2/\f\3\2\2\2\60\61\7_\2\2\61\16\3\2\2\2\62\63\7]\2\2\63\20\3\2"+
		"\2\2\64\65\7~\2\2\65\22\3\2\2\2\66\67\4\62;\2\67\24\3\2\2\28:\5\23\n\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\26\3\2\2\2=@\7/\2\2>@\5\23\n"+
		"\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\30\3\2\2\2CF\7\""+
		"\2\2DF\5\23\n\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\32"+
		"\3\2\2\2\t\2*;?AEG\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}