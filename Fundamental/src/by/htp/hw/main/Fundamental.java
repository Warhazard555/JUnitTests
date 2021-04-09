package by.htp.hw.main;

public class Fundamental {

	public static void main(String[] args) {
		double a = 10;
		double b = 9;
		double c = 8;
		double d = 7;
		
		System.out.print(rezult(a,b,c,d));

	}

	public static double rezult(double a,double b,double c,double d) {
			
			double s;
			
			 s =(a / c) * (b / d) - ((a * b - c) / (c * d));
			
			return s;
			
		}

}
