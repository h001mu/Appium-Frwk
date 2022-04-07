package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchApps {
	@Test
	public void SwitchApps() throws MalformedURLException, Throwable {
		
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
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.startActivity("com.androidsample.generalstore", ".SplashActivity");
		 
		 Thread.sleep(2000);
		 
		 //switch the same app back
		 //driver.startActivity("io.appium.android.apis", ".ApiDemos");
		driver.launchApp();
		 driver.close();
	}

}
