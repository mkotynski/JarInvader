// Generated from C:/Users/kotyn/Desktop/jarInvader/src/main/antlr4\grama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DECL=18, WS=19, WSO=20, STH=21;
	public static final int
		RULE_begin = 0, RULE_listing = 1, RULE_adding = 2, RULE_installjar = 3, 
		RULE_listpackages = 4, RULE_listclasses = 5, RULE_listmethods = 6, RULE_listfields = 7, 
		RULE_listctors = 8, RULE_addpackage = 9, RULE_addclass = 10, RULE_addinterface = 11, 
		RULE_addmethod = 12, RULE_addfield = 13, RULE_addcons = 14, RULE_setmethodbody = 15, 
		RULE_addbeformethod = 16, RULE_addaftermethod = 17, RULE_setctorbody = 18, 
		RULE_savejar = 19, RULE_expr = 20, RULE_expr2 = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "listing", "adding", "installjar", "listpackages", "listclasses", 
			"listmethods", "listfields", "listctors", "addpackage", "addclass", "addinterface", 
			"addmethod", "addfield", "addcons", "setmethodbody", "addbeformethod", 
			"addaftermethod", "setctorbody", "savejar", "expr", "expr2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'--i '", "'--list-packages'", "'--list-classes'", "'--list-methods '", 
			"'--list-fields '", "'--list-ctors '", "'add-package '", "'add-class '", 
			"'add-interface '", "'add-method '", "'add-field '", "'add-ctor '", "'set-method-body '", 
			"'add-before-method'", "'add-after-method'", "'set-ctor-body'", "'--o '", 
			null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "DECL", "WS", "WSO", "STH"
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
	public String getGrammarFileName() { return "grama.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BeginContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gramaParser.EOF, 0); }
		public InstalljarContext installjar() {
			return getRuleContext(InstalljarContext.class,0);
		}
		public ListingContext listing() {
			return getRuleContext(ListingContext.class,0);
		}
		public AddingContext adding() {
			return getRuleContext(AddingContext.class,0);
		}
		public SavejarContext savejar() {
			return getRuleContext(SavejarContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(44);
				installjar();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				setState(45);
				listing();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				{
				setState(46);
				adding();
				}
				break;
			case T__16:
				{
				setState(47);
				savejar();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(50);
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

	public static class ListingContext extends ParserRuleContext {
		public ListpackagesContext listpackages() {
			return getRuleContext(ListpackagesContext.class,0);
		}
		public ListclassesContext listclasses() {
			return getRuleContext(ListclassesContext.class,0);
		}
		public ListmethodsContext listmethods() {
			return getRuleContext(ListmethodsContext.class,0);
		}
		public ListfieldsContext listfields() {
			return getRuleContext(ListfieldsContext.class,0);
		}
		public ListctorsContext listctors() {
			return getRuleContext(ListctorsContext.class,0);
		}
		public ListingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListingContext listing() throws RecognitionException {
		ListingContext _localctx = new ListingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(52);
				listpackages();
				}
				break;
			case T__2:
				{
				setState(53);
				listclasses();
				}
				break;
			case T__3:
				{
				setState(54);
				listmethods();
				}
				break;
			case T__4:
				{
				setState(55);
				listfields();
				}
				break;
			case T__5:
				{
				setState(56);
				listctors();
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

	public static class AddingContext extends ParserRuleContext {
		public AddpackageContext addpackage() {
			return getRuleContext(AddpackageContext.class,0);
		}
		public AddclassContext addclass() {
			return getRuleContext(AddclassContext.class,0);
		}
		public AddinterfaceContext addinterface() {
			return getRuleContext(AddinterfaceContext.class,0);
		}
		public AddmethodContext addmethod() {
			return getRuleContext(AddmethodContext.class,0);
		}
		public AddfieldContext addfield() {
			return getRuleContext(AddfieldContext.class,0);
		}
		public AddconsContext addcons() {
			return getRuleContext(AddconsContext.class,0);
		}
		public SetmethodbodyContext setmethodbody() {
			return getRuleContext(SetmethodbodyContext.class,0);
		}
		public AddaftermethodContext addaftermethod() {
			return getRuleContext(AddaftermethodContext.class,0);
		}
		public AddbeformethodContext addbeformethod() {
			return getRuleContext(AddbeformethodContext.class,0);
		}
		public SetctorbodyContext setctorbody() {
			return getRuleContext(SetctorbodyContext.class,0);
		}
		public AddingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAdding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAdding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAdding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddingContext adding() throws RecognitionException {
		AddingContext _localctx = new AddingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_adding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(59);
				addpackage();
				}
				break;
			case T__7:
				{
				setState(60);
				addclass();
				}
				break;
			case T__8:
				{
				setState(61);
				addinterface();
				}
				break;
			case T__9:
				{
				setState(62);
				addmethod();
				}
				break;
			case T__10:
				{
				setState(63);
				addfield();
				}
				break;
			case T__11:
				{
				setState(64);
				addcons();
				}
				break;
			case T__12:
				{
				setState(65);
				setmethodbody();
				}
				break;
			case T__14:
				{
				setState(66);
				addaftermethod();
				}
				break;
			case T__13:
				{
				setState(67);
				addbeformethod();
				}
				break;
			case T__15:
				{
				setState(68);
				setctorbody();
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

	public static class InstalljarContext extends ParserRuleContext {
		public Token filename;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public InstalljarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_installjar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterInstalljar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitInstalljar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitInstalljar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstalljarContext installjar() throws RecognitionException {
		InstalljarContext _localctx = new InstalljarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_installjar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			((InstalljarContext)_localctx).filename = match(STH);
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

	public static class ListpackagesContext extends ParserRuleContext {
		public ListpackagesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listpackages; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListpackages(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListpackages(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListpackages(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListpackagesContext listpackages() throws RecognitionException {
		ListpackagesContext _localctx = new ListpackagesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listpackages);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__1);
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

	public static class ListclassesContext extends ParserRuleContext {
		public ListclassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listclasses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListclasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListclasses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListclasses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListclassesContext listclasses() throws RecognitionException {
		ListclassesContext _localctx = new ListclassesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_listclasses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__2);
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

	public static class ListmethodsContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public ListmethodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listmethods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListmethods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListmethods(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListmethods(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListmethodsContext listmethods() throws RecognitionException {
		ListmethodsContext _localctx = new ListmethodsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listmethods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__3);
			setState(79);
			((ListmethodsContext)_localctx).name = match(STH);
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

	public static class ListfieldsContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public ListfieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listfields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListfields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListfields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListfields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListfieldsContext listfields() throws RecognitionException {
		ListfieldsContext _localctx = new ListfieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_listfields);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__4);
			setState(82);
			((ListfieldsContext)_localctx).name = match(STH);
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

	public static class ListctorsContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public ListctorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listctors; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterListctors(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitListctors(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitListctors(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListctorsContext listctors() throws RecognitionException {
		ListctorsContext _localctx = new ListctorsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listctors);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__5);
			setState(85);
			((ListctorsContext)_localctx).name = match(STH);
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

	public static class AddpackageContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public AddpackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addpackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddpackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddpackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddpackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddpackageContext addpackage() throws RecognitionException {
		AddpackageContext _localctx = new AddpackageContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addpackage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__6);
			setState(88);
			((AddpackageContext)_localctx).name = match(STH);
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

	public static class AddclassContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public AddclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddclassContext addclass() throws RecognitionException {
		AddclassContext _localctx = new AddclassContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_addclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__7);
			setState(91);
			((AddclassContext)_localctx).name = match(STH);
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

	public static class AddinterfaceContext extends ParserRuleContext {
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public AddinterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addinterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddinterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddinterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddinterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddinterfaceContext addinterface() throws RecognitionException {
		AddinterfaceContext _localctx = new AddinterfaceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addinterface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__8);
			setState(94);
			((AddinterfaceContext)_localctx).name = match(STH);
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

	public static class AddmethodContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddmethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addmethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddmethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddmethodContext addmethod() throws RecognitionException {
		AddmethodContext _localctx = new AddmethodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addmethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__9);
			setState(97);
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

	public static class AddfieldContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddfieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addfield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddfield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddfield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddfield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddfieldContext addfield() throws RecognitionException {
		AddfieldContext _localctx = new AddfieldContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_addfield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__10);
			setState(100);
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

	public static class AddconsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddconsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addcons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddcons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddcons(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddcons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddconsContext addcons() throws RecognitionException {
		AddconsContext _localctx = new AddconsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addcons);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__11);
			setState(103);
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

	public static class SetmethodbodyContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public SetmethodbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setmethodbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterSetmethodbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitSetmethodbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitSetmethodbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetmethodbodyContext setmethodbody() throws RecognitionException {
		SetmethodbodyContext _localctx = new SetmethodbodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_setmethodbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			expr2();
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

	public static class AddbeformethodContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public AddbeformethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addbeformethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddbeformethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddbeformethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddbeformethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddbeformethodContext addbeformethod() throws RecognitionException {
		AddbeformethodContext _localctx = new AddbeformethodContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addbeformethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__13);
			setState(109);
			expr2();
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

	public static class AddaftermethodContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public AddaftermethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addaftermethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterAddaftermethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitAddaftermethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitAddaftermethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddaftermethodContext addaftermethod() throws RecognitionException {
		AddaftermethodContext _localctx = new AddaftermethodContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_addaftermethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__14);
			setState(112);
			expr2();
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

	public static class SetctorbodyContext extends ParserRuleContext {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public SetctorbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setctorbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterSetctorbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitSetctorbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitSetctorbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetctorbodyContext setctorbody() throws RecognitionException {
		SetctorbodyContext _localctx = new SetctorbodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setctorbody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__15);
			setState(115);
			expr2();
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

	public static class SavejarContext extends ParserRuleContext {
		public Token filename;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public SavejarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savejar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterSavejar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitSavejar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitSavejar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SavejarContext savejar() throws RecognitionException {
		SavejarContext _localctx = new SavejarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_savejar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__16);
			setState(118);
			((SavejarContext)_localctx).filename = match(STH);
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
		public Token name;
		public Token declaration;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public TerminalNode DECL() { return getToken(gramaParser.DECL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((ExprContext)_localctx).name = match(STH);
			setState(121);
			((ExprContext)_localctx).declaration = match(DECL);
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

	public static class Expr2Context extends ParserRuleContext {
		public Token name;
		public Token src;
		public TerminalNode WSO() { return getToken(gramaParser.WSO, 0); }
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
		public TerminalNode DECL() { return getToken(gramaParser.DECL, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaListener ) ((gramaListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaVisitor ) return ((gramaVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expr2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((Expr2Context)_localctx).name = match(STH);
			setState(124);
			match(WSO);
			setState(125);
			((Expr2Context)_localctx).src = match(DECL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\5\2"+
		"\63\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4H\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\2{"+
		"\2\62\3\2\2\2\4;\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16"+
		"P\3\2\2\2\20S\3\2\2\2\22V\3\2\2\2\24Y\3\2\2\2\26\\\3\2\2\2\30_\3\2\2\2"+
		"\32b\3\2\2\2\34e\3\2\2\2\36h\3\2\2\2 k\3\2\2\2\"n\3\2\2\2$q\3\2\2\2&t"+
		"\3\2\2\2(w\3\2\2\2*z\3\2\2\2,}\3\2\2\2.\63\5\b\5\2/\63\5\4\3\2\60\63\5"+
		"\6\4\2\61\63\5(\25\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2"+
		"\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66<\5\n\6\2\67<\5\f\7\28<"+
		"\5\16\b\29<\5\20\t\2:<\5\22\n\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2;9\3"+
		"\2\2\2;:\3\2\2\2<\5\3\2\2\2=H\5\24\13\2>H\5\26\f\2?H\5\30\r\2@H\5\32\16"+
		"\2AH\5\34\17\2BH\5\36\20\2CH\5 \21\2DH\5$\23\2EH\5\"\22\2FH\5&\24\2G="+
		"\3\2\2\2G>\3\2\2\2G?\3\2\2\2G@\3\2\2\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2G"+
		"D\3\2\2\2GE\3\2\2\2GF\3\2\2\2H\7\3\2\2\2IJ\7\3\2\2JK\7\27\2\2K\t\3\2\2"+
		"\2LM\7\4\2\2M\13\3\2\2\2NO\7\5\2\2O\r\3\2\2\2PQ\7\6\2\2QR\7\27\2\2R\17"+
		"\3\2\2\2ST\7\7\2\2TU\7\27\2\2U\21\3\2\2\2VW\7\b\2\2WX\7\27\2\2X\23\3\2"+
		"\2\2YZ\7\t\2\2Z[\7\27\2\2[\25\3\2\2\2\\]\7\n\2\2]^\7\27\2\2^\27\3\2\2"+
		"\2_`\7\13\2\2`a\7\27\2\2a\31\3\2\2\2bc\7\f\2\2cd\5*\26\2d\33\3\2\2\2e"+
		"f\7\r\2\2fg\5*\26\2g\35\3\2\2\2hi\7\16\2\2ij\5*\26\2j\37\3\2\2\2kl\7\17"+
		"\2\2lm\5,\27\2m!\3\2\2\2no\7\20\2\2op\5,\27\2p#\3\2\2\2qr\7\21\2\2rs\5"+
		",\27\2s%\3\2\2\2tu\7\22\2\2uv\5,\27\2v\'\3\2\2\2wx\7\23\2\2xy\7\27\2\2"+
		"y)\3\2\2\2z{\7\27\2\2{|\7\24\2\2|+\3\2\2\2}~\7\27\2\2~\177\7\26\2\2\177"+
		"\u0080\7\24\2\2\u0080-\3\2\2\2\5\62;G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}