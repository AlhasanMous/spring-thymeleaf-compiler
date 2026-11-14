// Generated from C:/Users/Lenovo/IdeaProjects/spring-thymeleaf-compiler/src/parser/HTMLThymeleafParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLThymeleafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLThymeleafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLThymeleafParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#htmlNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNode(HTMLThymeleafParser.HtmlNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalTag(HTMLThymeleafParser.NormalTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(HTMLThymeleafParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLThymeleafParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThymeleafAttribute(HTMLThymeleafParser.ThymeleafAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttributeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThymeleafAttributeName(HTMLThymeleafParser.ThymeleafAttributeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLThymeleafParser#standardAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(HTMLThymeleafParser.StandardAttributeContext ctx);
}