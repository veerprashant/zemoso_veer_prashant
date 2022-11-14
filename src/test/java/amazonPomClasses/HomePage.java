package amazonPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    @FindBy(xpath="//a[@data-csa-c-content-id='nav_cs_gb']") private WebElement todaysDeal;
    @FindBy(xpath="//div[@data-testid='grid-deals-container']/div[3]")  private WebElement thirdItem;
    @FindBy(xpath="//ul[@class=\"a-unordered-list a-nostyle a-horizontal a-spacing-none\"]/li[1]")  private WebElement firstItem;


    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void clickOnTodaysDeals(){
todaysDeal.click();
    }
    public void clickOnThirdItem(){
        thirdItem.click();
    }

        public void selectFirstItem(){
firstItem.click();
        }

}
