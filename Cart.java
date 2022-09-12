import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {

    @FindBy(xpath="//span[@class='a-button a-button-dropdown quantity']") private WebElement cart;


    public Cart(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public WebElement verify()
    {

      return cart;
    }
}

