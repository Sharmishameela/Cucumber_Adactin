package com.org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	public SearchHotelPom(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	
	public WebElement getLocation()
	{
		return location;
	}
	public WebElement getHotel()
	{
		return hotel;
	}
	public WebElement getRoomType()
	{
		return roomtype;
	}
	public WebElement getNo_Of_Rooms()
	{
		return roomnos;
	}
	public WebElement getCheckInDate()
	{
		return datepickin;
	}
	public WebElement getCheckOutDate()
	{
		return datepickout;
	}
	public WebElement getAdultRoom()
	{
		return adultroom;
	}
	public WebElement getChildRoom()
	{
		return childroom;
	}
	public WebElement getSubmit()
	{
		return submit;
	}

}
