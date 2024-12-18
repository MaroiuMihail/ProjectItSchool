package testsEmag;

import org.testng.annotations.Test;
import pages.EmagCookiesPage;
import pages.EmagHomePage;
import pages.EmagLoginPage;
import sharedData.EmagSharedData;

public class EmagLogInTest extends EmagSharedData {

    @Test
    public void metodaTest() {

        EmagCookiesPage emagCookiesPage = new EmagCookiesPage(getDriver());
        emagCookiesPage.clickCookiesAccept();

        EmagHomePage homePage = new EmagHomePage(getDriver());
        homePage.clickContulMeu();

        EmagLoginPage loginPage = new EmagLoginPage(getDriver());
        loginPage.clickUserEmail();

        String emailRegisterValue = "mihai_maroiu01@gmail.com";
        loginPage.fillUserInfo(emailRegisterValue);

        loginPage.clickContinueButton();
    }
}
