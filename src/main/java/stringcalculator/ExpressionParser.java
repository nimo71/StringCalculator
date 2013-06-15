package stringcalculator;

import stringcalculator.expressiontree.EmptyExpressionTree;
import stringcalculator.expressiontree.ExpressionTree;
import stringcalculator.operator.Operators;


public class ExpressionParser {

	private final Operators operators;
	
	private ExpressionTree tree = new EmptyExpressionTree();
	
	public ExpressionParser(Operators operators) {
		this.operators = operators;
	}
	
	public Expression parse(String exprStr) {
		String[] tokens = exprStr.split(" ");
		
		for (String token : tokens) {
			tree = incrementTree(token);
		}
		return tree.build();
	}

	private ExpressionTree incrementTree(String token) {
		if (operators.isOperator(token)) { 
			return tree.add(operators.parse(token));
		}
		return tree.add(new IntOperand(Integer.parseInt(token)));
	}
	
	
}
