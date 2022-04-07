package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ZoomINZoomOut {
	@Test
	public void ZoomINZoomOut() throws MalformedURLException, Throwable {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		dc.setCapability("appPackkage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appAcitivity", ".MainActivity");
		//dc for Android
		URL uri = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(uri,dc);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
		driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
		WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		driver.zoom(img);
		Thread.sleep(1000);
		driver.pinch(img);
		driver.
		
		
				
		
		
		
	}

}
