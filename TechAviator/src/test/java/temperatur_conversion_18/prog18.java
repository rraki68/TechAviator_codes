package temperatur_conversion_18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class prog18 {
	double faren;
	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		
		d.get("http://www.onlineconversion.com/temperature.htm");
		
		WebElement dropdown = d.findElement(By.xpath("//td[@class='content']//tbody/tr[2]/td[1]/select"));
		
		Select mySelect= new Select(dropdown);
		mySelect.selectByVisibleText("degree Celsius");
		
		d.findElement(By.xpath(".//input[@name='what']")).sendKeys("40");
		
		
        WebElement dropdown1 = d.findElement(By.xpath("//select[@name='to']"));
		
		Select mySelect1= new Select(dropdown1);
		mySelect1.selectByVisibleText("degree Fahrenheit");
		
		System.out.println(d.findElement(By.xpath(".//input[@name='answer']")).getAttribute("value"));
		
		String cmp = d.findElement(By.xpath(".//input[@name='answer']")).getAttribute("value");
		String[] cmp1 = cmp.split(" ");
		//System.out.println(cmp1[4]);
		
		
		
		double faren = (40*1.8)+32;
		System.out.println("Faren value is "+faren);
		
		if (cmp.contains(cmp1[4])){
			//System.out.println(" yes " );
			
			Double con =Double.parseDouble(cmp1[4]);
			//System.out.println(con);
			if(con.equals(faren)){
				
				System.out.println("the value is correct");
			}
		}
		
			
	}

}
