package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Base {
    WebDriver driver;

    public static void initializeBrowser(){
        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    }
}
