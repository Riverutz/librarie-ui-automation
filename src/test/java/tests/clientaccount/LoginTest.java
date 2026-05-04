package tests.clientaccount;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldBeLoggedInWithValidCredentials() {
        LoginPage loginPage = loginAsUser();

        Assert.assertTrue(loginPage.isLogoutVisible(), "Login failed - logout link not visible");
        Assert.assertEquals(loginPage.getLoggedInEmail(), "automationtestingemail4@gmail.com", "Logged in email is incorrect");
    }
}
