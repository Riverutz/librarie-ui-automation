package pages;

import objectdata.LoginObject;
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

    @FindBy(xpath = "//div[@class='css_info']")
    private WebElement logoutConfirmation;


    public void clickMyAccountLink() {
        elementsMethods.clickElement(myAccountLink);
    }

    public void fillLoginForm(LoginObject testData) {
        elementsMethods.fillElement(emailField, testData.getEmail());
        elementsMethods.fillElement(passwordField, testData.getPassword());
    }

    public void clickSubmitButton(){
        elementsMethods.clickElement(submitButton);
    }

    public boolean isLogoutLinkDisplayed() {
        return elementsMethods.isElementDisplayed(logoutLink);
    }

    public void clickLogout(){
        elementsMethods.clickElement(logoutLink);
    }

    public boolean isLoggedOut(){
        return elementsMethods.isElementDisplayed(logoutConfirmation);
    }
}
