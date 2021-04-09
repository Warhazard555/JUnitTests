package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class MassTestProiz {
	@Test
	public void TestProiz() {
		int[] mas = new int[] { -3, 2, -7, 6, -5, -9, 12, 7, -6 };
		int realProiz;
		int expectedProiz = -756;
		realProiz = MassLogic.proiz(mas);
		Assert.assertEquals(expectedProiz,realProiz);
	}

}
