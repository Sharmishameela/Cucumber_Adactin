package com.org.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.org.baseclass.BaseClass1;
import com.org.pom.SelectPom;
import com.org.runnerclass.Runner_Class;

import io.cucumber.java.en.*;

public class Select_Hotel {
	public static WebDriver driver=Runner_Class.driver;
	
	BaseClass1 b=new BaseClass1();
	SelectPom P=new SelectPom(driver);
	
	
	@Given("user wants to select desire hotel")
	public void user_wants_to_select_desire_hotel() {
	    
	}

	@Then("user click the continue button")
	public void user_click_the_continue_button() {
	    
	}

}
