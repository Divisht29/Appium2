package pac.practice;
  import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

			public class ListOfAllElements {
		

				public static void main(String[] args) throws MalformedURLException {
					DesiredCapabilities dc = new DesiredCapabilities();
					dc.setCapability("deviceName", "sdk_gphone_x86_arm");
					dc.setCapability("automationName", "appium");
					dc.setCapability("platformName", "Android");
					dc.setCapability("platformVersion", "11");
					dc.setCapability("UDID", "emulator-5554");
					dc.setCapability("appPackage", "io.appium.android.apis");
					dc.setCapability("appActivity", ".ApiDemos");
					
					URL url = new URL("http://localhost:4723/wd/hub");
					
					AndroidDriver driver = new AndroidDriver(url, dc);
					
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
//					List<MobileElement> options = driver.findElementsByClassName("android.widget.TextView");
					List<MobileElement>options = driver.findElementsByXPath("//android.widget.TextView[@resource-id='android:id/text1']");
					for(int i=1; i<options.size();i++)
					{
						System.out.println(options.get(i).getText());
					}
					

				}

			}				