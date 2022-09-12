import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PastOrder {
    @FindBy (xpath="//a[@id='nav-orders']") private WebElement Order;


  public PastOrder(WebDriver driver)
  {
      PageFactory.initElements(driver,this);
  }

  public WebElement goToOrder()
  {
      return  Order;
  }

}
