package stepDefination;

import amazonPomClasses.*;
import io.cucumber.java.en.*;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class StepForAmazonAssignment {
    WebDriver driver;
    HomePage home;

    Verify verify;

    SearchMobiles search;
    PrimeCheckBox pm;

    Orders order;

    Login login;

    Payment payment;

    Address address;

    @BeforeClass
    @Given("User Launch browser")
    public void user_launch_browser() {
        System.setProperty("webdriver.chrome.driver", "/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        driver = new ChromeDriver();
        home=new HomePage(driver);
        verify=new Verify(driver);
        search=new SearchMobiles(driver);
        pm=new PrimeCheckBox(driver);
        order=new Orders(driver);
        login=new Login(driver);
        payment=new Payment(driver);
        address=new Address(driver);
    }

    @BeforeClass
    @When("User enters Url")
    public void user_enters_url(io.cucumber.datatable.DataTable dataTable) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       List<String> data = dataTable.row(0);
        driver.get(data.get(0));
        driver.manage().window().maximize();
    }

    @When("Click on Today's deals")
    public void click_on_today_s_deals() {
        home.clickOnTodaysDeals();
    }

    @Then("Click on Third item")
    public void click_on_third_item() {
        home.clickOnThirdItem();
    }

    @Then("Select first item")
    public void select_first_item() {
        home.selectFirstItem();
    }

    @When("Click on AddToCart button")
    public void click_on_add_to_cart_button() throws InterruptedException {
        Thread.sleep(3000);
        verify.clickOnAddToCart();
    }

    @Then("Go to Cart")
    public void go_to_cart(){
        verify.clickOnGoToCart();
    }

    @Then("Verify Minimum Quantity")
    public void verify_minimum_quantity() {
        verify.verifyQuantityInCart();
    }

    @When("Search for Mobiles")
    public void search_for_mobiles() {
        search.inputToSearchBar();
    }

    @When("Scroll to bottom")
    public void scroll_to_bottom()  {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",search.scrollToLastItem());
    }

    @Then("Get last item details")
    public void get_last_item_details() {
        search.getLastDisplayedInfo();
    }

    @Then("Navigate back to main")
    public void navigate_back_to_main() {
        for (int i = 0; i <=3; i++) {
            driver.navigate().back();
        }
    }
    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
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
    public void user_go_to_your_orders() throws IOException {
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
        payment.verifyPaymentOption();
        payment.clickOnManageCard();
        payment.clickOnAddBank();
        payment.clickOnCheckBox();
        payment.inputToIFSC();
        payment.inputToHolderName();
        payment.inputToAccountNumber();
        payment.inputToConfirmAccountNumber();
        payment.clickOnYourAccounts();
    }

//    @Then("User Verify Payment is Added")
//    public void user_verify_payment_is_added() {
//        payment.verifyPaymentOption();
//    }

    @When("User click on Add new address")
    public void user_click_on_add_new_address() throws InterruptedException {
//        address.clickOnYourAccount();
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
