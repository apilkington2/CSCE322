// Generated from c:\Users\Adrian\Desktop\Homework01\csce322assignment01part02.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ROW_ENDING=1, MOVES_ENDING=2, MOVES_BEGINNING=3, GAME_ENDING=4, GAME_BEGINNING=5, 
		SECTION_BEGINNING=6, SECTION_ENDING=7, MOVE_TITLE=8, GAME_TITLE=9, MOVE_SYMBOL=10, 
		GAME_SYMBOL=11, EMPTY=12, UNDER=13, WHITESPACE=14, ANYTHING=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", 
		"ZERO", "M", "O", "V", "E", "S", "G", "A", "SLASH", "STAR", "RIGHT_BRACKET", 
		"LEFT_BRACKET", "RIGHT_BRACE", "LEFT_BRACE", "ROW", "MINUS", "LEFT_PARENT", 
		"RIGHT_PARENT", "UNDERSCORE", "ROW_ENDING", "MOVES_ENDING", "MOVES_BEGINNING", 
		"GAME_ENDING", "GAME_BEGINNING", "SECTION_BEGINNING", "SECTION_ENDING", 
		"MOVE_TITLE", "GAME_TITLE", "MOVE_SYMBOL", "GAME_SYMBOL", "EMPTY", "UNDER", 
		"WHITESPACE", "ANYTHING"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ROW_ENDING", "MOVES_ENDING", "MOVES_BEGINNING", "GAME_ENDING", 
		"GAME_BEGINNING", "SECTION_BEGINNING", "SECTION_ENDING", "MOVE_TITLE", 
		"GAME_TITLE", "MOVE_SYMBOL", "GAME_SYMBOL", "EMPTY", "UNDER", "WHITESPACE", 
		"ANYTHING"
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


	public csce322assignment01part02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322assignment01part02.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00d1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u00b7\n\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\5(\u00c3\n(\3)\3)\3*\3*\3+\6+\u00ca\n+\r+\16+\u00cb"+
		"\3+\3+\3,\3,\2\2-\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31"+
		"\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\3="+
		"\4?\5A\6C\7E\bG\tI\nK\13M\fO\rQ\16S\17U\20W\21\3\2\3\4\2\13\f\"\"\2\u00c7"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2"+
		"\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25k\3\2\2"+
		"\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2\37u\3\2\2\2!w\3\2\2"+
		"\2#y\3\2\2\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0081\3\2\2\2-\u0083\3"+
		"\2\2\2/\u0085\3\2\2\2\61\u0087\3\2\2\2\63\u0089\3\2\2\2\65\u008b\3\2\2"+
		"\2\67\u008d\3\2\2\29\u008f\3\2\2\2;\u0091\3\2\2\2=\u0093\3\2\2\2?\u0095"+
		"\3\2\2\2A\u0097\3\2\2\2C\u0099\3\2\2\2E\u009b\3\2\2\2G\u009e\3\2\2\2I"+
		"\u00a1\3\2\2\2K\u00a7\3\2\2\2M\u00b6\3\2\2\2O\u00c2\3\2\2\2Q\u00c4\3\2"+
		"\2\2S\u00c6\3\2\2\2U\u00c9\3\2\2\2W\u00cf\3\2\2\2YZ\7\63\2\2Z\4\3\2\2"+
		"\2[\\\7\64\2\2\\\6\3\2\2\2]^\7\65\2\2^\b\3\2\2\2_`\7\66\2\2`\n\3\2\2\2"+
		"ab\7\67\2\2b\f\3\2\2\2cd\78\2\2d\16\3\2\2\2ef\79\2\2f\20\3\2\2\2gh\7:"+
		"\2\2h\22\3\2\2\2ij\7;\2\2j\24\3\2\2\2kl\7\62\2\2l\26\3\2\2\2mn\7o\2\2"+
		"n\30\3\2\2\2op\7q\2\2p\32\3\2\2\2qr\7x\2\2r\34\3\2\2\2st\7g\2\2t\36\3"+
		"\2\2\2uv\7u\2\2v \3\2\2\2wx\7i\2\2x\"\3\2\2\2yz\7c\2\2z$\3\2\2\2{|\7\61"+
		"\2\2|&\3\2\2\2}~\7,\2\2~(\3\2\2\2\177\u0080\7\177\2\2\u0080*\3\2\2\2\u0081"+
		"\u0082\7}\2\2\u0082,\3\2\2\2\u0083\u0084\7_\2\2\u0084.\3\2\2\2\u0085\u0086"+
		"\7]\2\2\u0086\60\3\2\2\2\u0087\u0088\7~\2\2\u0088\62\3\2\2\2\u0089\u008a"+
		"\7/\2\2\u008a\64\3\2\2\2\u008b\u008c\7*\2\2\u008c\66\3\2\2\2\u008d\u008e"+
		"\7+\2\2\u008e8\3\2\2\2\u008f\u0090\7a\2\2\u0090:\3\2\2\2\u0091\u0092\5"+
		"\61\31\2\u0092<\3\2\2\2\u0093\u0094\5)\25\2\u0094>\3\2\2\2\u0095\u0096"+
		"\5+\26\2\u0096@\3\2\2\2\u0097\u0098\5-\27\2\u0098B\3\2\2\2\u0099\u009a"+
		"\5/\30\2\u009aD\3\2\2\2\u009b\u009c\5%\23\2\u009c\u009d\5\'\24\2\u009d"+
		"F\3\2\2\2\u009e\u009f\5\'\24\2\u009f\u00a0\5%\23\2\u00a0H\3\2\2\2\u00a1"+
		"\u00a2\5\27\f\2\u00a2\u00a3\5\31\r\2\u00a3\u00a4\5\33\16\2\u00a4\u00a5"+
		"\5\35\17\2\u00a5\u00a6\5\37\20\2\u00a6J\3\2\2\2\u00a7\u00a8\5!\21\2\u00a8"+
		"\u00a9\5#\22\2\u00a9\u00aa\5\27\f\2\u00aa\u00ab\5\35\17\2\u00abL\3\2\2"+
		"\2\u00ac\u00b7\5\3\2\2\u00ad\u00b7\5\5\3\2\u00ae\u00b7\5\7\4\2\u00af\u00b7"+
		"\5\t\5\2\u00b0\u00b7\5\13\6\2\u00b1\u00b7\5\r\7\2\u00b2\u00b7\5\17\b\2"+
		"\u00b3\u00b7\5\21\t\2\u00b4\u00b7\5\23\n\2\u00b5\u00b7\5\25\13\2\u00b6"+
		"\u00ac\3\2\2\2\u00b6\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2"+
		"\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b3\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7N\3\2\2\2"+
		"\u00b8\u00c3\5\3\2\2\u00b9\u00c3\5\5\3\2\u00ba\u00c3\5\7\4\2\u00bb\u00c3"+
		"\5\t\5\2\u00bc\u00c3\5\13\6\2\u00bd\u00c3\5\r\7\2\u00be\u00c3\5\17\b\2"+
		"\u00bf\u00c3\5\21\t\2\u00c0\u00c3\5\23\n\2\u00c1\u00c3\5\25\13\2\u00c2"+
		"\u00b8\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00bb\3\2"+
		"\2\2\u00c2\u00bc\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3P\3\2\2\2"+
		"\u00c4\u00c5\5\63\32\2\u00c5R\3\2\2\2\u00c6\u00c7\59\35\2\u00c7T\3\2\2"+
		"\2\u00c8\u00ca\t\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b+\2\2\u00ce"+
		"V\3\2\2\2\u00cf\u00d0\13\2\2\2\u00d0X\3\2\2\2\6\2\u00b6\u00c2\u00cb\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}