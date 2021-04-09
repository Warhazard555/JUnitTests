package by.htp.hw.main;

public class MassLogic {

	public static int minus(int[] mas) {
		int minus = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				minus++;
			}
		}
		return minus;
	}

	public static int sumplus(int[] mas) {
		int sumplus = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				sumplus = sumplus + mas[i];
			}
		}
		return sumplus;
	}

	public static int proiz(int[] mas) {
		int proiz = 1;
		for (int i = 0; i < mas.length; i++) {
			if (i % 2 != 0) {
				proiz = proiz * mas[i];
			}
		}
		return proiz;
	}

}
