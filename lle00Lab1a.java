//lle00Lab1a
//Luyen Le
//1/31/23
//Lab 1 part a

public class lle00Lab1a {

	public static void main(String[] args) {
		double earned = 786.0;
		double soFar = 950.0;
		double currPercent = earned/soFar;
		double A = 0.90;
		double B = 0.80;
		double C = 0.70;
		double D = 0.60;
		
		System.out.println("Pat has earned " + earned + " points out of " + soFar + " points possible so far.");
		System.out.printf("Current percentage earned is " + "%,.2f",currPercent);
		System.out.println("%");
		
		if(currPercent > A) {
			System.out.println("Current grade is A");
		} else if(currPercent > B) {
			System.out.println("Current grade is B");
		} else if(currPercent > C) {
			System.out.println("Current grade is C");
		} else {
			System.out.println("Current grade is D");
		}
		
		System.out.println();
		
		double pointsleftforA = (A * soFar) - earned;
		double pointsleftforB = (B * soFar) - earned;
		double pointsleftforC = (C * soFar) - earned;
		double pointsleftforD = (D * soFar) - earned;
		
		
		System.out.println("To earn this grade, Pat needs to earn this many points (of the remaining)");
		System.out.printf("        A          " + "%,.1f\n",pointsleftforA);
		System.out.printf("        B          " + "%,.1f\n",pointsleftforB);
		System.out.printf("        C          " + "%,.1f\n",pointsleftforC);
		System.out.printf("        D          " + "%,.1f\n",pointsleftforD);
		
		/*
		 ** I don't remember if this was original prompt in instructions **
		System.out.println("        A           564");
		System.out.println("        B           414");
		System.out.println("        C           264");
		System.out.println("        D           114");
		*/
		
	}

}