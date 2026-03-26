package pages;

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

    @FindBy(xpath = "//select[@name='ua_bl']")
    private WebElement selectCounty;

    @FindBy(xpath = "//select[@name='ua_t_id']")
    private WebElement selectCountry;


    public void clickAddressLink() {
        elementsMethods.clickElement(addressLink);
    }

    public void clickAddNewAddressButton() {
        elementsMethods.clickElement(addNewAddressButton);
    }

//    public void fillLastName() {
//        elementsMethods.

    }

//}
