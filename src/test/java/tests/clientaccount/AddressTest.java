package tests.clientaccount;

import base.BaseTest;
import objectdata.AddressObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.AddressPage;
import utils.LoggerUtility;

public class AddressTest extends BaseTest {
    private AddressPage addressPage;

    @Test
    public void shouldCreateNewAddressSuccessfully() {
        AddressObject testData = new AddressObject("testdata/addressData.json");
        loginAsUser();

        addressPage = new AddressPage(getDriver());
        addressPage.clickAddressLink();
        addressPage.clickAddNewAddressButton();
        addressPage.fillAddressForm(testData);
        addressPage.clickSubmitAddress();
        Assert.assertEquals(addressPage.getConfirmationMessage(), "Adresa a fost adaugata!", "Confirmation message is incorrect");
    }

    @AfterMethod
    public void cleanUpAddress() {
        if (addressPage == null) {
            LoggerUtility.warn("addressPage is null, skipping cleanup");
            return;
        }
        addressPage.clickSavedAddress();
        addressPage.clickDeleteAddress();
        addressPage.clickConfirmDeleteAddress();
    }
}