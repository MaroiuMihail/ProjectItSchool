package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends EmagBasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='btn btn-xl btn-primary btn-emag btn-block main-button gtm_680klw yeahIWantThisProduct']")
    private WebElement phoneItem;
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm btn-block']")
    private WebElement seeCartDetails;

    public void clickAddToCart(){
        clickMethods.clickJSElement(phoneItem);
    }

    public void clickCartDetails(){
        clickMethods.clickJSElement(seeCartDetails);
    }
}
