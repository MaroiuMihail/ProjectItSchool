package testsEmag;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.EmagHomePage;
import pages.EmagItemPage;
import pages.EmagSearchBar;
import sharedData.EmagSharedData;

public class EmagItems extends EmagSharedData {

    @Test
    public void metodaTest() {

        EmagHomePage homePageEmag = new EmagHomePage(getDriver());
        homePageEmag.clicksearchBar();

        String searchItemValue = "telefon";
        EmagSearchBar searchBarEmag = new EmagSearchBar(getDriver());
        searchBarEmag.itemSearch(searchItemValue);

        searchBarEmag.searchButton();

        EmagItemPage emagItemPage = new EmagItemPage(getDriver());
        emagItemPage.clickItemButton();

        CartPage addtoCartPage = new CartPage(getDriver());
        addtoCartPage.clickAddToCart();
        addtoCartPage.closeCartTab();

        emagItemPage.clickBlueItemButton();
        addtoCartPage.clickAddToCart();

        addtoCartPage.clickCartDetails();
        addtoCartPage.clickDeleteItem();

        addtoCartPage.clickCheckOutButton();
    }
}



