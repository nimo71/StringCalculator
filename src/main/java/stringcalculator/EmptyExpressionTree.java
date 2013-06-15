package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class EmptyExpressionTree implements ExpressionTree {

	@Override
	public ExpressionTree add(Expression operand) {
		return new OperandExpressionTree(operand);
	}

	@Override
	public ExpressionTree add(BinaryOperator operator) {
		return null;
	}

	@Override
	public Expression build() {
		return new EmptyExpression();
	}

}
