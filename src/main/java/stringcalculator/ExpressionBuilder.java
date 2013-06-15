package stringcalculator;

import stringcalculator.operator.Operators;

public class ExpressionBuilder {

	private final Operators operators;
	
	private ExpressionTree tree = new EmptyExpressionTree();
	
	public ExpressionBuilder(Operators operators) {
		this.operators = operators;
	}

	public void next(String token) {
		tree = (operators.isOperator(token)) ? 
			tree = tree.add(operators.parse(token))
				: tree.add(new IntOperand(Integer.parseInt(token)));
	}

	public Expression build() {
		return tree.build();
	}

}
