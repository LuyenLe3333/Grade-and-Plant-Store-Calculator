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
		double discount = 0.00; //output Discount
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
		
		if (japQuan > 10)
		{
			japtenpercCalc = japCost * tendisc; //479.99 * 0.10
			japwithDiscount = japCost - japtenpercCalc; //431.99
			jappriceEach = japwithDiscount;
		}
		else
		{
			japwithnoDiscount = japCost;
			jappriceEach = japwithnoDiscount;
					
		}
		
		System.out.print("Quantity of azaleas: ");
		azQuan = scan.nextInt(); //quantity
		
		if (azQuan > 10)
		{
			aztenpercCalc = azCost * tendisc; //479.99 * 0.10
			azwithDiscount = azCost - aztenpercCalc; //431.99
			azpriceEach = azwithDiscount;
		}
		else
		{
			azwithnoDiscount = azCost;
			azpriceEach = azwithnoDiscount;
		}
		scan.close();

//----------OUTPUT-------------------------------------------------------------------------------------------
		double japExt = japQuan*jappriceEach;
		double azExt = azQuan*azpriceEach;
		double subTotal = japExt+azExt;
		
		System.out.println("");
		System.out.println("Item 	  	   qty 		  price each 	      extended");
		System.out.println("================================================================");
		System.out.printf("Japanese Maple"+"     $ "+japQuan+"     "+"     $ "+"%,.2f",jappriceEach);
		System.out.print("             $ ");
		System.out.printf("%,.2f",+japExt);
		
		System.out.println("");
		
		System.out.printf("Azaleas       "+"     $ "+azQuan+"      "+"     $ "+"%,.2f",azpriceEach);
		System.out.print("              $ ");
		System.out.printf("%,.2f",+azExt);
		System.out.println("");
		System.out.printf("Subtotal before discounts"+"                             $ "+"%,.2f",subTotal);
		System.out.println("");
		
		if (subTotal > 1000.0)
		{
			double seventyfivedisc = 0.075;
			double subTotalwithDisc = subTotal * seventyfivedisc;
			double subTotalafterDisc = subTotal - subTotalwithDisc;
			double ninetyeightST = 0.098;
			double salesTax = subTotal * ninetyeightST;
			
			System.out.print("Discount                                              $ ");
			System.out.printf("%,.2f",subTotalwithDisc);
			System.out.println("");
			System.out.printf("Subtotal after discount "+"                              $ "+"%,.2f",subTotalafterDisc);
			System.out.println("");
			System.out.print("Sales tax "+"                         9.8 %"+"              $ ");
			System.out.printf("%,.2f",salesTax);
			double totalDue = subTotalafterDisc + salesTax;
			System.out.println("");
			System.out.printf("Total due "+"                                            $ "+"%,.2f",totalDue);
		}
		else //subTotal < 1000.0
		{
			double ninetyeightST = 0.098;
			double salesTax = subTotal * ninetyeightST;
			double subTotalnoDisc = subTotal;
			
			System.out.println("");
			System.out.printf("Subtotal after discount "+"                              $ "+"%,.2f",subTotalnoDisc);
			System.out.println("");
			System.out.print("Sales tax "+"                         9.8 %"+"              $ ");
			System.out.printf("%,.2f",salesTax);
			double totalDue = subTotalnoDisc + salesTax;
			System.out.println("");
			System.out.printf("Total due "+"                                            $ "+"%,.2f",totalDue);
		}
	}
}
//-----------------------------------------------------------------------------------------------------------