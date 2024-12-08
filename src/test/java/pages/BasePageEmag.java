package pages;

import helpMethods.ClickMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageEmag {

    public WebDriver driver;
    public ClickMethods clickMethods;

    public BasePageEmag(WebDriver driver){
        this.driver = driver;
        clickMethods = new ClickMethods(this.driver);
        PageFactory.initElements(this.driver, this);

    }
}

