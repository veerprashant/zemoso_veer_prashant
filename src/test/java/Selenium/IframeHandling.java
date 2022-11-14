package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeHandling {
    public static void main(String[] args) {


            System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
            WebDriver driver=new ChromeDriver();

            driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


//            First Frame
            driver.switchTo().frame("packageListFrame");

            driver.findElement(By.xpath("//ul[@title='Packages']/li[1]")).click();
            driver.switchTo().defaultContent();

//            SecondFrame
            driver.switchTo().frame("packageFrame");

            driver.findElement(By.xpath("(//a[@title=\"interface in org.openqa.selenium\"])[14]")).click();
            driver.switchTo().defaultContent();

//            Third Frame
            driver.switchTo().frame("classFrame");

            driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
            driver.switchTo().defaultContent();




        }
}
