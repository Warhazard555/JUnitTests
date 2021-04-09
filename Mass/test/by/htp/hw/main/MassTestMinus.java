package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class MassTestMinus {
	@Test
	public void TestMinus() {
		int[] mas = new int[] { -3, 2, -7, 6, -5, -9, 12, 7, -6 };
		int realMinus;
		int expectedMinus = 5;
		realMinus = MassLogic.minus(mas);
		Assert.assertEquals(expectedMinus,realMinus);
	}

}
