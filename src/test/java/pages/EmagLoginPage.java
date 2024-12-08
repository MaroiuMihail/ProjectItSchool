package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmagLoginPage extends EmagBasePage {
    public EmagLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "user_login_email")
    private WebElement emailLoginElement;
    @FindBy(id = "user_login_email")
    private WebElement emailRegisterElement;
    @FindBy(id = "user_login_continue")
    private WebElement emailContinueElement;


    public void clickUserEmail(){
        clickMethods.clickElement(emailLoginElement);
    }

    public void clickContinueButton(){
        clickMethods.clickElement(emailContinueElement);
    }

    public void fillUserInfo(String emailRegisterValue){
        clickMethods.fillElement(emailRegisterElement, emailRegisterValue);
    }
}
