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
		T__9=10, T__10=11, T__11=12, WS=13, STH=14;
	public static final int
		RULE_begin = 0, RULE_listing = 1, RULE_adding = 2, RULE_installjar = 3, 
		RULE_listpackages = 4, RULE_listclasses = 5, RULE_listmethods = 6, RULE_listfields = 7, 
		RULE_listctors = 8, RULE_addpackage = 9, RULE_addclass = 10, RULE_addinterface = 11, 
		RULE_addmethod = 12, RULE_addfield = 13, RULE_addcons = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"begin", "listing", "adding", "installjar", "listpackages", "listclasses", 
			"listmethods", "listfields", "listctors", "addpackage", "addclass", "addinterface", 
			"addmethod", "addfield", "addcons"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'--i '", "'--list-packages'", "'--list-classes'", "'--list-methods '", 
			"'--list-fields '", "'--list-ctors '", "'add-package '", "'add-class '", 
			"'add-interface '", "'add-method '", "'add-field '", "'add-ctor '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "WS", "STH"
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
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(30);
				installjar();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
				{
				setState(31);
				listing();
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				{
				setState(32);
				adding();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(35);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(37);
				listpackages();
				}
				break;
			case T__2:
				{
				setState(38);
				listclasses();
				}
				break;
			case T__3:
				{
				setState(39);
				listmethods();
				}
				break;
			case T__4:
				{
				setState(40);
				listfields();
				}
				break;
			case T__5:
				{
				setState(41);
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
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(44);
				addpackage();
				}
				break;
			case T__7:
				{
				setState(45);
				addclass();
				}
				break;
			case T__8:
				{
				setState(46);
				addinterface();
				}
				break;
			case T__9:
				{
				setState(47);
				addmethod();
				}
				break;
			case T__10:
				{
				setState(48);
				addfield();
				}
				break;
			case T__11:
				{
				setState(49);
				addcons();
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
			setState(52);
			match(T__0);
			setState(53);
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
			setState(55);
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
			setState(57);
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
			setState(59);
			match(T__3);
			setState(60);
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
			setState(62);
			match(T__4);
			setState(63);
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
			setState(65);
			match(T__5);
			setState(66);
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
			setState(68);
			match(T__6);
			setState(69);
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
			setState(71);
			match(T__7);
			setState(72);
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
			setState(74);
			match(T__8);
			setState(75);
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
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
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
			setState(77);
			match(T__9);
			setState(78);
			((AddmethodContext)_localctx).name = match(STH);
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
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
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
			setState(80);
			match(T__10);
			setState(81);
			((AddfieldContext)_localctx).name = match(STH);
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
		public Token name;
		public TerminalNode STH() { return getToken(gramaParser.STH, 0); }
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
			setState(83);
			match(T__11);
			setState(84);
			((AddconsContext)_localctx).name = match(STH);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\5\2$\n\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2T\2#"+
		"\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n9\3\2\2\2\f;\3\2\2\2\16"+
		"=\3\2\2\2\20@\3\2\2\2\22C\3\2\2\2\24F\3\2\2\2\26I\3\2\2\2\30L\3\2\2\2"+
		"\32O\3\2\2\2\34R\3\2\2\2\36U\3\2\2\2 $\5\b\5\2!$\5\4\3\2\"$\5\6\4\2# "+
		"\3\2\2\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'-\5\n\6"+
		"\2(-\5\f\7\2)-\5\16\b\2*-\5\20\t\2+-\5\22\n\2,\'\3\2\2\2,(\3\2\2\2,)\3"+
		"\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\65\5\24\13\2/\65\5\26\f\2\60\65"+
		"\5\30\r\2\61\65\5\32\16\2\62\65\5\34\17\2\63\65\5\36\20\2\64.\3\2\2\2"+
		"\64/\3\2\2\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65"+
		"\7\3\2\2\2\66\67\7\3\2\2\678\7\20\2\28\t\3\2\2\29:\7\4\2\2:\13\3\2\2\2"+
		";<\7\5\2\2<\r\3\2\2\2=>\7\6\2\2>?\7\20\2\2?\17\3\2\2\2@A\7\7\2\2AB\7\20"+
		"\2\2B\21\3\2\2\2CD\7\b\2\2DE\7\20\2\2E\23\3\2\2\2FG\7\t\2\2GH\7\20\2\2"+
		"H\25\3\2\2\2IJ\7\n\2\2JK\7\20\2\2K\27\3\2\2\2LM\7\13\2\2MN\7\20\2\2N\31"+
		"\3\2\2\2OP\7\f\2\2PQ\7\20\2\2Q\33\3\2\2\2RS\7\r\2\2ST\7\20\2\2T\35\3\2"+
		"\2\2UV\7\16\2\2VW\7\20\2\2W\37\3\2\2\2\5#,\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}