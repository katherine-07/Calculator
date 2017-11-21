// Generated from C:/Users/Luisa Gilig/eclipse-workspace/Calculator/src/antlr\calculator.g4 by ANTLR 4.7
package generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(calculatorParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AS}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAS(calculatorParser.ASContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValNumber}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValNumber(calculatorParser.ValNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MDM}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMDM(calculatorParser.MDMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpression(calculatorParser.ParenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calculatorParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(calculatorParser.ValueContext ctx);
}