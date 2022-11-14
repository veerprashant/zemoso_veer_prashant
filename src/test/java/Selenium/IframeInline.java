package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeInline {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));


        driver.findElement(By.xpath("//ul[@class=\"nav nav-tabs \"]/li[2]")).click();

        WebElement outer=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));

        driver.switchTo().frame(outer);

        driver.switchTo().parentFrame();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//ul[@class=\"nav nav-tabs \"]/li[1]")).click();


    }
}
