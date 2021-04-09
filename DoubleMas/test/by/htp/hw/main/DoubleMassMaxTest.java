package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class DoubleMassMaxTest {
	@Test
	public void MaxTest() {
		int[][] mas = new int[][] {{1,3,17},{4,-2,12},{5,14,-7},{-1,11,9}};
		int[] realMax;
		int[] expectedMax = {17,0,2};
		realMax = DoubleMasLogic.MaxNumber(mas);
		for (int i = 0; i<3;i++) {
		Assert.assertEquals(expectedMax[i],realMax[i]);
		}
	}

}
