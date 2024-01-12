//lle00Lab1a
//Luyen Le
//1/31/23
//Lab 1 part a

public class lle00Lab1a {

	public static void main(String[] args) {
		double earned = 786.0;
		double soFar = 950.0;
		double currPerc = earned / soFar;
		double A = 0.90;
		double B = 0.80;
		double C = 0.70;
		double D = 0.60;
		
		System.out.println("Pat has earned " + earned + " points out of " + soFar + " points possible so far.");
		System.out.printf("Current percentage earned is " + "%,.2f",currPerc);
		System.out.println("%");

		if (currPerc > A)
		{
			System.out.println("Current grade is A");
		}
		else if (currPerc > B)
		{
			System.out.println("Current grade is B");
		}
		else if (currPerc > C)
		{
			System.out.println("Current grade is C");
		}
		else if (currPerc > D)
		{
			System.out.println("Current grade is D");
		}

		System.out.println("To earn this grade, Pat needs to earn this many points (of the remaining)");
		System.out.println("        A           564");
		System.out.println("        B           414");
		System.out.println("        C           264");
		System.out.println("        D           114");
			
	}

}