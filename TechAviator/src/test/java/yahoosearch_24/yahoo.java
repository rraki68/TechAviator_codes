package yahoosearch_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://search.yahoo.com/");
		d.findElement(By.id("yschsp")).sendKeys("Selenium");
		List<WebElement> title = d.findElements(By.xpath(".//*[@class='sa-tray-list-container']//li"));
		System.out.println(title.size());
		
		for (int i=0; i < title.size();i++)
		{
			System.out.println(i+" "+title.get(i).getText());
			if(title.get(i).getText().contains("selenium"))
			{
				System.out.println("Selenium text is present in "+i);
			}
			
		}

	}

}
