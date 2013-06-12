package stringcalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTester {
	
	@Test
	public void blankEvaluatesToZero() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(0, calculator.evaluate("   "));
	}
	
	@Test
	public void adds3To6() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(9, calculator.evaluate("6 + 3"));
	}
	
	@Test
	public void adds34To12() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(46, calculator.evaluate("12 + 34"));
	}
	
	@Test
	public void subtracts3from6() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(3, calculator.evaluate("6 - 3"));
	}
	
	
}
