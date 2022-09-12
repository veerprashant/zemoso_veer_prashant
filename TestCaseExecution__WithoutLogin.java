import graphql.language.Argument;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestCaseExecution__WithoutLogin {

    WebDriver driver;
    AddtoCart add;
@BeforeClass
    public void intializeBrowser() {
        System.setProperty("webdriver.chrome.driver", "/home/prav/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
@Test(priority =1)
    public void todayDeals()
    {
        TodaysDeals t=new TodaysDeals(driver);

//        t.clickOnPopup().click();
        t.clickonTodaysDeals().click();
    }

    @Test(priority = 2)
    public void thirdItem()
    {
        ThirdItem  s=new ThirdItem(driver);
        s.clickOnThirdItem().click();
    }


    @Test(priority=3)
    public void addIteam() throws InterruptedException {
        add=new AddtoCart(driver);
        add.clickOnItem().click();
        add.addToCart().click();
        add.getGoToCart().click();

    }


    @Test(priority = 4)
public void verifyCart()
{
    add.getGoToCart();
    Cart c=new Cart(driver);
 String ExpectedText=c.verify().getText();
 System.out.println(ExpectedText);
 String Actual="Qty:1";

    Assert.assertEquals(Actual,ExpectedText,"Failed");
}

@Test(priority = 5)
public void searchForMobiles() {

    Mobiles m=new Mobiles(driver);
    m.enterMobile().click();
    m.enterMobile().sendKeys("Mobile");

    m.clickonSearch().click();

    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3000)");

    for (int i = 0; i <=5 ; i++) {
        driver.navigate().back();
    }


}
@AfterClass
public void closeBrowser()
{
    driver.quit();

}
}

