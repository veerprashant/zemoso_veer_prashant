Feature: Login


  Scenario Outline: : Successful Login with valid Credentials DDF
    Given User Launch Chrome Browser
    When User Opens URl "<URL>"
    And  User enters Email as "<Email>" and Password as "<Password>"
    And click on Login Button
    Then Page title should be "<Title1>"
    When User click on Logout button
    Then Page title should be "<Title2>"
    Then close browser

Examples:
    |Email|Password|URL|Title1|Title2|
    |admin@yourstore.com|admin|https://admin-demo.nopcommerce.com/login|Dashboard / nopCommerce administration|Your store. Login|