package com.drivermethods;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class ZoomINZoomOut {
	@Test
	public static void ZoomINZoomOut() {
		AppiumDriverLocalService server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
		.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
		.usingPort(4723)
		.withLogFile(new File("../AppiumSDET28/Logs.txt")));
			server.start();
		
		
		
		
		
	}

}
