package mapsofindia_36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class mapsofindia {
	
	static int i =1;
	
	public static void main(String[] args) {
		
	
	WebDriver d= new FirefoxDriver();
	d.get("http://www.mapsofindia.com/maps/cities/cities-in-india.html");
	Select a = new Select(d.findElement(By.xpath("//*[@id='myform']/select")));
	a.selectByVisibleText("Bangalore");
	
	List<WebElement> orgilist = d.findElements(By.xpath(".//*[@id='myform']/select/option"));
	  
	 List<String> second = new ArrayList<String>();
	 List<String> third = new ArrayList<String>();
	 
     for (int i = 0; i < orgilist.size(); i++) 
     {
    	 second.add(orgilist.get(i).getText());
    	 third.add(orgilist.get(i).getText());
     }
     
     Collections.sort(second);
      
         
    for (int i = 0; i < second.size(); i++) {
		
	    	 
    	   	 if(second.get(i).equals(third.get(i)))
    	   	 {
    	   		 
    	   		 System.out.println("matching elements are "+second.get(i)+"  "+third.get(i));
    	   	 }  	
    	   	 
    	   	 else {System.out.println("not matching "+second.get(i)+"  "+third.get(i));}
    	 
    	 
     }
	}	   
}
