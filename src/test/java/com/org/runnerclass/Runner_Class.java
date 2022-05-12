package com.org.runnerclass;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.org.baseclass.BaseClass1;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\org\\featurefile",glue="com\\org\\stepdefinition",
monochrome = true,dryRun=true)

public class Runner_Class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void getBrowser()
	{
	driver=BaseClass1.getBrowser("chrome");
	}

}
