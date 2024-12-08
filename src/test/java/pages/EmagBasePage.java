package pages;

import helpMethods.ClickMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EmagBasePage {

    public WebDriver driver;
    public ClickMethods clickMethods;

    public EmagBasePage(WebDriver driver){
        this.driver = driver;
        clickMethods = new ClickMethods(this.driver);
        PageFactory.initElements(this.driver, this);

    }
}

