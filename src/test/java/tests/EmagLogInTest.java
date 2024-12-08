package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ValueLoginPage;
import sharedData.SharedData;

public class EmagLogInTest extends SharedData {

    private static final Logger log = LoggerFactory.getLogger(EmagLogInTest.class);

    @Test
    public void metodaTest(){
        HomePage homePage = new HomePage(getDriver());
        homePage.clickContulMeu();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickUserEmail();

        String emailRegisterValue = "mihai_maroiu01@gmail.com";

        ValueLoginPage valueLoginPage = new ValueLoginPage(getDriver());
        valueLoginPage.fillUserInfo(emailRegisterValue);

        loginPage.clickContinueButton();
    }
}
