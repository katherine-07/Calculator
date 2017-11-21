// Generated from C:/Users/Luisa Gilig/eclipse-workspace/Calculator/src/antlr\calculator.g4 by ANTLR 4.7
package generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(calculatorParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(calculatorParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AS}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterAS(calculatorParser.ASContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AS}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitAS(calculatorParser.ASContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValNumber}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterValNumber(calculatorParser.ValNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValNumber}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitValNumber(calculatorParser.ValNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MDM}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterMDM(calculatorParser.MDMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MDM}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitMDM(calculatorParser.MDMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(calculatorParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpression}
	 * labeled alternative in {@link calculatorParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(calculatorParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(calculatorParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(calculatorParser.ValueContext ctx);
}