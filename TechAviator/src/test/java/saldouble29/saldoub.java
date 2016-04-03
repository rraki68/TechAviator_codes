package saldouble29;

import java.util.Scanner;

public class saldoub {
 static int sal ;
static int val;
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter salary");
		 sal = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the no of years");
		val = b.nextInt();
		
		for (int i=1;i<= val;i++){
			sal = sal*2;
			System.out.println("For the year "+i+ " salary is " +sal );
			
		}
	}

}
