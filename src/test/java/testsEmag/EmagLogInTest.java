package testsEmag;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.HomePageEmag;
import pages.LoginPageEmag;
import pages.ValueLoginPageEmag;
import sharedData.EmagSharedData;

public class EmagLogInTest extends EmagSharedData {

    private static final Logger log = LoggerFactory.getLogger(EmagLogInTest.class);

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
