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
		T__17=18, ID=19, FLOAT=20, ALPHA=21, NUM=22, WHITESPACE=23, COMMENT=24, 
		COMMENT2=25;
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
			"T__17", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'/'", "'*'", "'+'", "'-'", "'!='", "'=='", "'&&'", "'||'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "ID", "FLOAT", "ALPHA", "NUM", 
			"WHITESPACE", "COMMENT", "COMMENT2"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00a1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\7\24j\n\24\f\24\16\24m\13\24\3\25"+
		"\6\25p\n\25\r\25\16\25q\3\25\3\25\6\25v\n\25\r\25\16\25w\5\25z\n\25\3"+
		"\26\3\26\3\27\3\27\3\30\6\30\u0081\n\30\r\30\16\30\u0082\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\7\31\u008b\n\31\f\31\16\31\u008e\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0098\n\32\f\32\16\32\u009b\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\3\2\b\13\2C\\aac|\u00a7\u00a8\u00ba\u00ba\u00c5\u00c5\u02de\u02de"+
		"\u2022\u2022\u2028\u2028\3\2\62;\5\2\13\f\17\17\"\"\3\2\f\f\3\2,,\3\2"+
		"\61\61\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67\3\2\2\2\7"+
		"9\3\2\2\2\t;\3\2\2\2\13=\3\2\2\2\rD\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23"+
		"N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35Y\3\2\2\2"+
		"\37\\\3\2\2\2!_\3\2\2\2#b\3\2\2\2%d\3\2\2\2\'f\3\2\2\2)o\3\2\2\2+{\3\2"+
		"\2\2-}\3\2\2\2/\u0080\3\2\2\2\61\u0086\3\2\2\2\63\u0091\3\2\2\2\65\66"+
		"\7}\2\2\66\4\3\2\2\2\678\7\177\2\28\6\3\2\2\29:\7?\2\2:\b\3\2\2\2;<\7"+
		"=\2\2<\n\3\2\2\2=>\7q\2\2>?\7w\2\2?@\7v\2\2@A\7r\2\2AB\7w\2\2BC\7v\2\2"+
		"C\f\3\2\2\2DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HI\7g\2\2I\16\3\2\2\2J"+
		"K\7*\2\2K\20\3\2\2\2LM\7+\2\2M\22\3\2\2\2NO\7\61\2\2O\24\3\2\2\2PQ\7,"+
		"\2\2Q\26\3\2\2\2RS\7-\2\2S\30\3\2\2\2TU\7/\2\2U\32\3\2\2\2VW\7#\2\2WX"+
		"\7?\2\2X\34\3\2\2\2YZ\7?\2\2Z[\7?\2\2[\36\3\2\2\2\\]\7(\2\2]^\7(\2\2^"+
		" \3\2\2\2_`\7~\2\2`a\7~\2\2a\"\3\2\2\2bc\7>\2\2c$\3\2\2\2de\7@\2\2e&\3"+
		"\2\2\2fk\5+\26\2gj\5+\26\2hj\5-\27\2ig\3\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2l(\3\2\2\2mk\3\2\2\2np\5-\27\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2ry\3\2\2\2su\7\60\2\2tv\5-\27\2ut\3\2\2\2vw\3\2\2\2wu"+
		"\3\2\2\2wx\3\2\2\2xz\3\2\2\2ys\3\2\2\2yz\3\2\2\2z*\3\2\2\2{|\t\2\2\2|"+
		",\3\2\2\2}~\t\3\2\2~.\3\2\2\2\177\u0081\t\4\2\2\u0080\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\u0085\b\30\2\2\u0085\60\3\2\2\2\u0086\u0087\7\61\2\2\u0087"+
		"\u0088\7\61\2\2\u0088\u008c\3\2\2\2\u0089\u008b\n\5\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\b\31\2\2\u0090\62\3\2\2"+
		"\2\u0091\u0092\7\61\2\2\u0092\u0093\7,\2\2\u0093\u0099\3\2\2\2\u0094\u0098"+
		"\n\6\2\2\u0095\u0096\7,\2\2\u0096\u0098\n\7\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\7,\2\2\u009d"+
		"\u009e\7\61\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\32\2\2\u00a0\64\3\2"+
		"\2\2\f\2ikqwy\u0082\u008c\u0097\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}