package genericUtils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	FileUtility file=new FileUtility();
	@BeforeSuite
	public void database() {
		System.out.println("connect to the database");
	}
	@BeforeTest
		public void parallel() {
			System.out.println("parallel execution");
		}
		@BeforeClass
			public void openServer() {
				 service=AppiumDriverLocalService.buildDefaultService();
						service.start();
			}
		@BeforeMethod
		public void launchApp() throws Throwable {
			FileUtility futil = new FileUtility();
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME	,futil.getProperty("platformName"));
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
			dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
			dc.setCapability("appPackage", "io.appium.android.apis");
			dc.setCapability("appActivity", ".ApiDemos");
			URL url=new URL("http://localhost:4723/wd/hub");
			 driver=new AndroidDriver(url, dc);
			 driver.launchApp();
		}
			 @AfterMethod
			 public void closeApp() {
				 driver.closeApp();
			 }
			 
			@AfterClass
			public void closeServer() {
				service.stop();
		}
			
		@AfterTest
			public void parallelscipt() {
				System.out.println("parallel execution");
			}
		
	
	@AfterSuite
	public void closedatabase() {
		System.out.println("close the database");
	}

}
