package by.tr.hw.logic;

import org.junit.Assert;
import org.junit.Test;
import by.tr.hw.entity.Complex;

public class LogicTestMinus {
	
	@Test
	public void LogicMinusTest() {
		Complex c1 = new Complex(5, -6);
		Complex c2 = new Complex(-3, 2);
		Complex realC;
		Complex expectedC = new Complex(8, -8);

		realC = ComplexLogic.minus(c1, c2);
		Assert.assertEquals(expectedC, realC);

	}
}
