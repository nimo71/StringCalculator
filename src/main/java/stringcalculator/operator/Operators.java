package stringcalculator.operator;

import java.util.Arrays;
import java.util.List;


public class Operators {

	private List<BinaryOperator> operators  = Arrays.asList(new BinaryOperator[] {
			new Add(), 
			new Subtract(), 
			new Multiply(), 
			new Divide()
	});

	public BinaryOperator parse(String operatorToken) {
		for (BinaryOperator op : operators) {
			if (op.matches(operatorToken)) return op;
		}
		throw new UnknownOperatorException(operatorToken);
	}

	public boolean isOperator(String token) {
		for (BinaryOperator op : operators) {
			if (op.matches(token)) return true; 
		}
		return false;
	}

}
