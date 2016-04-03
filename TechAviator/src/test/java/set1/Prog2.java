package set1;


import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prog2 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://www.timeanddate.com/");
		d.findElement(By.id("query")).sendKeys("Bengaluru");
		Thread.sleep(1000);
		d.findElement(By.xpath(".//*[@class='small clear']/input[2]")).click();
		
		if(d.findElement(By.xpath("//*[contains(@class,'fixed')]/h1[contains(text(),'Bengaluru')]")).getText().equals("Weather in Bengaluru, Karnataka, India")&& 
				d.findElement(By.xpath("html/body/div[1]/div[7]/section[2]/div[1]/h2")).getText().equals("Upcoming 5 hours")	)
		{
			System.out.println("Weather for the next 5 hrs is displayed");
		}
		
		Calendar cal = Calendar.getInstance(); 
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println("Current system time is ="+hour);
		   
		List<WebElement> c =d.findElements(By.xpath(".//*[@id='wt-5hr']/tbody/tr[1]/td"));
		String x = null  ;
		for (int i=1; i< c.size();i++)
		{		
			x= x+":"+c.get(i).getText().replace(":00", "");
			//System.out.println(x);	
		}
		
		for (int i = hour; i<hour+5;i++)
		{
			System.out.println();
			if (x.contains(String.valueOf(i)))
			{System.out.println("Weather for "+i+ " is Displayed");}
		}
		
		Thread.sleep(3000);
		d.quit();
		
	}
	
	
}

