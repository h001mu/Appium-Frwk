package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapAction {
	@Test
	public void tapAction() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Redmi");
		dc.setCapability(MobileCapabilityType.UDID,"c69725260006");
		//dc for App
		URL uri = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(uri,dc);
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
		driver.tap(1, ele, 500);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
		driver.tap(1, ele, 500);
		System.out.println(ele.getText());
		}
	
	}
