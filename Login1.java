import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {
    @FindBy(xpath="//input[@type='email']") private WebElement Username;
    @FindBy(xpath="//input[@type='password']") private WebElement Password;
    @FindBy(xpath="//input[@id='signInSubmit']") private WebElement Login;
    public Login1(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement enterUsername()
    {
        return Username;

    }
    public WebElement enterPassword()
    {

        return Password;
    }
    public WebElement clickOnLogin() {
        return Login;
    }

}
