package stringcalculator.operator;

public interface BinaryOperator {

	boolean matches(String operatorToken);

	int evaluate(int left, int right);

}
