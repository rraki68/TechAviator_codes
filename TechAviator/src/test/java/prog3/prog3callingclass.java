package prog3;

import java.util.Scanner;

public class prog3callingclass {
     public static void main(String[] args) {
    	 
    	 program3 abc = new program3();
    	 
    	 //accepting input from user 
    	 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the pizza size in inches");
		 double a = input.nextDouble();
         System.out.println("Cost of the Pizza is " +abc.PizzaCost(a));	 
	}
	
}
