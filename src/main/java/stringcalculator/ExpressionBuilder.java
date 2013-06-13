package stringcalculator;

import java.util.ArrayList;
import java.util.List;

import stringcalculator.operator.Operators;

public class ExpressionBuilder {

	private final Operators operators;
	
	List<String> tokens = new ArrayList<String>();
	
	public ExpressionBuilder(Operators operators) {
		this.operators = operators;
	}

	public void next(String token) {
	    tokens.add(token);	
	}

	public Expression build() {
		if (tokens.size() < 3) 
			return new EmptyExpression();
		
		return new BinaryExpression(
				new IntOperand(Integer.parseInt(tokens.get(0))), 
				operators.parse(tokens.get(1)), 
				new IntOperand(Integer.parseInt(tokens.get(2))));
	}

}
