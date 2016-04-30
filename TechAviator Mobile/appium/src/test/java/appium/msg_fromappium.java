package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class msg_fromappium {
	
	public static void main(String[] args) throws MalformedURLException 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("deviceName", "A0001");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "5.1.1");
		
		dc.setCapability("appPackage", "com.android.mms");
		dc.setCapability("appActivity", ".ui.ConversationList");
		
		AndroidDriver d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		d.findElementById("com.android.mms:id/floating_action_button").click();
		d.findElement(By.id("com.android.mms:id/recipients_editor")).sendKeys("9535143660");
		d.findElement(By.id("com.android.mms:id/embedded_text_editor")).sendKeys("Appium Automation Test");
		d.findElement(By.id("com.android.mms:id/send_button_sms")).click();
		
	}
	
	
	

	
	

}
