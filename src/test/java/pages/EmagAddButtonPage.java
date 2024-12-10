package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagAddButtonPage extends EmagBasePage {
    public EmagAddButtonPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='btn btn-xl btn-primary btn-emag btn-block main-button gtm_680klw yeahIWantThisProduct']")
    private WebElement phoneItem;
    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm btn-block']")
    private WebElement seeCartDetails;
    @FindBy(xpath = "//*[@class='em em-close hidden-xs gtm_6046yfqs']")
    private WebElement closeCart;
    @FindBy(xpath = "//*[@class=' btn btn-emag btn-secondary font-size-md btn-block btn-lg gtm_sn11312018']")
    private WebElement checkOutButton;
    @FindBy(xpath = "//*[@data-id='8667458']//*[@class='line-item line-item-footer hidden-xs hidden-sm']//*[@class='btn btn-link btn-remove-product gtm_rp080219 remove-product']")
    private WebElement deleteItem;
    @FindBy(xpath = "//*[@class='gtm_t95ovv']")
    private WebElement favoriteItem;

    public void clickAddToCart() {
        clickMethods.clickJSElement(phoneItem);
    }

    public void clickCartDetails() {
        clickMethods.clickJSElement(seeCartDetails);
    }

    public void closeCartTab() {
        clickMethods.clickElement(closeCart);
    }

    public void clickCheckOutButton() {
        clickMethods.clickJSElement(checkOutButton);
    }

    public void clickDeleteItem(){
        clickMethods.clickJSElement(deleteItem);
    }

    public void clickAddToFavorite(){
        clickMethods.clickJSElement(favoriteItem);
    }
}
