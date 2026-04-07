package tests.product;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductPage;

public class ProductPageTest extends BaseTest {

    @Test
    public void productPageTest() {
        getDriver().get("https://www.librarie.net/p/498789/secretul-secretelor");
        ProductPage productPage = new ProductPage(getDriver());

        Assert.assertTrue(productPage.isBookTitleDisplayed(), "Title not displayed");
        Assert.assertTrue(productPage.isBookAuthorDisplayed(), "Author not displayed");
        Assert.assertTrue(productPage.isBookPriceDisplayed(), "Price not displayed");
        Assert.assertTrue(productPage.isAddToCartDisplayed(), "Add to cart not displayed");
        Assert.assertTrue(productPage.isBookStockDisplayed(), "Stock not displayed");
    }
}
