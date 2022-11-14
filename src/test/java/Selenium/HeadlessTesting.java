package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HeadlessTesting {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new HtmlUnitDriver();

        driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


       String text= driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).getText();

        driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
        System.out.println(text);




    }
}
