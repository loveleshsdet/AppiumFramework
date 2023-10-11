package Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class OpenandcloseApp {
	public DesiredCapabilities cap;
	public static AndroidDriver<AndroidElement> driver;
	public static IOSDriver<IOSElement> driver1;
	
	@Parameters({"Platform","Device","Name"})
	@BeforeClass
	public void  before(String s1,String s2,String name) throws MalformedURLException 
	{	
		URL url=new URL(  "http://127.0.0.1:4723/wd/hub");
		
	if(s1.equalsIgnoreCase("Android")) {
		String path=System.getProperty("user.dir")+"\\"+name+".apk";
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, s2);
		cap.setCapability(MobileCapabilityType.APP, path);
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		 driver=new AndroidDriver<AndroidElement>(url, cap);
		
	}
	else if(s1.equalsIgnoreCase("iOS")) {
		String path=System.getProperty("user.dir")+"\\"+name+".app";
		cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, s1);
		cap.setCapability(MobileCapabilityType.APP, path);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		driver1 =new IOSDriver<>(url, cap);
	}
	
	}


@AfterClass
public void after() {
	driver.closeApp();
}


}
