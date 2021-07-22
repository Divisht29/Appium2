package pac.practice;


	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.android.AndroidDriver;

	
		public class CameraLaunching {
		public static void main(String[] args) throws MalformedURLException, Throwable {
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("deviceName", "sdk_gphone_x86_arm");  
			  dc.setCapability("automationName", "appium");
			  dc.setCapability("platformName", "Android");
			  dc.setCapability("platformVersion", "11");
			  dc.setCapability("UDID", "emulator-5554");
			
			URL url=new URL("http://localhost:4723/wd/hub");
			
			AndroidDriver driver=new AndroidDriver(url,dc);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.id("android:id/aerr_wait")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.android.camera2:id/confirm_button")).click();
			Thread.sleep(1000);
			
			//driver.findElement(By.id("android:id/button1")).click();
			//driver.findElementByAccessibilityId("Shutter button").click();

		}


		}


