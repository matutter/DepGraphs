// Generated from JavaDirective.g4 by ANTLR 4.2

	package lang;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaDirectiveParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaDirectiveVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaDirectiveParser#l_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_package(@NotNull JavaDirectiveParser.L_packageContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaDirectiveParser#l_directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_directive(@NotNull JavaDirectiveParser.L_directiveContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaDirectiveParser#l_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitL_target(@NotNull JavaDirectiveParser.L_targetContext ctx);

	/**
	 * Visit a parse tree produced by {@link JavaDirectiveParser#lang_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang_source(@NotNull JavaDirectiveParser.Lang_sourceContext ctx);
}