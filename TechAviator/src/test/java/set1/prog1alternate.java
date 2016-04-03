package set1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class prog1alternate {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://search.yahoo.com/");
		d.findElement(By.id("yschsp")).sendKeys("Selenium");
		d.findElement(By.className("sbb")).click();
		String a = d.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		System.out.println();
		System.out.println("Total results found "+ a);
		
			
		String f = a.replaceAll("results","").replaceAll(",", "");
		
		Double h = Double.parseDouble(f);
		
		if(h > 1000000)
		{
			System.out.println();
			System.out.println("Selenium Search Results are Greater than 100000");
		}
		
				
		d.close();

	}

}
