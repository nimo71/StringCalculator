package stringcalculator;

public class IntOperand implements Expression {

	private final int value;

	public IntOperand(int value) {
		this.value = value;
	}

	@Override
	public int evaluate() {
		return value;
	}

}
