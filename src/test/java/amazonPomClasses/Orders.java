package amazonPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders {
    @FindBy(xpath="//a[@id=\"nav-orders\"]") private WebElement yourOrders;
    @FindBy(xpath="//span[@id=\"a-autoid-1-announce\"]") private WebElement dropDown;
    @FindBy(xpath="//a[@id=\"time-filter_2\"]") private WebElement pastYear;


    public Orders(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickOnYourOrders(){
        yourOrders.click();
    }

    public void clickOnDropDown(){
        dropDown.click();
    }
    public void selectPastOneYear(){
        pastYear.click();
    }

}
