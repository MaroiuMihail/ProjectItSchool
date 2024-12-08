package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagHomePage extends EmagBasePage {
    public EmagHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "my_account")
    private WebElement contulMeu;
    @FindBy(id = "searchboxTrigger")
    private WebElement searchBarTab;

    public void clickContulMeu() {
        clickMethods.clickJSElement(contulMeu);
    }

    public void clicksearchBar() {
        clickMethods.clickElement(searchBarTab);
    }
}