package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_gb']") private WebElement todaysDeal;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getTextOfElement(){
     return todaysDeal;

    }
}
