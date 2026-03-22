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
    private WebElement firstNameField;

    @FindBy(xpath = "//input[@name='ua_prenume']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@name='ua_strada']")
    private WebElement streetField;

    @FindBy(xpath = "//input[@name='ua_nr']")
    private WebElement streetNumberField;




    public void clickAddressLink() {
        elementsMethods.clickElement(addressLink);
    }

    public void clickAddNewAddressButton() {
        elementsMethods.clickElement(addNewAddressButton);
    }

}
