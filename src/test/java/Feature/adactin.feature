Feature: Hotel Adactin Automation
  Scenario: Select a hotel
    Given Launch "chrome" and url "https://adactinhotelapp.com/index.php"
    When User login website by enters username as "Nithi1206" and password as "V04MFT"
    Then User lands on search hotel page and verifies the URL contains "SearchHotel" text
    When User selects london in location
    And User selects Hotel Sunshine
    And User selcts Super Delux room type
    And User selects two number of rooms
    And User adds check in date "25/10/2024"
    And User adds check out date "27/10/2024"
    And User selects two adults
    And User selects two children
    And User clicks on search button
    Then User lands on select hotel page and verifies the URL contains "SelectHotel" text
    When User selects radio button
    When User clicks on continue button
    Then User lands on book hotel page and verifies the URL contains "BookHotel" text
    And User enters first name as "Nithi"
    And User enters last name as "Anand"
    And User enters billing address as "123, house, parrys, London"
    And User enters credit card number "8743913407127430"
    And User selects Visa credit card
    And User selects month and year in expiry date
    And User enters CVV number "333"
    And User click on book now button
    Given User takes screenshot of the booking confrimation page
    Then User quits the browser