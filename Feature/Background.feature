Feature: Login

Background:
  Given User2  Launch Chrome Browser
  When User2 Opens URl "https://admin-demo.nopcommerce.com/login"
  And  User2 enters Email as "admin@yourstore.com" and Password as "admin"
  And click on Login button


  Scenario: Successful Login With Valid Credential
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Logout button
    Then Page Title should be "Your store. Login"
    Then Close Browser


  Scenario: Successful Login second time with valid Credentials
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User Click on Logout button
    Then Page Title should be "Your store. Login"
    Then Close Browser