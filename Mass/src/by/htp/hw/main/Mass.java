package by.htp.hw.main;

import by.htp.hw.main.MassLogic;

public class Mass {

	public static void main(String[] args) {
		int[] mas = new int[] {-3,2,-7,6,-5,-9,12,7,-6};
		
		System.out.println("Количество отрицательных элементов " + MassLogic.minus(mas));
		System.out.println("Сумма положительных эллементов " + MassLogic.sumplus(mas));
		System.out.println("Произведение элементов на нечетной позиции " + MassLogic.proiz(mas));

	}

}
