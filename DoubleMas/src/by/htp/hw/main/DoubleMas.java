package by.htp.hw.main;

public class DoubleMas {

	public static void main(String[] args) {
		int[][] mas = new int[][] {{1,3,17},{4,-2,12},{5,14,-7},{-1,11,9}};
	    int [] maxmas = DoubleMasLogic.MaxNumber(mas);
		int [] minmas = DoubleMasLogic.MinNumber(mas);
		
		System.out.println("Максимальное значение равно " + maxmas[0] + " на позициях " + maxmas[1] + " " + maxmas[2]);
		System.out.println("Минимальное значение равно " + minmas[0] + " на позициях " + minmas[1] + " " + minmas[2]);
		

	}

}
