package testsEmag;

import org.testng.annotations.Test;
import pages.HomePageEmag;
import pages.SearchBarEmag;
import sharedData.EmagSharedData;

public class EmagItems extends EmagSharedData {

    @Test
    public void metodaTest(){

        HomePageEmag homePageEmag = new HomePageEmag(getDriver());
        homePageEmag.clicksearchBar();

        String searchItemValue = "telefon";
        SearchBarEmag searchBarEmag = new SearchBarEmag(getDriver());
        searchBarEmag.itemSearch(searchItemValue);

        searchBarEmag.searchButton();
    }
}
