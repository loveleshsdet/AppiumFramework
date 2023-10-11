package screenPage;
import java.time.Duration;
import java.util.Scanner;

import Utility.OpenandcloseApp;
import Utility.ReusableMethods;
import screenElements.HomeElements;

public class Homepage extends ReusableMethods {
	public Homepage() {
		super();
		// TODO Auto-generated constructor stub
	}
	HomeElements e=new HomeElements();

	public void home(String value,String value1){
		
		
		Duration d=Duration.ofSeconds(10);
		OpenandcloseApp.driver.configuratorSetWaitForSelectorTimeout(d);
		
		click(e.Signup());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(e.Number(), value);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(e.signupButton());
		Scanner sc=new Scanner(System.in);
		String otpp=sc.nextLine();
		sc.close();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		type(e.otp(), otpp);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		click(e.signupButton());
		type(e.name(),"johnn");
		
	}
	

	
	
}
