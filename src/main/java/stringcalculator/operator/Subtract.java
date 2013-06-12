package stringcalculator.operator;

public class Subtract implements BinaryOperator {

	@Override
	public boolean matches(String operatorToken) {
		return "-".equals(operatorToken);
	}

	@Override
	public int evaluate(int left, int right) {
		return left - right;
	}

}
