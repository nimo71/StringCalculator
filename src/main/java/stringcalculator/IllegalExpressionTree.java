package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class IllegalExpressionTree implements ExpressionTree {

	@Override
	public ExpressionTree add(Expression operand) {
		return null;
	}

	@Override
	public ExpressionTree add(BinaryOperator operator) {
		return null;
	}

	@Override
	public Expression build() {
		throw new IllegalExpressionException();
	}

}
