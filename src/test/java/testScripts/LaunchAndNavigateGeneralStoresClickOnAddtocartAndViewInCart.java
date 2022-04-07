package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchAndNavigateGeneralStoresClickOnAddtocartAndViewInCart {
	@Test
	public void LaunchAndNavigateGeneralStoresClickOnAddtocartAndViewInCart() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME	, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		//to run and launch app
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		
		URL uri = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(uri,dc);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Himanshu");
		 driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 
		 driver.tap(1, 588, 722, 500);
		 driver.tap(1, 590, 1296, 500);
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 driver.findElement(By.xpath("//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']"));
		 
	}

}
