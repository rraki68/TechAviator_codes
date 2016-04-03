package prog7;

import java.util.Scanner;

public class prog7callingclass {
	public static void main(String[] args) {
		
		program7 funcall = new program7();
		Scanner bip = new Scanner(System.in);
		System.out.println( "Enter the number of Burger");
		double Burger = bip.nextDouble();
		
		Scanner fip = new Scanner(System.in);
		System.out.println( "Enter the number of Fries");
		double fries = bip.nextDouble();
		
		Scanner sip = new Scanner(System.in);
		System.out.println( "Enter the number of Fries");
		double Soda = bip.nextDouble();
	 
	    funcall.burger_cost(Burger, fries, Soda);
	}
	 
}
