package com.org.baseclass;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.AWTException;
//import java.awt.Point;
import java.awt.Robot;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass1 {
	
	public static WebDriver driver;
	public static WebDriver getBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ ("\\Drivers\\chromedriver.exe"));
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
		    System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+("\\Drivers\\IEDriverServer.exe"))	;
		    driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+("\\Drivers\\geckodriver.exe"));
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	/*To prevent this Exception, Selenium Wait Commands must be used.
	In automation testing, wait commands direct test execution to pause for a certain length of time before moving onto the next step.
	This enables WebDriver to check if one or more web elements are present/visible/enriched/clickable, etc */
	
	public static void implicitWait()
	{
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/*public static void explicitWait(String ele)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 100);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ele)));
	}
	
	/*public static void fluentWait()
	{
		FluentWait wait = new FluentWait(driver);
		//Specify the timout of the wait
		wait.withTimeout(30, TimeUnit.MILLISECONDS);
		//Sepcify polling time
	    wait.pollingEvery(5, TimeUnit.MILLISECONDS);
		//Specify what exceptions to ignore
		wait.ignoring(NoSuchElementException.class);
	}
	*/
	public static void getUrl(String url)
	{
		try {
		driver.get(url);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigateTo(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void back()
	{
		driver.navigate().back();
	}
	
	public static void forward()
	{
		driver.navigate().forward();
	}
	
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	public static void getTitle() 
	{
	   System.out.println("������������TiTle����������������");
       System.out.println(driver.getTitle());
	}
	
	public static void getCurrentUrl()
	{
		System.out.println("����������������������Current Url��������������������");
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void getPageSource() 
	{
		System.out.println("����������������������PageSource��������������������");
		System.out.println(driver.getPageSource());
	}
	
	public static void getWindowHandle() //window's address
	{
		System.out.println("��������������windowHandle�����������������");
		System.out.println(driver.getWindowHandle());
	}
	
	public static void getWindowHandles() //multible open windows address
	{
		System.out.println("��������������windowHandles�����������������");
		System.out.println(driver.getWindowHandles());
	}
	
	public static void sendKeysId(WebElement ele,String email) throws Throwable 

	{
		try {
		ele.sendKeys(email);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		
	}
	
	public static void sendKeyPass(WebElement ele,String pass) throws Throwable
	{
		ele.sendKeys(pass);
		Thread.sleep(1000);
	}
	
	public static void click(WebElement ele) throws Throwable
	{
		ele.click();
		Thread.sleep(1000);
	}
	
	public static void isEnabled(WebElement ele)
	{
		System.out.println(ele.isEnabled());
	}
	
	public static void isDisplayed(WebElement ele)
	{
		System.out.println(ele.isDisplayed());
	}
	
	public static void isSelected(WebElement ele) 
	{
		System.out.println(ele.isSelected());
	}
	
	public static void getTagName(WebElement ele)
	{
		System.out.println(ele.getTagName());
	}
	
	public static void getAttribute(WebElement ele,String attributename)
	{
		System.out.println(ele.getAttribute(attributename));
	}
	
    public static void getText(WebElement ele)
    {
    	System.out.println(ele.getText());
    }
    
    public static void getOptions(WebElement ele)
    {
    	Select s=new Select(ele);
    	
    	List<WebElement> option=s.getOptions();
    			
    		for(WebElement alldata:option)
    		{
    			System.out.println(alldata.getText());
    		}
    		System.out.println(option.size());
    }
    
    public static void getFirstSelectedOption(WebElement ele)
    {
    	Select s=new Select(ele);
    	System.out.println(s.getFirstSelectedOption());
    }
    
    public static void getAllSelectedOptions(WebElement ele)
    {
    	Select s=new Select(ele);
    	List<WebElement> alloption=s.getAllSelectedOptions();
    	for(WebElement all:alloption)
    	{
    		System.out.println(all.getText());
        }
    }
    
    public static void isMultiple(WebElement ele)
    {
    	Select s=new Select(ele);
    	System.out.println(s.isMultiple());
    }
    
    public static void submit(WebElement ele)
    {
    	ele.submit();
    }
    
    public static void getLocation(WebElement ele)
    {
    	Point p=ele.getLocation();
    	System.out.println(p.x + p.y);
    }
    
    public static void simpleAlert() //simple alert
    {
    	
    	driver.switchTo().alert().accept();
    }
    
    public static void confirmAlertAccept() throws Throwable //confirm alert
    {
    	
    	driver.switchTo().alert().accept();
    	Thread.sleep(1000);
    }
    public static void confirmAlertDismiss() throws Throwable
    {
   
    	driver.switchTo().alert().dismiss();
    	Thread.sleep(1000);
    }
    
    public static void promptAlert(WebElement ele)//prompt Alert
    {
    	//ele.click();
    	driver.switchTo().alert().sendKeys("Yes");
    	driver.switchTo().alert().accept();
    }
    
    public static void action(WebElement ele) //mouse over actions
    {
    	Actions ac=new Actions(driver);
    	ac.moveToElement(ele).perform();
    }
    public static void doubleClick(WebElement ele)
    {
    	Actions ac=new Actions(driver);
    	ac.doubleClick(ele).perform();
    }
    public static void contextClick(WebElement ele)
    {
    	Actions ac=new Actions(driver);
    	ac.contextClick(ele).perform();
    }
    public static void dragAndDrop(WebElement ele1,WebElement ele2)
    {
    	Actions ac=new Actions(driver);
    	ac.dragAndDrop(ele1, ele2);
    }
    
    public static void singleFrame(WebElement frame)
    {
    	driver.switchTo().frame(frame);
    }
    public static void textBoxSendkey(WebElement ele,String value)
    {
    	ele.sendKeys(value);
    }
    public static void multipleFrame(WebElement frame1,WebElement frame2,WebElement textbox)
    {
    	driver.switchTo().frame(frame1);
    	driver.switchTo().frame(frame2);
    	textbox.click();
    }
    
    public static void Robot(WebElement ele,String value) throws Throwable //keyboard actions
    {
    	Actions ac=new Actions(driver);
    	//ac.contextClick(ele).perform();
    	
    	ele.sendKeys(value);
    	ac.click(ele).perform();
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    }
    
    public static void windowsHandling(WebElement tab1,WebElement tab2) throws Throwable
    {
    	Actions ac=new Actions(driver);
    	ac.contextClick(tab1).perform();
    	
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	
    	r.keyPress(KeyEvent.VK_DOWN);
    	r.keyRelease(KeyEvent.VK_DOWN);
    	r.keyPress(KeyEvent.VK_ENTER);
    	
    	ac.contextClick(tab2).perform();
    	
    	Robot r1=new Robot();
    	r1.keyPress(KeyEvent.VK_DOWN);
    	r1.keyRelease(KeyEvent.VK_DOWN);
    	
    	r1.keyPress(KeyEvent.VK_DOWN);
    	r1.keyRelease(KeyEvent.VK_DOWN);
    	r1.keyPress(KeyEvent.VK_ENTER);
    }
    
    public static void dropDown(WebElement month,String value) throws Throwable
    {
    	month.click();
    	
    	Select mon=new Select(month);
    	mon.selectByValue(value);
    	Thread.sleep(1000);
    	
    	
    }
    
    public static void dropDown1(WebElement month,String value) throws Throwable
    {
    	month.click();
    	
    	Select mon=new Select(month);
    	mon.selectByVisibleText(value);
    	Thread.sleep(1000);
    	
    	
    }
    
    
    
    public static void radioButton(WebElement radio1) throws Throwable
    {
    	radio1.click(); // radio button1 is selected
    	//radio2.click(); // radio button1 is de-selected and radio button2 is selectd
    	Thread.sleep(1000);
    	
    }
    
    public static void checkBox(WebElement option1) throws Throwable
    {
      option1.click();
      //option2.click();
      Thread.sleep(1000);
    }
    
    public static void scrollUPDown() throws Throwable
    {
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,1000)");
    	js.executeScript("window.scrollBy(0,-1000)");
    	Thread.sleep(1000);
    }
    
    public static void screenShot() throws Throwable
    {
    	TakesScreenshot ts=(TakesScreenshot)driver;
	     
	     File srcfile=ts.getScreenshotAs(OutputType.FILE);
	     
	     File desfile=new File("C:\\Users\\azara\\eclipse-workspace\\SeleniumBaseClass\\screenshot\\test.png");
	     
	     FileUtils.copyFile(srcfile, desfile);
    }
    
    public static void clear(WebElement ele,String value)
    {
      ele.sendKeys(value);	
      ele.clear();
    }
    
    public static void quit()
    {
       driver.quit();	
    }
    
    public static void close()
    {
    	driver.close();
    }
}

