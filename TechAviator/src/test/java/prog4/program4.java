package prog4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program4 {

	public static void Author_Search(String Author_name) {
		WebDriver d = new FirefoxDriver();
		 d.get("http://www.cb-india.com");
 		System.out.println("Given Author name is "+Author_name);
		d.findElement(By.id("ctl00_txtSearch")).sendKeys(Author_name);
		d.findElement(By.id("ctl00_ImageButton1")).click();
		List<WebElement> authlist = d.findElements(By.cssSelector(".authorgreen"));
		System.out.println("Total no of books found is "+ authlist.size());
		String a = null;
		for (int i = 0; i<authlist.size();i++ )
		{
			a=a+":"+authlist.get(i).getText();
			
			if(a.contains(Author_name))
			{
				System.out.println(Author_name+" is a author for the book "+i);
			}
		}
		
		/*Iterator<WebElement> a= authlist.iterator();
		while (a.hasNext()) {
			if(a.toString().contains("Chandler"))
			{
				System.out.println("author found");
			}	
			else{System.out.println("Author not found");}
		}*/
		d.close();
	}
}
