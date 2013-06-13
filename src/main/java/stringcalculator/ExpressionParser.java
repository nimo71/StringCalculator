package stringcalculator;

import stringcalculator.operator.Operators;


public class ExpressionParser {
	private final Operators operators;

	public ExpressionParser(Operators operators) {
		this.operators = operators;
	}
	
	public Expression parse(String exprStr) {
		String[] tokens = exprStr.split(" ");
		
		ExpressionBuilder expressionBuilder = new ExpressionBuilder(operators);
		for (String token : tokens) {
			expressionBuilder.next(token);
		}
		return expressionBuilder.build();
	}
}
