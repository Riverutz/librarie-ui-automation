package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //    automationtestingemail4@gmail.com
    //    PvwdNcob

    @FindBy(xpath = "//a[@title='CONT CLIENT']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@name='email']")
    private WebElement emailField;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@title='Logout']")
    private WebElement logoutLink;


    public void clickMyAccountLink() {
        elementsMethods.clickElement(myAccountLink);
    }

    public void fillEmail() {
        String emailValue = "automationtestingemail4@gmail.com";
        elementsMethods.fillElement(emailField, emailValue);
    }

    public void fillPassword(){
        String passwordValue = "PvwdNcob";
        elementsMethods.fillElement(passwordField, passwordValue);
    }

    public void clickSubmitButton(){
        elementsMethods.clickElement(submitButton);
    }

    public boolean isLogoutLinkDisplayed() {
        return elementsMethods.isElementDisplayed(logoutLink);
    }
}
