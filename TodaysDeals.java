import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeals {
//   @FindBy(xpath="//input[@class='a-button-input']") private WebElement Popup;
    @FindBy(xpath="//a[text()=\"Today's Deals\"]") private WebElement TodaysDeals;





    public TodaysDeals(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

//    public WebElement clickOnPopup()
//    {
//        return Popup;
//    }

    public WebElement clickonTodaysDeals()
    {
        return TodaysDeals;
    }

}
