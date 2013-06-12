package stringcalculator;

import stringcalculator.operator.Operators;


public class Calculator {

	private static final Operators OPERATORS = new Operators();

	public int evaluate(String exprStr) {
		Expression expression = new ExpressionFactory(OPERATORS).create(exprStr); 
		return expression.evaluate();
	}

}
