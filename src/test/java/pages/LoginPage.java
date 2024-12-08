package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user_login_email")
    private WebElement emailLoginElement;
    @FindBy(id = "user_login_continue")
    private WebElement emailContinueElement;

    public void clickUserEmail(){
        clickMethods.clickElement(emailLoginElement);
    }

    public void clickContinueButton(){
        clickMethods.clickElement(emailContinueElement);
    }


}
