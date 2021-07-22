package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class LaunchapiDemo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		 dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "sdk_gphone_x86_arm");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Controls").click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Holo Light Theme\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("divisht");
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("Checkbox 2").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("RadioButton 2").click();
	}


}
