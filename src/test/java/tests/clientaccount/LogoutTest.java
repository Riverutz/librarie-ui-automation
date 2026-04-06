package tests.clientaccount;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTest(){
        loginAsUser();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickLogout();
        Assert.assertTrue(loginPage.isLoggedOut(), "Logout failed");
    }
}
