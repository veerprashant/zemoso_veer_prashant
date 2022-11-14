package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]")));


        WebElement dest= driver.findElement(By.xpath("//div[@id=\"trash\"]"));

        WebElement item1= driver.findElement(By.xpath("//ul[@id=\"gallery\"]/li[1]"));
        WebElement item2= driver.findElement(By.xpath("//ul[@id=\"gallery\"]/li[4]"));
//       Iframe

        Actions act=new Actions(driver);
        act.dragAndDrop(item1,dest).perform();
        act.dragAndDrop(item2,dest).perform();

//        act.moveToElement(item1).clickAndHold().moveToElement(dest).release().build().perform();


    }
}
