package stringcalculator.operator;

import java.util.Arrays;
import java.util.List;

import stringcalculator.UnknownOperatorException;

public class Operators {

	private List<BinaryOperator> operators  = Arrays.asList(new BinaryOperator[] {
			new Add(), 
			new Subtract()
	});

	public BinaryOperator parse(String operatorToken) {
		for (BinaryOperator op : operators) {
			if (op.matches(operatorToken)) return op;
		}
		throw new UnknownOperatorException();
	}

}
