import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mobiles {

    @FindBy(xpath="//input[@type='text']") private WebElement mobile;
 @FindBy(xpath="//input[@id='nav-search-submit-button']") private WebElement search;


    public Mobiles(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement enterMobile()
    {
        return  mobile;
    }

    public WebElement clickonSearch()
    {
        return search;
    }




}
