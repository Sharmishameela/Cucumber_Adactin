package com.org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	
	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public LoginPom(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver1,this);
	}
	
	public WebElement getUserName()
	{
		return username;
	}
    public WebElement getPassWord()
    {
    	return password;
    }
    public WebElement getLogin()
    {
    	return login;
    }
}
