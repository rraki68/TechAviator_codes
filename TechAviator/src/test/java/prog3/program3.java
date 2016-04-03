package prog3;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program3 {
	 double lc;
	 double rc;
		public program3()
		{
		  lc= 0.75;
		  rc = 1.00;
		}
			
		public String PizzaCost(Double diameter_in_inchs){
			System.out.println("Diameter value is "+diameter_in_inchs);
			double b = lc+rc;
			double c = b*(0.05*diameter_in_inchs);
			return "$" + (double) Math.round(c * 100) / 100;
		}
	

			
	}
	
