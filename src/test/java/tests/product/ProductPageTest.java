package tests.product;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;
import pages.SearchPage;

public class ProductPageTest extends BaseTest {

    @Test
    public void productPageShouldDisplayAllRequiredElements() {
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickSearchField("Secretul secretelor");
        searchPage.clickFirstResult();

        ProductPage productPage = new ProductPage(getDriver());

        Assert.assertEquals(productPage.getBookTitle(), "Secretul secretelor", "Wrong book title");
        Assert.assertEquals(productPage.getBookAuthor(), "Dan Brown", "Wrong book author");
        Assert.assertTrue(productPage.isBookPriceDisplayed(), "Price not displayed");
        Assert.assertTrue(productPage.isAddToCartDisplayed(), "Add to cart not displayed");
        Assert.assertTrue(productPage.isBookStockDisplayed(), "Stock not displayed");
    }
}
