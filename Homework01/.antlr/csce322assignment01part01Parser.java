// Generated from c:\Users\Adrian\Desktop\Homework01\csce322assignment01part01.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ROW_ENDING=1, MOVES_ENDING=2, MOVES_BEGINNING=3, GAME_ENDING=4, GAME_BEGINNING=5, 
		SECTION_BEGINNING=6, SECTION_ENDING=7, MOVE_TITLE=8, GAME_TITLE=9, MOVE_SYMBOL=10, 
		GAME_SYMBOL=11, EMPTY=12, UNDER=13, WHITESPACE=14, SYMANTIC_ERROR=15, 
		ANYTHING=16;
	public static final int
		RULE_connectFour = 0;
	public static final String[] ruleNames = {
		"connectFour"
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

	@Override
	public String getGrammarFileName() { return "csce322assignment01part01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322assignment01part01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConnectFourContext extends ParserRuleContext {
		public Token MOVE_SYMBOL;
		public Token GAME_SYMBOL;
		public Token SYMANTIC_ERROR;
		public TerminalNode EOF() { return getToken(csce322assignment01part01Parser.EOF, 0); }
		public List<TerminalNode> SECTION_BEGINNING() { return getTokens(csce322assignment01part01Parser.SECTION_BEGINNING); }
		public TerminalNode SECTION_BEGINNING(int i) {
			return getToken(csce322assignment01part01Parser.SECTION_BEGINNING, i);
		}
		public List<TerminalNode> SECTION_ENDING() { return getTokens(csce322assignment01part01Parser.SECTION_ENDING); }
		public TerminalNode SECTION_ENDING(int i) {
			return getToken(csce322assignment01part01Parser.SECTION_ENDING, i);
		}
		public List<TerminalNode> MOVE_TITLE() { return getTokens(csce322assignment01part01Parser.MOVE_TITLE); }
		public TerminalNode MOVE_TITLE(int i) {
			return getToken(csce322assignment01part01Parser.MOVE_TITLE, i);
		}
		public List<TerminalNode> UNDER() { return getTokens(csce322assignment01part01Parser.UNDER); }
		public TerminalNode UNDER(int i) {
			return getToken(csce322assignment01part01Parser.UNDER, i);
		}
		public List<TerminalNode> GAME_TITLE() { return getTokens(csce322assignment01part01Parser.GAME_TITLE); }
		public TerminalNode GAME_TITLE(int i) {
			return getToken(csce322assignment01part01Parser.GAME_TITLE, i);
		}
		public List<TerminalNode> MOVES_ENDING() { return getTokens(csce322assignment01part01Parser.MOVES_ENDING); }
		public TerminalNode MOVES_ENDING(int i) {
			return getToken(csce322assignment01part01Parser.MOVES_ENDING, i);
		}
		public List<TerminalNode> MOVES_BEGINNING() { return getTokens(csce322assignment01part01Parser.MOVES_BEGINNING); }
		public TerminalNode MOVES_BEGINNING(int i) {
			return getToken(csce322assignment01part01Parser.MOVES_BEGINNING, i);
		}
		public List<TerminalNode> GAME_ENDING() { return getTokens(csce322assignment01part01Parser.GAME_ENDING); }
		public TerminalNode GAME_ENDING(int i) {
			return getToken(csce322assignment01part01Parser.GAME_ENDING, i);
		}
		public List<TerminalNode> GAME_BEGINNING() { return getTokens(csce322assignment01part01Parser.GAME_BEGINNING); }
		public TerminalNode GAME_BEGINNING(int i) {
			return getToken(csce322assignment01part01Parser.GAME_BEGINNING, i);
		}
		public List<TerminalNode> ROW_ENDING() { return getTokens(csce322assignment01part01Parser.ROW_ENDING); }
		public TerminalNode ROW_ENDING(int i) {
			return getToken(csce322assignment01part01Parser.ROW_ENDING, i);
		}
		public List<TerminalNode> MOVE_SYMBOL() { return getTokens(csce322assignment01part01Parser.MOVE_SYMBOL); }
		public TerminalNode MOVE_SYMBOL(int i) {
			return getToken(csce322assignment01part01Parser.MOVE_SYMBOL, i);
		}
		public List<TerminalNode> GAME_SYMBOL() { return getTokens(csce322assignment01part01Parser.GAME_SYMBOL); }
		public TerminalNode GAME_SYMBOL(int i) {
			return getToken(csce322assignment01part01Parser.GAME_SYMBOL, i);
		}
		public List<TerminalNode> EMPTY() { return getTokens(csce322assignment01part01Parser.EMPTY); }
		public TerminalNode EMPTY(int i) {
			return getToken(csce322assignment01part01Parser.EMPTY, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(csce322assignment01part01Parser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(csce322assignment01part01Parser.WHITESPACE, i);
		}
		public List<TerminalNode> SYMANTIC_ERROR() { return getTokens(csce322assignment01part01Parser.SYMANTIC_ERROR); }
		public TerminalNode SYMANTIC_ERROR(int i) {
			return getToken(csce322assignment01part01Parser.SYMANTIC_ERROR, i);
		}
		public ConnectFourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectFour; }
	}

	public final ConnectFourContext connectFour() throws RecognitionException {
		ConnectFourContext _localctx = new ConnectFourContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_connectFour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SECTION_BEGINNING:
					{
					setState(2);
					match(SECTION_BEGINNING);
					System.out.println("Beginning of Section");
					}
					break;
				case SECTION_ENDING:
					{
					setState(4);
					match(SECTION_ENDING);
					System.out.println("End of Section");
					}
					break;
				case MOVE_TITLE:
					{
					setState(6);
					match(MOVE_TITLE);
					System.out.println("Moves Section");
					}
					break;
				case UNDER:
					{
					setState(8);
					match(UNDER);
					}
					break;
				case GAME_TITLE:
					{
					setState(9);
					match(GAME_TITLE);
					System.out.println("Game Section");
					}
					break;
				case MOVES_ENDING:
					{
					setState(11);
					match(MOVES_ENDING);
					System.out.println("End of List");
					}
					break;
				case MOVES_BEGINNING:
					{
					setState(13);
					match(MOVES_BEGINNING);
					System.out.println("Beginning of List");
					}
					break;
				case GAME_ENDING:
					{
					setState(15);
					match(GAME_ENDING);
					System.out.println("End of Game");
					}
					break;
				case GAME_BEGINNING:
					{
					setState(17);
					match(GAME_BEGINNING);
					System.out.println("Start of Game");
					}
					break;
				case ROW_ENDING:
					{
					setState(19);
					match(ROW_ENDING);
					System.out.println("End of Row");
					}
					break;
				case MOVE_SYMBOL:
					{
					setState(21);
					((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
					System.out.println("Number: "+(((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null));
					}
					break;
				case GAME_SYMBOL:
					{
					setState(23);
					((ConnectFourContext)_localctx).GAME_SYMBOL = match(GAME_SYMBOL);
					System.out.println("Number: "+(((ConnectFourContext)_localctx).GAME_SYMBOL!=null?((ConnectFourContext)_localctx).GAME_SYMBOL.getText():null));
					}
					break;
				case EMPTY:
					{
					setState(25);
					match(EMPTY);
					System.out.println("Space: Empty");
					}
					break;
				case WHITESPACE:
					{
					setState(27);
					match(WHITESPACE);
					}
					break;
				case SYMANTIC_ERROR:
					{
					{
					setState(28);
					((ConnectFourContext)_localctx).SYMANTIC_ERROR = match(SYMANTIC_ERROR);
					System.out.println("SYNTAX PROBLEM ON LINE "+(((ConnectFourContext)_localctx).SYMANTIC_ERROR!=null?((ConnectFourContext)_localctx).SYMANTIC_ERROR.getLine():0)); System.exit(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW_ENDING) | (1L << MOVES_ENDING) | (1L << MOVES_BEGINNING) | (1L << GAME_ENDING) | (1L << GAME_BEGINNING) | (1L << SECTION_BEGINNING) | (1L << SECTION_ENDING) | (1L << MOVE_TITLE) | (1L << GAME_TITLE) | (1L << MOVE_SYMBOL) | (1L << GAME_SYMBOL) | (1L << EMPTY) | (1L << UNDER) | (1L << WHITESPACE) | (1L << SYMANTIC_ERROR))) != 0) );
			setState(34);
			match(EOF);
			System.out.println("End of File");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22(\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\2\3\2\3\2\3"+
		"\2\2\2\3\2\2\2\2\65\2 \3\2\2\2\4\5\7\b\2\2\5!\b\2\1\2\6\7\7\t\2\2\7!\b"+
		"\2\1\2\b\t\7\n\2\2\t!\b\2\1\2\n!\7\17\2\2\13\f\7\13\2\2\f!\b\2\1\2\r\16"+
		"\7\4\2\2\16!\b\2\1\2\17\20\7\5\2\2\20!\b\2\1\2\21\22\7\6\2\2\22!\b\2\1"+
		"\2\23\24\7\7\2\2\24!\b\2\1\2\25\26\7\3\2\2\26!\b\2\1\2\27\30\7\f\2\2\30"+
		"!\b\2\1\2\31\32\7\r\2\2\32!\b\2\1\2\33\34\7\16\2\2\34!\b\2\1\2\35!\7\20"+
		"\2\2\36\37\7\21\2\2\37!\b\2\1\2 \4\3\2\2\2 \6\3\2\2\2 \b\3\2\2\2 \n\3"+
		"\2\2\2 \13\3\2\2\2 \r\3\2\2\2 \17\3\2\2\2 \21\3\2\2\2 \23\3\2\2\2 \25"+
		"\3\2\2\2 \27\3\2\2\2 \31\3\2\2\2 \33\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2!"+
		"\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%&\b\2\1\2&\3\3\2"+
		"\2\2\4 \"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}