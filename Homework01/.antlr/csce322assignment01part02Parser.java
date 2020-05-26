// Generated from c:\Users\Adrian\Desktop\Homework01\csce322assignment01part02.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322assignment01part02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ROW_ENDING=1, MOVES_ENDING=2, MOVES_BEGINNING=3, GAME_ENDING=4, GAME_BEGINNING=5, 
		SECTION_BEGINNING=6, SECTION_ENDING=7, MOVE_TITLE=8, GAME_TITLE=9, MOVE_SYMBOL=10, 
		GAME_SYMBOL=11, EMPTY=12, UNDER=13, WHITESPACE=14, ANYTHING=15;
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

	@Override
	public String getGrammarFileName() { return "csce322assignment01part02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322assignment01part02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConnectFourContext extends ParserRuleContext {
		public Token MOVE_SYMBOL;
		public TerminalNode MOVE_TITLE() { return getToken(csce322assignment01part02Parser.MOVE_TITLE, 0); }
		public List<TerminalNode> SECTION_BEGINNING() { return getTokens(csce322assignment01part02Parser.SECTION_BEGINNING); }
		public TerminalNode SECTION_BEGINNING(int i) {
			return getToken(csce322assignment01part02Parser.SECTION_BEGINNING, i);
		}
		public TerminalNode MOVES_BEGINNING() { return getToken(csce322assignment01part02Parser.MOVES_BEGINNING, 0); }
		public TerminalNode MOVES_ENDING() { return getToken(csce322assignment01part02Parser.MOVES_ENDING, 0); }
		public List<TerminalNode> SECTION_ENDING() { return getTokens(csce322assignment01part02Parser.SECTION_ENDING); }
		public TerminalNode SECTION_ENDING(int i) {
			return getToken(csce322assignment01part02Parser.SECTION_ENDING, i);
		}
		public TerminalNode GAME_TITLE() { return getToken(csce322assignment01part02Parser.GAME_TITLE, 0); }
		public TerminalNode GAME_BEGINNING() { return getToken(csce322assignment01part02Parser.GAME_BEGINNING, 0); }
		public List<TerminalNode> ROW_ENDING() { return getTokens(csce322assignment01part02Parser.ROW_ENDING); }
		public TerminalNode ROW_ENDING(int i) {
			return getToken(csce322assignment01part02Parser.ROW_ENDING, i);
		}
		public TerminalNode GAME_ENDING() { return getToken(csce322assignment01part02Parser.GAME_ENDING, 0); }
		public TerminalNode EOF() { return getToken(csce322assignment01part02Parser.EOF, 0); }
		public List<TerminalNode> MOVE_SYMBOL() { return getTokens(csce322assignment01part02Parser.MOVE_SYMBOL); }
		public TerminalNode MOVE_SYMBOL(int i) {
			return getToken(csce322assignment01part02Parser.MOVE_SYMBOL, i);
		}
		public List<TerminalNode> EMPTY() { return getTokens(csce322assignment01part02Parser.EMPTY); }
		public TerminalNode EMPTY(int i) {
			return getToken(csce322assignment01part02Parser.EMPTY, i);
		}
		public List<TerminalNode> UNDER() { return getTokens(csce322assignment01part02Parser.UNDER); }
		public TerminalNode UNDER(int i) {
			return getToken(csce322assignment01part02Parser.UNDER, i);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE_TITLE:
				enterOuterAlt(_localctx, 1);
				{
				{
				int max = 1; int amount = 0; boolean col = false; boolean row = false; boolean one = false; boolean two = false; int columns = 0; int rows = 1;
				setState(3);
				match(MOVE_TITLE);
				setState(4);
				match(SECTION_BEGINNING);
				setState(5);
				match(MOVES_BEGINNING);
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(6);
					((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
					if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) > max){max=Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null));}
					setState(9);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNDER) {
						{
						setState(8);
						match(UNDER);
						}
					}

					}
					}
					setState(13); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL );
				setState(15);
				match(MOVES_ENDING);
				setState(16);
				match(SECTION_ENDING);
				setState(17);
				match(GAME_TITLE);
				setState(18);
				match(SECTION_BEGINNING);
				setState(19);
				match(GAME_BEGINNING);
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(24);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(20);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(22);
						match(EMPTY);
						columns++;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(26); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				if(columns > 10 || columns < 6){col=true;}
				setState(29);
				match(ROW_ENDING);
				rows++;
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(34);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(31);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(33);
						match(EMPTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				setState(38);
				match(ROW_ENDING);
				rows++;
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(43);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(40);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(42);
						match(EMPTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				setState(47);
				match(ROW_ENDING);
				rows++;
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(54);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(49);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(51);
						match(EMPTY);
						}
						break;
					case ROW_ENDING:
						{
						setState(52);
						match(ROW_ENDING);
						rows++; if(rows > 10){row=true;}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(56); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW_ENDING) | (1L << MOVE_SYMBOL) | (1L << EMPTY))) != 0) );
				setState(58);
				match(GAME_ENDING);
				if(rows < 6){row=true;}
				setState(60);
				match(SECTION_ENDING);
				if(!two || !one){System.out.println("SEMANTIC PROBLEM 1");}if(row){System.out.println("SEMANTIC PROBLEM 2");}if(col){System.out.println("SEMANTIC PROBLEM 3");}if(max>columns){System.out.println("SEMANTIC PROBLEM 4");}else if(max <=columns && !col && !row && one && two){System.out.println(amount + " pieces have been played");}
				setState(62);
				match(EOF);
				}
				}
				break;
			case GAME_TITLE:
				enterOuterAlt(_localctx, 2);
				{
				{
				int max = 1; int amount = 0; boolean col = false; boolean row = false; boolean one = false; boolean two = false; int columns = 0; int rows = 1;
				setState(64);
				match(GAME_TITLE);
				setState(65);
				match(SECTION_BEGINNING);
				setState(66);
				match(GAME_BEGINNING);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(67);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(69);
						match(EMPTY);
						columns++;
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				if(columns > 10 || columns < 6){col=true;}
				setState(76);
				match(ROW_ENDING);
				rows++;
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(81);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(78);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(80);
						match(EMPTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(83); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				setState(85);
				match(ROW_ENDING);
				rows++;
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(90);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(87);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(89);
						match(EMPTY);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(92); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL || _la==EMPTY );
				setState(94);
				match(ROW_ENDING);
				rows++;
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(101);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MOVE_SYMBOL:
						{
						setState(96);
						((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
						amount++; if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 1) {one = true;} if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) == 2) {two = true;}
						}
						break;
					case EMPTY:
						{
						setState(98);
						match(EMPTY);
						}
						break;
					case ROW_ENDING:
						{
						setState(99);
						match(ROW_ENDING);
						rows++; if(rows > 10){row=true;}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROW_ENDING) | (1L << MOVE_SYMBOL) | (1L << EMPTY))) != 0) );
				setState(105);
				match(GAME_ENDING);
				if(rows < 6){row=true;}
				setState(107);
				match(SECTION_ENDING);
				if(!two || !one){System.out.println("SEMANTIC PROBLEM 1");}if(row){System.out.println("SEMANTIC PROBLEM 2");}if(col){System.out.println("SEMANTIC PROBLEM 3");}
				setState(109);
				match(MOVE_TITLE);
				setState(110);
				match(SECTION_BEGINNING);
				setState(111);
				match(MOVES_BEGINNING);
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(112);
					((ConnectFourContext)_localctx).MOVE_SYMBOL = match(MOVE_SYMBOL);
					if(Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null)) > max){max=Integer.parseInt((((ConnectFourContext)_localctx).MOVE_SYMBOL!=null?((ConnectFourContext)_localctx).MOVE_SYMBOL.getText():null));}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNDER) {
						{
						setState(114);
						match(UNDER);
						}
					}

					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MOVE_SYMBOL );
				setState(121);
				match(MOVES_ENDING);
				setState(122);
				match(SECTION_ENDING);
				if(max > columns){System.out.println("SEMANTIC PROBLEM 4");}else if(!row && !col && (one || two)){System.out.println(amount + " pieces have been played");}
				setState(124);
				match(EOF);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u0082\4\2\t\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\f\n\2\6\2\16\n\2\r\2\16\2\17\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\33\n\2\r\2\16\2\34\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\6\2%\n\2\r\2\16\2&\3\2\3\2\3\2\3\2\3\2\6\2.\n\2\r\2\16\2/\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\6\29\n\2\r\2\16\2:\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\6\2J\n\2\r\2\16\2K\3\2\3\2\3\2\3\2\3\2\3\2\6"+
		"\2T\n\2\r\2\16\2U\3\2\3\2\3\2\3\2\3\2\6\2]\n\2\r\2\16\2^\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\6\2h\n\2\r\2\16\2i\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2v\n\2\6\2x\n\2\r\2\16\2y\3\2\3\2\3\2\3\2\5\2\u0080\n\2\3\2\2\2"+
		"\3\2\2\2\2\u0097\2\177\3\2\2\2\4\5\b\2\1\2\5\6\7\n\2\2\6\7\7\b\2\2\7\r"+
		"\7\5\2\2\b\t\7\f\2\2\t\13\b\2\1\2\n\f\7\17\2\2\13\n\3\2\2\2\13\f\3\2\2"+
		"\2\f\16\3\2\2\2\r\b\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20"+
		"\21\3\2\2\2\21\22\7\4\2\2\22\23\7\t\2\2\23\24\7\13\2\2\24\25\7\b\2\2\25"+
		"\32\7\7\2\2\26\27\7\f\2\2\27\33\b\2\1\2\30\31\7\16\2\2\31\33\b\2\1\2\32"+
		"\26\3\2\2\2\32\30\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\36\3\2\2\2\36\37\b\2\1\2\37 \7\3\2\2 $\b\2\1\2!\"\7\f\2\2\"%\b\2\1\2"+
		"#%\7\16\2\2$!\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2"+
		"\2\2()\7\3\2\2)-\b\2\1\2*+\7\f\2\2+.\b\2\1\2,.\7\16\2\2-*\3\2\2\2-,\3"+
		"\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\3\2\2\62"+
		"8\b\2\1\2\63\64\7\f\2\2\649\b\2\1\2\659\7\16\2\2\66\67\7\3\2\2\679\b\2"+
		"\1\28\63\3\2\2\28\65\3\2\2\28\66\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2"+
		";<\3\2\2\2<=\7\6\2\2=>\b\2\1\2>?\7\t\2\2?@\b\2\1\2@\u0080\7\2\2\3AB\b"+
		"\2\1\2BC\7\13\2\2CD\7\b\2\2DI\7\7\2\2EF\7\f\2\2FJ\b\2\1\2GH\7\16\2\2H"+
		"J\b\2\1\2IE\3\2\2\2IG\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MN\b\2\1\2NO\7\3\2\2OS\b\2\1\2PQ\7\f\2\2QT\b\2\1\2RT\7\16\2\2SP\3\2\2"+
		"\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\3\2\2X\\\b\2"+
		"\1\2YZ\7\f\2\2Z]\b\2\1\2[]\7\16\2\2\\Y\3\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\3\2\2ag\b\2\1\2bc\7\f\2\2ch\b\2\1\2d"+
		"h\7\16\2\2ef\7\3\2\2fh\b\2\1\2gb\3\2\2\2gd\3\2\2\2ge\3\2\2\2hi\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\6\2\2lm\b\2\1\2mn\7\t\2\2no\b\2\1\2"+
		"op\7\n\2\2pq\7\b\2\2qw\7\5\2\2rs\7\f\2\2su\b\2\1\2tv\7\17\2\2ut\3\2\2"+
		"\2uv\3\2\2\2vx\3\2\2\2wr\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{|\7\4\2\2|}\7\t\2\2}~\b\2\1\2~\u0080\7\2\2\3\177\4\3\2\2\2\177A\3\2"+
		"\2\2\u0080\3\3\2\2\2\27\13\17\32\34$&-/8:IKSU\\^giuy\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}