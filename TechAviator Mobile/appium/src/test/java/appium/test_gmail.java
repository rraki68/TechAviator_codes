package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;

public class test_gmail
{
		public static void main(String[] args) throws MalformedURLException {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "A0001");
			cap.setCapability("platformVersion", "6.0.1");
			cap.setCapability("platformName", "Android");
			
			cap.setCapability("appPackage", "com.google.android.gm");
			cap.setCapability("appActivity", "com.google.android.gm.ConversationListActivityGmail");
			
			AndroidDriver d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
			
			
		}
}
