import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class AddtoCart {

  @FindBy(xpath="//a[@class='a-size-base a-color-base a-link-normal a-text-normal'][1]") private WebElement FirstItem;

    @FindBy(xpath="//input[@id='add-to-cart-button']") private WebElement addcart;

    @FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']") private WebElement Gotocart;


    public AddtoCart(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public WebElement clickOnItem()
    {

        return FirstItem;
    }




    public WebElement addToCart() {
return addcart;

    }

    public WebElement getGoToCart()
    {
        return Gotocart;
    }
}
