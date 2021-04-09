package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class MassTestSumplus {
	@Test
	public void TestSumplus() {
		int[] mas = new int[] { -3, 2, -7, 6, -5, -9, 12, 7, -6 };
		int realSumplus;
		int expectedSumplus = 27;
		realSumplus = MassLogic.sumplus(mas);
		Assert.assertEquals(expectedSumplus,realSumplus);
	}

}
