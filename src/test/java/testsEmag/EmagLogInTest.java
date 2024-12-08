package testsEmag;

import org.testng.annotations.Test;
import pages.HomePageEmag;
import pages.LoginPageEmag;
import pages.ValueLoginPageEmag;
import sharedData.EmagSharedData;

public class EmagLogInTest extends EmagSharedData {

    @Test
    public void metodaTest(){
        HomePageEmag homePage = new HomePageEmag(getDriver());
        homePage.clickContulMeu();

        LoginPageEmag loginPage = new LoginPageEmag(getDriver());
        loginPage.clickUserEmail();

        String emailRegisterValue = "mihai_maroiu01@gmail.com";

        ValueLoginPageEmag valueLoginPage = new ValueLoginPageEmag(getDriver());
        valueLoginPage.fillUserInfo(emailRegisterValue);

        loginPage.clickContinueButton();
    }
}
