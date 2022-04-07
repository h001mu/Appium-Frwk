package com.drivermethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnection {
	@Test
	public void NetworkConnection() throws MalformedURLException {
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
		 Connection connection = driver.getConnection();
		 //System.out.println(connection);
		 //driver.setConnection(Connection.WIFI);
		 //System.out.println(driver.getConnection());
		 driver.setConnection(Connection.DATA);
		 System.out.println(driver.getConnection());
		//driver.setConnection(Connection.AIRPLANE);
		 //System.out.println(driver.getConnection());
		
		}

}
