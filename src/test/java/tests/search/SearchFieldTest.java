package tests.search;

import base.BaseTest;
import objectdata.SearchObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchFieldTest extends BaseTest {

    @Test
    public void searchFieldTest() {
        SearchObject searchData = new SearchObject("testdata/searchData.json");
        SearchPage searchPage = new SearchPage(getDriver());

        for (String query : searchData.getSearchQueries()) {
            searchPage.clickSearchField(query);
            Assert.assertTrue(searchPage.hasResults(), "No results for: " + query);
        }
    }
}
