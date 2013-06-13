package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class BinaryExpression implements Expression {
	private final Expression left;
	private final Expression right;
	private final BinaryOperator operator;

	public BinaryExpression(Expression left, BinaryOperator operator, Expression right) {
		this.left = left;
		this.right = right;
		this.operator = operator;
	}
	
	public int evaluate() {
		return operator.evaluate(left.evaluate(), right.evaluate());
	}

}
