package Utility;

import org.openqa.selenium.By;

public class ReusableMethods extends OpenandcloseApp {
	//public static AndroidDriver<AndroidElement> driver;
//	public ReusableMethods(AndroidDriver<AndroidElement> driver) {
//	this.driver=driver;
//	}
	
	

	
	public  void type(By locator,String value){
		driver.findElement(locator).sendKeys(value);
	}
	
	public  void click(By locator){
		driver.findElement(locator).click();
		
	}
	
	public String getText(By locator){
		return driver.findElement(locator).getText();
		
	}
	
	public boolean valueEqualTo(By locator,String value){
		return driver.findElement(locator).getText().equals(value);
		
	}
	
	public String getTitle(){
		return driver.getTitle();		
	}




}
