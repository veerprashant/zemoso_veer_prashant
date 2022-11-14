package amazonPomClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify {

    @FindBy (xpath="//input[@id='add-to-cart-button']") private WebElement addToCart;
    @FindBy (xpath="(//a[@class='a-button-text'])[3]") private WebElement goToCart;  //go to cart
//@FindBy (xpath="//span[@id='attach-sidesheet-view-cart-button']") private WebElement goToCart;   //cart
    @FindBy (xpath="//span[@data-a-class=\"quantity\"]") private WebElement verifyQuantity;

public Verify(WebDriver driver){
    PageFactory.initElements(driver,this);
}

public void clickOnAddToCart()  {
    addToCart.click();

}
    public void clickOnGoToCart() {
goToCart.click();
    }
    public void verifyQuantityInCart(){
   String actual = verifyQuantity.getText();
    String expected = "Qty:1";

        Assert.assertEquals(expected,actual);
    }
}
