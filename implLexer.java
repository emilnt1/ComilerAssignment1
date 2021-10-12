// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, ID=20, FLOAT=21, ALPHA=22, NUM=23, WHITESPACE=24, 
		COMMENT=25, COMMENT2=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'if'", "'/'", "'*'", "'+'", "'-'", "'!='", "'=='", "'&&'", "'||'", "'<'", 
			"'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "FLOAT", "ALPHA", 
			"NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\7\25o\n\25"+
		"\f\25\16\25r\13\25\3\26\6\26u\n\26\r\26\16\26v\3\26\3\26\6\26{\n\26\r"+
		"\26\16\26|\5\26\177\n\26\3\27\3\27\3\30\3\30\3\31\6\31\u0086\n\31\r\31"+
		"\16\31\u0087\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u0090\n\32\f\32\16\32"+
		"\u0093\13\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u009d\n\33\f"+
		"\33\16\33\u00a0\13\33\3\33\3\33\3\33\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\b\13\2C\\aac|\u00a7\u00a8"+
		"\u00ba\u00ba\u00c5\u00c5\u02de\u02de\u2022\u2022\u2028\u2028\3\2\62;\5"+
		"\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2\61\61\2\u00ae\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?"+
		"\3\2\2\2\rF\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25S\3\2\2\2\27"+
		"U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37^\3\2\2\2!a\3\2\2\2#d"+
		"\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)k\3\2\2\2+t\3\2\2\2-\u0080\3\2\2\2/\u0082"+
		"\3\2\2\2\61\u0085\3\2\2\2\63\u008b\3\2\2\2\65\u0096\3\2\2\2\678\7}\2\2"+
		"8\4\3\2\2\29:\7\177\2\2:\6\3\2\2\2;<\7?\2\2<\b\3\2\2\2=>\7=\2\2>\n\3\2"+
		"\2\2?@\7q\2\2@A\7w\2\2AB\7v\2\2BC\7r\2\2CD\7w\2\2DE\7v\2\2E\f\3\2\2\2"+
		"FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ\7n\2\2JK\7g\2\2K\16\3\2\2\2LM\7*\2\2M\20"+
		"\3\2\2\2NO\7+\2\2O\22\3\2\2\2PQ\7k\2\2QR\7h\2\2R\24\3\2\2\2ST\7\61\2\2"+
		"T\26\3\2\2\2UV\7,\2\2V\30\3\2\2\2WX\7-\2\2X\32\3\2\2\2YZ\7/\2\2Z\34\3"+
		"\2\2\2[\\\7#\2\2\\]\7?\2\2]\36\3\2\2\2^_\7?\2\2_`\7?\2\2` \3\2\2\2ab\7"+
		"(\2\2bc\7(\2\2c\"\3\2\2\2de\7~\2\2ef\7~\2\2f$\3\2\2\2gh\7>\2\2h&\3\2\2"+
		"\2ij\7@\2\2j(\3\2\2\2kp\5-\27\2lo\5-\27\2mo\5/\30\2nl\3\2\2\2nm\3\2\2"+
		"\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q*\3\2\2\2rp\3\2\2\2su\5/\30\2ts\3\2\2"+
		"\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2\2\2xz\7\60\2\2y{\5/\30\2zy\3\2"+
		"\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~x\3\2\2\2~\177\3\2\2\2"+
		"\177,\3\2\2\2\u0080\u0081\t\2\2\2\u0081.\3\2\2\2\u0082\u0083\t\3\2\2\u0083"+
		"\60\3\2\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\b\31\2\2\u008a\62\3\2\2\2\u008b\u008c\7\61\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u0091\3\2\2\2\u008e\u0090\n\5\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2"+
		"\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094\u0095\b\32\2\2\u0095\64\3\2\2\2\u0096\u0097\7\61"+
		"\2\2\u0097\u0098\7,\2\2\u0098\u009e\3\2\2\2\u0099\u009d\n\6\2\2\u009a"+
		"\u009b\7,\2\2\u009b\u009d\n\7\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a3\7\61"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\b\33\2\2\u00a5\66\3\2\2\2\f\2npv"+
		"|~\u0087\u0091\u009c\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}