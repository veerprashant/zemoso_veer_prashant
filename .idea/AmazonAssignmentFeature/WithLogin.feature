Feature: Amazon Assignment with Login

  Background:
    Given User Launch browser
    When User Open URl



@scenario1
 Scenario: Select Past one year orders
#    Given User Launch browser
#    When User Open URl "<URL>"
    And User select amazon prime delivery check box
    Then User get date of first displayed item
    When User Go to your orders
    Then User select past one year order
    When User Add new  Payment option
    Then User Verify Payment is Added
    When User click on Add new address
   Then User enters Name as "<Name>"
   And  Enter Number as "<MobileNumber>"
   And  Enter pincode as "<PinCode>"
   And  Enter House number as "<HouseNo>"
   And Enter Area as "<Area>"
   And Enter Landmark as "<LandMark>"
    Then User Verify Address is Added


    Examples:
    |URL|Name|MobileNumber|PinCode|HouseNo|Area|LandMark|
    |https://www.amazon.in/deals?ref_=nav_cs_gb|Prashant Veer|8208970060|413504|872|Veer Galli|Near Gurukul|

