package amazonPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.desktop.SystemEventListener;

public class PrimeCheckBox {
    @FindBy(xpath="//a[@data-csa-c-content-id=\"nav_cs_electronics\"]") private WebElement electronics;
    @FindBy(xpath="(//i[@class=\"a-icon a-icon-checkbox\"])[2]") private WebElement checkBox;
    @FindBy(xpath="(//div[@class=\"a-row s-align-children-center\"])[1]") private WebElement firstItem;

    public PrimeCheckBox(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickOnElectronics(){
        electronics.click();
    }
    public void selectCheckBox(){
        checkBox.click();
    }
    public void getDateOfItem(){
        String date=firstItem.getText();
        System.out.println("Date of first item is "+date);
    }

}
