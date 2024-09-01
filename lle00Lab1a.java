//lle00Lab1a
//Luyen Le
//1/31/23
//Lab 1 part a

public class lle00Lab1a {

	public static void main(String[] args) {
		double earned = 786.0;
		double soFar = 950.0;
		double currPercent = currPercent(earned, soFar);
		double A = 0.90;
		double B = 0.80;
		double C = 0.70;
		double D = 0.60;
		
		System.out.println("Pat has earned " + earned + "/" + soFar + " points possible so far.");
		System.out.printf("Current percentage earned: " + "%,.2f",currPercent);
		System.out.println("%");
		
		if(currPercent > A) {
			System.out.println("Current grade: A");
		} else if(currPercent > B) {
			System.out.println("Current grade: B");
		} else if(currPercent > C) {
			System.out.println("Current grade: C");
		} else {
			System.out.println("Current grade: D");
		}
		
		System.out.println();
		
		System.out.println("To earn this grade, Pat needs to earn this many points (of the remaining)");
		System.out.printf("        A          %.0f\n", calcRemaining(A, soFar, earned));
		System.out.printf("        B          %.0f\n", calcRemaining(B, soFar, earned));
		System.out.printf("        C          %.0f\n", calcRemaining(C, soFar, earned));
		System.out.printf("        D          %.0f\n", calcRemaining(D, soFar, earned));
		
		/*
		 ** I don't remember if this was original prompt in instructions **
		System.out.println("        A           564");
		System.out.println("        B           414");
		System.out.println("        C           264");
		System.out.println("        D           114");
		*/
	}
	
	public static double currPercent(double earned, double soFar) {
		return earned/soFar;
	}

	public static double calcRemaining(double letter, double soFar, double earned) {
		return (letter * soFar) - earned;
	}
}
