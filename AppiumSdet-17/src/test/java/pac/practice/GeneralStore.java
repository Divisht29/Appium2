package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStore {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		  // Common DC (Android or IOS)
		 dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "sdk_gphone_x86_arm");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
                 URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		 driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("divisht");
		 
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 
		 
		 
}
}