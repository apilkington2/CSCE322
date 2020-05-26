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
public class csce322assignment01part01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ROW_ENDING=1, MOVES_ENDING=2, MOVES_BEGINNING=3, GAME_ENDING=4, GAME_BEGINNING=5, 
		SECTION_BEGINNING=6, SECTION_ENDING=7, MOVE_TITLE=8, GAME_TITLE=9, MOVE_SYMBOL=10, 
		GAME_SYMBOL=11, EMPTY=12, UNDER=13, WHITESPACE=14, SYMANTIC_ERROR=15, 
		ANYTHING=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NUMBER", "M", "O", "V", "E", "S", "G", "A", "SLASH", "STAR", "RIGHT_BRACKET", 
		"LEFT_BRACKET", "RIGHT_BRACE", "LEFT_BRACE", "ROW", "MINUS", "LEFT_PARENT", 
		"RIGHT_PARENT", "POUND", "EXCLAIM", "ARROW", "QUESTION", "BACKSLASH", 
		"UNDERSCORE", "ROW_ENDING", "MOVES_ENDING", "MOVES_BEGINNING", "GAME_ENDING", 
		"GAME_BEGINNING", "SECTION_BEGINNING", "SECTION_ENDING", "MOVE_TITLE", 
		"GAME_TITLE", "MOVE_SYMBOL", "GAME_SYMBOL", "EMPTY", "UNDER", "WHITESPACE", 
		"SYMANTIC_ERROR", "ANYTHING"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ROW_ENDING", "MOVES_ENDING", "MOVES_BEGINNING", "GAME_ENDING", 
		"GAME_BEGINNING", "SECTION_BEGINNING", "SECTION_ENDING", "MOVE_TITLE", 
		"GAME_TITLE", "MOVE_SYMBOL", "GAME_SYMBOL", "EMPTY", "UNDER", "WHITESPACE", 
		"SYMANTIC_ERROR", "ANYTHING"
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


	public csce322assignment01part01Lexer(CharStream input) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u00c1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\6#\u00a0\n#\r#\16#\u00a1"+
		"\3$\6$\u00a5\n$\r$\16$\u00a6\3%\3%\3&\3&\3\'\6\'\u00ae\n\'\r\'\16\'\u00af"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u00be\n(\3)\3)\2\2*\3\2\5\2"+
		"\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%"+
		"\2\'\2)\2+\2-\2/\2\61\2\63\3\65\4\67\59\6;\7=\b?\tA\nC\13E\fG\rI\16K\17"+
		"M\20O\21Q\22\3\2\3\4\2\13\f\"\"\2\u00b2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r"+
		"]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2"+
		"\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%"+
		"u\3\2\2\2\'w\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\u0081"+
		"\3\2\2\2\63\u0083\3\2\2\2\65\u0085\3\2\2\2\67\u0087\3\2\2\29\u0089\3\2"+
		"\2\2;\u008b\3\2\2\2=\u008d\3\2\2\2?\u0090\3\2\2\2A\u0093\3\2\2\2C\u0099"+
		"\3\2\2\2E\u009f\3\2\2\2G\u00a4\3\2\2\2I\u00a8\3\2\2\2K\u00aa\3\2\2\2M"+
		"\u00ad\3\2\2\2O\u00bd\3\2\2\2Q\u00bf\3\2\2\2ST\4\62;\2T\4\3\2\2\2UV\7"+
		"o\2\2V\6\3\2\2\2WX\7q\2\2X\b\3\2\2\2YZ\7x\2\2Z\n\3\2\2\2[\\\7g\2\2\\\f"+
		"\3\2\2\2]^\7u\2\2^\16\3\2\2\2_`\7i\2\2`\20\3\2\2\2ab\7c\2\2b\22\3\2\2"+
		"\2cd\7\61\2\2d\24\3\2\2\2ef\7,\2\2f\26\3\2\2\2gh\7\177\2\2h\30\3\2\2\2"+
		"ij\7}\2\2j\32\3\2\2\2kl\7_\2\2l\34\3\2\2\2mn\7]\2\2n\36\3\2\2\2op\7~\2"+
		"\2p \3\2\2\2qr\7/\2\2r\"\3\2\2\2st\7*\2\2t$\3\2\2\2uv\7+\2\2v&\3\2\2\2"+
		"wx\7%\2\2x(\3\2\2\2yz\7#\2\2z*\3\2\2\2{|\7@\2\2|,\3\2\2\2}~\7A\2\2~.\3"+
		"\2\2\2\177\u0080\7^\2\2\u0080\60\3\2\2\2\u0081\u0082\7a\2\2\u0082\62\3"+
		"\2\2\2\u0083\u0084\5\37\20\2\u0084\64\3\2\2\2\u0085\u0086\5\27\f\2\u0086"+
		"\66\3\2\2\2\u0087\u0088\5\31\r\2\u00888\3\2\2\2\u0089\u008a\5\33\16\2"+
		"\u008a:\3\2\2\2\u008b\u008c\5\35\17\2\u008c<\3\2\2\2\u008d\u008e\5\23"+
		"\n\2\u008e\u008f\5\25\13\2\u008f>\3\2\2\2\u0090\u0091\5\25\13\2\u0091"+
		"\u0092\5\23\n\2\u0092@\3\2\2\2\u0093\u0094\5\5\3\2\u0094\u0095\5\7\4\2"+
		"\u0095\u0096\5\t\5\2\u0096\u0097\5\13\6\2\u0097\u0098\5\r\7\2\u0098B\3"+
		"\2\2\2\u0099\u009a\5\17\b\2\u009a\u009b\5\21\t\2\u009b\u009c\5\5\3\2\u009c"+
		"\u009d\5\13\6\2\u009dD\3\2\2\2\u009e\u00a0\5\3\2\2\u009f\u009e\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2F\3"+
		"\2\2\2\u00a3\u00a5\5\3\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7H\3\2\2\2\u00a8\u00a9\5!\21\2"+
		"\u00a9J\3\2\2\2\u00aa\u00ab\5\61\31\2\u00abL\3\2\2\2\u00ac\u00ae\t\2\2"+
		"\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\'\2\2\u00b2N\3\2\2\2\u00b3"+
		"\u00be\5/\30\2\u00b4\u00be\5+\26\2\u00b5\u00be\5)\25\2\u00b6\u00be\5%"+
		"\23\2\u00b7\u00be\5#\22\2\u00b8\u00be\5\'\24\2\u00b9\u00ba\5\23\n\2\u00ba"+
		"\u00bb\5\23\n\2\u00bb\u00be\3\2\2\2\u00bc\u00be\5-\27\2\u00bd\u00b3\3"+
		"\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00beP\3\2\2\2\u00bf\u00c0\13\2\2\2\u00c0R\3\2\2\2\7\2\u00a1\u00a6"+
		"\u00af\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}