package tests.cart;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;
import pages.SearchPage;

public class CartTest extends BaseTest {

    private CartPage cartPage;

    @BeforeMethod
    public void setUpCart() {
        SearchPage searchPage = new SearchPage(getDriver());
        searchPage.clickSearchField("Secretul secretelor");
        searchPage.clickFirstResult();

        ProductPage productPage = new ProductPage(getDriver());
        productPage.addToCart();

        cartPage = new CartPage(getDriver());
        cartPage.navigateToCart();
    }

    @AfterMethod
    public void cleanUpCart() {
        cartPage.navigateToCart();
        if (!cartPage.isCartEmpty()) {
            cartPage.removeItem();
        }
    }

    @Test
    public void userShouldBeAbleToAddItemToCart() {
        Assert.assertEquals(cartPage.getCartItemTitle(), "Secretul secretelor", "Wrong item in cart");
    }

    @Test
    public void userShouldBeAbleToRemoveItemFromCart() {
        cartPage.removeItem();
        Assert.assertEquals(cartPage.getEmptyCartMessage(), "Coșul de cumpărături este gol!", "Cart is not empty after removing item");
    }

    @Test
    public void userShouldBeAbleToUpdateItemQuantity() {
        cartPage.updateQuantity("2");
        cartPage.clickRecalculate();
        Assert.assertEquals(cartPage.getQuantityValue(), "2", "Quantity was not updated correctly");
    }
}
