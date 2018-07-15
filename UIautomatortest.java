import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomatortest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	AndroidDriver<AndroidElement> driver=Capabilities();
		
//			driver.findElementByAndroidUIAutomator("attribute(value)")
	
			//Validate  Clickable feature for all options
//			driver.findElementByAndroidUIAutomator("new UiSelector().property(value)");
			System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	
	}

}
