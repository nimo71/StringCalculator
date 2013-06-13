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
	
	@Test
	public void subtracts4from18() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(14, calculator.evaluate("18 - 4"));
	}
	
	@Test
	public void multiplies6by3() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(18, calculator.evaluate("6 * 3"));
	}
	
	@Test
	public void multiplies5by22() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(110, calculator.evaluate("5 * 22"));
	}
	
	@Test
	public void divides6by3() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(2, calculator.evaluate("6 / 3"));
	}
	
	@Test
	public void divides36by12() {
		Calculator calculator = new CalculatorFactory().create();
		assertEquals(3, calculator.evaluate("36 / 12"));
	}
	
}
