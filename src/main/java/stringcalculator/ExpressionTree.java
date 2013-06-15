package stringcalculator;

import stringcalculator.operator.BinaryOperator;

public interface ExpressionTree {

	ExpressionTree add(Expression operand);

	ExpressionTree add(BinaryOperator parse);

	Expression build();

}
