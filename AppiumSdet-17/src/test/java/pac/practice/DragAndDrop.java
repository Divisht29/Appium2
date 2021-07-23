package pac.practice;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class DragAndDrop {


	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc.setCapability("deviceName", "sdk_gphone_x86_arm");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		// Appium Server Port No.
		URL url = new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//find Elements
		
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Drag and Drop").click();
		Thread.sleep(1000);

		WebElement src=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement dest=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_3"));

		TouchAction ta=new TouchAction(driver);
		ta.longPress(src).waitAction(2000).moveTo(dest).release().perform();

	


	}


}
