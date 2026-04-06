package tests.clientaccount;

import base.BaseTest;
import objectdata.AddressObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;

public class DeleteAddressTest extends BaseTest {

    @Test
    public void deleteAddressTest() {
        AddressObject testData = new AddressObject("testdata/addressData.json");
        loginAsUser();

        AddressPage addressPage = new AddressPage(getDriver());
        addressPage.clickAddressLink();
        addressPage.clickAddNewAddressButton();
        addressPage.fillAddressForm(testData);
        addressPage.clickSubmitAddress();
        Assert.assertTrue(addressPage.isAddressSaved(), "Address was not saved successfully");
        addressPage.clickSavedAddress();
        addressPage.clickDeleteAddress();
        addressPage.clickConfirmDeleteAddress();
        Assert.assertTrue(addressPage.isAddressDeleted(), "Address was not deleted successfully");
    }
}
