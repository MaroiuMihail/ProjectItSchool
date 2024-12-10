package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagItemPage extends EmagBasePage {
    public EmagItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@alt='Telefon mobil Apple iPhone 13, 128GB, 5G, Midnight']")
    private WebElement colorBlackPhone;
    @FindBy(xpath = "//*[@title='Albastru']")
    private WebElement colorBluePhone;
    @FindBy(xpath = "//img[contains(@alt, 'Laptop Acer Aspire 5')]")
    private WebElement laptopItemPage;

    public void clickItemButton() {
        clickMethods.clickJSElement(colorBlackPhone);
    }

    public void clickBlueItemButton() {
        clickMethods.clickJSElement(colorBluePhone);
    }

    public void clickLaptop(){
        clickMethods.clickJSElement(laptopItemPage);
    }
}
