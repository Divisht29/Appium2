package pac.practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwipeUP {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// Common DC (Android or IOS)
		dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "sdk_gphone_x86_arm");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "11");
		dc.setCapability("UDID", "emulator-5554");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");


		URL url=new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver=new AndroidDriver(url,dc);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//verical swipe
		driver.swipe(484, 273, 474, 1665, 500);

		//Horizontal swipe
		driver.swipe(91, 969, 898, 949, 1000);


		driver.swipe(888, 262, 303, 1615, 1000);

	}
}