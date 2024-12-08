package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagSearchBar extends EmagBasePage {
    public EmagSearchBar(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "searchboxTrigger")
    private WebElement searchItemElement;
    @FindBy(xpath = "//button[@class='btn btn-default searchbox-submit-button']")
    private WebElement confirmButton;

    public void itemSearch(String searchItemValue) {
        clickMethods.fillElement(searchItemElement, searchItemValue);
    }

    public void searchButton() {
        clickMethods.clickJSElement(confirmButton);
    }
}
