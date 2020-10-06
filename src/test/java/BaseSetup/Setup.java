package BaseSetup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Setup {
	public static AndroidDriver<MobileElement> driver;

	public void set_up()    {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "OTP"); //For Registration Story
		caps.setCapability("udid", "emulator-5554"); //For Registration Story
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9.0");
		caps.setCapability("skipUnlock","true");
		caps.setCapability("appPackage", "io.flutter.demo.gallery");
		caps.setCapability("appActivity","io.flutter.demo.gallery.MainActivity");
		caps.setCapability("noReset","false");
		caps.setCapability("newCommandTimeout","30000");
		caps.setCapability("fullreset", true);
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	public void tearDown(){
		driver.quit();
	}
}
