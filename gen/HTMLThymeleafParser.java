// Generated from C:/Users/Lenovo/IdeaProjects/spring-thymeleaf-compiler/src/parser/HTMLThymeleafParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HTMLThymeleafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, DOCTYPE=2, TAG_OPEN_SLASH=3, TAG_OPEN=4, HTML_TEXT=5, 
		TAG_CLOSE=6, TAG_SLASH_CLOSE=7, TH_TEXT=8, TH_EACH=9, TH_IF=10, TH_UNLESS=11, 
		TH_SRC=12, TH_HREF=13, TH_ACTION=14, TH_OBJECT=15, TH_FIELD=16, TH_VALUE=17, 
		TH_OTHER_ATTR=18, EQUALS=19, TAG_NAME=20, ATTVALUE_VALUE=21, TAG_WHITESPACE=22;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlNode = 1, RULE_htmlElement = 2, RULE_htmlAttribute = 3, 
		RULE_thymeleafAttribute = 4, RULE_thymeleafAttributeName = 5, RULE_standardAttribute = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlNode", "htmlElement", "htmlAttribute", "thymeleafAttribute", 
			"thymeleafAttributeName", "standardAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'</'", "'<'", null, "'>'", "'/>'", "'th:text'", "'th:each'", 
			"'th:if'", "'th:unless'", "'th:src'", "'th:href'", "'th:action'", "'th:object'", 
			"'th:field'", "'th:value'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "DOCTYPE", "TAG_OPEN_SLASH", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TH_TEXT", "TH_EACH", "TH_IF", "TH_UNLESS", 
			"TH_SRC", "TH_HREF", "TH_ACTION", "TH_OBJECT", "TH_FIELD", "TH_VALUE", 
			"TH_OTHER_ATTR", "EQUALS", "TAG_NAME", "ATTVALUE_VALUE", "TAG_WHITESPACE"
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
	public String getGrammarFileName() { return "HTMLThymeleafParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLThymeleafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HTMLThymeleafParser.EOF, 0); }
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_OPEN || _la==HTML_TEXT) {
				{
				{
				setState(14);
				htmlNode();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlNodeContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public TerminalNode HTML_TEXT() { return getToken(HTMLThymeleafParser.HTML_TEXT, 0); }
		public HtmlNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterHtmlNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitHtmlNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitHtmlNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlNodeContext htmlNode() throws RecognitionException {
		HtmlNodeContext _localctx = new HtmlNodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlNode);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				htmlElement();
				}
				break;
			case HTML_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(HTML_TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLThymeleafParser.TAG_OPEN, 0); }
		public TerminalNode TAG_NAME() { return getToken(HTMLThymeleafParser.TAG_NAME, 0); }
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HTMLThymeleafParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public SelfClosingTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalTagContext extends HtmlElementContext {
		public TerminalNode TAG_OPEN() { return getToken(HTMLThymeleafParser.TAG_OPEN, 0); }
		public List<TerminalNode> TAG_NAME() { return getTokens(HTMLThymeleafParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HTMLThymeleafParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HTMLThymeleafParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HTMLThymeleafParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_OPEN_SLASH() { return getToken(HTMLThymeleafParser.TAG_OPEN_SLASH, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlNodeContext> htmlNode() {
			return getRuleContexts(HtmlNodeContext.class);
		}
		public HtmlNodeContext htmlNode(int i) {
			return getRuleContext(HtmlNodeContext.class,i);
		}
		public NormalTagContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterNormalTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitNormalTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitNormalTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new NormalTagContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(TAG_OPEN);
				setState(27);
				match(TAG_NAME);
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1572608L) != 0)) {
					{
					{
					setState(28);
					htmlAttribute();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(TAG_CLOSE);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_OPEN || _la==HTML_TEXT) {
					{
					{
					setState(35);
					htmlNode();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(TAG_OPEN_SLASH);
				setState(42);
				match(TAG_NAME);
				setState(43);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				_localctx = new SelfClosingTagContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(TAG_OPEN);
				setState(45);
				match(TAG_NAME);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1572608L) != 0)) {
					{
					{
					setState(46);
					htmlAttribute();
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(TAG_SLASH_CLOSE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public ThymeleafAttributeContext thymeleafAttribute() {
			return getRuleContext(ThymeleafAttributeContext.class,0);
		}
		public StandardAttributeContext standardAttribute() {
			return getRuleContext(StandardAttributeContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlAttribute);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TH_TEXT:
			case TH_EACH:
			case TH_IF:
			case TH_UNLESS:
			case TH_SRC:
			case TH_HREF:
			case TH_ACTION:
			case TH_OBJECT:
			case TH_FIELD:
			case TH_VALUE:
			case TH_OTHER_ATTR:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				thymeleafAttribute();
				}
				break;
			case TAG_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				standardAttribute();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThymeleafAttributeContext extends ParserRuleContext {
		public ThymeleafAttributeNameContext thymeleafAttributeName() {
			return getRuleContext(ThymeleafAttributeNameContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(HTMLThymeleafParser.EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLThymeleafParser.ATTVALUE_VALUE, 0); }
		public ThymeleafAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thymeleafAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterThymeleafAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitThymeleafAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitThymeleafAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThymeleafAttributeContext thymeleafAttribute() throws RecognitionException {
		ThymeleafAttributeContext _localctx = new ThymeleafAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_thymeleafAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			thymeleafAttributeName();
			setState(60);
			match(EQUALS);
			setState(61);
			match(ATTVALUE_VALUE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThymeleafAttributeNameContext extends ParserRuleContext {
		public TerminalNode TH_TEXT() { return getToken(HTMLThymeleafParser.TH_TEXT, 0); }
		public TerminalNode TH_EACH() { return getToken(HTMLThymeleafParser.TH_EACH, 0); }
		public TerminalNode TH_IF() { return getToken(HTMLThymeleafParser.TH_IF, 0); }
		public TerminalNode TH_UNLESS() { return getToken(HTMLThymeleafParser.TH_UNLESS, 0); }
		public TerminalNode TH_SRC() { return getToken(HTMLThymeleafParser.TH_SRC, 0); }
		public TerminalNode TH_HREF() { return getToken(HTMLThymeleafParser.TH_HREF, 0); }
		public TerminalNode TH_ACTION() { return getToken(HTMLThymeleafParser.TH_ACTION, 0); }
		public TerminalNode TH_OBJECT() { return getToken(HTMLThymeleafParser.TH_OBJECT, 0); }
		public TerminalNode TH_FIELD() { return getToken(HTMLThymeleafParser.TH_FIELD, 0); }
		public TerminalNode TH_VALUE() { return getToken(HTMLThymeleafParser.TH_VALUE, 0); }
		public TerminalNode TH_OTHER_ATTR() { return getToken(HTMLThymeleafParser.TH_OTHER_ATTR, 0); }
		public ThymeleafAttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thymeleafAttributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterThymeleafAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitThymeleafAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitThymeleafAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThymeleafAttributeNameContext thymeleafAttributeName() throws RecognitionException {
		ThymeleafAttributeNameContext _localctx = new ThymeleafAttributeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_thymeleafAttributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 524032L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HTMLThymeleafParser.TAG_NAME, 0); }
		public TerminalNode EQUALS() { return getToken(HTMLThymeleafParser.EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HTMLThymeleafParser.ATTVALUE_VALUE, 0); }
		public StandardAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standardAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).enterStandardAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLThymeleafParserListener ) ((HTMLThymeleafParserListener)listener).exitStandardAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLThymeleafParserVisitor ) return ((HTMLThymeleafParserVisitor<? extends T>)visitor).visitStandardAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandardAttributeContext standardAttribute() throws RecognitionException {
		StandardAttributeContext _localctx = new StandardAttributeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_standardAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(TAG_NAME);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(66);
				match(EQUALS);
				setState(67);
				match(ATTVALUE_VALUE);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016G\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u001e\b\u0002\n\u0002\f\u0002!\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00020\b"+
		"\u0002\n\u0002\f\u00023\t\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006E\b\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\b\u0012G\u0000\u0011\u0001"+
		"\u0000\u0000\u0000\u0002\u0018\u0001\u0000\u0000\u0000\u00045\u0001\u0000"+
		"\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b;\u0001\u0000\u0000\u0000"+
		"\n?\u0001\u0000\u0000\u0000\fA\u0001\u0000\u0000\u0000\u000e\u0010\u0003"+
		"\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0013\u0001"+
		"\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012\u0001"+
		"\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000\u0001\u0015\u0001\u0001"+
		"\u0000\u0000\u0000\u0016\u0019\u0003\u0004\u0002\u0000\u0017\u0019\u0005"+
		"\u0005\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0004\u0000\u0000\u001b\u001f\u0005\u0014\u0000\u0000\u001c\u001e\u0003"+
		"\u0006\u0003\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"&\u0005"+
		"\u0006\u0000\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0003"+
		"\u0000\u0000*+\u0005\u0014\u0000\u0000+6\u0005\u0006\u0000\u0000,-\u0005"+
		"\u0004\u0000\u0000-1\u0005\u0014\u0000\u0000.0\u0003\u0006\u0003\u0000"+
		"/.\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000024\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000046\u0005\u0007\u0000\u00005\u001a\u0001\u0000\u0000\u0000"+
		"5,\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000\u00007:\u0003\b\u0004"+
		"\u00008:\u0003\f\u0006\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:\u0007\u0001\u0000\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0013"+
		"\u0000\u0000=>\u0005\u0015\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0007"+
		"\u0000\u0000\u0000@\u000b\u0001\u0000\u0000\u0000AD\u0005\u0014\u0000"+
		"\u0000BC\u0005\u0013\u0000\u0000CE\u0005\u0015\u0000\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000E\r\u0001\u0000\u0000\u0000\b\u0011"+
		"\u0018\u001f&159D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}