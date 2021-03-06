package solve;

import generate.calculatorParser;
import generate.calculatorBaseVisitor;
import generate.calculatorLexer;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;

public class CalculatorSolutionVisitor extends calculatorBaseVisitor {

    private calculatorLexer lexer;
    private CommonTokenStream tokens;
    private calculatorParser parser;
    private ParseTree tree;

    public Float solve(String expression) throws ParseCancellationException{

        lexer = new calculatorLexer(CharStreams.fromString(expression));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        tokens = new CommonTokenStream(lexer);

        parser = new calculatorParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        try {
	        tree = parser.start();
	
	        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
	        viewer.setScale(2);
	        viewer.open();
	
	        return (Float) visit(tree);
        } catch (ParseCancellationException e) {
			throw e;
		}
    }
    
    @Override
    public Object visitStart(calculatorParser.StartContext ctx) {
        return visit(ctx.num_expression());
    }

    @Override
    public Object visitParenExpression(calculatorParser.ParenExpressionContext ctx) {
        return visit(ctx.num_expression());
    }

    @Override
    public Float visitMDM(calculatorParser.MDMContext ctx) {
        Float leftNum = (Float) visit(ctx.num_expression(0));
        Float rightNum = (Float) visit(ctx.num_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        }
        else {
            switch (ctx.op.getType()) {
                case calculatorParser.DIV:
                    return leftNum / rightNum;
                case calculatorParser.MOD:
                    return leftNum % rightNum;
                case calculatorParser.MUL:
                    return leftNum * rightNum;
            }

            return null;
        }
    }

    @Override
    public Float visitAS(calculatorParser.ASContext ctx) {
        Float leftNum = (Float) visit(ctx.num_expression(0));
        Float rightNum = (Float) visit(ctx.num_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        } else {
            switch (ctx.op.getType()) {
                case calculatorParser.ADD:
                    return leftNum + rightNum;
                case calculatorParser.SUB:
                    return leftNum - rightNum;
            }
            return null;
        }
    }

    @Override
    public Float visitValNumber(calculatorParser.ValNumberContext ctx) {
        return Float.valueOf(ctx.value().getText());
    }


    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
