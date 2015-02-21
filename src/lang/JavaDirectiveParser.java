// Generated from JavaDirective.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaDirectiveParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KeyWorkImport=1, KeyWordPackage=2, SEP=3, END=4, S=5, Identifier=6, COMMENT=7, 
		LINE_COMMENT=8, WS=9, EXTRA=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'import'", "'package'", "'.'", "';'", "S", "Identifier", 
		"COMMENT", "LINE_COMMENT", "WS", "EXTRA"
	};
	public static final int
		RULE_lang_source = 0, RULE_l_target = 1, RULE_l_package = 2, RULE_l_directive = 3;
	public static final String[] ruleNames = {
		"lang_source", "l_target", "l_package", "l_directive"
	};

	@Override
	public String getGrammarFileName() { return "JavaDirective.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaDirectiveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Lang_sourceContext extends ParserRuleContext {
		public L_packageContext l_package(int i) {
			return getRuleContext(L_packageContext.class,i);
		}
		public List<L_packageContext> l_package() {
			return getRuleContexts(L_packageContext.class);
		}
		public L_directiveContext l_directive(int i) {
			return getRuleContext(L_directiveContext.class,i);
		}
		public List<L_directiveContext> l_directive() {
			return getRuleContexts(L_directiveContext.class);
		}
		public Lang_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).enterLang_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).exitLang_source(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDirectiveVisitor ) return ((JavaDirectiveVisitor<? extends T>)visitor).visitLang_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lang_sourceContext lang_source() throws RecognitionException {
		Lang_sourceContext _localctx = new Lang_sourceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lang_source);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(11);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(8); l_package();
					}
					} 
				}
				setState(13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(17);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(14); l_directive();
					}
					} 
				}
				setState(19);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
			setState(21); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(20);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=1 && _alt!=-1 );
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

	public static class L_targetContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JavaDirectiveParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaDirectiveParser.Identifier, i);
		}
		public List<TerminalNode> SEP() { return getTokens(JavaDirectiveParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(JavaDirectiveParser.SEP, i);
		}
		public L_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).enterL_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).exitL_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDirectiveVisitor ) return ((JavaDirectiveVisitor<? extends T>)visitor).visitL_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_targetContext l_target() throws RecognitionException {
		L_targetContext _localctx = new L_targetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_l_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); match(Identifier);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(26); match(SEP);
				setState(27); match(Identifier);
				}
				}
				setState(32);
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

	public static class L_packageContext extends ParserRuleContext {
		public TerminalNode KeyWordPackage() { return getToken(JavaDirectiveParser.KeyWordPackage, 0); }
		public L_targetContext l_target() {
			return getRuleContext(L_targetContext.class,0);
		}
		public TerminalNode END() { return getToken(JavaDirectiveParser.END, 0); }
		public L_packageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).enterL_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).exitL_package(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDirectiveVisitor ) return ((JavaDirectiveVisitor<? extends T>)visitor).visitL_package(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_packageContext l_package() throws RecognitionException {
		L_packageContext _localctx = new L_packageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_l_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); match(KeyWordPackage);
			setState(34); l_target();
			setState(35); match(END);
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

	public static class L_directiveContext extends ParserRuleContext {
		public L_targetContext l_target() {
			return getRuleContext(L_targetContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaDirectiveParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JavaDirectiveParser.Identifier, i);
		}
		public TerminalNode END() { return getToken(JavaDirectiveParser.END, 0); }
		public TerminalNode KeyWorkImport() { return getToken(JavaDirectiveParser.KeyWorkImport, 0); }
		public L_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).enterL_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaDirectiveListener ) ((JavaDirectiveListener)listener).exitL_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaDirectiveVisitor ) return ((JavaDirectiveVisitor<? extends T>)visitor).visitL_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final L_directiveContext l_directive() throws RecognitionException {
		L_directiveContext _localctx = new L_directiveContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_l_directive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(KeyWorkImport);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(38); match(Identifier);
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(44); l_target();
			setState(45); match(END);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\7\2\22\n\2\f\2"+
		"\16\2\25\13\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\7\3\37\n\3\f\3\16"+
		"\3\"\13\3\3\4\3\4\3\4\3\4\3\5\3\5\7\5*\n\5\f\5\16\5-\13\5\3\5\3\5\3\5"+
		"\3\5\3\31\2\6\2\4\6\b\2\2\62\2\r\3\2\2\2\4\33\3\2\2\2\6#\3\2\2\2\b\'\3"+
		"\2\2\2\n\f\5\6\4\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2"+
		"\16\23\3\2\2\2\17\r\3\2\2\2\20\22\5\b\5\2\21\20\3\2\2\2\22\25\3\2\2\2"+
		"\23\21\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\26\30\13\2\2"+
		"\2\27\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2\31\27\3\2\2\2\32\3\3\2\2"+
		"\2\33 \7\b\2\2\34\35\7\5\2\2\35\37\7\b\2\2\36\34\3\2\2\2\37\"\3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\" \3\2\2\2#$\7\4\2\2$%\5\4\3\2%&\7\6"+
		"\2\2&\7\3\2\2\2\'+\7\3\2\2(*\7\b\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,.\3\2\2\2-+\3\2\2\2./\5\4\3\2/\60\7\6\2\2\60\t\3\2\2\2\7\r\23\31"+
		" +";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}