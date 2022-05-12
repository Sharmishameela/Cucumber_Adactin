Feature: To Automate Adactin Hotel WebSite working Functionality

  Scenario: To Test Searching Hotel Details is Working
    Given User  wants to select hotel location
    And User wants to select desire hotel
    And User wants to select RoomType
    And User wants to select no.of Rooms
    And User wants to select CheckIn date
    And User wants to select CheckOut date
    And User wants to select AdultRooms
    And User wants to select childRooms
    Then User clicks the search button
