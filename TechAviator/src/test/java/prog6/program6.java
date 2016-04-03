package prog6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program6 {
	public static void Author_Search(String Author_name) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("http://www.cb-india.com");
		d.findElement(By.id("ctl00_txtSearch")).sendKeys(Author_name);
		Thread.sleep(2000);
		d.findElement(By.id("ctl00_ImageButton1")).click();
		Thread.sleep(1000);
		
		Alert alert = d.switchTo().alert();
		if(!alert.getText().isEmpty()){
			//System.out.println("Warning message Displayed : "+alert.getText());
		alert.dismiss();
		}
				
		d.close();
	}
	
	
}
