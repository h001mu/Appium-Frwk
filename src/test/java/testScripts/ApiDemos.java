package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemos {
	@Test
public void LaunchApiDemos() throws MalformedURLException {
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
				 List<MobileElement> options = driver.findElements(By.className("android.widget.Textview"));
				 for (int i = 0; i < options.size(); i++) {
					 System.out.println(options.get(i).getText());
					
				}
		 
	}
		
		
		
	}

