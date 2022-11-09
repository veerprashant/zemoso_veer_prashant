package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Background {

    @FindBy(xpath = "//input[@id='Email']") private WebElement usernameField;
    @FindBy(id="Password") private WebElement passwordField;
    @FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
    @FindBy(xpath="//a[text()='Logout']") private  WebElement logoutButton;


    public Background (WebDriver driver){

        PageFactory.initElements(driver,this);
    }

    public void enterUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

    public void clickonlogoutButton(){
        logoutButton.click();
    }
}
