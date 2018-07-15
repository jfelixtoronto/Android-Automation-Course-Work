import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver=Capabilities();

		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		CommonHelper.wait(2);
		TouchAction t= new TouchAction(driver);
		//driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']")).perform();
//		CommonHelper.wait(1);
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
//		CommonHelper.wait(1);
		//driver.findElementByXPath("//*[@content-desc='9']").click();
		t.tap(driver.findElementByXPath("//*[@content-desc='9']")).perform();
//		CommonHelper.wait(1);
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(3000)).moveTo(driver.findElementByXPath("//*[@content-desc='30']")).release().perform();
		
	}

}
