package com.org.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.org.baseclass.BaseClass1;
import com.org.pom.SearchHotelPom;
import com.org.runnerclass.Runner_Class;

import io.cucumber.java.en.*;

public class Adactin_SearchHotel {
	
	public static WebDriver driver=Runner_Class.driver;
	
	BaseClass1 b=new BaseClass1();
	
    SearchHotelPom sp=new SearchHotelPom(driver);
	
	
	@Given("User  wants to select hotel location")
	public void user_wants_to_select_hotel_location() throws Throwable {
	    b.dropDown(sp.getLocation(),"London");
	}
	@Given("User wants to select desire hotel")
	public void user_wants_to_select_desire_hotel() throws Throwable {
	    b.dropDown(sp.getHotel(), "Hotel Creek");
	}
	@Given("User wants to select RoomType")
	public void user_wants_to_select_room_type() throws Throwable {
	    b.dropDown(sp.getRoomType(), "Super Deluxe");
	}
	@Given("User wants to select no.of Rooms")
	public void user_wants_to_select_no_of_rooms() throws Throwable {
	   b.dropDown(sp.getNo_Of_Rooms(),"1");
	}
	@Given("User wants to select CheckIn date")
	public void user_wants_to_select_check_in_date() throws Throwable {
	    b.dropDown(sp.getCheckInDate(), "09/05/2022");
	}
	@Given("User wants to select CheckOut date")
	public void user_wants_to_select_check_out_date() throws Throwable {
		 b.dropDown(sp.getCheckOutDate(), "11/05/2022");
	}
	@Given("User wants to select AdultRooms")
	public void user_wants_to_select_adult_rooms() throws Throwable {
	    b.dropDown(sp.getAdultRoom(), "1");
	}
	@Given("User wants to select childRooms")
	public void user_wants_to_select_child_rooms() throws Throwable {
	    b.dropDown(sp.getChildRoom(), "0");
	}
	@Then("User clicks the search button")
	public void user_clicks_the_search_button() throws Throwable {
	   b.click(sp.getSubmit());
	}




}
