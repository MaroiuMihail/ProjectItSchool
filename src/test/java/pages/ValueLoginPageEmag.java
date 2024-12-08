package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValueLoginPageEmag extends BasePageEmag {
    public ValueLoginPageEmag(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user_login_email")
    private WebElement emailRegisterElement;

    public void fillUserInfo(String emailRegisterValue){
        clickMethods.fillElement(emailRegisterElement, emailRegisterValue);

    }
}
