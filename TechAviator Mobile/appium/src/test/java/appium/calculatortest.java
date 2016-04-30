package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculatortest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
			
DesiredCapabilities capabilities= new DesiredCapabilities();
		
		capabilities.setCapability("deviceName", "A0001");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.1.1");
		
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", ".Calculator");
		
		AndroidDriver d= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		d.findElementById("com.android.calculator2:id/digit_2").click();
		d.findElement(By.id("com.android.calculator2:id/op_mul")).click();
		d.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		System.out.println(d.findElementByClassName("android.widget.EditText").getAttribute("text"));
				
		System.out.println(d.findElementsByClassName("android.widget.EditText").get(1).getAttribute("text"));
		
	}
	
	
}
