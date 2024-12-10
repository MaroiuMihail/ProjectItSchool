package testsEmag;

import org.testng.annotations.Test;
import pages.*;
import sharedData.EmagSharedData;

public class EmagFavoriteTest extends EmagSharedData {

    @Test
    public void metodaTest() {

        EmagCookiesPage emagCookiesPage = new EmagCookiesPage(getDriver());
        emagCookiesPage.clickCookiesAccept();

        EmagHomePage homePageEmag = new EmagHomePage(getDriver());
        homePageEmag.clicksearchBar();

        String searchItemValue = "laptop acer";
        EmagSearchBar searchBarEmag = new EmagSearchBar(getDriver());
        searchBarEmag.itemSearch(searchItemValue);

        searchBarEmag.searchButton();

        EmagFiltersPage emagFiltersPage = new EmagFiltersPage(getDriver());
        emagFiltersPage.clickOfferFilter();

        EmagPriceRange emagPriceRange = new EmagPriceRange(getDriver());
        emagPriceRange.clearMinimumPrice();
        String minimumPriceRangeValue = "2998";
        emagPriceRange.fillMinimumPriceRange(minimumPriceRangeValue);

        emagPriceRange.clearMaximumPrice();
        String maximumPriceRangeValue = "3001";
        emagPriceRange.fillMaximumPriceRangeElement(maximumPriceRangeValue);

        emagPriceRange.clickValidationPriceButton();

        EmagItemPage emagItemPage = new EmagItemPage(getDriver());
        emagItemPage.clickLaptop();

        EmagAddButtonPage emagAddButtonPage = new EmagAddButtonPage(getDriver());
        emagAddButtonPage.clickAddToFavorite();
    }
}
