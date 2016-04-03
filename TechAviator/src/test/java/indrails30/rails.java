package indrails30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class rails {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://www.indianrail.gov.in/train_Schedule.html");
		d.findElement(By.id("lccp_trnname")).sendKeys("123");
		d.findElement(By.xpath("//*[@value='Get Schedule']")).click();
		
		List<WebElement> a = d.findElements(By.xpath("//*[@class='table_border_both' ]/tbody//tr/td[1]"));
		
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i).getText().contains("123"))
			{
				System.out.println("123 is present in "+a.get(i).getText());
			}
		}
		
		List<WebElement> trname = d.findElements(By.xpath("//*[@class='table_border_both' ]/tbody/tr/td[2]"));
		List<WebElement> destname = d.findElements(By.xpath("//*[@class='table_border_both' ]/tbody/tr/td[3]"));
		List<WebElement> radio = d.findElements(By.xpath("//*[@class='table_border_both' ]/tbody/tr/td[1]/input"));
		for(int i=0;i<radio.size();i++)
		{
		   if(trname.get(i).getText().contains("ARCHANA EXPRESS") & destname.get(i).getText().contains("JAMMU TAWI"))
		   {
			  
			   //d.findElement(By.xpath("//*[@class='table_border_both' ]/tbody/tr["+i+"]/td[1]/input")).click();
			   System.out.println(trname.get(i).getText());
			   System.out.println(i);
			   radio.get(i-1).click();
			   
			  break;
		   }
		}
		
		d.findElement(By.xpath("//*[@value='Get Schedule']")).click();
		d.findElement(By.xpath("//*[@class='table_border_both' ]/tbody/tr[2]/td[3]")).getText().contains("JAMMU TAWI");
		System.out.println("Train details verified ");

	}

}
