package by.tr.hw.logic;

import org.junit.Test;
import by.tr.hw.entity.Complex;
import org.junit.Assert;

public class LogicTestSum {

	@Test
	public void LogicSumTest() {
		Complex c1 = new Complex(5, -6);
		Complex c2 = new Complex(-3, 2);
		Complex realC;
		Complex expectedC = new Complex(2, -4);

		realC = ComplexLogic.sum(c1, c2);
		Assert.assertEquals(expectedC, realC);

	}

}
