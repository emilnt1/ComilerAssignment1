// Generated from impl.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, FLOAT=23, ALPHA=24, NUM=25, 
		WHITESPACE=26, COMMENT=27, COMMENT2=28;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_expr = 3, RULE_condition = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'='", "';'", "'output'", "'while'", "'('", "')'", 
			"'if'", "'for'", "'..'", "'/'", "'*'", "'+'", "'-'", "'!='", "'=='", 
			"'&&'", "'||'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "FLOAT", 
			"ALPHA", "NUM", "WHITESPACE", "COMMENT", "COMMENT2"
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

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
				{
				{
				setState(10);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends ProgramContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MultipleCommandsContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultipleCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultipleCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultipleCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends ProgramContext {
		public CommandContext c;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
			case T__8:
			case T__9:
			case ID:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case T__0:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(T__0);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0)) {
					{
					{
					setState(20);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(T__1);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStatementContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public IfStatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends CommandContext {
		public Token x;
		public ExprContext e1;
		public ExprContext e2;
		public ProgramContext p;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ForLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputContext extends CommandContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((AssignmentContext)_localctx).x = match(ID);
				setState(30);
				match(T__2);
				setState(31);
				((AssignmentContext)_localctx).e = expr(0);
				setState(32);
				match(T__3);
				}
				break;
			case T__4:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__4);
				setState(35);
				((OutputContext)_localctx).e = expr(0);
				setState(36);
				match(T__3);
				}
				break;
			case T__5:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__5);
				setState(39);
				match(T__6);
				setState(40);
				((WhileLoopContext)_localctx).c = condition();
				setState(41);
				match(T__7);
				setState(42);
				((WhileLoopContext)_localctx).p = program();
				}
				break;
			case T__8:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__8);
				setState(45);
				match(T__6);
				setState(46);
				((IfStatementContext)_localctx).c = condition();
				setState(47);
				match(T__7);
				setState(48);
				((IfStatementContext)_localctx).p = program();
				}
				break;
			case T__9:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__9);
				setState(51);
				match(T__6);
				setState(52);
				((ForLoopContext)_localctx).x = match(ID);
				setState(53);
				match(T__2);
				setState(54);
				((ForLoopContext)_localctx).e1 = expr(0);
				setState(55);
				match(T__10);
				setState(56);
				((ForLoopContext)_localctx).e2 = expr(0);
				setState(57);
				match(T__7);
				setState(58);
				((ForLoopContext)_localctx).p = program();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubtractionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegativeContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(implParser.FLOAT, 0); }
		public NegativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token c;
		public TerminalNode FLOAT() { return getToken(implParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(63);
				((ConstantContext)_localctx).c = match(FLOAT);
				}
				break;
			case T__14:
				{
				_localctx = new NegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(T__14);
				setState(65);
				((NegativeContext)_localctx).c = match(FLOAT);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case T__6:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(T__6);
				setState(68);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(69);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						((DivisionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(74);
						match(T__11);
						setState(75);
						((DivisionContext)_localctx).e2 = expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(77);
						match(T__12);
						setState(78);
						((MultiplicationContext)_localctx).e2 = expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
						match(T__13);
						setState(81);
						((AdditionContext)_localctx).e2 = expr(7);
						}
						break;
					case 4:
						{
						_localctx = new SubtractionContext(new ExprContext(_parentctx, _parentState));
						((SubtractionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
						match(T__14);
						setState(84);
						((SubtractionContext)_localctx).e2 = expr(6);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnequalContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public UnequalContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUnequal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUnequal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUnequal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SmallerContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSmaller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSmaller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSmaller(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LargerContext extends ConditionContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LargerContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLarger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLarger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLarger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new UnequalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((UnequalContext)_localctx).e1 = expr(0);
				setState(91);
				match(T__15);
				setState(92);
				((UnequalContext)_localctx).e2 = expr(0);
				}
				break;
			case 2:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((EqualContext)_localctx).e1 = expr(0);
				setState(95);
				match(T__16);
				setState(96);
				((EqualContext)_localctx).e2 = expr(0);
				}
				break;
			case 3:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				((AndContext)_localctx).e1 = expr(0);
				setState(99);
				match(T__17);
				setState(100);
				((AndContext)_localctx).e2 = expr(0);
				}
				break;
			case 4:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				((OrContext)_localctx).e1 = expr(0);
				setState(103);
				match(T__18);
				setState(104);
				((OrContext)_localctx).e2 = expr(0);
				}
				break;
			case 5:
				_localctx = new SmallerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				((SmallerContext)_localctx).e1 = expr(0);
				setState(107);
				match(T__19);
				setState(108);
				((SmallerContext)_localctx).e2 = expr(0);
				}
				break;
			case 6:
				_localctx = new LargerContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				((LargerContext)_localctx).e1 = expr(0);
				setState(111);
				match(T__20);
				setState(112);
				((LargerContext)_localctx).e2 = expr(0);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\3\5\3\36\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5J\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\6\2\3\b"+
		"\7\2\4\6\b\n\2\2\2\u0084\2\17\3\2\2\2\4\35\3\2\2\2\6>\3\2\2\2\bI\3\2\2"+
		"\2\nt\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\36"+
		"\5\6\4\2\25\31\7\3\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27"+
		"\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\36\7\4\2\2\35\24"+
		"\3\2\2\2\35\25\3\2\2\2\36\5\3\2\2\2\37 \7\30\2\2 !\7\5\2\2!\"\5\b\5\2"+
		"\"#\7\6\2\2#?\3\2\2\2$%\7\7\2\2%&\5\b\5\2&\'\7\6\2\2\'?\3\2\2\2()\7\b"+
		"\2\2)*\7\t\2\2*+\5\n\6\2+,\7\n\2\2,-\5\4\3\2-?\3\2\2\2./\7\13\2\2/\60"+
		"\7\t\2\2\60\61\5\n\6\2\61\62\7\n\2\2\62\63\5\4\3\2\63?\3\2\2\2\64\65\7"+
		"\f\2\2\65\66\7\t\2\2\66\67\7\30\2\2\678\7\5\2\289\5\b\5\29:\7\r\2\2:;"+
		"\5\b\5\2;<\7\n\2\2<=\5\4\3\2=?\3\2\2\2>\37\3\2\2\2>$\3\2\2\2>(\3\2\2\2"+
		">.\3\2\2\2>\64\3\2\2\2?\7\3\2\2\2@A\b\5\1\2AJ\7\31\2\2BC\7\21\2\2CJ\7"+
		"\31\2\2DJ\7\30\2\2EF\7\t\2\2FG\5\b\5\2GH\7\n\2\2HJ\3\2\2\2I@\3\2\2\2I"+
		"B\3\2\2\2ID\3\2\2\2IE\3\2\2\2JY\3\2\2\2KL\f\n\2\2LM\7\16\2\2MX\5\b\5\13"+
		"NO\f\t\2\2OP\7\17\2\2PX\5\b\5\nQR\f\b\2\2RS\7\20\2\2SX\5\b\5\tTU\f\7\2"+
		"\2UV\7\21\2\2VX\5\b\5\bWK\3\2\2\2WN\3\2\2\2WQ\3\2\2\2WT\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\]\5\b\5\2]^\7\22\2\2^_"+
		"\5\b\5\2_u\3\2\2\2`a\5\b\5\2ab\7\23\2\2bc\5\b\5\2cu\3\2\2\2de\5\b\5\2"+
		"ef\7\24\2\2fg\5\b\5\2gu\3\2\2\2hi\5\b\5\2ij\7\25\2\2jk\5\b\5\2ku\3\2\2"+
		"\2lm\5\b\5\2mn\7\26\2\2no\5\b\5\2ou\3\2\2\2pq\5\b\5\2qr\7\27\2\2rs\5\b"+
		"\5\2su\3\2\2\2t\\\3\2\2\2t`\3\2\2\2td\3\2\2\2th\3\2\2\2tl\3\2\2\2tp\3"+
		"\2\2\2u\13\3\2\2\2\n\17\31\35>IWYt";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}