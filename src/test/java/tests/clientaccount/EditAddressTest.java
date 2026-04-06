package tests.clientaccount;

import base.BaseTest;
import objectdata.AddressObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddressPage;

public class EditAddressTest extends BaseTest {

    private AddressPage addressPage;

    @BeforeMethod
    public void setUpAddress() {
        AddressObject originalData = new AddressObject("testdata/addressData.json");
        loginAsUser();
        addressPage = new AddressPage(getDriver());
        addressPage.clickAddressLink();
        addressPage.clickAddNewAddressButton();
        addressPage.fillAddressForm(originalData);
        addressPage.clickSubmitAddress();
    }

    @Test
    public void editAddressTest() {
        AddressObject editData = new AddressObject("testdata/editAddressData.json");
        addressPage.clickSavedAddress();
        addressPage.editAddressForm(editData);
        Assert.assertTrue(addressPage.isAddressEdited(), "Edit failed");
    }

    @AfterMethod
    public void cleanUpAddress() {
        addressPage.clickDeleteAddress();
        addressPage.clickConfirmDeleteAddress();
    }
}

