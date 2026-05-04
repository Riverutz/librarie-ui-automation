package pages;

import objectdata.AddressObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtility;

public class AddressPage extends BasePage {
    public AddressPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='Adrese']")
    private WebElement addressLink;

    @FindBy(xpath = "//button[@class='css_form_button']")
    private WebElement addNewAddressButton;

    @FindBy(xpath = "//input[@name='ua_nume']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='ua_prenume']")
    private WebElement firstNameField;

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

    @FindBy(xpath = "//div[@class='css_info']")
    private WebElement addressConfirmationMessage;

    @FindBy(xpath = "//div[@class='css_client_adresa']")
    private WebElement savedAddressCard;

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
    private WebElement editConfirmation;


    public void clickAddressLink() {
        LoggerUtility.info("Clicking 'Adrese' link");
        elementsMethods.clickElement(addressLink);
    }

    public void clickAddNewAddressButton() {
        LoggerUtility.info("Opening 'Add New Address' form");
        elementsMethods.clickElement(addNewAddressButton);
    }

    public void fillAddressForm(AddressObject testData) {
        LoggerUtility.info("Filling address form");

        LoggerUtility.info("Entering last name: " + testData.getLastName());
        elementsMethods.fillElement(lastNameField, testData.getLastName());

        LoggerUtility.info("Entering first name: " + testData.getFirstName());
        elementsMethods.fillElement(firstNameField, testData.getFirstName());

        LoggerUtility.info("Entering street: " + testData.getStreet());
        elementsMethods.fillElement(streetField, testData.getStreet());

        LoggerUtility.info("Entering street number: " + testData.getStreetNumber());
        elementsMethods.fillElement(streetNumberField, testData.getStreetNumber());

        LoggerUtility.info("Entering block: " + testData.getBlockNumber());
        elementsMethods.fillElement(blockNumberField, testData.getBlockNumber());

        LoggerUtility.info("Entering stairs: " + testData.getStairsNumber());
        elementsMethods.fillElement(stairsNumberField, testData.getStairsNumber());

        LoggerUtility.info("Entering apartment: " + testData.getApartmentNumber());
        elementsMethods.fillElement(apartmentNumberField, testData.getApartmentNumber());

        LoggerUtility.info("Entering delivery details");
        elementsMethods.fillElement(deliveryDetailsField, testData.getDeliveryDetails());

        LoggerUtility.info("Entering postal code: " + testData.getPostalCode());
        elementsMethods.fillElement(postalCodeField, testData.getPostalCode());

        LoggerUtility.info("Entering city: " + testData.getCity());
        elementsMethods.fillElement(cityField, testData.getCity());

        pageMethods.scrollPage(0, 350);

        LoggerUtility.info("Selecting county: " + testData.getCounty());
        elementsMethods.selectByTextElement(countyDropdown, testData.getCounty());

        LoggerUtility.info("Selecting country: " + testData.getCountry());
        elementsMethods.selectByTextElement(countryDropdown, testData.getCountry());
        pageMethods.scrollPage(0, 350);
    }

    public void clickSubmitAddress() {
        LoggerUtility.info("Submitting address");
        elementsMethods.clickElement(submitAddressButton);
    }

    public String getConfirmationMessage() {
        LoggerUtility.info("Reading address confirmation message");
        return elementsMethods.getText(addressConfirmationMessage);
    }

    public void clickSavedAddress() {
        LoggerUtility.info("Selecting saved address");
        elementsMethods.clickElement(savedAddressLink);
    }

    public void clickDeleteAddress() {
        LoggerUtility.info("Clicking 'Delete Address' button");
        elementsMethods.clickElement(deleteAddressButton);
    }

    public void clickConfirmDeleteAddress() {
        LoggerUtility.info("Confirming address deletion");
        elementsMethods.clickElement(confirmDeleteAddressButton);
    }

    public void editAddressForm(AddressObject testData) {
        LoggerUtility.info("Editing address form");
        elementsMethods.clearAndType(lastNameField, testData.getLastName());
        elementsMethods.clearAndType(firstNameField, testData.getFirstName());
        elementsMethods.clearAndType(streetField, testData.getStreet());
        elementsMethods.clearAndType(streetNumberField, testData.getStreetNumber());
        elementsMethods.clearAndType(blockNumberField, testData.getBlockNumber());
        elementsMethods.clearAndType(stairsNumberField, testData.getStairsNumber());
        elementsMethods.clearAndType(apartmentNumberField, testData.getApartmentNumber());
        elementsMethods.clearAndType(deliveryDetailsField, testData.getDeliveryDetails());
        elementsMethods.clearAndType(postalCodeField, testData.getPostalCode());
        elementsMethods.clearAndType(cityField, testData.getCity());

        pageMethods.scrollPage(0, 350);
        LoggerUtility.info("Selecting county: " + testData.getCounty());
        elementsMethods.selectByTextElement(countyDropdown, testData.getCounty());

        LoggerUtility.info("Selecting country: " + testData.getCountry());
        elementsMethods.selectByTextElement(countryDropdown, testData.getCountry());

        LoggerUtility.info("Saving address changes");
        pageMethods.scrollPage(0, 350);
        elementsMethods.clickElement(saveChangesButton);

        pageMethods.scrollPage(0, 450);
    }

    public String getDeleteConfirmationMessage() {
        LoggerUtility.info("Reading delete confirmation message");
        return elementsMethods.getText(addressDeletedConfirmation);
    }

    public String getEditConfirmationMessage() {
        LoggerUtility.info("Reading edit confirmation message");
        return elementsMethods.getText(editConfirmation);
    }
}

