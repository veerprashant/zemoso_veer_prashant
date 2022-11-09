package amazonPomClasses;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {

    @FindBy(xpath = "(//a[@class=\"a-link-normal\"])[1]") private WebElement yourAccount;
    @FindBy(xpath = "(//div[@class=\"a-box ya-card--rich\"])[5]") private WebElement paymentOptions;

    @FindBy(xpath="(//div[@class=\"a-box-inner\"])[3]") private WebElement manageBankOption;


    public Payment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void clickOnYourAccount(){
        yourAccount.click();
    }
    public void clickOnPaymentOptions(){
        paymentOptions.click();
    }

    public void verifyPaymentOption(){
        String actual=manageBankOption.getText();
        System.out.println(actual);
  String expected="Manage Bank Accounts";

        Assert.assertEquals(expected,actual);
    }


}
