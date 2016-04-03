package prog105;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
	
	WebDriver d ;
	
	// below method is used to open a browser
	//@BeforeMethod
	public  void launch_app()
	{
		d= new FirefoxDriver();
		d.get("https://www.google.co.in/");
	}
	
	
	// below method is used to open a browser
	//@AfterMethod
	public  void close_app()
	{
		d.quit();
	}
}
