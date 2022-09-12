import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdItem {
    @FindBy(xpath="(//a[@class='a-link-normal DealCard-module__linkOutlineOffset_2fc037WfeGSjbFp1CAhOUn'])[4]") private WebElement ThirdOption;


    public ThirdItem(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public WebElement clickOnThirdItem()
    {
       return ThirdOption;
    }
}


