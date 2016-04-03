package prog8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program8 {

	WebDriver d =null;
	
	public void zig(int minprice, int maxprice, String fuel  ) 
	{
		d = new FirefoxDriver();
		d.get("http://www.zigwheels.com/newcars");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    d.manage().window().maximize();
		//select min price
	   
		Select select = new Select(d.findElement(By.id("byPriceFrom")));
		select.selectByVisibleText(minprice+" Lakh");
		
		//select max price
		Select select2 = new Select(d.findElement(By.id("byPriceTo")));
		select2.selectByVisibleText(maxprice+" Lakh");
		
		//select fuel
		Select select3 = new Select(d.findElement(By.id("byPriceFuelType")));
		select3.selectByVisibleText(fuel);
		
		d.findElement(By.className("redBtn_nomargin_pr")).submit();
		
		String pcomp = d.findElement(By.xpath(".//*[@id='search_param_place']/li[1]")).getText();
		String fcomp = d.findElement(By.xpath(".//*[@id='search_param_place']/li[3]")).getText();
		if (pcomp.contains("PRICE RANGE: "+minprice+" lakh  to "+maxprice+" lakh") && fcomp.contains(fuel))
		{
			System.out.println();
			System.out.println(pcomp);
			System.out.println("FUEL TYPES: "+fuel);
		}
		
	}
	
	public void addfuletype(String fuel_type) throws InterruptedException
	{
		List<WebElement> fuletype = d.findElements(By.xpath("//*[@id='filterPanel']/div[5]/ul/li/input"));
		for(int i =0;i<fuletype.size();i++)
		{
			if(fuletype.get(i).getAttribute("value").equalsIgnoreCase(fuel_type)){
				System.out.println("fule type selected is "+ fuletype.get(i).getAttribute("value"));
				fuletype.get(i).click();
				Thread.sleep(3000);
			}
		}	
	
}
	
}