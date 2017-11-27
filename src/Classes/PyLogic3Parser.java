// Generated from src/Grammar/PyLogic3.g4 by ANTLR 4.7
package Classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PyLogic3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, RETURN=2, RAISE=3, FROM=4, IMPORT=5, AS=6, GLOBAL=7, NONLOCAL=8, 
		ASSERT=9, IF=10, ELIF=11, ELSE=12, WHILE=13, FOR=14, IN=15, TRY=16, FINALLY=17, 
		WITH=18, EXCEPT=19, LAMBDA=20, OR=21, AND=22, NOT=23, IS=24, NONE=25, 
		TRUE=26, FALSE=27, CLASS=28, YIELD=29, DEL=30, PASS=31, CONTINUE=32, BREAK=33, 
		PRINT=34, FACT=35, RULE=36, CONSULT=37, NEWLINE=38, NAME=39, STRING_LITERAL=40, 
		BYTES_LITERAL=41, DECIMAL_INTEGER=42, OCT_INTEGER=43, HEX_INTEGER=44, 
		BIN_INTEGER=45, FLOAT_NUMBER=46, IMAG_NUMBER=47, DOT=48, ELLIPSIS=49, 
		STAR=50, OPEN_PAREN=51, CLOSE_PAREN=52, COMMA=53, COLON=54, SEMI_COLON=55, 
		POWER=56, ASSIGN=57, OPEN_BRACK=58, CLOSE_BRACK=59, OR_OP=60, XOR=61, 
		AND_OP=62, LEFT_SHIFT=63, RIGHT_SHIFT=64, ADD=65, MINUS=66, DIV=67, MOD=68, 
		IDIV=69, NOT_OP=70, OPEN_BRACE=71, CLOSE_BRACE=72, LESS_THAN=73, GREATER_THAN=74, 
		EQUALS=75, GT_EQ=76, LT_EQ=77, NOT_EQ_1=78, NOT_EQ_2=79, AT=80, ARROW=81, 
		ADD_ASSIGN=82, SUB_ASSIGN=83, MULT_ASSIGN=84, AT_ASSIGN=85, DIV_ASSIGN=86, 
		MOD_ASSIGN=87, AND_ASSIGN=88, OR_ASSIGN=89, XOR_ASSIGN=90, LEFT_SHIFT_ASSIGN=91, 
		RIGHT_SHIFT_ASSIGN=92, POWER_ASSIGN=93, IDIV_ASSIGN=94, SKIP_=95, UNKNOWN_CHAR=96, 
		INDENT=97, DEDENT=98;
	public static final int
		RULE_file_input = 0, RULE_single_input = 1, RULE_eval_input = 2, RULE_decorator = 3, 
		RULE_decorators = 4, RULE_decorated = 5, RULE_funcdef = 6, RULE_parameters = 7, 
		RULE_typedargslist = 8, RULE_tfpdef = 9, RULE_varargslist = 10, RULE_vfpdef = 11, 
		RULE_stmt = 12, RULE_simple_stmt = 13, RULE_small_stmt = 14, RULE_expr_stmt = 15, 
		RULE_testlist_star_expr = 16, RULE_augassign = 17, RULE_del_stmt = 18, 
		RULE_pass_stmt = 19, RULE_flow_stmt = 20, RULE_break_stmt = 21, RULE_continue_stmt = 22, 
		RULE_return_stmt = 23, RULE_yield_stmt = 24, RULE_raise_stmt = 25, RULE_import_stmt = 26, 
		RULE_import_name = 27, RULE_import_from = 28, RULE_import_as_name = 29, 
		RULE_dotted_as_name = 30, RULE_import_as_names = 31, RULE_dotted_as_names = 32, 
		RULE_dotted_name = 33, RULE_global_stmt = 34, RULE_nonlocal_stmt = 35, 
		RULE_assert_stmt = 36, RULE_compound_stmt = 37, RULE_if_stmt = 38, RULE_while_stmt = 39, 
		RULE_for_stmt = 40, RULE_try_stmt = 41, RULE_with_stmt = 42, RULE_with_item = 43, 
		RULE_except_clause = 44, RULE_suite = 45, RULE_test = 46, RULE_test_nocond = 47, 
		RULE_lambdef = 48, RULE_lambdef_nocond = 49, RULE_or_test = 50, RULE_and_test = 51, 
		RULE_not_test = 52, RULE_comparison = 53, RULE_comp_op = 54, RULE_star_expr = 55, 
		RULE_expr = 56, RULE_xor_expr = 57, RULE_and_expr = 58, RULE_shift_expr = 59, 
		RULE_arith_expr = 60, RULE_term = 61, RULE_factor = 62, RULE_power = 63, 
		RULE_atom = 64, RULE_testlist_comp = 65, RULE_trailer = 66, RULE_subscriptlist = 67, 
		RULE_subscript = 68, RULE_sliceop = 69, RULE_exprlist = 70, RULE_testlist = 71, 
		RULE_dictorsetmaker = 72, RULE_classdef = 73, RULE_arglist = 74, RULE_argument = 75, 
		RULE_comp_iter = 76, RULE_comp_for = 77, RULE_comp_if = 78, RULE_yield_expr = 79, 
		RULE_yield_arg = 80, RULE_print = 81, RULE_fact = 82, RULE_rules = 83, 
		RULE_consult = 84, RULE_log_line = 85, RULE_strr = 86, RULE_number = 87, 
		RULE_integer = 88;
	public static final String[] ruleNames = {
		"file_input", "single_input", "eval_input", "decorator", "decorators", 
		"decorated", "funcdef", "parameters", "typedargslist", "tfpdef", "varargslist", 
		"vfpdef", "stmt", "simple_stmt", "small_stmt", "expr_stmt", "testlist_star_expr", 
		"augassign", "del_stmt", "pass_stmt", "flow_stmt", "break_stmt", "continue_stmt", 
		"return_stmt", "yield_stmt", "raise_stmt", "import_stmt", "import_name", 
		"import_from", "import_as_name", "dotted_as_name", "import_as_names", 
		"dotted_as_names", "dotted_name", "global_stmt", "nonlocal_stmt", "assert_stmt", 
		"compound_stmt", "if_stmt", "while_stmt", "for_stmt", "try_stmt", "with_stmt", 
		"with_item", "except_clause", "suite", "test", "test_nocond", "lambdef", 
		"lambdef_nocond", "or_test", "and_test", "not_test", "comparison", "comp_op", 
		"star_expr", "expr", "xor_expr", "and_expr", "shift_expr", "arith_expr", 
		"term", "factor", "power", "atom", "testlist_comp", "trailer", "subscriptlist", 
		"subscript", "sliceop", "exprlist", "testlist", "dictorsetmaker", "classdef", 
		"arglist", "argument", "comp_iter", "comp_for", "comp_if", "yield_expr", 
		"yield_arg", "print", "fact", "rules", "consult", "log_line", "strr", 
		"number", "integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'return'", "'raise'", "'from'", "'import'", "'as'", "'global'", 
		"'nonlocal'", "'assert'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
		"'in'", "'try'", "'finally'", "'with'", "'except'", "'lambda'", "'or'", 
		"'and'", "'not'", "'is'", "'None'", "'True'", "'False'", "'class'", "'yield'", 
		"'del'", "'pass'", "'continue'", "'break'", "'print'", "'fact'", "'rule'", 
		"'consult'", null, null, null, null, null, null, null, null, null, null, 
		"'.'", "'...'", "'*'", "'('", "')'", "','", "':'", "';'", "'**'", "'='", 
		"'['", "']'", "'|'", "'^'", "'&'", "'<<'", "'>>'", "'+'", "'-'", "'/'", 
		"'%'", "'//'", "'~'", "'{'", "'}'", "'<'", "'>'", "'=='", "'>='", "'<='", 
		"'<>'", "'!='", "'@'", "'->'", "'+='", "'-='", "'*='", "'@='", "'/='", 
		"'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'**='", "'//='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEF", "RETURN", "RAISE", "FROM", "IMPORT", "AS", "GLOBAL", "NONLOCAL", 
		"ASSERT", "IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "TRY", "FINALLY", 
		"WITH", "EXCEPT", "LAMBDA", "OR", "AND", "NOT", "IS", "NONE", "TRUE", 
		"FALSE", "CLASS", "YIELD", "DEL", "PASS", "CONTINUE", "BREAK", "PRINT", 
		"FACT", "RULE", "CONSULT", "NEWLINE", "NAME", "STRING_LITERAL", "BYTES_LITERAL", 
		"DECIMAL_INTEGER", "OCT_INTEGER", "HEX_INTEGER", "BIN_INTEGER", "FLOAT_NUMBER", 
		"IMAG_NUMBER", "DOT", "ELLIPSIS", "STAR", "OPEN_PAREN", "CLOSE_PAREN", 
		"COMMA", "COLON", "SEMI_COLON", "POWER", "ASSIGN", "OPEN_BRACK", "CLOSE_BRACK", 
		"OR_OP", "XOR", "AND_OP", "LEFT_SHIFT", "RIGHT_SHIFT", "ADD", "MINUS", 
		"DIV", "MOD", "IDIV", "NOT_OP", "OPEN_BRACE", "CLOSE_BRACE", "LESS_THAN", 
		"GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "AT", 
		"ARROW", "ADD_ASSIGN", "SUB_ASSIGN", "MULT_ASSIGN", "AT_ASSIGN", "DIV_ASSIGN", 
		"MOD_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "LEFT_SHIFT_ASSIGN", 
		"RIGHT_SHIFT_ASSIGN", "POWER_ASSIGN", "IDIV_ASSIGN", "SKIP_", "UNKNOWN_CHAR", 
		"INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "PyLogic3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PyLogic3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class File_inputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PyLogic3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PyLogic3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyLogic3Parser.NEWLINE, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public File_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFile_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_inputContext file_input() throws RecognitionException {
		File_inputContext _localctx = new File_inputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << RAISE) | (1L << FROM) | (1L << IMPORT) | (1L << GLOBAL) | (1L << NONLOCAL) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << TRY) | (1L << WITH) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CLASS) | (1L << YIELD) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << FACT) | (1L << RULE) | (1L << NEWLINE) | (1L << NAME) | (1L << STRING_LITERAL) | (1L << BYTES_LITERAL) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (MINUS - 65)) | (1L << (NOT_OP - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (AT - 65)))) != 0)) {
				{
				setState(180);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(178);
					match(NEWLINE);
					}
					break;
				case DEF:
				case RETURN:
				case RAISE:
				case FROM:
				case IMPORT:
				case GLOBAL:
				case NONLOCAL:
				case ASSERT:
				case IF:
				case WHILE:
				case FOR:
				case TRY:
				case WITH:
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case CLASS:
				case YIELD:
				case DEL:
				case PASS:
				case CONTINUE:
				case BREAK:
				case PRINT:
				case FACT:
				case RULE:
				case NAME:
				case STRING_LITERAL:
				case BYTES_LITERAL:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IMAG_NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
				case AT:
					{
					setState(179);
					stmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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

	public static class Single_inputContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Single_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSingle_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_inputContext single_input() throws RecognitionException {
		Single_inputContext _localctx = new Single_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_single_input);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(NEWLINE);
				}
				break;
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
			case FOR:
			case TRY:
			case WITH:
			case CLASS:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				compound_stmt();
				setState(190);
				match(NEWLINE);
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

	public static class Eval_inputContext extends ParserRuleContext {
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PyLogic3Parser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PyLogic3Parser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PyLogic3Parser.NEWLINE, i);
		}
		public Eval_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitEval_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eval_inputContext eval_input() throws RecognitionException {
		Eval_inputContext _localctx = new Eval_inputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			testlist();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(195);
				match(NEWLINE);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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

	public static class DecoratorContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(AT);
			setState(204);
			dotted_name();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(205);
				match(OPEN_PAREN);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (POWER - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(206);
					arglist();
					}
				}

				setState(209);
				match(CLOSE_PAREN);
				}
			}

			setState(212);
			match(NEWLINE);
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

	public static class DecoratorsContext extends ParserRuleContext {
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				decorator();
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
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

	public static class DecoratedContext extends ParserRuleContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public DecoratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorated; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDecorated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratedContext decorated() throws RecognitionException {
		DecoratedContext _localctx = new DecoratedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decorated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			decorators();
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASS:
				{
				setState(220);
				classdef();
				}
				break;
			case DEF:
				{
				setState(221);
				funcdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PyLogic3Parser.DEF, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(DEF);
			setState(225);
			match(NAME);
			setState(226);
			parameters();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(227);
				match(ARROW);
				setState(228);
				test();
				}
			}

			setState(231);
			match(COLON);
			setState(232);
			suite();
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

	public static class ParametersContext extends ParserRuleContext {
		public TypedargslistContext typedargslist() {
			return getRuleContext(TypedargslistContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(OPEN_PAREN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(235);
				typedargslist();
				}
			}

			setState(238);
			match(CLOSE_PAREN);
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

	public static class TypedargslistContext extends ParserRuleContext {
		public List<TfpdefContext> tfpdef() {
			return getRuleContexts(TfpdefContext.class);
		}
		public TfpdefContext tfpdef(int i) {
			return getRuleContext(TfpdefContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TypedargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedargslist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTypedargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedargslistContext typedargslist() throws RecognitionException {
		TypedargslistContext _localctx = new TypedargslistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typedargslist);
		int _la;
		try {
			int _alt;
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				tfpdef();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(241);
					match(ASSIGN);
					setState(242);
					test();
					}
				}

				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(245);
						match(COMMA);
						setState(246);
						tfpdef();
						setState(249);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(247);
							match(ASSIGN);
							setState(248);
							test();
							}
						}

						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(256);
					match(COMMA);
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(257);
						match(STAR);
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NAME) {
							{
							setState(258);
							tfpdef();
							}
						}

						setState(269);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(261);
								match(COMMA);
								setState(262);
								tfpdef();
								setState(265);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(263);
									match(ASSIGN);
									setState(264);
									test();
									}
								}

								}
								} 
							}
							setState(271);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(272);
							match(COMMA);
							setState(273);
							match(POWER);
							setState(274);
							tfpdef();
							}
						}

						}
						break;
					case POWER:
						{
						setState(277);
						match(POWER);
						setState(278);
						tfpdef();
						}
						break;
					case CLOSE_PAREN:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(STAR);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(284);
					tfpdef();
					}
				}

				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(287);
						match(COMMA);
						setState(288);
						tfpdef();
						setState(291);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(289);
							match(ASSIGN);
							setState(290);
							test();
							}
						}

						}
						} 
					}
					setState(297);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(298);
					match(COMMA);
					setState(299);
					match(POWER);
					setState(300);
					tfpdef();
					}
				}

				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(POWER);
				setState(304);
				tfpdef();
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

	public static class TfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tfpdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TfpdefContext tfpdef() throws RecognitionException {
		TfpdefContext _localctx = new TfpdefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tfpdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(NAME);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(308);
				match(COLON);
				setState(309);
				test();
				}
			}

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

	public static class VarargslistContext extends ParserRuleContext {
		public List<VfpdefContext> vfpdef() {
			return getRuleContexts(VfpdefContext.class);
		}
		public VfpdefContext vfpdef(int i) {
			return getRuleContext(VfpdefContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public VarargslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varargslist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitVarargslist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarargslistContext varargslist() throws RecognitionException {
		VarargslistContext _localctx = new VarargslistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varargslist);
		int _la;
		try {
			int _alt;
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				vfpdef();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(313);
					match(ASSIGN);
					setState(314);
					test();
					}
				}

				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317);
						match(COMMA);
						setState(318);
						vfpdef();
						setState(321);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(319);
							match(ASSIGN);
							setState(320);
							test();
							}
						}

						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(328);
					match(COMMA);
					setState(351);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(329);
						match(STAR);
						setState(331);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NAME) {
							{
							setState(330);
							vfpdef();
							}
						}

						setState(341);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(333);
								match(COMMA);
								setState(334);
								vfpdef();
								setState(337);
								_errHandler.sync(this);
								_la = _input.LA(1);
								if (_la==ASSIGN) {
									{
									setState(335);
									match(ASSIGN);
									setState(336);
									test();
									}
								}

								}
								} 
							}
							setState(343);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						}
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(344);
							match(COMMA);
							setState(345);
							match(POWER);
							setState(346);
							vfpdef();
							}
						}

						}
						break;
					case POWER:
						{
						setState(349);
						match(POWER);
						setState(350);
						vfpdef();
						}
						break;
					case COLON:
						break;
					default:
						break;
					}
					}
				}

				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(STAR);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(356);
					vfpdef();
					}
				}

				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(359);
						match(COMMA);
						setState(360);
						vfpdef();
						setState(363);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(361);
							match(ASSIGN);
							setState(362);
							test();
							}
						}

						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(370);
					match(COMMA);
					setState(371);
					match(POWER);
					setState(372);
					vfpdef();
					}
				}

				}
				break;
			case POWER:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				match(POWER);
				setState(376);
				vfpdef();
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

	public static class VfpdefContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public VfpdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vfpdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitVfpdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VfpdefContext vfpdef() throws RecognitionException {
		VfpdefContext _localctx = new VfpdefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vfpdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(NAME);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				simple_stmt();
				}
				break;
			case DEF:
			case IF:
			case WHILE:
			case FOR:
			case TRY:
			case WITH:
			case CLASS:
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				compound_stmt();
				}
				break;
			case FACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				fact();
				}
				break;
			case RULE:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				rules();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				print();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public List<Small_stmtContext> small_stmt() {
			return getRuleContexts(Small_stmtContext.class);
		}
		public Small_stmtContext small_stmt(int i) {
			return getRuleContext(Small_stmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			small_stmt();
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(SEMI_COLON);
					setState(390);
					small_stmt();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI_COLON) {
				{
				setState(396);
				match(SEMI_COLON);
				}
			}

			setState(399);
			match(NEWLINE);
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

	public static class Small_stmtContext extends ParserRuleContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Del_stmtContext del_stmt() {
			return getRuleContext(Del_stmtContext.class,0);
		}
		public Pass_stmtContext pass_stmt() {
			return getRuleContext(Pass_stmtContext.class,0);
		}
		public Flow_stmtContext flow_stmt() {
			return getRuleContext(Flow_stmtContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public Global_stmtContext global_stmt() {
			return getRuleContext(Global_stmtContext.class,0);
		}
		public Nonlocal_stmtContext nonlocal_stmt() {
			return getRuleContext(Nonlocal_stmtContext.class,0);
		}
		public Assert_stmtContext assert_stmt() {
			return getRuleContext(Assert_stmtContext.class,0);
		}
		public Small_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_small_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSmall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Small_stmtContext small_stmt() throws RecognitionException {
		Small_stmtContext _localctx = new Small_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_small_stmt);
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				expr_stmt();
				}
				break;
			case DEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				del_stmt();
				}
				break;
			case PASS:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				pass_stmt();
				}
				break;
			case RETURN:
			case RAISE:
			case YIELD:
			case CONTINUE:
			case BREAK:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				flow_stmt();
				}
				break;
			case FROM:
			case IMPORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				import_stmt();
				}
				break;
			case GLOBAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(406);
				global_stmt();
				}
				break;
			case NONLOCAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(407);
				nonlocal_stmt();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 8);
				{
				setState(408);
				assert_stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public List<Testlist_star_exprContext> testlist_star_expr() {
			return getRuleContexts(Testlist_star_exprContext.class);
		}
		public Testlist_star_exprContext testlist_star_expr(int i) {
			return getRuleContext(Testlist_star_exprContext.class,i);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public List<Yield_exprContext> yield_expr() {
			return getRuleContexts(Yield_exprContext.class);
		}
		public Yield_exprContext yield_expr(int i) {
			return getRuleContext(Yield_exprContext.class,i);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<ConsultContext> consult() {
			return getRuleContexts(ConsultContext.class);
		}
		public ConsultContext consult(int i) {
			return getRuleContext(ConsultContext.class,i);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			testlist_star_expr();
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD_ASSIGN:
			case SUB_ASSIGN:
			case MULT_ASSIGN:
			case AT_ASSIGN:
			case DIV_ASSIGN:
			case MOD_ASSIGN:
			case AND_ASSIGN:
			case OR_ASSIGN:
			case XOR_ASSIGN:
			case LEFT_SHIFT_ASSIGN:
			case RIGHT_SHIFT_ASSIGN:
			case POWER_ASSIGN:
			case IDIV_ASSIGN:
				{
				setState(412);
				augassign();
				setState(415);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(413);
					yield_expr();
					}
					break;
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case NAME:
				case STRING_LITERAL:
				case BYTES_LITERAL:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IMAG_NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(414);
					testlist();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NEWLINE:
			case CLOSE_PAREN:
			case SEMI_COLON:
			case ASSIGN:
				{
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASSIGN) {
					{
					{
					setState(417);
					match(ASSIGN);
					setState(421);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case YIELD:
						{
						setState(418);
						yield_expr();
						}
						break;
					case LAMBDA:
					case NOT:
					case NONE:
					case TRUE:
					case FALSE:
					case NAME:
					case STRING_LITERAL:
					case BYTES_LITERAL:
					case DECIMAL_INTEGER:
					case OCT_INTEGER:
					case HEX_INTEGER:
					case BIN_INTEGER:
					case FLOAT_NUMBER:
					case IMAG_NUMBER:
					case ELLIPSIS:
					case STAR:
					case OPEN_PAREN:
					case OPEN_BRACK:
					case ADD:
					case MINUS:
					case NOT_OP:
					case OPEN_BRACE:
						{
						setState(419);
						testlist_star_expr();
						}
						break;
					case CONSULT:
						{
						setState(420);
						consult();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Testlist_star_exprContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public Testlist_star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_star_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTestlist_star_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_star_exprContext testlist_star_expr() throws RecognitionException {
		Testlist_star_exprContext _localctx = new Testlist_star_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_testlist_star_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(430);
				test();
				}
				break;
			case 2:
				{
				setState(431);
				star_expr();
				}
				break;
			}
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(434);
					match(COMMA);
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						setState(435);
						test();
						}
						break;
					case 2:
						{
						setState(436);
						star_expr();
						}
						break;
					}
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(444);
				match(COMMA);
				}
			}

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

	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitAugassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_augassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MULT_ASSIGN - 82)) | (1L << (AT_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)) | (1L << (AND_ASSIGN - 82)) | (1L << (OR_ASSIGN - 82)) | (1L << (XOR_ASSIGN - 82)) | (1L << (LEFT_SHIFT_ASSIGN - 82)) | (1L << (RIGHT_SHIFT_ASSIGN - 82)) | (1L << (POWER_ASSIGN - 82)) | (1L << (IDIV_ASSIGN - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Del_stmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(PyLogic3Parser.DEL, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public Del_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_del_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDel_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Del_stmtContext del_stmt() throws RecognitionException {
		Del_stmtContext _localctx = new Del_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_del_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(DEL);
			setState(450);
			exprlist();
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

	public static class Pass_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PyLogic3Parser.PASS, 0); }
		public Pass_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitPass_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pass_stmtContext pass_stmt() throws RecognitionException {
		Pass_stmtContext _localctx = new Pass_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pass_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			match(PASS);
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

	public static class Flow_stmtContext extends ParserRuleContext {
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Raise_stmtContext raise_stmt() {
			return getRuleContext(Raise_stmtContext.class,0);
		}
		public Yield_stmtContext yield_stmt() {
			return getRuleContext(Yield_stmtContext.class,0);
		}
		public Flow_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFlow_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Flow_stmtContext flow_stmt() throws RecognitionException {
		Flow_stmtContext _localctx = new Flow_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_flow_stmt);
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				break_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				continue_stmt();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				return_stmt();
				}
				break;
			case RAISE:
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				raise_stmt();
				}
				break;
			case YIELD:
				enterOuterAlt(_localctx, 5);
				{
				setState(458);
				yield_stmt();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PyLogic3Parser.BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(BREAK);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PyLogic3Parser.CONTINUE, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(CONTINUE);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PyLogic3Parser.RETURN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(RETURN);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
				{
				setState(466);
				testlist();
				}
			}

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

	public static class Yield_stmtContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Yield_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitYield_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_stmtContext yield_stmt() throws RecognitionException {
		Yield_stmtContext _localctx = new Yield_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_yield_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			yield_expr();
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

	public static class Raise_stmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(PyLogic3Parser.RAISE, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PyLogic3Parser.FROM, 0); }
		public Raise_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitRaise_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_stmtContext raise_stmt() throws RecognitionException {
		Raise_stmtContext _localctx = new Raise_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_raise_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(RAISE);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
				{
				setState(472);
				test();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(473);
					match(FROM);
					setState(474);
					test();
					}
				}

				}
			}

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

	public static class Import_stmtContext extends ParserRuleContext {
		public Import_nameContext import_name() {
			return getRuleContext(Import_nameContext.class,0);
		}
		public Import_fromContext import_from() {
			return getRuleContext(Import_fromContext.class,0);
		}
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_import_stmt);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				import_name();
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				import_from();
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

	public static class Import_nameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PyLogic3Parser.IMPORT, 0); }
		public Dotted_as_namesContext dotted_as_names() {
			return getRuleContext(Dotted_as_namesContext.class,0);
		}
		public Import_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitImport_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_nameContext import_name() throws RecognitionException {
		Import_nameContext _localctx = new Import_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_import_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(IMPORT);
			setState(484);
			dotted_as_names();
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

	public static class Import_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PyLogic3Parser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(PyLogic3Parser.IMPORT, 0); }
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public Import_as_namesContext import_as_names() {
			return getRuleContext(Import_as_namesContext.class,0);
		}
		public Import_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_from; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitImport_from(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_fromContext import_from() throws RecognitionException {
		Import_fromContext _localctx = new Import_fromContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_import_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(FROM);
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==ELLIPSIS) {
					{
					{
					setState(487);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493);
				dotted_name();
				}
				break;
			case 2:
				{
				setState(495); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(494);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(497); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==ELLIPSIS );
				}
				break;
			}
			setState(501);
			match(IMPORT);
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(502);
				match(STAR);
				}
				break;
			case OPEN_PAREN:
				{
				setState(503);
				match(OPEN_PAREN);
				setState(504);
				import_as_names();
				setState(505);
				match(CLOSE_PAREN);
				}
				break;
			case NAME:
				{
				setState(507);
				import_as_names();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class Import_as_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PyLogic3Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PyLogic3Parser.NAME, i);
		}
		public TerminalNode AS() { return getToken(PyLogic3Parser.AS, 0); }
		public Import_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitImport_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_nameContext import_as_name() throws RecognitionException {
		Import_as_nameContext _localctx = new Import_as_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_import_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(NAME);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(511);
				match(AS);
				setState(512);
				match(NAME);
				}
			}

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

	public static class Dotted_as_nameContext extends ParserRuleContext {
		public Dotted_nameContext dotted_name() {
			return getRuleContext(Dotted_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PyLogic3Parser.AS, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public Dotted_as_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDotted_as_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_nameContext dotted_as_name() throws RecognitionException {
		Dotted_as_nameContext _localctx = new Dotted_as_nameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dotted_as_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			dotted_name();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(516);
				match(AS);
				setState(517);
				match(NAME);
				}
			}

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

	public static class Import_as_namesContext extends ParserRuleContext {
		public List<Import_as_nameContext> import_as_name() {
			return getRuleContexts(Import_as_nameContext.class);
		}
		public Import_as_nameContext import_as_name(int i) {
			return getRuleContext(Import_as_nameContext.class,i);
		}
		public Import_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_as_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitImport_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_as_namesContext import_as_names() throws RecognitionException {
		Import_as_namesContext _localctx = new Import_as_namesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_import_as_names);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			import_as_name();
			setState(525);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					match(COMMA);
					setState(522);
					import_as_name();
					}
					} 
				}
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(528);
				match(COMMA);
				}
			}

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

	public static class Dotted_as_namesContext extends ParserRuleContext {
		public List<Dotted_as_nameContext> dotted_as_name() {
			return getRuleContexts(Dotted_as_nameContext.class);
		}
		public Dotted_as_nameContext dotted_as_name(int i) {
			return getRuleContext(Dotted_as_nameContext.class,i);
		}
		public Dotted_as_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_as_names; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDotted_as_names(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_as_namesContext dotted_as_names() throws RecognitionException {
		Dotted_as_namesContext _localctx = new Dotted_as_namesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dotted_as_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			dotted_as_name();
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(532);
				match(COMMA);
				setState(533);
				dotted_as_name();
				}
				}
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Dotted_nameContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(PyLogic3Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PyLogic3Parser.NAME, i);
		}
		public Dotted_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotted_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDotted_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dotted_nameContext dotted_name() throws RecognitionException {
		Dotted_nameContext _localctx = new Dotted_nameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dotted_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(NAME);
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(540);
				match(DOT);
				setState(541);
				match(NAME);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Global_stmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PyLogic3Parser.GLOBAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PyLogic3Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PyLogic3Parser.NAME, i);
		}
		public Global_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitGlobal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_stmtContext global_stmt() throws RecognitionException {
		Global_stmtContext _localctx = new Global_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_global_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(GLOBAL);
			setState(548);
			match(NAME);
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(549);
				match(COMMA);
				setState(550);
				match(NAME);
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Nonlocal_stmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(PyLogic3Parser.NONLOCAL, 0); }
		public List<TerminalNode> NAME() { return getTokens(PyLogic3Parser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(PyLogic3Parser.NAME, i);
		}
		public Nonlocal_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitNonlocal_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_stmtContext nonlocal_stmt() throws RecognitionException {
		Nonlocal_stmtContext _localctx = new Nonlocal_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nonlocal_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(NONLOCAL);
			setState(557);
			match(NAME);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(558);
				match(COMMA);
				setState(559);
				match(NAME);
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Assert_stmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PyLogic3Parser.ASSERT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Assert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitAssert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_stmtContext assert_stmt() throws RecognitionException {
		Assert_stmtContext _localctx = new Assert_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_assert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(ASSERT);
			setState(566);
			test();
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(567);
				match(COMMA);
				setState(568);
				test();
				}
			}

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

	public static class Compound_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Try_stmtContext try_stmt() {
			return getRuleContext(Try_stmtContext.class,0);
		}
		public With_stmtContext with_stmt() {
			return getRuleContext(With_stmtContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
		}
		public DecoratedContext decorated() {
			return getRuleContext(DecoratedContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_compound_stmt);
		try {
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(572);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				for_stmt();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 4);
				{
				setState(574);
				try_stmt();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 5);
				{
				setState(575);
				with_stmt();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 6);
				{
				setState(576);
				funcdef();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 7);
				{
				setState(577);
				classdef();
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 8);
				{
				setState(578);
				decorated();
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

	public static class If_stmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PyLogic3Parser.IF, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(PyLogic3Parser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(PyLogic3Parser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(PyLogic3Parser.ELSE, 0); }
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_if_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IF);
			setState(582);
			test();
			setState(583);
			match(COLON);
			setState(584);
			suite();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(585);
				match(ELIF);
				setState(586);
				test();
				setState(587);
				match(COLON);
				setState(588);
				suite();
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(595);
				match(ELSE);
				setState(596);
				match(COLON);
				setState(597);
				suite();
				}
			}

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

	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PyLogic3Parser.WHILE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PyLogic3Parser.ELSE, 0); }
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_while_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(WHILE);
			setState(601);
			test();
			setState(602);
			match(COLON);
			setState(603);
			suite();
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(604);
				match(ELSE);
				setState(605);
				match(COLON);
				setState(606);
				suite();
				}
			}

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

	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PyLogic3Parser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PyLogic3Parser.IN, 0); }
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PyLogic3Parser.ELSE, 0); }
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(FOR);
			setState(610);
			exprlist();
			setState(611);
			match(IN);
			setState(612);
			testlist();
			setState(613);
			match(COLON);
			setState(614);
			suite();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(615);
				match(ELSE);
				setState(616);
				match(COLON);
				setState(617);
				suite();
				}
			}

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

	public static class Try_stmtContext extends ParserRuleContext {
		public TerminalNode TRY() { return getToken(PyLogic3Parser.TRY, 0); }
		public List<SuiteContext> suite() {
			return getRuleContexts(SuiteContext.class);
		}
		public SuiteContext suite(int i) {
			return getRuleContext(SuiteContext.class,i);
		}
		public TerminalNode FINALLY() { return getToken(PyLogic3Parser.FINALLY, 0); }
		public List<Except_clauseContext> except_clause() {
			return getRuleContexts(Except_clauseContext.class);
		}
		public Except_clauseContext except_clause(int i) {
			return getRuleContext(Except_clauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PyLogic3Parser.ELSE, 0); }
		public Try_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_try_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTry_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Try_stmtContext try_stmt() throws RecognitionException {
		Try_stmtContext _localctx = new Try_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_try_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			match(TRY);
			setState(621);
			match(COLON);
			setState(622);
			suite();
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCEPT:
				{
				setState(627); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(623);
					except_clause();
					setState(624);
					match(COLON);
					setState(625);
					suite();
					}
					}
					setState(629); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(631);
					match(ELSE);
					setState(632);
					match(COLON);
					setState(633);
					suite();
					}
				}

				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(636);
					match(FINALLY);
					setState(637);
					match(COLON);
					setState(638);
					suite();
					}
				}

				}
				break;
			case FINALLY:
				{
				setState(641);
				match(FINALLY);
				setState(642);
				match(COLON);
				setState(643);
				suite();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class With_stmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PyLogic3Parser.WITH, 0); }
		public List<With_itemContext> with_item() {
			return getRuleContexts(With_itemContext.class);
		}
		public With_itemContext with_item(int i) {
			return getRuleContext(With_itemContext.class,i);
		}
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public With_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitWith_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_stmtContext with_stmt() throws RecognitionException {
		With_stmtContext _localctx = new With_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_with_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(WITH);
			setState(647);
			with_item();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(648);
				match(COMMA);
				setState(649);
				with_item();
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(655);
			match(COLON);
			setState(656);
			suite();
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

	public static class With_itemContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PyLogic3Parser.AS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public With_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitWith_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_itemContext with_item() throws RecognitionException {
		With_itemContext _localctx = new With_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_with_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			test();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(659);
				match(AS);
				setState(660);
				expr();
				}
			}

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

	public static class Except_clauseContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PyLogic3Parser.EXCEPT, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TerminalNode AS() { return getToken(PyLogic3Parser.AS, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public Except_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_except_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitExcept_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Except_clauseContext except_clause() throws RecognitionException {
		Except_clauseContext _localctx = new Except_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_except_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(EXCEPT);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
				{
				setState(664);
				test();
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(665);
					match(AS);
					setState(666);
					match(NAME);
					}
				}

				}
			}

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

	public static class SuiteContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PyLogic3Parser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PyLogic3Parser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSuite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_suite);
		int _la;
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case RAISE:
			case FROM:
			case IMPORT:
			case GLOBAL:
			case NONLOCAL:
			case ASSERT:
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case YIELD:
			case DEL:
			case PASS:
			case CONTINUE:
			case BREAK:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				simple_stmt();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(NEWLINE);
				setState(673);
				match(INDENT);
				setState(675); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(674);
					stmt();
					}
					}
					setState(677); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEF) | (1L << RETURN) | (1L << RAISE) | (1L << FROM) | (1L << IMPORT) | (1L << GLOBAL) | (1L << NONLOCAL) | (1L << ASSERT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << TRY) | (1L << WITH) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << CLASS) | (1L << YIELD) | (1L << DEL) | (1L << PASS) | (1L << CONTINUE) | (1L << BREAK) | (1L << PRINT) | (1L << FACT) | (1L << RULE) | (1L << NAME) | (1L << STRING_LITERAL) | (1L << BYTES_LITERAL) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (MINUS - 65)) | (1L << (NOT_OP - 65)) | (1L << (OPEN_BRACE - 65)) | (1L << (AT - 65)))) != 0) );
				setState(679);
				match(DEDENT);
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

	public static class TestContext extends ParserRuleContext {
		public List<Or_testContext> or_test() {
			return getRuleContexts(Or_testContext.class);
		}
		public Or_testContext or_test(int i) {
			return getRuleContext(Or_testContext.class,i);
		}
		public TerminalNode IF() { return getToken(PyLogic3Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PyLogic3Parser.ELSE, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public TestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestContext test() throws RecognitionException {
		TestContext _localctx = new TestContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_test);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(683);
				or_test();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(684);
					match(IF);
					setState(685);
					or_test();
					setState(686);
					match(ELSE);
					setState(687);
					test();
					}
				}

				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				lambdef();
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

	public static class Test_nocondContext extends ParserRuleContext {
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Lambdef_nocondContext lambdef_nocond() {
			return getRuleContext(Lambdef_nocondContext.class,0);
		}
		public Test_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_nocond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTest_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_nocondContext test_nocond() throws RecognitionException {
		Test_nocondContext _localctx = new Test_nocondContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_test_nocond);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				or_test();
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				lambdef_nocond();
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

	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PyLogic3Parser.LAMBDA, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(LAMBDA);
			setState(700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(699);
				varargslist();
				}
			}

			setState(702);
			match(COLON);
			setState(703);
			test();
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

	public static class Lambdef_nocondContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PyLogic3Parser.LAMBDA, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public VarargslistContext varargslist() {
			return getRuleContext(VarargslistContext.class,0);
		}
		public Lambdef_nocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef_nocond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitLambdef_nocond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambdef_nocondContext lambdef_nocond() throws RecognitionException {
		Lambdef_nocondContext _localctx = new Lambdef_nocondContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_lambdef_nocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			match(LAMBDA);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << STAR) | (1L << POWER))) != 0)) {
				{
				setState(706);
				varargslist();
				}
			}

			setState(709);
			match(COLON);
			setState(710);
			test_nocond();
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

	public static class Or_testContext extends ParserRuleContext {
		public List<And_testContext> and_test() {
			return getRuleContexts(And_testContext.class);
		}
		public And_testContext and_test(int i) {
			return getRuleContext(And_testContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PyLogic3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyLogic3Parser.OR, i);
		}
		public Or_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitOr_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Or_testContext or_test() throws RecognitionException {
		Or_testContext _localctx = new Or_testContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_or_test);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			and_test();
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(713);
					match(OR);
					setState(714);
					and_test();
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
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

	public static class And_testContext extends ParserRuleContext {
		public List<Not_testContext> not_test() {
			return getRuleContexts(Not_testContext.class);
		}
		public Not_testContext not_test(int i) {
			return getRuleContext(Not_testContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PyLogic3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyLogic3Parser.AND, i);
		}
		public And_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitAnd_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_testContext and_test() throws RecognitionException {
		And_testContext _localctx = new And_testContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_and_test);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			not_test();
			setState(725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(721);
					match(AND);
					setState(722);
					not_test();
					}
					} 
				}
				setState(727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
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

	public static class Not_testContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PyLogic3Parser.NOT, 0); }
		public Not_testContext not_test() {
			return getRuleContext(Not_testContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public Not_testContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_test; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitNot_test(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_testContext not_test() throws RecognitionException {
		Not_testContext _localctx = new Not_testContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_not_test);
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(NOT);
				setState(729);
				not_test();
				}
				break;
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				comparison();
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			star_expr();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << NOT) | (1L << IS))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (LESS_THAN - 73)) | (1L << (GREATER_THAN - 73)) | (1L << (EQUALS - 73)) | (1L << (GT_EQ - 73)) | (1L << (LT_EQ - 73)) | (1L << (NOT_EQ_1 - 73)) | (1L << (NOT_EQ_2 - 73)))) != 0)) {
				{
				{
				setState(734);
				comp_op();
				setState(735);
				star_expr();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PyLogic3Parser.IN, 0); }
		public TerminalNode NOT() { return getToken(PyLogic3Parser.NOT, 0); }
		public TerminalNode IS() { return getToken(PyLogic3Parser.IS, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_comp_op);
		try {
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(742);
				match(LESS_THAN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				match(GREATER_THAN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(744);
				match(EQUALS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(745);
				match(GT_EQ);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(746);
				match(LT_EQ);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(747);
				match(NOT_EQ_1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				match(NOT_EQ_2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(749);
				match(IN);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(750);
				match(NOT);
				setState(751);
				match(IN);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(752);
				match(IS);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(753);
				match(IS);
				setState(754);
				match(NOT);
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

	public static class Star_exprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_star_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR) {
				{
				setState(757);
				match(STAR);
				}
			}

			setState(760);
			expr();
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
		public List<Xor_exprContext> xor_expr() {
			return getRuleContexts(Xor_exprContext.class);
		}
		public Xor_exprContext xor_expr(int i) {
			return getRuleContext(Xor_exprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			xor_expr();
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR_OP) {
				{
				{
				setState(763);
				match(OR_OP);
				setState(764);
				xor_expr();
				}
				}
				setState(769);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Xor_exprContext extends ParserRuleContext {
		public List<And_exprContext> and_expr() {
			return getRuleContexts(And_exprContext.class);
		}
		public And_exprContext and_expr(int i) {
			return getRuleContext(And_exprContext.class,i);
		}
		public Xor_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xor_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitXor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Xor_exprContext xor_expr() throws RecognitionException {
		Xor_exprContext _localctx = new Xor_exprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_xor_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			and_expr();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==XOR) {
				{
				{
				setState(771);
				match(XOR);
				setState(772);
				and_expr();
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class And_exprContext extends ParserRuleContext {
		public List<Shift_exprContext> shift_expr() {
			return getRuleContexts(Shift_exprContext.class);
		}
		public Shift_exprContext shift_expr(int i) {
			return getRuleContext(Shift_exprContext.class,i);
		}
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitAnd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		And_exprContext _localctx = new And_exprContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_and_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			shift_expr();
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND_OP) {
				{
				{
				setState(779);
				match(AND_OP);
				setState(780);
				shift_expr();
				}
				}
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Shift_exprContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitShift_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_shift_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			arith_expr();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFT_SHIFT || _la==RIGHT_SHIFT) {
				{
				setState(791);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LEFT_SHIFT:
					{
					setState(787);
					match(LEFT_SHIFT);
					setState(788);
					arith_expr();
					}
					break;
				case RIGHT_SHIFT:
					{
					setState(789);
					match(RIGHT_SHIFT);
					setState(790);
					arith_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			term();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==MINUS) {
				{
				setState(801);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(797);
					match(ADD);
					setState(798);
					term();
					}
					break;
				case MINUS:
					{
					setState(799);
					match(MINUS);
					setState(800);
					term();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			factor();
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 50)) & ~0x3f) == 0 && ((1L << (_la - 50)) & ((1L << (STAR - 50)) | (1L << (DIV - 50)) | (1L << (MOD - 50)) | (1L << (IDIV - 50)) | (1L << (AT - 50)))) != 0)) {
				{
				setState(817);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(807);
					match(STAR);
					setState(808);
					factor();
					}
					break;
				case DIV:
					{
					setState(809);
					match(DIV);
					setState(810);
					factor();
					}
					break;
				case MOD:
					{
					setState(811);
					match(MOD);
					setState(812);
					factor();
					}
					break;
				case IDIV:
					{
					setState(813);
					match(IDIV);
					setState(814);
					factor();
					}
					break;
				case AT:
					{
					setState(815);
					match(AT);
					setState(816);
					factor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_factor);
		try {
			setState(829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(ADD);
				setState(823);
				factor();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				match(MINUS);
				setState(825);
				factor();
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(826);
				match(NOT_OP);
				setState(827);
				factor();
				}
				break;
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(828);
				power();
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

	public static class PowerContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_power);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			atom();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0)) {
				{
				{
				setState(832);
				trailer();
				}
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POWER) {
				{
				setState(838);
				match(POWER);
				setState(839);
				factor();
				}
			}

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

	public static class AtomContext extends ParserRuleContext {
		public Yield_exprContext yield_expr() {
			return getRuleContext(Yield_exprContext.class,0);
		}
		public Testlist_compContext testlist_comp() {
			return getRuleContext(Testlist_compContext.class,0);
		}
		public DictorsetmakerContext dictorsetmaker() {
			return getRuleContext(DictorsetmakerContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<StrrContext> strr() {
			return getRuleContexts(StrrContext.class);
		}
		public StrrContext strr(int i) {
			return getRuleContext(StrrContext.class,i);
		}
		public TerminalNode NONE() { return getToken(PyLogic3Parser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(PyLogic3Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PyLogic3Parser.FALSE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_atom);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				match(OPEN_PAREN);
				setState(845);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case YIELD:
					{
					setState(843);
					yield_expr();
					}
					break;
				case LAMBDA:
				case NOT:
				case NONE:
				case TRUE:
				case FALSE:
				case NAME:
				case STRING_LITERAL:
				case BYTES_LITERAL:
				case DECIMAL_INTEGER:
				case OCT_INTEGER:
				case HEX_INTEGER:
				case BIN_INTEGER:
				case FLOAT_NUMBER:
				case IMAG_NUMBER:
				case ELLIPSIS:
				case STAR:
				case OPEN_PAREN:
				case OPEN_BRACK:
				case ADD:
				case MINUS:
				case NOT_OP:
				case OPEN_BRACE:
					{
					setState(844);
					testlist_comp();
					}
					break;
				case CLOSE_PAREN:
					break;
				default:
					break;
				}
				setState(847);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(848);
				match(OPEN_BRACK);
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(849);
					testlist_comp();
					}
				}

				setState(852);
				match(CLOSE_BRACK);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(853);
				match(OPEN_BRACE);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(854);
					dictorsetmaker();
					}
				}

				setState(857);
				match(CLOSE_BRACE);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				match(NAME);
				}
				break;
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 5);
				{
				setState(859);
				number();
				}
				break;
			case STRING_LITERAL:
			case BYTES_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(861); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(860);
					strr();
					}
					}
					setState(863); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STRING_LITERAL || _la==BYTES_LITERAL );
				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				match(ELLIPSIS);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 8);
				{
				setState(866);
				match(NONE);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(867);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 10);
				{
				setState(868);
				match(FALSE);
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

	public static class Testlist_compContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Testlist_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist_comp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTestlist_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Testlist_compContext testlist_comp() throws RecognitionException {
		Testlist_compContext _localctx = new Testlist_compContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_testlist_comp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			test();
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				{
				setState(872);
				comp_for();
				}
				break;
			case CLOSE_PAREN:
			case COMMA:
			case CLOSE_BRACK:
				{
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(873);
						match(COMMA);
						setState(874);
						test();
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(880);
					match(COMMA);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class TrailerContext extends ParserRuleContext {
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public SubscriptlistContext subscriptlist() {
			return getRuleContext(SubscriptlistContext.class,0);
		}
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_trailer);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(OPEN_PAREN);
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (POWER - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(886);
					arglist();
					}
				}

				setState(889);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(890);
				match(OPEN_BRACK);
				setState(891);
				subscriptlist();
				setState(892);
				match(CLOSE_BRACK);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(894);
				match(DOT);
				setState(895);
				match(NAME);
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

	public static class SubscriptlistContext extends ParserRuleContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public SubscriptlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSubscriptlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptlistContext subscriptlist() throws RecognitionException {
		SubscriptlistContext _localctx = new SubscriptlistContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_subscriptlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			subscript();
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(899);
					match(COMMA);
					setState(900);
					subscript();
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(906);
				match(COMMA);
				}
			}

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

	public static class SubscriptContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public SliceopContext sliceop() {
			return getRuleContext(SliceopContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_subscript);
		int _la;
		try {
			setState(920);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				test();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(910);
					test();
					}
				}

				setState(913);
				match(COLON);
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(914);
					test();
					}
				}

				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(917);
					sliceop();
					}
				}

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

	public static class SliceopContext extends ParserRuleContext {
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public SliceopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sliceop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitSliceop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceopContext sliceop() throws RecognitionException {
		SliceopContext _localctx = new SliceopContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sliceop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(922);
			match(COLON);
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
				{
				setState(923);
				test();
				}
			}

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

	public static class ExprlistContext extends ParserRuleContext {
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitExprlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exprlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			star_expr();
			setState(931);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(927);
					match(COMMA);
					setState(928);
					star_expr();
					}
					} 
				}
				setState(933);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
			}
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(934);
				match(COMMA);
				}
			}

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

	public static class TestlistContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TestlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitTestlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestlistContext testlist() throws RecognitionException {
		TestlistContext _localctx = new TestlistContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_testlist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			test();
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(938);
					match(COMMA);
					setState(939);
					test();
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(945);
				match(COMMA);
				}
			}

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

	public static class DictorsetmakerContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public DictorsetmakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictorsetmaker; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitDictorsetmaker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictorsetmakerContext dictorsetmaker() throws RecognitionException {
		DictorsetmakerContext _localctx = new DictorsetmakerContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_dictorsetmaker);
		int _la;
		try {
			int _alt;
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(948);
				test();
				setState(949);
				match(COLON);
				setState(950);
				test();
				setState(965);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(951);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(959);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(952);
							match(COMMA);
							setState(953);
							test();
							setState(954);
							match(COLON);
							setState(955);
							test();
							}
							} 
						}
						setState(961);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(962);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				test();
				setState(979);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
					{
					setState(968);
					comp_for();
					}
					break;
				case COMMA:
				case CLOSE_BRACE:
					{
					setState(973);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(969);
							match(COMMA);
							setState(970);
							test();
							}
							} 
						}
						setState(975);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
					}
					setState(977);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(976);
						match(COMMA);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PyLogic3Parser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public SuiteContext suite() {
			return getRuleContext(SuiteContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_classdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(CLASS);
			setState(984);
			match(NAME);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(985);
				match(OPEN_PAREN);
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (LAMBDA - 20)) | (1L << (NOT - 20)) | (1L << (NONE - 20)) | (1L << (TRUE - 20)) | (1L << (FALSE - 20)) | (1L << (NAME - 20)) | (1L << (STRING_LITERAL - 20)) | (1L << (BYTES_LITERAL - 20)) | (1L << (DECIMAL_INTEGER - 20)) | (1L << (OCT_INTEGER - 20)) | (1L << (HEX_INTEGER - 20)) | (1L << (BIN_INTEGER - 20)) | (1L << (FLOAT_NUMBER - 20)) | (1L << (IMAG_NUMBER - 20)) | (1L << (ELLIPSIS - 20)) | (1L << (STAR - 20)) | (1L << (OPEN_PAREN - 20)) | (1L << (POWER - 20)) | (1L << (OPEN_BRACK - 20)) | (1L << (ADD - 20)) | (1L << (MINUS - 20)) | (1L << (NOT_OP - 20)) | (1L << (OPEN_BRACE - 20)))) != 0)) {
					{
					setState(986);
					arglist();
					}
				}

				setState(989);
				match(CLOSE_PAREN);
				}
			}

			setState(992);
			match(COLON);
			setState(993);
			suite();
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

	public static class ArglistContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_arglist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1000);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					argument();
					setState(996);
					match(COMMA);
					}
					} 
				}
				setState(1002);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1003);
				argument();
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1004);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				{
				setState(1007);
				match(STAR);
				setState(1008);
				test();
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1009);
						match(COMMA);
						setState(1010);
						argument();
						}
						} 
					}
					setState(1015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
				}
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1016);
					match(COMMA);
					setState(1017);
					match(POWER);
					setState(1018);
					test();
					}
				}

				}
				break;
			case 3:
				{
				setState(1021);
				match(POWER);
				setState(1022);
				test();
				}
				break;
			}
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_argument);
		int _la;
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1025);
				test();
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1026);
					comp_for();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1029);
				test();
				setState(1030);
				match(ASSIGN);
				setState(1031);
				test();
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

	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public Comp_ifContext comp_if() {
			return getRuleContext(Comp_ifContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_comp_iter);
		try {
			setState(1037);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				comp_if();
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

	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PyLogic3Parser.FOR, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode IN() { return getToken(PyLogic3Parser.IN, 0); }
		public Or_testContext or_test() {
			return getRuleContext(Or_testContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(FOR);
			setState(1040);
			exprlist();
			setState(1041);
			match(IN);
			setState(1042);
			or_test();
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(1043);
				comp_iter();
				}
			}

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

	public static class Comp_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PyLogic3Parser.IF, 0); }
		public Test_nocondContext test_nocond() {
			return getRuleContext(Test_nocondContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitComp_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_ifContext comp_if() throws RecognitionException {
		Comp_ifContext _localctx = new Comp_ifContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_comp_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
			match(IF);
			setState(1047);
			test_nocond();
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(1048);
				comp_iter();
				}
			}

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

	public static class Yield_exprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(PyLogic3Parser.YIELD, 0); }
		public Yield_argContext yield_arg() {
			return getRuleContext(Yield_argContext.class,0);
		}
		public Yield_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitYield_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_exprContext yield_expr() throws RecognitionException {
		Yield_exprContext _localctx = new Yield_exprContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_yield_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(YIELD);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FROM) | (1L << LAMBDA) | (1L << NOT) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << NAME) | (1L << STRING_LITERAL) | (1L << BYTES_LITERAL) | (1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER) | (1L << FLOAT_NUMBER) | (1L << IMAG_NUMBER) | (1L << ELLIPSIS) | (1L << STAR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (ADD - 65)) | (1L << (MINUS - 65)) | (1L << (NOT_OP - 65)) | (1L << (OPEN_BRACE - 65)))) != 0)) {
				{
				setState(1052);
				yield_arg();
				}
			}

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

	public static class Yield_argContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PyLogic3Parser.FROM, 0); }
		public TestContext test() {
			return getRuleContext(TestContext.class,0);
		}
		public TestlistContext testlist() {
			return getRuleContext(TestlistContext.class,0);
		}
		public Yield_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yield_arg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitYield_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Yield_argContext yield_arg() throws RecognitionException {
		Yield_argContext _localctx = new Yield_argContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_yield_arg);
		try {
			setState(1058);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				enterOuterAlt(_localctx, 1);
				{
				setState(1055);
				match(FROM);
				setState(1056);
				test();
				}
				break;
			case LAMBDA:
			case NOT:
			case NONE:
			case TRUE:
			case FALSE:
			case NAME:
			case STRING_LITERAL:
			case BYTES_LITERAL:
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
			case FLOAT_NUMBER:
			case IMAG_NUMBER:
			case ELLIPSIS:
			case STAR:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case ADD:
			case MINUS:
			case NOT_OP:
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1057);
				testlist();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(PyLogic3Parser.PRINT, 0); }
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(PRINT);
			setState(1061);
			match(OPEN_PAREN);
			setState(1062);
			expr_stmt();
			setState(1063);
			match(CLOSE_PAREN);
			setState(1064);
			match(NEWLINE);
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

	public static class FactContext extends ParserRuleContext {
		public TerminalNode FACT() { return getToken(PyLogic3Parser.FACT, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PyLogic3Parser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PyLogic3Parser.DEDENT, 0); }
		public List<Log_lineContext> log_line() {
			return getRuleContexts(Log_lineContext.class);
		}
		public Log_lineContext log_line(int i) {
			return getRuleContext(Log_lineContext.class,i);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_fact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(FACT);
			setState(1067);
			match(NAME);
			setState(1068);
			match(COLON);
			setState(1069);
			match(NEWLINE);
			setState(1070);
			match(INDENT);
			setState(1072); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1071);
				log_line();
				}
				}
				setState(1074); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE || _la==OPEN_PAREN );
			setState(1076);
			match(DEDENT);
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

	public static class RulesContext extends ParserRuleContext {
		public TerminalNode RULE() { return getToken(PyLogic3Parser.RULE, 0); }
		public TerminalNode NAME() { return getToken(PyLogic3Parser.NAME, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PyLogic3Parser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PyLogic3Parser.DEDENT, 0); }
		public List<Log_lineContext> log_line() {
			return getRuleContexts(Log_lineContext.class);
		}
		public Log_lineContext log_line(int i) {
			return getRuleContext(Log_lineContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			match(RULE);
			setState(1079);
			match(NAME);
			setState(1080);
			parameters();
			setState(1081);
			match(COLON);
			setState(1082);
			match(NEWLINE);
			setState(1083);
			match(INDENT);
			setState(1085); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1084);
				log_line();
				}
				}
				setState(1087); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE || _la==OPEN_PAREN );
			setState(1089);
			match(DEDENT);
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

	public static class ConsultContext extends ParserRuleContext {
		public TerminalNode CONSULT() { return getToken(PyLogic3Parser.CONSULT, 0); }
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PyLogic3Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PyLogic3Parser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(PyLogic3Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PyLogic3Parser.OR, i);
		}
		public ConsultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consult; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitConsult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultContext consult() throws RecognitionException {
		ConsultContext _localctx = new ConsultContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_consult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(CONSULT);
			setState(1092);
			match(OPEN_PAREN);
			setState(1093);
			test();
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(1094);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1095);
				test();
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1101);
			match(CLOSE_PAREN);
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

	public static class Log_lineContext extends ParserRuleContext {
		public List<TestContext> test() {
			return getRuleContexts(TestContext.class);
		}
		public TestContext test(int i) {
			return getRuleContext(TestContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PyLogic3Parser.NEWLINE, 0); }
		public Log_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitLog_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Log_lineContext log_line() throws RecognitionException {
		Log_lineContext _localctx = new Log_lineContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_log_line);
		int _la;
		try {
			setState(1115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1103);
				match(OPEN_PAREN);
				setState(1104);
				test();
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1105);
					match(COMMA);
					setState(1106);
					test();
					}
					}
					setState(1111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1112);
				match(CLOSE_PAREN);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
				match(NEWLINE);
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

	public static class StrrContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(PyLogic3Parser.STRING_LITERAL, 0); }
		public TerminalNode BYTES_LITERAL() { return getToken(PyLogic3Parser.BYTES_LITERAL, 0); }
		public StrrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitStrr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrrContext strr() throws RecognitionException {
		StrrContext _localctx = new StrrContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_strr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==BYTES_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NumberContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public TerminalNode FLOAT_NUMBER() { return getToken(PyLogic3Parser.FLOAT_NUMBER, 0); }
		public TerminalNode IMAG_NUMBER() { return getToken(PyLogic3Parser.IMAG_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_number);
		try {
			setState(1122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_INTEGER:
			case OCT_INTEGER:
			case HEX_INTEGER:
			case BIN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				integer();
				}
				break;
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1120);
				match(FLOAT_NUMBER);
				}
				break;
			case IMAG_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1121);
				match(IMAG_NUMBER);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_INTEGER() { return getToken(PyLogic3Parser.DECIMAL_INTEGER, 0); }
		public TerminalNode OCT_INTEGER() { return getToken(PyLogic3Parser.OCT_INTEGER, 0); }
		public TerminalNode HEX_INTEGER() { return getToken(PyLogic3Parser.HEX_INTEGER, 0); }
		public TerminalNode BIN_INTEGER() { return getToken(PyLogic3Parser.BIN_INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PyLogic3Visitor ) return ((PyLogic3Visitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_INTEGER) | (1L << OCT_INTEGER) | (1L << HEX_INTEGER) | (1L << BIN_INTEGER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3d\u0469\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\3\2\3\2\7\2\u00b7\n\2\f\2\16\2\u00ba"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\u00c3\n\3\3\4\3\4\7\4\u00c7\n\4"+
		"\f\4\16\4\u00ca\13\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00d2\n\5\3\5\5\5\u00d5"+
		"\n\5\3\5\3\5\3\6\6\6\u00da\n\6\r\6\16\6\u00db\3\7\3\7\3\7\5\7\u00e1\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\5\b\u00e8\n\b\3\b\3\b\3\b\3\t\3\t\5\t\u00ef\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\5\n\u00f6\n\n\3\n\3\n\3\n\3\n\5\n\u00fc\n\n\7\n\u00fe"+
		"\n\n\f\n\16\n\u0101\13\n\3\n\3\n\3\n\5\n\u0106\n\n\3\n\3\n\3\n\3\n\5\n"+
		"\u010c\n\n\7\n\u010e\n\n\f\n\16\n\u0111\13\n\3\n\3\n\3\n\5\n\u0116\n\n"+
		"\3\n\3\n\5\n\u011a\n\n\5\n\u011c\n\n\3\n\3\n\5\n\u0120\n\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0126\n\n\7\n\u0128\n\n\f\n\16\n\u012b\13\n\3\n\3\n\3\n\5\n\u0130"+
		"\n\n\3\n\3\n\5\n\u0134\n\n\3\13\3\13\3\13\5\13\u0139\n\13\3\f\3\f\3\f"+
		"\5\f\u013e\n\f\3\f\3\f\3\f\3\f\5\f\u0144\n\f\7\f\u0146\n\f\f\f\16\f\u0149"+
		"\13\f\3\f\3\f\3\f\5\f\u014e\n\f\3\f\3\f\3\f\3\f\5\f\u0154\n\f\7\f\u0156"+
		"\n\f\f\f\16\f\u0159\13\f\3\f\3\f\3\f\5\f\u015e\n\f\3\f\3\f\5\f\u0162\n"+
		"\f\5\f\u0164\n\f\3\f\3\f\5\f\u0168\n\f\3\f\3\f\3\f\3\f\5\f\u016e\n\f\7"+
		"\f\u0170\n\f\f\f\16\f\u0173\13\f\3\f\3\f\3\f\5\f\u0178\n\f\3\f\3\f\5\f"+
		"\u017c\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0185\n\16\3\17\3\17"+
		"\3\17\7\17\u018a\n\17\f\17\16\17\u018d\13\17\3\17\5\17\u0190\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u019c\n\20\3\21\3\21"+
		"\3\21\3\21\5\21\u01a2\n\21\3\21\3\21\3\21\3\21\5\21\u01a8\n\21\7\21\u01aa"+
		"\n\21\f\21\16\21\u01ad\13\21\5\21\u01af\n\21\3\22\3\22\5\22\u01b3\n\22"+
		"\3\22\3\22\3\22\5\22\u01b8\n\22\7\22\u01ba\n\22\f\22\16\22\u01bd\13\22"+
		"\3\22\5\22\u01c0\n\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u01ce\n\26\3\27\3\27\3\30\3\30\3\31\3\31\5\31\u01d6\n"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u01de\n\33\5\33\u01e0\n\33\3\34"+
		"\3\34\5\34\u01e4\n\34\3\35\3\35\3\35\3\36\3\36\7\36\u01eb\n\36\f\36\16"+
		"\36\u01ee\13\36\3\36\3\36\6\36\u01f2\n\36\r\36\16\36\u01f3\5\36\u01f6"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01ff\n\36\3\37\3\37\3\37"+
		"\5\37\u0204\n\37\3 \3 \3 \5 \u0209\n \3!\3!\3!\7!\u020e\n!\f!\16!\u0211"+
		"\13!\3!\5!\u0214\n!\3\"\3\"\3\"\7\"\u0219\n\"\f\"\16\"\u021c\13\"\3#\3"+
		"#\3#\7#\u0221\n#\f#\16#\u0224\13#\3$\3$\3$\3$\7$\u022a\n$\f$\16$\u022d"+
		"\13$\3%\3%\3%\3%\7%\u0233\n%\f%\16%\u0236\13%\3&\3&\3&\3&\5&\u023c\n&"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0246\n\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\7(\u0251\n(\f(\16(\u0254\13(\3(\3(\3(\5(\u0259\n(\3)\3)\3)\3)\3)"+
		"\3)\3)\5)\u0262\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u026d\n*\3+\3+\3+\3+"+
		"\3+\3+\3+\6+\u0276\n+\r+\16+\u0277\3+\3+\3+\5+\u027d\n+\3+\3+\3+\5+\u0282"+
		"\n+\3+\3+\3+\5+\u0287\n+\3,\3,\3,\3,\7,\u028d\n,\f,\16,\u0290\13,\3,\3"+
		",\3,\3-\3-\3-\5-\u0298\n-\3.\3.\3.\3.\5.\u029e\n.\5.\u02a0\n.\3/\3/\3"+
		"/\3/\6/\u02a6\n/\r/\16/\u02a7\3/\3/\5/\u02ac\n/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u02b4\n\60\3\60\5\60\u02b7\n\60\3\61\3\61\5\61\u02bb\n\61"+
		"\3\62\3\62\5\62\u02bf\n\62\3\62\3\62\3\62\3\63\3\63\5\63\u02c6\n\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\64\7\64\u02ce\n\64\f\64\16\64\u02d1\13\64\3"+
		"\65\3\65\3\65\7\65\u02d6\n\65\f\65\16\65\u02d9\13\65\3\66\3\66\3\66\5"+
		"\66\u02de\n\66\3\67\3\67\3\67\3\67\7\67\u02e4\n\67\f\67\16\67\u02e7\13"+
		"\67\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u02f6\n8\39\59\u02f9\n9"+
		"\39\39\3:\3:\3:\7:\u0300\n:\f:\16:\u0303\13:\3;\3;\3;\7;\u0308\n;\f;\16"+
		";\u030b\13;\3<\3<\3<\7<\u0310\n<\f<\16<\u0313\13<\3=\3=\3=\3=\3=\7=\u031a"+
		"\n=\f=\16=\u031d\13=\3>\3>\3>\3>\3>\7>\u0324\n>\f>\16>\u0327\13>\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u0334\n?\f?\16?\u0337\13?\3@\3@\3@\3@"+
		"\3@\3@\3@\5@\u0340\n@\3A\3A\7A\u0344\nA\fA\16A\u0347\13A\3A\3A\5A\u034b"+
		"\nA\3B\3B\3B\5B\u0350\nB\3B\3B\3B\5B\u0355\nB\3B\3B\3B\5B\u035a\nB\3B"+
		"\3B\3B\3B\6B\u0360\nB\rB\16B\u0361\3B\3B\3B\3B\5B\u0368\nB\3C\3C\3C\3"+
		"C\7C\u036e\nC\fC\16C\u0371\13C\3C\5C\u0374\nC\5C\u0376\nC\3D\3D\5D\u037a"+
		"\nD\3D\3D\3D\3D\3D\3D\3D\5D\u0383\nD\3E\3E\3E\7E\u0388\nE\fE\16E\u038b"+
		"\13E\3E\5E\u038e\nE\3F\3F\5F\u0392\nF\3F\3F\5F\u0396\nF\3F\5F\u0399\n"+
		"F\5F\u039b\nF\3G\3G\5G\u039f\nG\3H\3H\3H\7H\u03a4\nH\fH\16H\u03a7\13H"+
		"\3H\5H\u03aa\nH\3I\3I\3I\7I\u03af\nI\fI\16I\u03b2\13I\3I\5I\u03b5\nI\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\3J\7J\u03c0\nJ\fJ\16J\u03c3\13J\3J\5J\u03c6\nJ"+
		"\5J\u03c8\nJ\3J\3J\3J\3J\7J\u03ce\nJ\fJ\16J\u03d1\13J\3J\5J\u03d4\nJ\5"+
		"J\u03d6\nJ\5J\u03d8\nJ\3K\3K\3K\3K\5K\u03de\nK\3K\5K\u03e1\nK\3K\3K\3"+
		"K\3L\3L\3L\7L\u03e9\nL\fL\16L\u03ec\13L\3L\3L\5L\u03f0\nL\3L\3L\3L\3L"+
		"\7L\u03f6\nL\fL\16L\u03f9\13L\3L\3L\3L\5L\u03fe\nL\3L\3L\5L\u0402\nL\3"+
		"M\3M\5M\u0406\nM\3M\3M\3M\3M\5M\u040c\nM\3N\3N\5N\u0410\nN\3O\3O\3O\3"+
		"O\3O\5O\u0417\nO\3P\3P\3P\5P\u041c\nP\3Q\3Q\5Q\u0420\nQ\3R\3R\3R\5R\u0425"+
		"\nR\3S\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\6T\u0433\nT\rT\16T\u0434\3T\3"+
		"T\3U\3U\3U\3U\3U\3U\3U\6U\u0440\nU\rU\16U\u0441\3U\3U\3V\3V\3V\3V\3V\7"+
		"V\u044b\nV\fV\16V\u044e\13V\3V\3V\3W\3W\3W\3W\7W\u0456\nW\fW\16W\u0459"+
		"\13W\3W\3W\3W\5W\u045e\nW\3X\3X\3Y\3Y\3Y\5Y\u0465\nY\3Z\3Z\3Z\2\2[\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\2\7\3\2T`\3\2\62\63\3\2\27\30\3\2"+
		"*+\3\2,/\2\u04dd\2\u00b8\3\2\2\2\4\u00c2\3\2\2\2\6\u00c4\3\2\2\2\b\u00cd"+
		"\3\2\2\2\n\u00d9\3\2\2\2\f\u00dd\3\2\2\2\16\u00e2\3\2\2\2\20\u00ec\3\2"+
		"\2\2\22\u0133\3\2\2\2\24\u0135\3\2\2\2\26\u017b\3\2\2\2\30\u017d\3\2\2"+
		"\2\32\u0184\3\2\2\2\34\u0186\3\2\2\2\36\u019b\3\2\2\2 \u019d\3\2\2\2\""+
		"\u01b2\3\2\2\2$\u01c1\3\2\2\2&\u01c3\3\2\2\2(\u01c6\3\2\2\2*\u01cd\3\2"+
		"\2\2,\u01cf\3\2\2\2.\u01d1\3\2\2\2\60\u01d3\3\2\2\2\62\u01d7\3\2\2\2\64"+
		"\u01d9\3\2\2\2\66\u01e3\3\2\2\28\u01e5\3\2\2\2:\u01e8\3\2\2\2<\u0200\3"+
		"\2\2\2>\u0205\3\2\2\2@\u020a\3\2\2\2B\u0215\3\2\2\2D\u021d\3\2\2\2F\u0225"+
		"\3\2\2\2H\u022e\3\2\2\2J\u0237\3\2\2\2L\u0245\3\2\2\2N\u0247\3\2\2\2P"+
		"\u025a\3\2\2\2R\u0263\3\2\2\2T\u026e\3\2\2\2V\u0288\3\2\2\2X\u0294\3\2"+
		"\2\2Z\u0299\3\2\2\2\\\u02ab\3\2\2\2^\u02b6\3\2\2\2`\u02ba\3\2\2\2b\u02bc"+
		"\3\2\2\2d\u02c3\3\2\2\2f\u02ca\3\2\2\2h\u02d2\3\2\2\2j\u02dd\3\2\2\2l"+
		"\u02df\3\2\2\2n\u02f5\3\2\2\2p\u02f8\3\2\2\2r\u02fc\3\2\2\2t\u0304\3\2"+
		"\2\2v\u030c\3\2\2\2x\u0314\3\2\2\2z\u031e\3\2\2\2|\u0328\3\2\2\2~\u033f"+
		"\3\2\2\2\u0080\u0341\3\2\2\2\u0082\u0367\3\2\2\2\u0084\u0369\3\2\2\2\u0086"+
		"\u0382\3\2\2\2\u0088\u0384\3\2\2\2\u008a\u039a\3\2\2\2\u008c\u039c\3\2"+
		"\2\2\u008e\u03a0\3\2\2\2\u0090\u03ab\3\2\2\2\u0092\u03d7\3\2\2\2\u0094"+
		"\u03d9\3\2\2\2\u0096\u03ea\3\2\2\2\u0098\u040b\3\2\2\2\u009a\u040f\3\2"+
		"\2\2\u009c\u0411\3\2\2\2\u009e\u0418\3\2\2\2\u00a0\u041d\3\2\2\2\u00a2"+
		"\u0424\3\2\2\2\u00a4\u0426\3\2\2\2\u00a6\u042c\3\2\2\2\u00a8\u0438\3\2"+
		"\2\2\u00aa\u0445\3\2\2\2\u00ac\u045d\3\2\2\2\u00ae\u045f\3\2\2\2\u00b0"+
		"\u0464\3\2\2\2\u00b2\u0466\3\2\2\2\u00b4\u00b7\7(\2\2\u00b5\u00b7\5\32"+
		"\16\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00bb\u00bc\7\2\2\3\u00bc\3\3\2\2\2\u00bd\u00c3\7(\2\2\u00be\u00c3"+
		"\5\34\17\2\u00bf\u00c0\5L\'\2\u00c0\u00c1\7(\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3\5\3\2\2\2"+
		"\u00c4\u00c8\5\u0090I\2\u00c5\u00c7\7(\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\7\2\2\3\u00cc\7\3\2\2\2\u00cd\u00ce\7R\2\2"+
		"\u00ce\u00d4\5D#\2\u00cf\u00d1\7\65\2\2\u00d0\u00d2\5\u0096L\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\7\66\2\2"+
		"\u00d4\u00cf\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\7(\2\2\u00d7\t\3\2\2\2\u00d8\u00da\5\b\5\2\u00d9\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\13\3\2\2"+
		"\2\u00dd\u00e0\5\n\6\2\u00de\u00e1\5\u0094K\2\u00df\u00e1\5\16\b\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\r\3\2\2\2\u00e2\u00e3\7\3\2\2"+
		"\u00e3\u00e4\7)\2\2\u00e4\u00e7\5\20\t\2\u00e5\u00e6\7S\2\2\u00e6\u00e8"+
		"\5^\60\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\78\2\2\u00ea\u00eb\5\\/\2\u00eb\17\3\2\2\2\u00ec\u00ee\7\65\2\2"+
		"\u00ed\u00ef\5\22\n\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\7\66\2\2\u00f1\21\3\2\2\2\u00f2\u00f5\5\24\13\2\u00f3"+
		"\u00f4\7;\2\2\u00f4\u00f6\5^\60\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00ff\3\2\2\2\u00f7\u00f8\7\67\2\2\u00f8\u00fb\5\24\13\2\u00f9"+
		"\u00fa\7;\2\2\u00fa\u00fc\5^\60\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u011b\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0119\7\67\2\2\u0103\u0105\7\64\2\2\u0104\u0106\5\24\13\2\u0105"+
		"\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010f\3\2\2\2\u0107\u0108\7\67"+
		"\2\2\u0108\u010b\5\24\13\2\u0109\u010a\7;\2\2\u010a\u010c\5^\60\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0115\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\67\2\2\u0113\u0114\7"+
		":\2\2\u0114\u0116\5\24\13\2\u0115\u0112\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u011a\3\2\2\2\u0117\u0118\7:\2\2\u0118\u011a\5\24\13\2\u0119\u0103\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0102\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0134\3\2\2\2\u011d\u011f\7\64"+
		"\2\2\u011e\u0120\5\24\13\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0129\3\2\2\2\u0121\u0122\7\67\2\2\u0122\u0125\5\24\13\2\u0123\u0124"+
		"\7;\2\2\u0124\u0126\5^\60\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0121\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012f\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012d\7\67\2\2\u012d\u012e\7:\2\2\u012e\u0130\5\24\13\2\u012f\u012c\3"+
		"\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131\u0132\7:\2\2\u0132"+
		"\u0134\5\24\13\2\u0133\u00f2\3\2\2\2\u0133\u011d\3\2\2\2\u0133\u0131\3"+
		"\2\2\2\u0134\23\3\2\2\2\u0135\u0138\7)\2\2\u0136\u0137\78\2\2\u0137\u0139"+
		"\5^\60\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\25\3\2\2\2\u013a"+
		"\u013d\5\30\r\2\u013b\u013c\7;\2\2\u013c\u013e\5^\60\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0147\3\2\2\2\u013f\u0140\7\67\2\2\u0140"+
		"\u0143\5\30\r\2\u0141\u0142\7;\2\2\u0142\u0144\5^\60\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u013f\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0163\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u014a\u0161\7\67\2\2\u014b\u014d\7\64\2\2\u014c"+
		"\u014e\5\30\r\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0157\3"+
		"\2\2\2\u014f\u0150\7\67\2\2\u0150\u0153\5\30\r\2\u0151\u0152\7;\2\2\u0152"+
		"\u0154\5^\60\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2"+
		"\2\2\u0155\u014f\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015d\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\67"+
		"\2\2\u015b\u015c\7:\2\2\u015c\u015e\5\30\r\2\u015d\u015a\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u0160\7:\2\2\u0160\u0162\5\30"+
		"\r\2\u0161\u014b\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u014a\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u017c\3\2"+
		"\2\2\u0165\u0167\7\64\2\2\u0166\u0168\5\30\r\2\u0167\u0166\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0171\3\2\2\2\u0169\u016a\7\67\2\2\u016a\u016d\5"+
		"\30\r\2\u016b\u016c\7;\2\2\u016c\u016e\5^\60\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u0169\3\2\2\2\u0170\u0173\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0177\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0174\u0175\7\67\2\2\u0175\u0176\7:\2\2\u0176\u0178\5\30"+
		"\r\2\u0177\u0174\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017c\3\2\2\2\u0179"+
		"\u017a\7:\2\2\u017a\u017c\5\30\r\2\u017b\u013a\3\2\2\2\u017b\u0165\3\2"+
		"\2\2\u017b\u0179\3\2\2\2\u017c\27\3\2\2\2\u017d\u017e\7)\2\2\u017e\31"+
		"\3\2\2\2\u017f\u0185\5\34\17\2\u0180\u0185\5L\'\2\u0181\u0185\5\u00a6"+
		"T\2\u0182\u0185\5\u00a8U\2\u0183\u0185\5\u00a4S\2\u0184\u017f\3\2\2\2"+
		"\u0184\u0180\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183"+
		"\3\2\2\2\u0185\33\3\2\2\2\u0186\u018b\5\36\20\2\u0187\u0188\79\2\2\u0188"+
		"\u018a\5\36\20\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3"+
		"\2\2\2\u018b\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e"+
		"\u0190\79\2\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\7(\2\2\u0192\35\3\2\2\2\u0193\u019c\5 \21\2\u0194\u019c"+
		"\5&\24\2\u0195\u019c\5(\25\2\u0196\u019c\5*\26\2\u0197\u019c\5\66\34\2"+
		"\u0198\u019c\5F$\2\u0199\u019c\5H%\2\u019a\u019c\5J&\2\u019b\u0193\3\2"+
		"\2\2\u019b\u0194\3\2\2\2\u019b\u0195\3\2\2\2\u019b\u0196\3\2\2\2\u019b"+
		"\u0197\3\2\2\2\u019b\u0198\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019a\3\2"+
		"\2\2\u019c\37\3\2\2\2\u019d\u01ae\5\"\22\2\u019e\u01a1\5$\23\2\u019f\u01a2"+
		"\5\u00a0Q\2\u01a0\u01a2\5\u0090I\2\u01a1\u019f\3\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01af\3\2\2\2\u01a3\u01a7\7;\2\2\u01a4\u01a8\5\u00a0Q\2\u01a5"+
		"\u01a8\5\"\22\2\u01a6\u01a8\5\u00aaV\2\u01a7\u01a4\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a3\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af\3\2"+
		"\2\2\u01ad\u01ab\3\2\2\2\u01ae\u019e\3\2\2\2\u01ae\u01ab\3\2\2\2\u01af"+
		"!\3\2\2\2\u01b0\u01b3\5^\60\2\u01b1\u01b3\5p9\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01bb\3\2\2\2\u01b4\u01b7\7\67\2\2\u01b5\u01b8\5"+
		"^\60\2\u01b6\u01b8\5p9\2\u01b7\u01b5\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01b4\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be"+
		"\u01c0\7\67\2\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0#\3\2\2\2"+
		"\u01c1\u01c2\t\2\2\2\u01c2%\3\2\2\2\u01c3\u01c4\7 \2\2\u01c4\u01c5\5\u008e"+
		"H\2\u01c5\'\3\2\2\2\u01c6\u01c7\7!\2\2\u01c7)\3\2\2\2\u01c8\u01ce\5,\27"+
		"\2\u01c9\u01ce\5.\30\2\u01ca\u01ce\5\60\31\2\u01cb\u01ce\5\64\33\2\u01cc"+
		"\u01ce\5\62\32\2\u01cd\u01c8\3\2\2\2\u01cd\u01c9\3\2\2\2\u01cd\u01ca\3"+
		"\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce+\3\2\2\2\u01cf\u01d0"+
		"\7#\2\2\u01d0-\3\2\2\2\u01d1\u01d2\7\"\2\2\u01d2/\3\2\2\2\u01d3\u01d5"+
		"\7\4\2\2\u01d4\u01d6\5\u0090I\2\u01d5\u01d4\3\2\2\2\u01d5\u01d6\3\2\2"+
		"\2\u01d6\61\3\2\2\2\u01d7\u01d8\5\u00a0Q\2\u01d8\63\3\2\2\2\u01d9\u01df"+
		"\7\5\2\2\u01da\u01dd\5^\60\2\u01db\u01dc\7\6\2\2\u01dc\u01de\5^\60\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01da\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\65\3\2\2\2\u01e1\u01e4\58\35\2\u01e2\u01e4"+
		"\5:\36\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4\67\3\2\2\2\u01e5"+
		"\u01e6\7\7\2\2\u01e6\u01e7\5B\"\2\u01e79\3\2\2\2\u01e8\u01f5\7\6\2\2\u01e9"+
		"\u01eb\t\3\2\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f6\5D#\2\u01f0\u01f2\t\3\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f3\3\2\2"+
		"\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01ec"+
		"\3\2\2\2\u01f5\u01f1\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01fe\7\7\2\2\u01f8"+
		"\u01ff\7\64\2\2\u01f9\u01fa\7\65\2\2\u01fa\u01fb\5@!\2\u01fb\u01fc\7\66"+
		"\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01ff\5@!\2\u01fe\u01f8\3\2\2\2\u01fe\u01f9"+
		"\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff;\3\2\2\2\u0200\u0203\7)\2\2\u0201\u0202"+
		"\7\b\2\2\u0202\u0204\7)\2\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"=\3\2\2\2\u0205\u0208\5D#\2\u0206\u0207\7\b\2\2\u0207\u0209\7)\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209?\3\2\2\2\u020a\u020f\5<\37\2"+
		"\u020b\u020c\7\67\2\2\u020c\u020e\5<\37\2\u020d\u020b\3\2\2\2\u020e\u0211"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u020f\3\2\2\2\u0212\u0214\7\67\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3"+
		"\2\2\2\u0214A\3\2\2\2\u0215\u021a\5> \2\u0216\u0217\7\67\2\2\u0217\u0219"+
		"\5> \2\u0218\u0216\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u021b\3\2\2\2\u021bC\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0222\7)\2\2\u021e"+
		"\u021f\7\62\2\2\u021f\u0221\7)\2\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2"+
		"\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223E\3\2\2\2\u0224\u0222"+
		"\3\2\2\2\u0225\u0226\7\t\2\2\u0226\u022b\7)\2\2\u0227\u0228\7\67\2\2\u0228"+
		"\u022a\7)\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022cG\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u022f"+
		"\7\n\2\2\u022f\u0234\7)\2\2\u0230\u0231\7\67\2\2\u0231\u0233\7)\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235I\3\2\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\13\2\2\u0238\u023b"+
		"\5^\60\2\u0239\u023a\7\67\2\2\u023a\u023c\5^\60\2\u023b\u0239\3\2\2\2"+
		"\u023b\u023c\3\2\2\2\u023cK\3\2\2\2\u023d\u0246\5N(\2\u023e\u0246\5P)"+
		"\2\u023f\u0246\5R*\2\u0240\u0246\5T+\2\u0241\u0246\5V,\2\u0242\u0246\5"+
		"\16\b\2\u0243\u0246\5\u0094K\2\u0244\u0246\5\f\7\2\u0245\u023d\3\2\2\2"+
		"\u0245\u023e\3\2\2\2\u0245\u023f\3\2\2\2\u0245\u0240\3\2\2\2\u0245\u0241"+
		"\3\2\2\2\u0245\u0242\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0244\3\2\2\2\u0246"+
		"M\3\2\2\2\u0247\u0248\7\f\2\2\u0248\u0249\5^\60\2\u0249\u024a\78\2\2\u024a"+
		"\u0252\5\\/\2\u024b\u024c\7\r\2\2\u024c\u024d\5^\60\2\u024d\u024e\78\2"+
		"\2\u024e\u024f\5\\/\2\u024f\u0251\3\2\2\2\u0250\u024b\3\2\2\2\u0251\u0254"+
		"\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0258\3\2\2\2\u0254"+
		"\u0252\3\2\2\2\u0255\u0256\7\16\2\2\u0256\u0257\78\2\2\u0257\u0259\5\\"+
		"/\2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2\u0259O\3\2\2\2\u025a\u025b"+
		"\7\17\2\2\u025b\u025c\5^\60\2\u025c\u025d\78\2\2\u025d\u0261\5\\/\2\u025e"+
		"\u025f\7\16\2\2\u025f\u0260\78\2\2\u0260\u0262\5\\/\2\u0261\u025e\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262Q\3\2\2\2\u0263\u0264\7\20\2\2\u0264\u0265"+
		"\5\u008eH\2\u0265\u0266\7\21\2\2\u0266\u0267\5\u0090I\2\u0267\u0268\7"+
		"8\2\2\u0268\u026c\5\\/\2\u0269\u026a\7\16\2\2\u026a\u026b\78\2\2\u026b"+
		"\u026d\5\\/\2\u026c\u0269\3\2\2\2\u026c\u026d\3\2\2\2\u026dS\3\2\2\2\u026e"+
		"\u026f\7\22\2\2\u026f\u0270\78\2\2\u0270\u0286\5\\/\2\u0271\u0272\5Z."+
		"\2\u0272\u0273\78\2\2\u0273\u0274\5\\/\2\u0274\u0276\3\2\2\2\u0275\u0271"+
		"\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u027c\3\2\2\2\u0279\u027a\7\16\2\2\u027a\u027b\78\2\2\u027b\u027d\5\\"+
		"/\2\u027c\u0279\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0281\3\2\2\2\u027e"+
		"\u027f\7\23\2\2\u027f\u0280\78\2\2\u0280\u0282\5\\/\2\u0281\u027e\3\2"+
		"\2\2\u0281\u0282\3\2\2\2\u0282\u0287\3\2\2\2\u0283\u0284\7\23\2\2\u0284"+
		"\u0285\78\2\2\u0285\u0287\5\\/\2\u0286\u0275\3\2\2\2\u0286\u0283\3\2\2"+
		"\2\u0287U\3\2\2\2\u0288\u0289\7\24\2\2\u0289\u028e\5X-\2\u028a\u028b\7"+
		"\67\2\2\u028b\u028d\5X-\2\u028c\u028a\3\2\2\2\u028d\u0290\3\2\2\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028e\3\2"+
		"\2\2\u0291\u0292\78\2\2\u0292\u0293\5\\/\2\u0293W\3\2\2\2\u0294\u0297"+
		"\5^\60\2\u0295\u0296\7\b\2\2\u0296\u0298\5r:\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298Y\3\2\2\2\u0299\u029f\7\25\2\2\u029a\u029d\5^\60\2"+
		"\u029b\u029c\7\b\2\2\u029c\u029e\7)\2\2\u029d\u029b\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029a\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"[\3\2\2\2\u02a1\u02ac\5\34\17\2\u02a2\u02a3\7(\2\2\u02a3\u02a5\7c\2\2"+
		"\u02a4\u02a6\5\32\16\2\u02a5\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\7d\2\2\u02aa"+
		"\u02ac\3\2\2\2\u02ab\u02a1\3\2\2\2\u02ab\u02a2\3\2\2\2\u02ac]\3\2\2\2"+
		"\u02ad\u02b3\5f\64\2\u02ae\u02af\7\f\2\2\u02af\u02b0\5f\64\2\u02b0\u02b1"+
		"\7\16\2\2\u02b1\u02b2\5^\60\2\u02b2\u02b4\3\2\2\2\u02b3\u02ae\3\2\2\2"+
		"\u02b3\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b7\5b\62\2\u02b6\u02ad"+
		"\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7_\3\2\2\2\u02b8\u02bb\5f\64\2\u02b9"+
		"\u02bb\5d\63\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bba\3\2\2\2"+
		"\u02bc\u02be\7\26\2\2\u02bd\u02bf\5\26\f\2\u02be\u02bd\3\2\2\2\u02be\u02bf"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\78\2\2\u02c1\u02c2\5^\60\2\u02c2"+
		"c\3\2\2\2\u02c3\u02c5\7\26\2\2\u02c4\u02c6\5\26\f\2\u02c5\u02c4\3\2\2"+
		"\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\78\2\2\u02c8\u02c9"+
		"\5`\61\2\u02c9e\3\2\2\2\u02ca\u02cf\5h\65\2\u02cb\u02cc\7\27\2\2\u02cc"+
		"\u02ce\5h\65\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0g\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2\u02d7"+
		"\5j\66\2\u02d3\u02d4\7\30\2\2\u02d4\u02d6\5j\66\2\u02d5\u02d3\3\2\2\2"+
		"\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8i\3"+
		"\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7\31\2\2\u02db\u02de\5j\66\2\u02dc"+
		"\u02de\5l\67\2\u02dd\u02da\3\2\2\2\u02dd\u02dc\3\2\2\2\u02dek\3\2\2\2"+
		"\u02df\u02e5\5p9\2\u02e0\u02e1\5n8\2\u02e1\u02e2\5p9\2\u02e2\u02e4\3\2"+
		"\2\2\u02e3\u02e0\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6m\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02f6\7K\2\2\u02e9"+
		"\u02f6\7L\2\2\u02ea\u02f6\7M\2\2\u02eb\u02f6\7N\2\2\u02ec\u02f6\7O\2\2"+
		"\u02ed\u02f6\7P\2\2\u02ee\u02f6\7Q\2\2\u02ef\u02f6\7\21\2\2\u02f0\u02f1"+
		"\7\31\2\2\u02f1\u02f6\7\21\2\2\u02f2\u02f6\7\32\2\2\u02f3\u02f4\7\32\2"+
		"\2\u02f4\u02f6\7\31\2\2\u02f5\u02e8\3\2\2\2\u02f5\u02e9\3\2\2\2\u02f5"+
		"\u02ea\3\2\2\2\u02f5\u02eb\3\2\2\2\u02f5\u02ec\3\2\2\2\u02f5\u02ed\3\2"+
		"\2\2\u02f5\u02ee\3\2\2\2\u02f5\u02ef\3\2\2\2\u02f5\u02f0\3\2\2\2\u02f5"+
		"\u02f2\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6o\3\2\2\2\u02f7\u02f9\7\64\2\2"+
		"\u02f8\u02f7\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb"+
		"\5r:\2\u02fbq\3\2\2\2\u02fc\u0301\5t;\2\u02fd\u02fe\7>\2\2\u02fe\u0300"+
		"\5t;\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302s\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u0309\5v<\2\u0305"+
		"\u0306\7?\2\2\u0306\u0308\5v<\2\u0307\u0305\3\2\2\2\u0308\u030b\3\2\2"+
		"\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030au\3\2\2\2\u030b\u0309"+
		"\3\2\2\2\u030c\u0311\5x=\2\u030d\u030e\7@\2\2\u030e\u0310\5x=\2\u030f"+
		"\u030d\3\2\2\2\u0310\u0313\3\2\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2"+
		"\2\2\u0312w\3\2\2\2\u0313\u0311\3\2\2\2\u0314\u031b\5z>\2\u0315\u0316"+
		"\7A\2\2\u0316\u031a\5z>\2\u0317\u0318\7B\2\2\u0318\u031a\5z>\2\u0319\u0315"+
		"\3\2\2\2\u0319\u0317\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031cy\3\2\2\2\u031d\u031b\3\2\2\2\u031e\u0325\5|?\2\u031f"+
		"\u0320\7C\2\2\u0320\u0324\5|?\2\u0321\u0322\7D\2\2\u0322\u0324\5|?\2\u0323"+
		"\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0325\u0326\3\2\2\2\u0326{\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0335"+
		"\5~@\2\u0329\u032a\7\64\2\2\u032a\u0334\5~@\2\u032b\u032c\7E\2\2\u032c"+
		"\u0334\5~@\2\u032d\u032e\7F\2\2\u032e\u0334\5~@\2\u032f\u0330\7G\2\2\u0330"+
		"\u0334\5~@\2\u0331\u0332\7R\2\2\u0332\u0334\5~@\2\u0333\u0329\3\2\2\2"+
		"\u0333\u032b\3\2\2\2\u0333\u032d\3\2\2\2\u0333\u032f\3\2\2\2\u0333\u0331"+
		"\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"}\3\2\2\2\u0337\u0335\3\2\2\2\u0338\u0339\7C\2\2\u0339\u0340\5~@\2\u033a"+
		"\u033b\7D\2\2\u033b\u0340\5~@\2\u033c\u033d\7H\2\2\u033d\u0340\5~@\2\u033e"+
		"\u0340\5\u0080A\2\u033f\u0338\3\2\2\2\u033f\u033a\3\2\2\2\u033f\u033c"+
		"\3\2\2\2\u033f\u033e\3\2\2\2\u0340\177\3\2\2\2\u0341\u0345\5\u0082B\2"+
		"\u0342\u0344\5\u0086D\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u034a\3\2\2\2\u0347\u0345\3\2"+
		"\2\2\u0348\u0349\7:\2\2\u0349\u034b\5~@\2\u034a\u0348\3\2\2\2\u034a\u034b"+
		"\3\2\2\2\u034b\u0081\3\2\2\2\u034c\u034f\7\65\2\2\u034d\u0350\5\u00a0"+
		"Q\2\u034e\u0350\5\u0084C\2\u034f\u034d\3\2\2\2\u034f\u034e\3\2\2\2\u034f"+
		"\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0368\7\66\2\2\u0352\u0354\7"+
		"<\2\2\u0353\u0355\5\u0084C\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0368\7=\2\2\u0357\u0359\7I\2\2\u0358\u035a\5\u0092"+
		"J\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u0368\7J\2\2\u035c\u0368\7)\2\2\u035d\u0368\5\u00b0Y\2\u035e\u0360\5"+
		"\u00aeX\2\u035f\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u035f\3\2\2\2"+
		"\u0361\u0362\3\2\2\2\u0362\u0368\3\2\2\2\u0363\u0368\7\63\2\2\u0364\u0368"+
		"\7\33\2\2\u0365\u0368\7\34\2\2\u0366\u0368\7\35\2\2\u0367\u034c\3\2\2"+
		"\2\u0367\u0352\3\2\2\2\u0367\u0357\3\2\2\2\u0367\u035c\3\2\2\2\u0367\u035d"+
		"\3\2\2\2\u0367\u035f\3\2\2\2\u0367\u0363\3\2\2\2\u0367\u0364\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0367\u0366\3\2\2\2\u0368\u0083\3\2\2\2\u0369\u0375\5^"+
		"\60\2\u036a\u0376\5\u009cO\2\u036b\u036c\7\67\2\2\u036c\u036e\5^\60\2"+
		"\u036d\u036b\3\2\2\2\u036e\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370"+
		"\3\2\2\2\u0370\u0373\3\2\2\2\u0371\u036f\3\2\2\2\u0372\u0374\7\67\2\2"+
		"\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0376\3\2\2\2\u0375\u036a"+
		"\3\2\2\2\u0375\u036f\3\2\2\2\u0376\u0085\3\2\2\2\u0377\u0379\7\65\2\2"+
		"\u0378\u037a\5\u0096L\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u0383\7\66\2\2\u037c\u037d\7<\2\2\u037d\u037e\5\u0088"+
		"E\2\u037e\u037f\7=\2\2\u037f\u0383\3\2\2\2\u0380\u0381\7\62\2\2\u0381"+
		"\u0383\7)\2\2\u0382\u0377\3\2\2\2\u0382\u037c\3\2\2\2\u0382\u0380\3\2"+
		"\2\2\u0383\u0087\3\2\2\2\u0384\u0389\5\u008aF\2\u0385\u0386\7\67\2\2\u0386"+
		"\u0388\5\u008aF\2\u0387\u0385\3\2\2\2\u0388\u038b\3\2\2\2\u0389\u0387"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038c"+
		"\u038e\7\67\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0089\3"+
		"\2\2\2\u038f\u039b\5^\60\2\u0390\u0392\5^\60\2\u0391\u0390\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0395\78\2\2\u0394\u0396\5^\60"+
		"\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399"+
		"\5\u008cG\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2"+
		"\2\u039a\u038f\3\2\2\2\u039a\u0391\3\2\2\2\u039b\u008b\3\2\2\2\u039c\u039e"+
		"\78\2\2\u039d\u039f\5^\60\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u008d\3\2\2\2\u03a0\u03a5\5p9\2\u03a1\u03a2\7\67\2\2\u03a2\u03a4\5p9"+
		"\2\u03a3\u03a1\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6"+
		"\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03aa\7\67\2\2"+
		"\u03a9\u03a8\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u008f\3\2\2\2\u03ab\u03b0"+
		"\5^\60\2\u03ac\u03ad\7\67\2\2\u03ad\u03af\5^\60\2\u03ae\u03ac\3\2\2\2"+
		"\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b4"+
		"\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03b5\7\67\2\2\u03b4\u03b3\3\2\2\2"+
		"\u03b4\u03b5\3\2\2\2\u03b5\u0091\3\2\2\2\u03b6\u03b7\5^\60\2\u03b7\u03b8"+
		"\78\2\2\u03b8\u03c7\5^\60\2\u03b9\u03c8\5\u009cO\2\u03ba\u03bb\7\67\2"+
		"\2\u03bb\u03bc\5^\60\2\u03bc\u03bd\78\2\2\u03bd\u03be\5^\60\2\u03be\u03c0"+
		"\3\2\2\2\u03bf\u03ba\3\2\2\2\u03c0\u03c3\3\2\2\2\u03c1\u03bf\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c4\u03c6\7\67"+
		"\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7"+
		"\u03b9\3\2\2\2\u03c7\u03c1\3\2\2\2\u03c8\u03d8\3\2\2\2\u03c9\u03d5\5^"+
		"\60\2\u03ca\u03d6\5\u009cO\2\u03cb\u03cc\7\67\2\2\u03cc\u03ce\5^\60\2"+
		"\u03cd\u03cb\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03d4\7\67\2\2"+
		"\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03ca"+
		"\3\2\2\2\u03d5\u03cf\3\2\2\2\u03d6\u03d8\3\2\2\2\u03d7\u03b6\3\2\2\2\u03d7"+
		"\u03c9\3\2\2\2\u03d8\u0093\3\2\2\2\u03d9\u03da\7\36\2\2\u03da\u03e0\7"+
		")\2\2\u03db\u03dd\7\65\2\2\u03dc\u03de\5\u0096L\2\u03dd\u03dc\3\2\2\2"+
		"\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\7\66\2\2\u03e0\u03db"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\78\2\2\u03e3"+
		"\u03e4\5\\/\2\u03e4\u0095\3\2\2\2\u03e5\u03e6\5\u0098M\2\u03e6\u03e7\7"+
		"\67\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea"+
		"\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u0401\3\2\2\2\u03ec\u03ea\3\2"+
		"\2\2\u03ed\u03ef\5\u0098M\2\u03ee\u03f0\7\67\2\2\u03ef\u03ee\3\2\2\2\u03ef"+
		"\u03f0\3\2\2\2\u03f0\u0402\3\2\2\2\u03f1\u03f2\7\64\2\2\u03f2\u03f7\5"+
		"^\60\2\u03f3\u03f4\7\67\2\2\u03f4\u03f6\5\u0098M\2\u03f5\u03f3\3\2\2\2"+
		"\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fd"+
		"\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\67\2\2\u03fb\u03fc\7:\2\2\u03fc"+
		"\u03fe\5^\60\2\u03fd\u03fa\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0402\3\2"+
		"\2\2\u03ff\u0400\7:\2\2\u0400\u0402\5^\60\2\u0401\u03ed\3\2\2\2\u0401"+
		"\u03f1\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u0097\3\2\2\2\u0403\u0405\5^"+
		"\60\2\u0404\u0406\5\u009cO\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406"+
		"\u040c\3\2\2\2\u0407\u0408\5^\60\2\u0408\u0409\7;\2\2\u0409\u040a\5^\60"+
		"\2\u040a\u040c\3\2\2\2\u040b\u0403\3\2\2\2\u040b\u0407\3\2\2\2\u040c\u0099"+
		"\3\2\2\2\u040d\u0410\5\u009cO\2\u040e\u0410\5\u009eP\2\u040f\u040d\3\2"+
		"\2\2\u040f\u040e\3\2\2\2\u0410\u009b\3\2\2\2\u0411\u0412\7\20\2\2\u0412"+
		"\u0413\5\u008eH\2\u0413\u0414\7\21\2\2\u0414\u0416\5f\64\2\u0415\u0417"+
		"\5\u009aN\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u009d\3\2\2"+
		"\2\u0418\u0419\7\f\2\2\u0419\u041b\5`\61\2\u041a\u041c\5\u009aN\2\u041b"+
		"\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c\u009f\3\2\2\2\u041d\u041f\7\37"+
		"\2\2\u041e\u0420\5\u00a2R\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u00a1\3\2\2\2\u0421\u0422\7\6\2\2\u0422\u0425\5^\60\2\u0423\u0425\5\u0090"+
		"I\2\u0424\u0421\3\2\2\2\u0424\u0423\3\2\2\2\u0425\u00a3\3\2\2\2\u0426"+
		"\u0427\7$\2\2\u0427\u0428\7\65\2\2\u0428\u0429\5 \21\2\u0429\u042a\7\66"+
		"\2\2\u042a\u042b\7(\2\2\u042b\u00a5\3\2\2\2\u042c\u042d\7%\2\2\u042d\u042e"+
		"\7)\2\2\u042e\u042f\78\2\2\u042f\u0430\7(\2\2\u0430\u0432\7c\2\2\u0431"+
		"\u0433\5\u00acW\2\u0432\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0432"+
		"\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7d\2\2\u0437"+
		"\u00a7\3\2\2\2\u0438\u0439\7&\2\2\u0439\u043a\7)\2\2\u043a\u043b\5\20"+
		"\t\2\u043b\u043c\78\2\2\u043c\u043d\7(\2\2\u043d\u043f\7c\2\2\u043e\u0440"+
		"\5\u00acW\2\u043f\u043e\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u043f\3\2\2"+
		"\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\7d\2\2\u0444\u00a9"+
		"\3\2\2\2\u0445\u0446\7\'\2\2\u0446\u0447\7\65\2\2\u0447\u044c\5^\60\2"+
		"\u0448\u0449\t\4\2\2\u0449\u044b\5^\60\2\u044a\u0448\3\2\2\2\u044b\u044e"+
		"\3\2\2\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e"+
		"\u044c\3\2\2\2\u044f\u0450\7\66\2\2\u0450\u00ab\3\2\2\2\u0451\u0452\7"+
		"\65\2\2\u0452\u0457\5^\60\2\u0453\u0454\7\67\2\2\u0454\u0456\5^\60\2\u0455"+
		"\u0453\3\2\2\2\u0456\u0459\3\2\2\2\u0457\u0455\3\2\2\2\u0457\u0458\3\2"+
		"\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2\2\2\u045a\u045b\7\66\2\2\u045b"+
		"\u045e\3\2\2\2\u045c\u045e\7(\2\2\u045d\u0451\3\2\2\2\u045d\u045c\3\2"+
		"\2\2\u045e\u00ad\3\2\2\2\u045f\u0460\t\5\2\2\u0460\u00af\3\2\2\2\u0461"+
		"\u0465\5\u00b2Z\2\u0462\u0465\7\60\2\2\u0463\u0465\7\61\2\2\u0464\u0461"+
		"\3\2\2\2\u0464\u0462\3\2\2\2\u0464\u0463\3\2\2\2\u0465\u00b1\3\2\2\2\u0466"+
		"\u0467\t\6\2\2\u0467\u00b3\3\2\2\2\u009d\u00b6\u00b8\u00c2\u00c8\u00d1"+
		"\u00d4\u00db\u00e0\u00e7\u00ee\u00f5\u00fb\u00ff\u0105\u010b\u010f\u0115"+
		"\u0119\u011b\u011f\u0125\u0129\u012f\u0133\u0138\u013d\u0143\u0147\u014d"+
		"\u0153\u0157\u015d\u0161\u0163\u0167\u016d\u0171\u0177\u017b\u0184\u018b"+
		"\u018f\u019b\u01a1\u01a7\u01ab\u01ae\u01b2\u01b7\u01bb\u01bf\u01cd\u01d5"+
		"\u01dd\u01df\u01e3\u01ec\u01f3\u01f5\u01fe\u0203\u0208\u020f\u0213\u021a"+
		"\u0222\u022b\u0234\u023b\u0245\u0252\u0258\u0261\u026c\u0277\u027c\u0281"+
		"\u0286\u028e\u0297\u029d\u029f\u02a7\u02ab\u02b3\u02b6\u02ba\u02be\u02c5"+
		"\u02cf\u02d7\u02dd\u02e5\u02f5\u02f8\u0301\u0309\u0311\u0319\u031b\u0323"+
		"\u0325\u0333\u0335\u033f\u0345\u034a\u034f\u0354\u0359\u0361\u0367\u036f"+
		"\u0373\u0375\u0379\u0382\u0389\u038d\u0391\u0395\u0398\u039a\u039e\u03a5"+
		"\u03a9\u03b0\u03b4\u03c1\u03c5\u03c7\u03cf\u03d3\u03d5\u03d7\u03dd\u03e0"+
		"\u03ea\u03ef\u03f7\u03fd\u0401\u0405\u040b\u040f\u0416\u041b\u041f\u0424"+
		"\u0434\u0441\u044c\u0457\u045d\u0464";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}