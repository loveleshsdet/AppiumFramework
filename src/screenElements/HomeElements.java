package screenElements;

import org.openqa.selenium.By;

public class HomeElements {
	public String elem="com.app.headzapp:id/tvSignUp";
	public String elem1="com.app.headzapp:id/et_contact_number";
	public String signup="com.app.headzapp:id/btn_phone_next";
	public String otp="com.app.headzapp:id/pin_view_verify_otp";
	String name="com.app.headzapp:id/et_user_name";
	
	public By Signup() {
		return By.id(elem);
	}
	
	public By Number() {
		return By.id(elem1);
	}
	
	public By signupButton() {
		return By.id(signup);
	}
	
	public By otp() {
		return By.id(otp);
	}
	public By name() {
		return By.id(name);
	}
	
}
