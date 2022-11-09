package amazonPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Login {
    @FindBy(xpath="//input[@id=\"ap_email\"]") private WebElement email;
    @FindBy(xpath="//input[@id=\"continue\"]") private WebElement continueBtn;
    @FindBy(xpath="//input[@id=\"ap_password\"]") private WebElement password;
    @FindBy(xpath="//input[@id=\"signInSubmit\"]") private WebElement signInBTN;
    public Login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public static String getTD(String key) throws IOException {
        FileInputStream file=new FileInputStream("src/test/java/TestData/data.properties");
        Properties p=new Properties();
        p.load(file);
        String Values=p.getProperty(key);
        return Values;
    }


    public void enterInputInEmail() throws IOException {
        email.sendKeys(getTD("Email"));
    }

    public void clickOnContinueBtn(){
        continueBtn.click();
    }


    public void enterInputINPassword() throws IOException {
password.sendKeys(getTD("Password"));
    }

    public void clickOnSignInBTN(){
        signInBTN.click();
    }
}
