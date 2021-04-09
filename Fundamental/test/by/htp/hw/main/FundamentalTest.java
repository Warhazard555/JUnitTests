package by.htp.hw.main;

import org.junit.Assert;
import org.junit.Test;

public class FundamentalTest {
	
	@Test
	public void FunctTest() {
		double a = 10;
		double b = 9;
		double c = 8;
		double d = 7;
		double realS;
		double expectedS = 0.14285714285714302;
		realS = Fundamental.rezult(a, b, c, d);
		Assert.assertEquals(expectedS, realS, 0.00000001);
		
	}

}
