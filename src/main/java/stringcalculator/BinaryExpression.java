package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class BinaryExpression implements Expression {
	private final int left;
	private final int right;
	private final BinaryOperator operator;

	public BinaryExpression(BinaryOperator operator, int left, int right) {
		this.operator = operator;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		return operator.evaluate(left, right);
	}

}
