package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class contacts_call {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "A0001");
		cap.setCapability("platformVersion", "5.1.1");
		cap.setCapability("PlatformName", "Android");
		
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		
		
		AndroidDriver d =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		Dimension size = d.manage().window().getSize();
		System.out.println(size);
		int startx = (int)(size.width*0.50);
		int endy = (int) (size.height*0.20);
		int starty = (int) (size.height*0.80);
		d.swipe(startx, starty, startx, endy, 1000);
		Thread.sleep(3000);
		d.findElementByXPath("//*[@resource-id='com.android.contacts:id/cliv_name_textview'][@text='Act Broadband']").click();
		d.findElement(By.id("com.android.contacts:id/icon")).click();
		Thread.sleep(1000);
		d.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();
	}

}
