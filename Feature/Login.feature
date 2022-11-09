Feature: Login


  Scenario: Successful Login with valid Credentials
    Given User Launch Chrome Browser
    When User Opens URl "https://admin-demo.nopcommerce.com/login"
    And  User enters Email as "admin@yourstore.com" and Password as "admin"
    And click on Login Button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout button
    Then Page title should be "Your store. Login"
    Then close browser

