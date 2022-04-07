package testScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Swipe {
	
	@Test
	public void Swipe() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME	, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		//dc for app
		URL uri = new URL("http://localhost:4723/wd/hub");
		 AndroidDriver driver = new AndroidDriver(uri,dc);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 //vertical swipe
		 driver.swipe(306, 283, 347	, 1060, 500);
		 //horizontal swipe
		 driver.swipe(92, 635, 564, 688, 500);
		 
		 Dimension size = driver.manage().window().getSize();
		 int ht = size.getHeight();
		 int wt = size.getWidth();
		 System.out.println("height of the phone is"+ht);
		 System.out.println("width of the phone is"+wt);
		 //height of the phone is =1344;
		 //width of the phone is =720;
		 // int starty=1344/2
		 //vertical swipe
		 driver.swipe(wt/2, (int)(ht*.25), wt/2, (int)(ht*0.80), 1000);
		 
		 //
		 //horizontal swipe
		 
		 driver.swipe((int)(wt*0.0),ht/2,(int)(wt*0.89),ht/2,1000);
		 }
	}
