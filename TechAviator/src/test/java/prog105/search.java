package prog105;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class search extends base{
 
	@Test
  public void scenario() throws InterruptedException
  {
	   d.findElement(By.id("lst-ib")).sendKeys("Selenium"+ Keys.ENTER);
	   Thread.sleep(2000);
	   
	   String tot_res = d.findElement(By.xpath(".//*[@id='resultStats']")).getText();
	   System.out.println(tot_res);
	   
  }
}
