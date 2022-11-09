package amazonPomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchMobiles {

    @FindBy (xpath = "//input[@id='twotabsearchtextbox']") private WebElement searchBar;
    @FindBy (xpath = "(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[23]") private WebElement lastItem;
    @FindBy (xpath = "//input[@id=\"nav-search-submit-button\"]") private WebElement search;

public SearchMobiles(WebDriver driver)
{
    PageFactory.initElements(driver,this);
}


public void inputToSearchBar(){
    searchBar.sendKeys("Mobiles");
    search.click();

}
public void getLastDisplayedInfo(){
  String details=  lastItem.getText();

  System.out.println(details);
}
public WebElement scrollToLastItem(){
    return  lastItem;
}

}
