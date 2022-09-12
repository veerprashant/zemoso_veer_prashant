import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics
{
    @FindBy(xpath="//a[text()=' Electronics ']") private WebElement Electronic;
    @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")private WebElement AmazonPrime;
    @FindBy(xpath="(//span[@class='a-color-base a-text-bold'])[1]") private WebElement FirstItem;


    public Electronics(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement clickonElectronics()
    {
        return Electronic;
    }

    public WebElement clickOnAmazonprime()
    {
        return AmazonPrime;
    }

    public WebElement getDate()
    {
        return FirstItem;
    }
}
