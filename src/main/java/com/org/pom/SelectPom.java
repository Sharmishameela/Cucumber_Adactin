package com.org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPom {
	private WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;

	@FindBy(name = "continue")
	private WebElement continuebutton;

	public SelectPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getradioButton() {
		return radiobutton;
	}

	public WebElement getContinueButton() {
		return continuebutton;
	}

}
