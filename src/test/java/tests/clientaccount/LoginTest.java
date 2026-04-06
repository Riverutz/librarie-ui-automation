package tests.clientaccount;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        loginAsUser();
        LoginPage loginPage = new LoginPage(getDriver());
        Assert.assertTrue(loginPage.isLogoutLinkDisplayed(), "Login failed - logout link not visible");    }
}
