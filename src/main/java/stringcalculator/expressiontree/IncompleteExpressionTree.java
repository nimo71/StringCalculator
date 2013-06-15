package stringcalculator.expressiontree;

import stringcalculator.Expression;
import stringcalculator.operator.BinaryOperator;

public class IncompleteExpressionTree implements ExpressionTree {

	private final ExpressionTree left;
	private final BinaryOperator operator;

	public IncompleteExpressionTree(
			ExpressionTree left, 
			BinaryOperator operator) 
	{
		this.left = left;
		this.operator = operator;
	}

	@Override
	public ExpressionTree add(Expression right) {
		return new BinaryExpressionTree(left, operator, new OperandExpressionTree(right));
	}

	@Override
	public ExpressionTree add(BinaryOperator parse) {
		return null;
	}

	@Override
	public Expression build() {
		return null;
	}

}
