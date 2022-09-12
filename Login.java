import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(xpath="//input[@type='email']") private WebElement Username;
    @FindBy(xpath="//input[@id='continue']") private WebElement Continue;
    @FindBy(xpath="//input[@type='password']") private WebElement Password;
    @FindBy(xpath="//input[@id='signInSubmit']") private WebElement Login;



    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement enterUsername()
    {
        return Username;

    }

    public WebElement clickOnContinueBtn()
    {
        return Continue;
    }

    public WebElement enterPassword()
    {
        return Password;
    }

    public WebElement clickonLogin() {
        return Login;
    }
}
