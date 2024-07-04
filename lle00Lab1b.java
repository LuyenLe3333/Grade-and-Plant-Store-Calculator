//lle00Lab1b
//Luyen Le
//1/31/23
//Lab 1 part b

import java.util.Scanner;

public class lle00Lab1b {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double japCost = 479.99;
		double azCost = 27.99;
		int azQuan;
		int japQuan;
		double tendisc = 0.10;
		double japtenpercCalc = 0.00;
		double japwithDiscount = 0.00;
		double japwithnoDiscount = 0.00;
		double jappriceEach = 0.00;

		double aztenpercCalc = 0.00;
		double azwithDiscount = 0.00;
		double azwithnoDiscount = 0.00;
		double azpriceEach = 0.00;

		//-------------QUANTITY AND DISCOUNT PROCESS-----------------------------------------------------------------
		System.out.print("Quantity of Japanese Maple trees: ");
		japQuan = scan.nextInt(); //quantity

		if (japQuan > 10) {
			japtenpercCalc = japCost * tendisc; //479.99 * 0.10
			japwithDiscount = japCost - japtenpercCalc; //431.99
			jappriceEach = japwithDiscount;
		} else {
			japwithnoDiscount = japCost;
			jappriceEach = japwithnoDiscount;	
		}

		System.out.print("Quantity of azaleas: ");
		azQuan = scan.nextInt(); //quantity

		if (azQuan > 10) {
			aztenpercCalc = azCost * tendisc; //479.99 * 0.10
			azwithDiscount = azCost - aztenpercCalc; //431.99
			azpriceEach = azwithDiscount;
		} else {
			azwithnoDiscount = azCost;
			azpriceEach = azwithnoDiscount;
		}
		scan.close();

		//----------OUTPUT-------------------------------------------------------------------------------------------
		double japExt = japQuan*jappriceEach;
		double azExt = azQuan*azpriceEach;
		double subTotal = japExt+azExt;

		System.out.println("");
		System.out.println("Item 	               qty          price each 	        extended");
		System.out.println("================================================================");
		System.out.printf("Japanese Maple      %5d            $%.2f           $%,.2f\n", japQuan, jappriceEach, japExt);
		System.out.printf("Azaleas             %5d            $%.2f            $%,.2f\n", azQuan, azpriceEach, azExt);
		System.out.printf("Subtotal before discounts                              $%,.2f\n", subTotal);


		//if extended is over $1000, then customer gets discount
		if (subTotal > 1000.0) {
			double seventyfivedisc = 0.075;
			double subTotalwithDisc = subTotal * seventyfivedisc;
			double subTotalafterDisc = subTotal - subTotalwithDisc;
			double ninetyeightST = 0.098;
			double salesTax = subTotal * ninetyeightST;
			double totalDue = subTotalafterDisc + salesTax;

			System.out.printf("Discount                                             - $%,.2f\n", subTotalwithDisc);
			System.out.printf("Subtotal after discount                                $%,.2f\n", subTotalafterDisc);
			System.out.printf("Sales tax                             9.8%%             $%,.2f\n", salesTax);
			System.out.printf("Total due                                              $%,.2f\n", totalDue);

		}
		else //subTotal < 1000.0
		{
			double ninetyeightST = 0.098;
			double salesTax = subTotal * ninetyeightST;
			double subTotalnoDisc = subTotal;
			double noDiscount = 0.00;
			double totalDue = subTotalnoDisc + salesTax;

			System.out.printf("Discount                                               $%,.2f\n", noDiscount);
			System.out.printf("Subtotal after discount                                $%,.2f\n", subTotalnoDisc);
			System.out.printf("Sales tax                             9.8%%             $%,.2f\n", salesTax);
			System.out.printf("Total due                                              $%,.2f\n", totalDue);
		}
	}
}