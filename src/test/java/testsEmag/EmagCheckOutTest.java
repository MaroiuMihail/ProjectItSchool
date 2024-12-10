package testsEmag;

import org.testng.annotations.Test;
import pages.*;
import sharedData.EmagSharedData;

public class EmagCheckOutTest extends EmagSharedData {

    @Test
    public void metodaTest() {

        EmagCookiesPage emagCookiesPage = new EmagCookiesPage(getDriver());
        emagCookiesPage.clickCookiesAccept();

        EmagHomePage homePageEmag = new EmagHomePage(getDriver());
        homePageEmag.clicksearchBar();

        String searchItemValue = "telefon";
        EmagSearchBar searchBarEmag = new EmagSearchBar(getDriver());
        searchBarEmag.itemSearch(searchItemValue);

        searchBarEmag.searchButton();

        EmagItemPage emagItemPage = new EmagItemPage(getDriver());
        emagItemPage.clickItemButton();

        EmagAddButtonPage addtoEmagAddButtonPage = new EmagAddButtonPage(getDriver());
        addtoEmagAddButtonPage.clickAddToCart();
        addtoEmagAddButtonPage.closeCartTab();

        emagItemPage.clickBlueItemButton();
        addtoEmagAddButtonPage.clickAddToCart();

        addtoEmagAddButtonPage.clickCartDetails();
        addtoEmagAddButtonPage.clickDeleteItem();

        addtoEmagAddButtonPage.clickCheckOutButton();
    }
}



