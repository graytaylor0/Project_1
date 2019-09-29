// Generated from C:/Users/monke/OneDrive - Texas A&M University/Fall 2019/CSCE 315 - 909/Project 1/src/project1\rules.g4 by ANTLR 4.7.2
package com.company.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		OP=32, INTEGER=33, DIGIT=34, IDENTIFIER=35, STRINGLITERAL=36, ALPHA=37, 
		WHITESPACE=38;
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
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "OP", "INTEGER", 
			"DIGIT", "IDENTIFIER", "STRINGLITERAL", "ALPHA", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'VARCHAR'", "'('", "')'", "'INTEGER'", "','", "'OPEN'", "'CLOSE'", 
			"'WRITE'", "'EXIT'", "'||'", "'&&'", "'select'", "'project'", "'rename'", 
			"'+'", "'-'", "'*'", "'&'", "'SHOW'", "'CREATE TABLE'", "'PRIMARY KEY'", 
			"'UPDATE'", "'SET'", "'='", "'WHERE'", "'INSERT INTO'", "'VALUES FROM'", 
			"'VALUES FROM RELATION'", "'DELETE FROM'", "';'", "'<-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "OP", "INTEGER", "DIGIT", 
			"IDENTIFIER", "STRINGLITERAL", "ALPHA", "WHITESPACE"
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


	public rulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0118\n!\3"+
		"\"\6\"\u011b\n\"\r\"\16\"\u011c\3#\3#\3$\3$\3$\7$\u0124\n$\f$\16$\u0127"+
		"\13$\3%\3%\3%\3%\7%\u012d\n%\f%\16%\u0130\13%\3%\3%\3&\3&\3\'\3\'\3\'"+
		"\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\6\4\2>>@@\3\2\62;\3\2C|\5\2\13\f\17"+
		"\17\"\"\2\u0141\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5W\3\2\2"+
		"\2\7Y\3\2\2\2\t[\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17j\3\2\2\2\21p\3\2\2"+
		"\2\23v\3\2\2\2\25{\3\2\2\2\27~\3\2\2\2\31\u0081\3\2\2\2\33\u0088\3\2\2"+
		"\2\35\u0090\3\2\2\2\37\u0097\3\2\2\2!\u0099\3\2\2\2#\u009b\3\2\2\2%\u009d"+
		"\3\2\2\2\'\u009f\3\2\2\2)\u00a4\3\2\2\2+\u00b1\3\2\2\2-\u00bd\3\2\2\2"+
		"/\u00c4\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2\2\65\u00d0\3\2\2\2\67"+
		"\u00dc\3\2\2\29\u00e8\3\2\2\2;\u00fd\3\2\2\2=\u0109\3\2\2\2?\u010b\3\2"+
		"\2\2A\u0117\3\2\2\2C\u011a\3\2\2\2E\u011e\3\2\2\2G\u0120\3\2\2\2I\u0128"+
		"\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2\2\2OP\7X\2\2PQ\7C\2\2QR\7T\2\2RS\7"+
		"E\2\2ST\7J\2\2TU\7C\2\2UV\7T\2\2V\4\3\2\2\2WX\7*\2\2X\6\3\2\2\2YZ\7+\2"+
		"\2Z\b\3\2\2\2[\\\7K\2\2\\]\7P\2\2]^\7V\2\2^_\7G\2\2_`\7I\2\2`a\7G\2\2"+
		"ab\7T\2\2b\n\3\2\2\2cd\7.\2\2d\f\3\2\2\2ef\7Q\2\2fg\7R\2\2gh\7G\2\2hi"+
		"\7P\2\2i\16\3\2\2\2jk\7E\2\2kl\7N\2\2lm\7Q\2\2mn\7U\2\2no\7G\2\2o\20\3"+
		"\2\2\2pq\7Y\2\2qr\7T\2\2rs\7K\2\2st\7V\2\2tu\7G\2\2u\22\3\2\2\2vw\7G\2"+
		"\2wx\7Z\2\2xy\7K\2\2yz\7V\2\2z\24\3\2\2\2{|\7~\2\2|}\7~\2\2}\26\3\2\2"+
		"\2~\177\7(\2\2\177\u0080\7(\2\2\u0080\30\3\2\2\2\u0081\u0082\7u\2\2\u0082"+
		"\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7g\2\2\u0085\u0086\7e\2\2"+
		"\u0086\u0087\7v\2\2\u0087\32\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7"+
		"t\2\2\u008a\u008b\7q\2\2\u008b\u008c\7l\2\2\u008c\u008d\7g\2\2\u008d\u008e"+
		"\7e\2\2\u008e\u008f\7v\2\2\u008f\34\3\2\2\2\u0090\u0091\7t\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7c\2\2\u0094\u0095\7o\2\2\u0095"+
		"\u0096\7g\2\2\u0096\36\3\2\2\2\u0097\u0098\7-\2\2\u0098 \3\2\2\2\u0099"+
		"\u009a\7/\2\2\u009a\"\3\2\2\2\u009b\u009c\7,\2\2\u009c$\3\2\2\2\u009d"+
		"\u009e\7(\2\2\u009e&\3\2\2\2\u009f\u00a0\7U\2\2\u00a0\u00a1\7J\2\2\u00a1"+
		"\u00a2\7Q\2\2\u00a2\u00a3\7Y\2\2\u00a3(\3\2\2\2\u00a4\u00a5\7E\2\2\u00a5"+
		"\u00a6\7T\2\2\u00a6\u00a7\7G\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7V\2\2"+
		"\u00a9\u00aa\7G\2\2\u00aa\u00ab\7\"\2\2\u00ab\u00ac\7V\2\2\u00ac\u00ad"+
		"\7C\2\2\u00ad\u00ae\7D\2\2\u00ae\u00af\7N\2\2\u00af\u00b0\7G\2\2\u00b0"+
		"*\3\2\2\2\u00b1\u00b2\7R\2\2\u00b2\u00b3\7T\2\2\u00b3\u00b4\7K\2\2\u00b4"+
		"\u00b5\7O\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7\7T\2\2\u00b7\u00b8\7[\2\2"+
		"\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7M\2\2\u00ba\u00bb\7G\2\2\u00bb\u00bc"+
		"\7[\2\2\u00bc,\3\2\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7R\2\2\u00bf\u00c0"+
		"\7F\2\2\u00c0\u00c1\7C\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3\7G\2\2\u00c3"+
		".\3\2\2\2\u00c4\u00c5\7U\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7V\2\2\u00c7"+
		"\60\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7Y\2\2\u00cb"+
		"\u00cc\7J\2\2\u00cc\u00cd\7G\2\2\u00cd\u00ce\7T\2\2\u00ce\u00cf\7G\2\2"+
		"\u00cf\64\3\2\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2\7P\2\2\u00d2\u00d3\7"+
		"U\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5\7T\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7"+
		"\7\"\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7P\2\2\u00d9\u00da\7V\2\2\u00da"+
		"\u00db\7Q\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7X\2\2\u00dd\u00de\7C\2\2\u00de"+
		"\u00df\7N\2\2\u00df\u00e0\7W\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7U\2\2"+
		"\u00e2\u00e3\7\"\2\2\u00e3\u00e4\7H\2\2\u00e4\u00e5\7T\2\2\u00e5\u00e6"+
		"\7Q\2\2\u00e6\u00e7\7O\2\2\u00e78\3\2\2\2\u00e8\u00e9\7X\2\2\u00e9\u00ea"+
		"\7C\2\2\u00ea\u00eb\7N\2\2\u00eb\u00ec\7W\2\2\u00ec\u00ed\7G\2\2\u00ed"+
		"\u00ee\7U\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\7T\2"+
		"\2\u00f1\u00f2\7Q\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7\"\2\2\u00f4\u00f5"+
		"\7T\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7N\2\2\u00f7\u00f8\7C\2\2\u00f8"+
		"\u00f9\7V\2\2\u00f9\u00fa\7K\2\2\u00fa\u00fb\7Q\2\2\u00fb\u00fc\7P\2\2"+
		"\u00fc:\3\2\2\2\u00fd\u00fe\7F\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7N\2"+
		"\2\u0100\u0101\7G\2\2\u0101\u0102\7V\2\2\u0102\u0103\7G\2\2\u0103\u0104"+
		"\7\"\2\2\u0104\u0105\7H\2\2\u0105\u0106\7T\2\2\u0106\u0107\7Q\2\2\u0107"+
		"\u0108\7O\2\2\u0108<\3\2\2\2\u0109\u010a\7=\2\2\u010a>\3\2\2\2\u010b\u010c"+
		"\7>\2\2\u010c\u010d\7/\2\2\u010d@\3\2\2\2\u010e\u010f\7?\2\2\u010f\u0118"+
		"\7?\2\2\u0110\u0111\7#\2\2\u0111\u0118\7?\2\2\u0112\u0118\t\2\2\2\u0113"+
		"\u0114\7>\2\2\u0114\u0118\7?\2\2\u0115\u0116\7@\2\2\u0116\u0118\7?\2\2"+
		"\u0117\u010e\3\2\2\2\u0117\u0110\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0118B\3\2\2\2\u0119\u011b\5E#\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"D\3\2\2\2\u011e\u011f\t\3\2\2\u011fF\3\2\2\2\u0120\u0125\5K&\2\u0121\u0124"+
		"\5K&\2\u0122\u0124\5E#\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126H\3\2\2\2"+
		"\u0127\u0125\3\2\2\2\u0128\u0129\7$\2\2\u0129\u012e\5K&\2\u012a\u012d"+
		"\5K&\2\u012b\u012d\5E#\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7$\2\2\u0132J\3\2\2\2\u0133\u0134"+
		"\t\4\2\2\u0134L\3\2\2\2\u0135\u0136\t\5\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\b\'\2\2\u0138N\3\2\2\2\t\2\u0117\u011c\u0123\u0125\u012c\u012e"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}