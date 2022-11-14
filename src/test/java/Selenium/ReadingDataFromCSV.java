package Selenium;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

public class ReadingDataFromCSV {

    public static void main(String[] args) throws IOException, InterruptedException, CsvValidationException {


        System.setProperty("webdriver.chrome.driver","/home/prav/Desktop/chromeexe/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        CSVReader reader=new CSVReader(new FileReader("src//test//java//Data//TestData.csv"));
        String[] cell =reader.readNext();

        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Password")).clear();


//while ((cell= reader.readNext())!=null) {
    for (int i = 0; i < cell.length; i++) {
        String email = cell[i];
        String pass = cell[i + 1];

        System.out.println(email);
        System.out.println(pass);

            driver.findElement(By.id("Email")).sendKeys(email);
            Thread.sleep(2000);

            driver.findElement(By.id("Password")).sendKeys(pass);

        driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
        Thread.sleep(2000);
        driver.quit();

//    }

}

    }
}
