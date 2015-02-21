// Generated from JavaDirective.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaDirectiveParser}.
 */
public interface JavaDirectiveListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaDirectiveParser#l_package}.
	 * @param ctx the parse tree
	 */
	void enterL_package(@NotNull JavaDirectiveParser.L_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDirectiveParser#l_package}.
	 * @param ctx the parse tree
	 */
	void exitL_package(@NotNull JavaDirectiveParser.L_packageContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaDirectiveParser#l_directive}.
	 * @param ctx the parse tree
	 */
	void enterL_directive(@NotNull JavaDirectiveParser.L_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDirectiveParser#l_directive}.
	 * @param ctx the parse tree
	 */
	void exitL_directive(@NotNull JavaDirectiveParser.L_directiveContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaDirectiveParser#l_target}.
	 * @param ctx the parse tree
	 */
	void enterL_target(@NotNull JavaDirectiveParser.L_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDirectiveParser#l_target}.
	 * @param ctx the parse tree
	 */
	void exitL_target(@NotNull JavaDirectiveParser.L_targetContext ctx);

	/**
	 * Enter a parse tree produced by {@link JavaDirectiveParser#lang_source}.
	 * @param ctx the parse tree
	 */
	void enterLang_source(@NotNull JavaDirectiveParser.Lang_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaDirectiveParser#lang_source}.
	 * @param ctx the parse tree
	 */
	void exitLang_source(@NotNull JavaDirectiveParser.Lang_sourceContext ctx);
}