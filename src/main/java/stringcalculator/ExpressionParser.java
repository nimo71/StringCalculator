package stringcalculator;

import stringcalculator.operator.Operators;


public class ExpressionParser {
	private final ExpressionBuilder expressionBuilder;

	public ExpressionParser(Operators operators) {
		expressionBuilder = new ExpressionBuilder(operators);
	}
	
	public Expression parse(String exprStr) {
		String[] tokens = exprStr.split(" ");
		
		for (String token : tokens) {
			expressionBuilder.next(token);
		}
		return expressionBuilder.build();
	}
}
