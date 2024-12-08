package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagItemPage extends EmagBasePage{
    public EmagItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@alt='Telefon mobil Apple iPhone 13, 128GB, 5G, Midnight']")
    private WebElement colorBlackButton;
    @FindBy(xpath = "//*[@title='Albastru']")
    private WebElement colorBlueButton;


    public void clickItemButton(){
        clickMethods.clickJSElement(colorBlackButton);
    }

    public void clickBlueItemButton(){
        clickMethods.clickJSElement(colorBlueButton);
    }
}
