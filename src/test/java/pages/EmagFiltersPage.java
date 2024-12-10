package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagFiltersPage extends EmagBasePage{
    public EmagFiltersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath= "//*[@class='js-filter-item filter-item' and @data-option-id='45']")
    private WebElement processorTypeFilter;


    public void clickOfferFilter() {
        clickMethods.clickJSElement(processorTypeFilter);
    }
}
