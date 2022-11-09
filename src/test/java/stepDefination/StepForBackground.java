//package stepDefination;
//
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pomClasses.Background;
//
//public class StepForBackground {
//
//    WebDriver driver;
//    Background lp;
//    @Given("User2  Launch Chrome Browser")
//    public void user2_launch_chrome_browser() {
//        System.setProperty("webdriver.chrome.driver","//home//prav//Desktop//chromeexe//chromedriver_linux64//chromedriver");
//        driver=new ChromeDriver();
//        lp=new Background(driver);
//    }
//    @When("User2 Opens URl {string}")
//    public void user2_opens_u_rl(String URL) {
//        driver.get(URL);
//        driver.manage().window().maximize();
//    }
//    @When("User2 enters Email as {string} and Password as {string}")
//    public void user2_enters_email_as_and_password_as(String email, String pwd) throws InterruptedException {
//        Thread.sleep(3000);
//        lp.enterUsername(email);
//        lp.enterPassword(pwd);
//    }
//    @When("click on Login button")
//    public void click_on_login_button() {
//        lp.clickOnLoginButton();
//    }
//    @Then("Page Title should be {string}")
//    public void page_title_should_be(String string) throws InterruptedException {
//        Thread.sleep(3000);
//        String title=driver.getTitle();
//        Assert.assertEquals(string,title);
//    }
//    @When("User Click on Logout button")
//    public void user_click_on_logout_button() throws InterruptedException {
//        lp.clickonlogoutButton();
//        Thread.sleep(3000);
//    }
//    @Then("Close Browser")
//    public void close_browser() {
//        driver.quit();
//    }
//}
//