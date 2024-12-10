package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagCookiesPage extends EmagBasePage{
    public EmagCookiesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-block js-accept gtm_h76e8zjgoo']")
    private WebElement cookiesAccept;

    public void clickCookiesAccept(){
        clickMethods.clickJSElement(cookiesAccept);
    }
}
