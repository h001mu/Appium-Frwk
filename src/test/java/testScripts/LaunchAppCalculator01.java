package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class LaunchAppCalculator01  {
	 AndroidDriver dri;
	

	 @Test
	public void LaunchAppCalculator() throws MalformedURLException {
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
		
		 
	WebElement fiveele = dri.findElement(By.id("com.miui.calculator:id/btn_5_s"));
			Tapaction(1, fiveele);
		 WebElement plus = dri.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		 	Tapaction(1, plus);
		WebElement three = dri.findElement(By.id("com.miui.calculator:id/btn_3_s"));
		Tapaction(1, three);
		 WebElement equals = dri.findElement(By.id("android:id/button1"));
			Tapaction(1, equals);
		 String value = dri.findElement(By.id("com.miui.calculator:id/btn_8_s")).getText();
		System.out.println(value);
		
		}
	public void Tapaction(int fingers,WebElement element) {
		dri.tap(fingers,element,500);
	}

}
