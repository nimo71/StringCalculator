package stringcalculator.operator;

public class UnknownOperatorException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public UnknownOperatorException(String operatorToken) {
		super(operatorToken);
	}

}
