package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class DoubleMasMinTest {
	@Test
	public void MinTest() {
		int[][] mas = new int[][] {{1,3,17},{4,-2,12},{5,14,-7},{-1,11,9}};
		int[] realMin;
		int[] expectedMin = {-7,2,2};
		realMin = DoubleMasLogic.MinNumber(mas);
		for (int i = 0; i<3;i++) {
		Assert.assertEquals(expectedMin[i],realMin[i]);
		}
	}

}
