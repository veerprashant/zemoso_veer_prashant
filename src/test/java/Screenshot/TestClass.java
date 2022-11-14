package Screenshot;

import com.testing.framework.EmailUtils;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class TestClass {
WebDriver driver;
HomePage home;

int TCID;


@BeforeClass
public void launchBrowser(){
    System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
     driver=new ChromeDriver();

    driver.get("https://www.amazon.in/ref=nav_logo");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    home=new HomePage(driver);

}

@Test(priority = 1)
public void verifyText() {
    TCID=100;
    String text=home.getTextOfElement().getText();
    System.out.println(text);

}
@Test(priority = 2)
public void TC2 () {
    TCID=101;

    home.getTextOfElement().click();
Assert.assertTrue(false);

}

@AfterMethod
public void failure(ITestResult result) throws IOException {
    if (result.FAILURE==result.getStatus())
    {
        Utility.captureScreenshot(driver,TCID);
    }

}

@AfterClass
public void closeBrowser() throws Exception {

    driver.quit();

    EmailUtils emailutil=new EmailUtils();

    FileInputStream file=new FileInputStream("src/test/java/Data/demo.properties");
    Properties prop=new Properties();
    prop.load(file);

    List<String> attachments=new ArrayList<>();
    attachments.add("//home//prav//IdeaProjects//AdvancedSeleniumNew//test-output//Extent.html");

    emailutil.sendUsingGmail(prop,"Test Execution result","Hii team ,execution is successful",attachments);

}
}
