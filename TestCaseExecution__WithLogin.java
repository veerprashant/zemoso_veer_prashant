import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.IOException;

import java.util.concurrent.TimeUnit;

public class TestCaseExecution__WithLogin {

    WebDriver driver;

    @BeforeClass
    public void intializeBrowser() {

        System.setProperty("webdriver.chrome.driver", "/home/prav/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/deals?ref_=nav_cs_gb");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void selectAmazonPrime()
    {
        Electronics e=new Electronics(driver);
        e.clickonElectronics().click();
        e.clickOnAmazonprime().click();
    String   Date= e.getDate().getText();
    System.out.println(Date);
    }

    @Test(priority = 2)
    public void goToReturnOrders()  {

       PastOrder pa=new PastOrder(driver);
          pa.goToOrder().click();

    }

    @Test(priority = 3)
    public void logIn() throws IOException {
        Login log=new Login(driver);


        log.enterUsername().sendKeys(UtilityClass.getTD("UserName"));
        log.clickOnContinueBtn().click();
        log.enterPassword().sendKeys(UtilityClass.getTD("Password"));
        log.clickonLogin().click();

    }


@Test(priority = 4)
public void selectListBox()
    {
        Year y=new Year(driver);
        y.clickOnListbox().click();
        y.clickOnyear().click();
    }

    @Test(priority = 5)
    public void addPayment() throws InterruptedException {
        Payment p=new Payment(driver);
        p.clickOnYourAcc().click();
        p.clickOnPayment().click();
        p.clickOnAddCreditcard().click();

driver.navigate().back();

    }

    @Test(priority = 6)
    public void addAddress() throws IOException {
        Address a=new Address(driver);
        a.clickOnyourAdd().click();
        a.clickOnAddAddress().click();
        a.enterFlatNo().sendKeys(UtilityClass.getTD("FlatNo"));
        a.enterArea().sendKeys(UtilityClass.getTD("Area"));
        a.enterLandmark().sendKeys(UtilityClass.getTD("LandMark"));
        a.verifyAddress();
    }


    @AfterClass
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
