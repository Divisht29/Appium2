package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInZoomOut {
	static AndroidDriver driver;

	
	
	
	public static void main(String[] args) throws MalformedURLException, Throwable {
	
	DesiredCapabilities dc = new DesiredCapabilities();
	// Common DC (Android or IOS)
	dc.setCapability("deviceName", "sdk_gphone_x86_arm");  
	dc.setCapability("automationName", "appium");
	dc.setCapability("platformName", "Android");
	dc.setCapability("platformVersion", "11");
	dc.setCapability("UDID", "emulator-5554");

	dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
	dc.setCapability("appActivity", ".MainActivity");

	URL url = new URL("http://localhost:4723/wd/hub");

	driver = new AndroidDriver(url, dc);

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("android:id/button1")).click();
	Thread.sleep(1000);
	
	
	driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	
	WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	
	driver.zoom(img);
	
	Thread.sleep(3000);
	
	driver.pinch(img);

}
}