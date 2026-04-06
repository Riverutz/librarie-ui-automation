package pages;

import objectdata.AddressObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Adrese']")
    private WebElement addressLink;

    @FindBy(xpath = "//button[@class='css_form_button']")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//button[text()='Persoana Fizica']")
    private WebElement individualPersonButton;

    @FindBy(xpath = "//input[@name='ua_nume']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='ua_prenume']")
    private WebElement fistNameField;

    @FindBy(xpath = "//input[@name='ua_strada']")
    private WebElement streetField;

    @FindBy(xpath = "//input[@name='ua_nr']")
    private WebElement streetNumberField;

    @FindBy(xpath = " //input[@name='ua_bl']")
    private WebElement blockNumberField;

    @FindBy(xpath = "//input[@name='ua_sc']")
    private WebElement stairsNumberField;

    @FindBy(xpath = "//input[@name='ua_ap']")
    private WebElement apartmentNumberField;

    @FindBy(xpath = "//input[@name='ua_detalii_livrare']")
    private WebElement deliveryDetailsField;

    @FindBy(xpath = "//input[@name='ua_cod']")
    private WebElement postalCodeField;

    @FindBy(xpath = "//input[@name='ua_oras']")
    private WebElement cityField;

    @FindBy(xpath = "//select[@name='ua_j_id']")
    private WebElement countyDropdown;

    @FindBy(xpath = "//select[@name='ua_t_id']")
    private WebElement countryDropdown;

    @FindBy(xpath = "//input[@value='Adauga adresa']")
    private WebElement submitAddressButton;

    @FindBy(xpath = "//div[@class='css_client_adresa']")
    private WebElement savedAddressConfirmation;

    @FindBy(xpath = "//div[@class='css_client_adresa']//a")
    private WebElement savedAddressLink;

    @FindBy(xpath = "//input[@value='Sterge aceasta adresa']")
    private WebElement deleteAddressButton;

    @FindBy(xpath = "//div[@class='css_info' and text()='Adresa a fost stearsa!']")
    private WebElement addressDeletedConfirmation;

    @FindBy(xpath = "//button[text()='STERGE']")
    private WebElement confirmDeleteAddressButton;

    @FindBy(xpath = "//input[@value='Salveaza modificarile']")
    private WebElement saveChangesButton;

    @FindBy(xpath = "//div[@class='css_info' and text()='Modificarile au fost salvate!']")
    public WebElement editConfirmation;


    public void clickAddressLink() {
        elementsMethods.clickElement(addressLink);
    }

    public void clickAddNewAddressButton() {
        elementsMethods.clickElement(addNewAddressButton);
    }

    public void fillAddressForm(AddressObject testData) {
        elementsMethods.fillElement(lastNameField, testData.getLastName());
        elementsMethods.fillElement(fistNameField, testData.getFirstName());
        elementsMethods.fillElement(streetField, testData.getStreet());
        elementsMethods.fillElement(streetNumberField, testData.getStreetNumber());
        elementsMethods.fillElement(blockNumberField, testData.getBlockNumber());
        elementsMethods.fillElement(stairsNumberField, testData.getStairsNumber());
        elementsMethods.fillElement(apartmentNumberField, testData.getApartmentNumber());
        elementsMethods.fillElement(deliveryDetailsField, testData.getDeliveryDetails());
        elementsMethods.fillElement(postalCodeField, testData.getPostalCode());
        elementsMethods.fillElement(cityField, testData.getCity());
        pageMethods.scrollPage(0, 350);
        elementsMethods.selectByTextElement(countyDropdown, testData.getCounty());
        elementsMethods.selectByTextElement(countryDropdown, testData.getCountry());
        pageMethods.scrollPage(0, 350);
    }

    public void clickSubmitAddress() {
        elementsMethods.clickElement(submitAddressButton);
    }

    public boolean isAddressSaved() {
        return elementsMethods.isElementDisplayed(savedAddressConfirmation);
    }

    public void clickSavedAddress() {
        elementsMethods.clickElement(savedAddressLink);
    }

    public void clickDeleteAddress() {
        elementsMethods.clickElement(deleteAddressButton);
    }

    public boolean isAddressDeleted() {
        return elementsMethods.isElementDisplayed(addressDeletedConfirmation);
    }

    public void clickConfirmDeleteAddress() {
        elementsMethods.clickElement(confirmDeleteAddressButton);
    }

    public void editAddressForm(AddressObject testData) {
        elementsMethods.clearAndType(lastNameField, testData.getLastName());
        elementsMethods.clearAndType(fistNameField, testData.getFirstName());
        elementsMethods.clearAndType(streetField, testData.getStreet());
        elementsMethods.clearAndType(streetNumberField, testData.getStreetNumber());
        elementsMethods.clearAndType(blockNumberField, testData.getBlockNumber());
        elementsMethods.clearAndType(stairsNumberField, testData.getStairsNumber());
        elementsMethods.clearAndType(apartmentNumberField, testData.getApartmentNumber());
        elementsMethods.clearAndType(deliveryDetailsField, testData.getDeliveryDetails());
        elementsMethods.clearAndType(postalCodeField, testData.getPostalCode());
        elementsMethods.clearAndType(cityField, testData.getCity());
        elementsMethods.selectByTextElement(countyDropdown, testData.getCounty());
        elementsMethods.selectByTextElement(countryDropdown, testData.getCountry());
        pageMethods.scrollPage(0, 350);
        elementsMethods.clickElement(saveChangesButton);
        pageMethods.scrollPage(0, 450);

    }

    public boolean isAddressEdited() {
        return elementsMethods.isElementDisplayed(editConfirmation);
    }
}

