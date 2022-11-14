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

    @FindBy(xpath="//span[@class='a-size-base']") private WebElement addBank;
    @FindBy(xpath="(//i[@class=\"a-icon a-icon-radio\"])[1]") private WebElement checkBox;

    @FindBy(xpath="//input[@id=\"enterIFSCInput\"]") private WebElement ifsc;

    @FindBy(xpath="//button[@id=\"confirmIFSCButton\"]") private WebElement submitBtn;

    @FindBy(xpath="//input[@id='addBankAccountHolderName']") private WebElement name;

    @FindBy(xpath="//input[@id='addBankAccountNumber']") private WebElement accountNo;

    @FindBy(xpath="//input[@id='confirmAddBankAccountNumber']") private WebElement confirmAccount;

    @FindBy(xpath="(//span[@class=\"a-color-tertiary\"])[1]") private WebElement backYourAccount;

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

    public void clickOnManageCard(){
manageBankOption.click();
    }
    public void clickOnAddBank(){
        addBank.click();
    }
    public void clickOnCheckBox(){
checkBox.click();
    }
    public void inputToIFSC(){
ifsc.sendKeys("IBKL0001549");
submitBtn.click();
    }
    public void inputToHolderName(){
name.sendKeys("Prashant");
    }
    public void inputToAccountNumber(){
accountNo.sendKeys("123456789");
    }
    public void inputToConfirmAccountNumber(){
confirmAccount.sendKeys("123456789");
    }

    public void clickOnYourAccounts(){
backYourAccount.click();
    }

}
