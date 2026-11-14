// Generated from C:/Users/Lenovo/IdeaProjects/spring-thymeleaf-compiler/src/parser/HTMLThymeleafParser.g4 by ANTLR 4.13.2

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLThymeleafParser}.
 */
public interface HTMLThymeleafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLThymeleafParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLThymeleafParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNode(HTMLThymeleafParser.HtmlNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#htmlNode}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNode(HTMLThymeleafParser.HtmlNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalTag(HTMLThymeleafParser.NormalTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalTag(HTMLThymeleafParser.NormalTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(HTMLThymeleafParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingTag}
	 * labeled alternative in {@link HTMLThymeleafParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(HTMLThymeleafParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLThymeleafParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLThymeleafParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void enterThymeleafAttribute(HTMLThymeleafParser.ThymeleafAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void exitThymeleafAttribute(HTMLThymeleafParser.ThymeleafAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttributeName}.
	 * @param ctx the parse tree
	 */
	void enterThymeleafAttributeName(HTMLThymeleafParser.ThymeleafAttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#thymeleafAttributeName}.
	 * @param ctx the parse tree
	 */
	void exitThymeleafAttributeName(HTMLThymeleafParser.ThymeleafAttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLThymeleafParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStandardAttribute(HTMLThymeleafParser.StandardAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLThymeleafParser#standardAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStandardAttribute(HTMLThymeleafParser.StandardAttributeContext ctx);
}