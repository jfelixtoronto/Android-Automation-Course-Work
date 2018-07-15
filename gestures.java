import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=Capabilities();
	
	driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	//Tap
	TouchAction t = new TouchAction(driver);
	t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
	
	driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	t.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofMillis(3000)).release().perform();
	System.out.println(driver.findElementById("android:id/title").getText());
	}

}
