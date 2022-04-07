package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Orientation {
	@Test
	public void Orientation() throws MalformedURLException, Throwable {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		//dc for app
		URL uri = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(uri,dc);
		 ScreenOrientation currentscreenorientation = driver.getOrientation();
		 System.out.println(currentscreenorientation);
		 driver.rotate(ScreenOrientation.LANDSCAPE);
		 System.out.println(driver.getOrientation());
		 Thread.sleep(2000);
		 driver.rotate(ScreenOrientation.PORTRAIT);
		 System.out.println(driver.getOrientation());
		 
		
	}

}
