package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickMyAccountLink();
        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickSubmitButton();
        Assert.assertTrue(loginPage.isLogoutLinkDisplayed(), "Login failed - logout link not visible");    }
}
