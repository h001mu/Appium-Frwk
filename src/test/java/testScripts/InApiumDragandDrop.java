package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InApiumDragandDrop {
@Test
public void InApiumDragandDrop() throws MalformedURLException {
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
	 WebElement view = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]"));
	TapAction(1, view); 
	 
	 }
public void TapAction(int fingers,WebElement element) {
	TapAction(1, el);
	
}
}
