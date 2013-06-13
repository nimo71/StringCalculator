package stringcalculator;

import stringcalculator.operator.Operators;


public class Calculator {

	private static final Operators OPERATORS = new Operators();

	public int evaluate(String exprStr) {
		Expression expression = new ExpressionParser(OPERATORS).parse(exprStr); 
		return expression.evaluate();
	}

}
