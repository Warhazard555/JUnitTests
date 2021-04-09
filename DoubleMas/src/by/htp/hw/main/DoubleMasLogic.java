package by.htp.hw.main;

public class DoubleMasLogic {
	
	public static int[] MaxNumber(int mas[][]) {
		int[] maxmas = new int[3];
		int max = mas[0][0];
		int maxI = 0;
		int maxJ = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > max) {
					max = mas[i][j];
					maxI = i;
					maxJ = j;
				}
			}
		}
		maxmas[0] = max;
		maxmas[1] = maxI;
		maxmas[2] = maxJ;
		return maxmas;
	}
	
	public static int[] MinNumber(int mas[][]) {
		int[] minmas = new int[3];
		int min = mas[0][0];
		int minI = 0;
		int minJ = 0;
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < min) {
					min = mas[i][j];
					minI = i;
					minJ = j;
				}
			}
		}
		minmas[0] = min;
		minmas[1] = minI;
		minmas[2] = minJ;
		return minmas;
	}

}
