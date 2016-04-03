package prog12;

import java.util.Arrays;
import java.util.Scanner;

public class prog12 {
 int i;
	public void strcmp() {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string to compare: ");
		String aip= a.nextLine();
    	
		Scanner b = new Scanner(System.in);
		System.out.println("Enter a string to remove: ");
		String bip= b.nextLine();
    
    if(aip.contains(bip))
    {
    	String c= aip.replace(bip, "");
    	System.out.println(c);
    }
    else {
    	System.out.println();
    	System.out.println(bip+ " is not found in "+aip);}
}
}
