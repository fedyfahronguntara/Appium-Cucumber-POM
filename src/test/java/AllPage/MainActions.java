package AllPage;

import java.awt.Point;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import BaseSetup.Setup;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class MainActions extends Setup{
	public void input(MobileElement element,String value) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		element.click();
		Actions a = new Actions(driver);
		a.sendKeys(value);
		a.perform();
	}

	public void click(MobileElement button) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(button));
		button.click();
	}
	//	
	public void getassert(String actual,MobileElement element) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.getAttribute("content-desc").contains(actual));
	}

	public void verifyEl(MobileElement element) {
		try {
			(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
		}catch (NoSuchElementException e) {
			Assert.fail("Element "+element+" is not found or element not use accessibility Id");
		}
		Assert.assertTrue(element.isDisplayed(), element+" wasn't found");
	}

	public void swipe() {
		int fromX = 957;
		int fromY = 487;
		int toX = 157;
		int toY = 487;
		
		TouchAction action = new TouchAction(driver);
		 action.press(PointOption.point(fromX,fromY))
		 .waitAction(new WaitOptions().withDuration(Duration.ofMillis(3000))) 
		 .moveTo(PointOption.point(toX, toY))
		 .release()
		 .perform();
		 
	} 

	public void wait1(MobileElement element) {
		(new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(element));
	}

	public void scroll_hori(String text) {
		driver.findElement(MobileBy.AndroidUIAutomator(
		        "new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList()" +
		         ".scrollIntoView(new UiSelector().getAttribute(\"content-desc\").contains(\""+text+"\"))"));
	}

	public void waitUntil(MobileElement Element) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(Element));
	}

	public void closeAPP() {
		((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.HOME));
	}
}
