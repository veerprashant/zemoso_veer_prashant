package stepDefination;

import amazonPomClasses.*;
import io.cucumber.java.en.*;
import io.cucumber.java.jv.Lan;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class WithLoginAssignment {

    WebDriver driver;
    PrimeCheckBox pm;

    Orders order;

    Login login;

    Payment payment;

    Address address;


    @Given("User Launch browser")
    public void user_launch_browser() {
        System.setProperty("webdriver.chrome.driver", "/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        pm=new PrimeCheckBox(driver);
        order=new Orders(driver);
        login=new Login(driver);
        payment=new Payment(driver);
        address=new Address(driver);
    }
    @When("User Open URl {string}")
    public void user_open_u_rl(String url) {
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
    @When("User select amazon prime delivery check box")
    public void user_select_amazon_prime_delivery_check_box() {
     pm.clickOnElectronics();
     pm.selectCheckBox();
    }
    @Then("User get date of first displayed item")
    public void user_get_date_of_first_displayed_item() {
        pm.getDateOfItem();
    }
    @When("User Go to your orders")
    public void user_go_to_your_orders() throws IOException, InterruptedException {
        order.clickOnYourOrders();
        login.enterInputInEmail();
        login.clickOnContinueBtn();
        login.enterInputINPassword();
        login.clickOnSignInBTN();

    }
    @Then("User select past one year order")
    public void user_select_past_one_year_order() {
       order.clickOnDropDown();
       order.selectPastOneYear();
    }
    @When("User Add new  Payment option")
    public void user_add_new_payment_option() {
payment.clickOnYourAccount();
payment.clickOnPaymentOptions();

    }
    @Then("User Verify Payment is Added")
    public void user_verify_payment_is_added() {
        payment.verifyPaymentOption();
    }
    @When("User click on Add new address")
    public void user_click_on_add_new_address() {
    address.clickOnYourAccount();
    address.clickOnYourAddress();
    address.clickOnAddAddress();
    }
    @Then("User enters Name as {string}")
    public void user_enters_name_as(String FullName) {
      address.enterName().sendKeys(FullName);

    }
    @Then("Enter Number as {string}")
    public void enter_number_as(String MobileNO) {
       address.enterMobileNo().sendKeys(MobileNO);
    }
    @Then("Enter pincode as {string}")
    public void enter_pincode_as(String Pincode) {
        address.enterPincode().clear();
       address.enterPincode().sendKeys(Pincode);

    }
    @Then("Enter House number as {string}")
    public void enter_house_number_as(String HouseNo) {
   address.enterHouseNo().sendKeys(HouseNo);
    }
    @Then("Enter Area as {string}")
    public void enter_area_as(String Area) {
       address.enterArea().sendKeys(Area);
    }
    @Then("Enter Landmark as {string}")
    public void enter_landmark_as(String LandMark) {
       address.enterLandMark().sendKeys(LandMark);
       address.clickOnSubmitBtn();
    }
    @Then("User Verify Address is Added")
    public void user_verify_address_is_added() {
address.verifyAddressAdded();
    }


}
