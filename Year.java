import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Year {
    @FindBy(xpath="//span[@id='a-autoid-1-announce']") private WebElement PastOrder;
 @FindBy(xpath="//div[@class='a-popover-inner']//li[3]") private WebElement year;

 public Year(WebDriver driver)
 {
     PageFactory.initElements(driver,this);
 }

 public WebElement clickOnListbox()
 {
     return PastOrder;
 }

 public WebElement clickOnyear()
 {
     return year;
 }
}
