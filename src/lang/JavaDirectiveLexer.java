// Generated from JavaDirective.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaDirectiveLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KeyWorkImport=1, KeyWordPackage=2, SEP=3, END=4, S=5, Identifier=6, COMMENT=7, 
		LINE_COMMENT=8, WS=9, EXTRA=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'import'", "'package'", "'.'", "';'", "S", "Identifier", "COMMENT", "LINE_COMMENT", 
		"WS", "EXTRA"
	};
	public static final String[] ruleNames = {
		"KeyWorkImport", "KeyWordPackage", "SEP", "END", "S", "Identifier", "COMMENT", 
		"LINE_COMMENT", "WS", "EXTRA"
	};


	public JavaDirectiveLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JavaDirective.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fY\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7\61\n\7\f\7\16\7\64\13\7\3\b\3\b"+
		"\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7"+
		"\tH\n\t\f\t\16\tK\13\t\3\t\3\t\3\n\6\nP\n\n\r\n\16\nQ\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3;\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\7"+
		"\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\5\2\13\f\16\17"+
		"\"\"\\\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3\27\3"+
		"\2\2\2\5\36\3\2\2\2\7&\3\2\2\2\t(\3\2\2\2\13*\3\2\2\2\r.\3\2\2\2\17\65"+
		"\3\2\2\2\21C\3\2\2\2\23O\3\2\2\2\25U\3\2\2\2\27\30\7k\2\2\30\31\7o\2\2"+
		"\31\32\7r\2\2\32\33\7q\2\2\33\34\7t\2\2\34\35\7v\2\2\35\4\3\2\2\2\36\37"+
		"\7r\2\2\37 \7c\2\2 !\7e\2\2!\"\7m\2\2\"#\7c\2\2#$\7i\2\2$%\7g\2\2%\6\3"+
		"\2\2\2&\'\7\60\2\2\'\b\3\2\2\2()\7=\2\2)\n\3\2\2\2*+\t\2\2\2+,\3\2\2\2"+
		",-\b\6\2\2-\f\3\2\2\2.\62\t\3\2\2/\61\t\4\2\2\60/\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\16\3\2\2\2\64\62\3\2\2\2\65\66\7\61"+
		"\2\2\66\67\7,\2\2\67;\3\2\2\28:\13\2\2\298\3\2\2\2:=\3\2\2\2;<\3\2\2\2"+
		";9\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7,\2\2?@\7\61\2\2@A\3\2\2\2AB\b\b\2\2"+
		"B\20\3\2\2\2CD\7\61\2\2DE\7\61\2\2EI\3\2\2\2FH\n\5\2\2GF\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\b\t\2\2M\22\3\2\2\2NP\t"+
		"\6\2\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\b\n\2\2T\24"+
		"\3\2\2\2UV\4\2\1\2VW\3\2\2\2WX\b\13\2\2X\26\3\2\2\2\7\2\62;IQ\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}