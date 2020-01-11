// Generated from C:/Users/kotyn/Desktop/jarInvader/src/main/antlr4\grama.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaParser#begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(gramaParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListing(gramaParser.ListingContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#adding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding(gramaParser.AddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#installjar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstalljar(gramaParser.InstalljarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listpackages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListpackages(gramaParser.ListpackagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listclasses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListclasses(gramaParser.ListclassesContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listmethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListmethods(gramaParser.ListmethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listfields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListfields(gramaParser.ListfieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#listctors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListctors(gramaParser.ListctorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addpackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddpackage(gramaParser.AddpackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddclass(gramaParser.AddclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addinterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddinterface(gramaParser.AddinterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addmethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddmethod(gramaParser.AddmethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addfield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddfield(gramaParser.AddfieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addcons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddcons(gramaParser.AddconsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#setmethodbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetmethodbody(gramaParser.SetmethodbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addbeformethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddbeformethod(gramaParser.AddbeformethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#addaftermethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddaftermethod(gramaParser.AddaftermethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#setctorbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetctorbody(gramaParser.SetctorbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#savejar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavejar(gramaParser.SavejarContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(gramaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(gramaParser.Expr2Context ctx);
}