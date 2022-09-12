import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Address {
    @FindBy(xpath="(//div[@class='a-box-inner'])[4]") private WebElement YourAddress;
    @FindBy(xpath="//div[@class='a-box first-desktop-address-tile']") private WebElement Addaddress;
    @FindBy(xpath="(//input[@type='text'])[5]") private WebElement FlatNo;
    @FindBy(xpath="(//input[@type='text'])[6]") private WebElement Area;
    @FindBy(xpath="(//input[@type='text'])[7]") private WebElement landmark;


    public Address(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement clickOnyourAdd()
    {
        return  YourAddress;
    }

    public WebElement clickOnAddAddress()
    {
        return Addaddress;
    }

    public WebElement enterFlatNo()
    {

        return FlatNo;
    }

    public WebElement enterArea()
    {
return Area;
    }
    public WebElement enterLandmark()
    {
return landmark;
    }


    public void verifyAddress()
    {
        Assert.assertNotNull(FlatNo,"Null");
        Assert.assertNotNull(Area,"Null");
        Assert.assertNotNull(landmark,"Null");



    }
}
