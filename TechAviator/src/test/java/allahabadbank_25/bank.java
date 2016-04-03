package allahabadbank_25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bank {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		
		d.findElement(By.xpath(".//input[@type='text' and contains(@name,'principal')]")).sendKeys("10000");
		d.findElement(By.xpath(".//input[@type='text' and contains(@name,'interest')]")).sendKeys("9");
		d.findElement(By.xpath(".//input[@type='text' and contains(@name,'instalment')]")).sendKeys("12");
		d.findElement(By.xpath("//input[@type='button' and contains(@value,'Calculate')]")).click();
		String tab = d.getWindowHandle();
		
		// for creating new tab
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
		
		d.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		d.findElement(By.xpath(".//*[@id='loanamount']")).sendKeys("10000");
		d.findElement(By.xpath(".//*[@id='rate']")).sendKeys("9");
		d.findElement(By.xpath(".//*[@id='pmonths']")).sendKeys("12");
		d.findElement(By.xpath(".//*[@id='Button1']")).click();
		
		//for switching to left tab = ctrl+pageup
		/*Actions act = new Actions(d);
		act.sendKeys(Keys.CONTROL,Keys.PAGE_UP).build().perform();
		Actions bil = new Actions(d);
		bil.sendKeys(Keys.CONTROL+"1").build().perform();*/
		
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"1");
		d.switchTo().window(tab);
		Thread.sleep(2000);
		/*ArrayList<String> win = new ArrayList<String>(d.getWindowHandles());
		System.out.println(win.size());
		d.switchTo().window(win.get(0));*/
		
		
		System.out.println(d.getTitle());
		d.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"2");
		d.switchTo().window(tab);
		System.out.println(d.getTitle());
		//below line is to check if we are able to interact with the page
		d.findElement(By.xpath(".//*[@id='pmonths']")).sendKeys("12");
		System.out.println("done");
		
		
		
	}

}
