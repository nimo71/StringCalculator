package stringcalculator;

import stringcalculator.operator.Operators;


public class ExpressionFactory {
	private final Operators operators;

	public ExpressionFactory(Operators operators) {
		this.operators = operators;
	}
	
	public Expression create(String exprStr) {
		String[] tokens = exprStr.split(" ");
		
		if (tokens.length < 3) 
			return new EmptyExpression();
		
		return new BinaryExpression(
				operators.parse(tokens[1]), 
				Integer.parseInt(tokens[0]), 
				Integer.parseInt(tokens[2]));
	}
}
