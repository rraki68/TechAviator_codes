package prog8;

import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class prog8callingclass {
	
	public static void main(String[] args) throws InterruptedException {
		program8 a= new program8();
		Scanner min = new Scanner(System.in);
		System.out.println("Enter the Min price range in Lakhs");
		int minprice = min.nextInt();
		
		Scanner max = new Scanner(System.in);
		System.out.println("Enter the Max price range in Lakshs");
		int maxprice = min.nextInt();
		
		Scanner fu = new Scanner(System.in);
		System.out.println("Enter the Fuel type ");
		String fuel = fu.nextLine();
		
		
		
		Scanner futype = new Scanner(System.in);
		System.out.println("Enter the Fuel type to check in checkbox");
		String fuel_type = futype.nextLine();
		
		a.zig(minprice, maxprice, fuel);
		
		a.addfuletype(fuel_type);
	} 
	
}
