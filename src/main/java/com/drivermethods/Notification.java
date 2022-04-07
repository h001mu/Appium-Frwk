package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notification {
	@Test
	public void Notification() throws MalformedURLException, Throwable {
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
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement app = driver.findElementByAccessibilityId("App");
		 driver.tap(1, app, 500);
		 WebElement notification = driver.findElementByAccessibilityId("Notification");
		 driver.tap(1, notification, 500);
		 WebElement incomingmess = driver.findElementByAccessibilityId("IncomingMessage");
		 driver.tap(1, incomingmess, 500);
		 WebElement showappnotifiy = driver.findElementByAccessibilityId("Show App Notification");
		 driver.tap(1, showappnotifiy, 500);
		 
		 Thread.sleep(2000);
		 
		 //open notfication
		 driver.openNotifications();
		 driver.findElement(By.xpath("//android.widget.TextView[@text()='Joe']")).click();
	
		 }

}
