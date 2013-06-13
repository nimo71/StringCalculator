package stringcalculator;

import stringcalculator.operator.Operators;


public class ExpressionParser {
	private final Operators operators;

	public ExpressionParser(Operators operators) {
		this.operators = operators;
	}
	
	public Expression parse(String exprStr) {
		String[] tokens = exprStr.split(" ");
		
		ExpressionBuilder expressionFactory = new ExpressionBuilder();
		
		if (tokens.length < 3) 
			return new EmptyExpression();
		
		return new BinaryExpression(
				new IntOperand(Integer.parseInt(tokens[0])), 
				operators.parse(tokens[1]), 
				new IntOperand(Integer.parseInt(tokens[2])));
		
		
	}
}
