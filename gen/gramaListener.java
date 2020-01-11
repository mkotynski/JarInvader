// Generated from C:/Users/kotyn/Desktop/jarInvader/src/main/antlr4\grama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaParser}.
 */
public interface gramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaParser#begin}.
	 * @param ctx the parse tree
	 */
	void enterBegin(gramaParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#begin}.
	 * @param ctx the parse tree
	 */
	void exitBegin(gramaParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listing}.
	 * @param ctx the parse tree
	 */
	void enterListing(gramaParser.ListingContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listing}.
	 * @param ctx the parse tree
	 */
	void exitListing(gramaParser.ListingContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#adding}.
	 * @param ctx the parse tree
	 */
	void enterAdding(gramaParser.AddingContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#adding}.
	 * @param ctx the parse tree
	 */
	void exitAdding(gramaParser.AddingContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#installjar}.
	 * @param ctx the parse tree
	 */
	void enterInstalljar(gramaParser.InstalljarContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#installjar}.
	 * @param ctx the parse tree
	 */
	void exitInstalljar(gramaParser.InstalljarContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listpackages}.
	 * @param ctx the parse tree
	 */
	void enterListpackages(gramaParser.ListpackagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listpackages}.
	 * @param ctx the parse tree
	 */
	void exitListpackages(gramaParser.ListpackagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listclasses}.
	 * @param ctx the parse tree
	 */
	void enterListclasses(gramaParser.ListclassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listclasses}.
	 * @param ctx the parse tree
	 */
	void exitListclasses(gramaParser.ListclassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listmethods}.
	 * @param ctx the parse tree
	 */
	void enterListmethods(gramaParser.ListmethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listmethods}.
	 * @param ctx the parse tree
	 */
	void exitListmethods(gramaParser.ListmethodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listfields}.
	 * @param ctx the parse tree
	 */
	void enterListfields(gramaParser.ListfieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listfields}.
	 * @param ctx the parse tree
	 */
	void exitListfields(gramaParser.ListfieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#listctors}.
	 * @param ctx the parse tree
	 */
	void enterListctors(gramaParser.ListctorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#listctors}.
	 * @param ctx the parse tree
	 */
	void exitListctors(gramaParser.ListctorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addpackage}.
	 * @param ctx the parse tree
	 */
	void enterAddpackage(gramaParser.AddpackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addpackage}.
	 * @param ctx the parse tree
	 */
	void exitAddpackage(gramaParser.AddpackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addclass}.
	 * @param ctx the parse tree
	 */
	void enterAddclass(gramaParser.AddclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addclass}.
	 * @param ctx the parse tree
	 */
	void exitAddclass(gramaParser.AddclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addinterface}.
	 * @param ctx the parse tree
	 */
	void enterAddinterface(gramaParser.AddinterfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addinterface}.
	 * @param ctx the parse tree
	 */
	void exitAddinterface(gramaParser.AddinterfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addmethod}.
	 * @param ctx the parse tree
	 */
	void enterAddmethod(gramaParser.AddmethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addmethod}.
	 * @param ctx the parse tree
	 */
	void exitAddmethod(gramaParser.AddmethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addfield}.
	 * @param ctx the parse tree
	 */
	void enterAddfield(gramaParser.AddfieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addfield}.
	 * @param ctx the parse tree
	 */
	void exitAddfield(gramaParser.AddfieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaParser#addcons}.
	 * @param ctx the parse tree
	 */
	void enterAddcons(gramaParser.AddconsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaParser#addcons}.
	 * @param ctx the parse tree
	 */
	void exitAddcons(gramaParser.AddconsContext ctx);
}