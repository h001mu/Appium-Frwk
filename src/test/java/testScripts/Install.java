package testScripts;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Install {
	
	@Test
	public void installapp() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
				dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
				dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
				dc.setCapability(MobileCapabilityType.UDID, "c69725260006");
				dc.setCapability(MobileCapabilityType.NO_RESET,"false");
				dc.setCapability("app",	 "C:\\Users\\BHARATH\\Downloads\\General-Store.apk");
				URL url=new URL("http://localhost:4723/wd/hub");
				
				AndroidDriver driver = new AndroidDriver(url,dc);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.installApp("C:\\Users\\BHARATH\\Downloads\\General-Store.apk");
				}

}
