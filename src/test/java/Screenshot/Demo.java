package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Demo {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).getText();

      File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        File dest=new File("src//main//abc1.jpg");

        FileHandler.copy(src,dest);
    }
}
