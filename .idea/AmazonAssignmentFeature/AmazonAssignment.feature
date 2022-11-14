Feature: Amazon Assignment with and without login

  Background:
    Given User Launch browser
    When User enters Url
    |https://www.amazon.in/ref=nav_logo|
#    |https://www.amazon.in/deals?ref_=nav_cs_gb|


    @WithoutLogin
Scenario Outline: Login not Required
    When Click on Today's deals
    Then Click on Third item
    And Select first item
    When Click on AddToCart button
    Then Go to Cart
    And Verify Minimum Quantity
    When Search for Mobiles
    And Scroll to bottom
    Then Get last item details
    And Navigate back to main
  Then Close the browser


@WithLogin
  Scenario Outline: Login required
    When User select amazon prime delivery check box
    Then User get date of first displayed item
    When User Go to your orders
    Then User select past one year order
    When User Add new  Payment option
#    Then User Verify Payment is Added
    When User click on Add new address
    Then User enters Name as "<Name>"
    And  Enter Number as "<MobileNumber>"
    And  Enter pincode as "<PinCode>"
    And  Enter House number as "<HouseNo>"
    And Enter Area as "<Area>"
    And Enter Landmark as "<LandMark>"
    Then User Verify Address is Added
    Then Close the browser



    Examples:
      |Name|MobileNumber|PinCode|HouseNo|Area|LandMark|
      |Prashant Veer|8208970060|413504|872|Veer Galli|Near Gurukul|
