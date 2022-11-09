//package stepDefination;
//
//
//import io.cucumber.java.en.*;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pomClasses.LoginPage;
//
//public class Step {
//    WebDriver driver;
//  LoginPage lp;
//    @Given("I launch chrome browser")
//    public void i_launch_chrome_browser() {
//        System.setProperty("webdriver.chrome.driver", "//home//prav//Desktop//chromeexe//chromedriver_linux64//chromedriver");
//        driver = new ChromeDriver();
//    }
//
//    @When("I open Homepage")
//    public void i_open_homepage() {
//        driver.get("https://training.orangehrm.com/");
//    }
//
//    @Then("I verify That the logo present on page")
//    public void i_verify_that_the_logo_present_on_page() {
//        boolean logo = driver.findElement(By.xpath("//div[@id='divLogo']")).isDisplayed();
//        Assert.assertEquals(true, logo);
//
//    }
//
//
//}
//
//
