package com.bckim9489.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**javadoc
	@author bckim
*/
public class CalculatorTest {
	private Calculator calculator = new Calculator();
	
	@Test
	public void testSum() {
		assertEquals(5, calculator.sum(2,3));
	}
}
