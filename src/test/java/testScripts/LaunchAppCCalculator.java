package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAppCCalculator {
	
	
	@Test
	public void launchApp() throws MalformedURLException {
		//common dc for mobile
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		//dc for APP
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", ".cal.CalculatorActivity");
		//url of app
		URL uri = new URL("http://localhost:4723/wd/hub");
		 		 AndroidDriver dri = new AndroidDriver(uri,dc);
		WebElement fiveele = dri.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		dri.tap(1, fiveele, 500);
		 WebElement plus = dri.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		 dri.tap(1, plus, 500);
		WebElement three = dri.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		 dri.tap(1, plus, 500);
		 WebElement equals = dri.findElement(By.id("android:id/button1"));
		 dri.tap(1, plus, 500);
String value = dri.findElement(By.id("com.miui.calculator:id/btn_8_s")).getText();
		System.out.println(value);
	
	
		}
	
	}
 

