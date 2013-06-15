package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public class OperandExpressionTree implements ExpressionTree {

	private final Expression operand;

	public OperandExpressionTree(Expression operand) { 
		this.operand = operand;
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
		return operand;
	}

}
