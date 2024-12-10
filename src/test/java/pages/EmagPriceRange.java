package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagPriceRange extends EmagBasePage{
    public EmagPriceRange(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='form-control js-custom-price-min']")
    private WebElement minimumPriceRangeElement;
    @FindBy(xpath = "//*[@class='form-control js-custom-price-max']")
    private WebElement maximumPriceRangeElement;
    @FindBy(xpath = "//*[@class='em em-right']")
    private WebElement validationPrice;


    public void clearMinimumPrice(){
        clickMethods.clearElement(minimumPriceRangeElement);
    }

    public void fillMinimumPriceRange(String minimumPriceRangeValue){
        clickMethods.fillElement(minimumPriceRangeElement, minimumPriceRangeValue);
    }

    public void clearMaximumPrice(){
        clickMethods.clearElement(maximumPriceRangeElement);
    }

    public void fillMaximumPriceRangeElement(String maximumPriceRangeValue){
        clickMethods.fillElement(maximumPriceRangeElement, maximumPriceRangeValue);
    }

    public void clickValidationPriceButton(){
        clickMethods.clickJSElement(validationPrice);
    }
}
