package amazonPomClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
//@FindBy (xpath = "//a[@data-testid=\"cpe-yourAccount-header\"]") private WebElement yourAccount;
@FindBy(xpath = "(//div[@class=\"a-box ya-card--rich\"])[4]") private WebElement yourAddress;
@FindBy (xpath="//div[@class=\"a-box first-desktop-address-tile\"]") private WebElement addAddress;
@FindBy (xpath="//input[@id=\"address-ui-widgets-enterAddressFullName\"]") private WebElement name;
@FindBy (xpath="//input[@id=\"address-ui-widgets-enterAddressPhoneNumber\"]") private WebElement mobileNo;
@FindBy (xpath="//input[@id=\"address-ui-widgets-enterAddressPostalCode\"]") private WebElement pincode;
@FindBy (xpath="//input[@id=\"address-ui-widgets-enterAddressLine1\"]") private WebElement houseNo;

@FindBy (xpath="//input[@id=\"address-ui-widgets-enterAddressLine2\"]") private WebElement area;

@FindBy (xpath="//input[@id=\"address-ui-widgets-landmark\"]") private WebElement landMark;

@FindBy (xpath="//span[@id=\"address-ui-widgets-form-submit-button\"]") private WebElement submitAddress;

@FindBy (xpath = "//div[@id=\"ya-myab-display-address-block-0\"]") private  WebElement verifyAddress;

@FindBy (xpath = "//span[@id=\"address-ui-widgets-FullName\"]") private WebElement verifyName;



public  Address(WebDriver driver){

    PageFactory.initElements(driver,this);
}


//public void clickOnYourAccount(){
//    yourAccount.click();
//}

public void clickOnYourAddress() {
    yourAddress.click();
}
    public void clickOnAddAddress(){
addAddress.click();
    }

public WebElement enterName(){
    return name;
}

    public WebElement enterMobileNo (){
        return mobileNo;
    }

    public WebElement enterPincode (){
        return pincode;
    }

    public WebElement enterHouseNo (){
        return houseNo;
    }

    public WebElement  enterArea(){
        return area;
    }

    public WebElement  enterLandMark(){
        return landMark;
    }

    public void clickOnSubmitBtn(){
    submitAddress.click();
    }

    public void verifyAddressAdded(){
    String address=verifyAddress.getText();
    System.out.println(address);

    String actual=verifyName.getText();
    String expected="Prashant Veer";
        Assert.assertEquals(expected,actual);


    }
}
