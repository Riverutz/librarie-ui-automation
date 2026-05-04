package tests.clientaccount;

import base.BaseTest;
import objectdata.AddressObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddressPage;

public class DeleteAddressTest extends BaseTest {

    @Test
    public void userShouldBeAbleToDeleteAddress() {
        AddressObject testData = new AddressObject("testdata/addressData.json");
        loginAsUser();

        AddressPage addressPage = new AddressPage(getDriver());
        addressPage.clickAddressLink();
        addressPage.clickAddNewAddressButton();
        addressPage.fillAddressForm(testData);
        addressPage.clickSubmitAddress();
        Assert.assertEquals(addressPage.getConfirmationMessage(), "Adresa a fost adaugata!", "Confirmation message is incorrect");
        addressPage.clickSavedAddress();
        addressPage.clickDeleteAddress();
        addressPage.clickConfirmDeleteAddress();
        Assert.assertEquals(addressPage.getDeleteConfirmationMessage(), "Adresa a fost stearsa!", "Address was not deleted successfully");
    }
}
