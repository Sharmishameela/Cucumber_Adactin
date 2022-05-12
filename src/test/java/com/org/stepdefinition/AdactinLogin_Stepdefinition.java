package com.org.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.org.baseclass.BaseClass1;
import com.org.pom.LoginPom;
import com.org.runnerclass.Runner_Class;

import io.cucumber.java.en.*;

public class AdactinLogin_Stepdefinition {
	public static WebDriver driver=Runner_Class.driver;
	
	BaseClass1 b=new BaseClass1();
    LoginPom lp=new LoginPom(driver);
	
	@Given("User wants to launch the Adctin Hotel Website")
	public void user_wants_to_launch_the_adctin_hotel_website() {
		
		b.getUrl("https://adactinhotelapp.com/");
	    
	}
	@Given("User Enters the username and password")
	public void user_enters_the_username_and_password() throws Throwable {
		b.sendKeysId(lp.getUserName(), "shehammals26");
		b.sendKeyPass(lp.getPassWord(), "Sharmilas26");
	    
	}
	@When("User wants to click the login button")
	public void user_wants_to_click_the_login_button() throws Throwable {
		b.click(lp.getLogin());
	    
	}
	@Then("User able to login successfully")
	public void user_able_to_login_successfully() {
		System.out.println("User LoggedIn Successfully");
	    
	}


}
