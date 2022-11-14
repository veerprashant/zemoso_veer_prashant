package Screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Utility {

    public static void captureScreenshot(WebDriver driver,int TCID) throws IOException {
      File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


      File dest=new File("src//test//java//Images//"+TCID+".jpg");

        FileHandler.copy(src,dest);


    }
}
