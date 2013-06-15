package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class BinaryExpressionTree implements ExpressionTree {

	private final ExpressionTree left;
	private final BinaryOperator operator;
	private final ExpressionTree right;

	public BinaryExpressionTree(
			ExpressionTree left,
			BinaryOperator operator, 
			ExpressionTree right) 
	{
		this.left = left;
		this.operator = operator;
		this.right = right;
		
	}

	@Override
	public ExpressionTree add(Expression operand) {
		return null;
	}

	@Override
	public ExpressionTree add(BinaryOperator operator) {
		return new IncompleteExpressionTree(this, operator);
	}

	@Override
	public Expression build() {
		return new BinaryExpression(left.build(), operator, right.build());
	}

}
