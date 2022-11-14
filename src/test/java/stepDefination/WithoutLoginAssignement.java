//package stepDefination;
//
//import amazonPomClasses.HomePage;
//import amazonPomClasses.SearchMobiles;
//import amazonPomClasses.Verify;
//import io.cucumber.java.en.*;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class WithoutLoginAssignement {
//
//    WebDriver driver;
//    HomePage home;
//
//    Verify verify;
//
//    SearchMobiles search;
//
//    @Given("User Launch  the browser")
//    public void user_launch_the_browser() {
//        System.setProperty("webdriver.chrome.driver", "/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
//        driver = new ChromeDriver();
//        home=new HomePage(driver);
//        verify=new Verify(driver);
//        search=new SearchMobiles(driver);
//    }
//    @When("User enters Url {string}")
//    public void user_open_a_u_rl(String string) {
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
//        driver.get(string);
//        driver.manage().window().maximize();
//
//    }
//    @Then("Click on Today's deals")
//    public void click_on_today_s_deals() {
//   home.clickOnTodaysDeals();
//    }
//
//    @Then("Click on Third item")
//    public void click_on_third_item() {
//        home.clickOnThirdItem();
//    }
//
////    @Then("Select first item")
////    public void select_first_item() {
////        home.selectFirstItem();
////    }
//
//    @When("Click on AddToCart button")
//    public void click_on_add_to_cart_button() {
//verify.clickOnAddToCart();
//    }
//
//    @Then("Go to Cart")
//    public void go_to_cart() {
//verify.clickOnGoToCart();
//    }
//
//    @Then("Verify Minimum Quantity")
//    public void verify_minimum_quantity() throws InterruptedException {
//        Thread.sleep(3000);
//verify.verifyQuantityInCart();
//    }
//
//    @When("Search for Mobiles")
//    public void search_for_mobiles() {
//search.inputToSearchBar();
//    }
//
//    @When("Scroll to bottom")
//    public void scroll_to_bottom() {
//
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",search.scrollToLastItem());
//    }
//
//    @Then("Get last item details")
//    public void get_last_item_details() {
//search.getLastDisplayedInfo();
//    }
//
//    @Then("Navigate back to main")
//    public void navigate_back_to_main() {
//
//        for (int i = 0; i <=3; i++) {
//            driver.navigate().back();
//        }
//    }
//
//
//}
