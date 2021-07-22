 package com.test


java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

//import io.appium.java_client.ios.IOSDriver;

public class LaunchApp {

	public static void main(String[] args) {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		  dc.setCapability("deviceName", "sdk_gphone_x86_arm");  
		  dc.setCapability("automationName", "appium");
		  dc.setCapability("platformName", "Android");
		  dc.setCapability("platformVersion", "11");
		  dc.setCapability("UDID", "emulator-5554");
		  //DC for Android 
		  dc.setCapability("appPackage", "com.android.camera2");
		  dc.setCapability("appActivity", "com.android.camera.VideoCamera");
		  
		  // Appium Server Port No.
		  URL url = new URL("http://localhost:4723/wd/hub");
		  
		  AndroidDriver driver = new AndroidDriver(url, dc);

		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		 

		 }

		

	}


