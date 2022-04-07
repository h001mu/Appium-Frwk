package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebApp {
	@Test
	public void WebApp() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME	, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		//launch browser
		dc.setCapability("browserName", "Chrome");
		//Appium Server Portno
		URL uri = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(uri,dc);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//div[text()='Log in to another account']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("himanshu.yn@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12245");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.
}
}
