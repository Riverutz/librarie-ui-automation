package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.AddressPage;
import pages.LoginPage;

public class AddressTest extends BaseTest {

    @Test
    public void addressTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickMyAccountLink();
        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.clickSubmitButton();

        AddressPage addressPage = new AddressPage(getDriver());
        addressPage.clickAddressLink();
        addressPage.clickAddNewAddressButton();
    }
}
