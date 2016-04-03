package Stringtimes_35;

import java.util.Scanner;

public class Stringtimes {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("enter the text");
		String b = a.nextLine();
		Scanner c = new Scanner(System.in);
		System.out.println("enter the no of times");
		int d = c.nextInt();
		
		for (int i = 0; i < d; i++) {
			System.out.println(b);
		}
	}

}
