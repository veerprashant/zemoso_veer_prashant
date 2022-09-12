import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
    @FindBy(xpath="//a[@class='nav-a nav-a-2 nav-truncate   nav-progressive-attribute']") private WebElement YourAcc;
    @FindBy(xpath="(//div[@class='a-box-inner'])[5]") private WebElement Payment;
    @FindBy(xpath="(//input[@class='a-button-input'])[1]") private WebElement Creditcard;


    public Payment(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement clickOnYourAcc()
    {
        return YourAcc;
    }

    public WebElement clickOnPayment()
    {
        return Payment;
    }

    public WebElement clickOnAddCreditcard()
    {
        return Creditcard;
    }


}
