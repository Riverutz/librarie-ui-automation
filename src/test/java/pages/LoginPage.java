package pages;

import objectdata.LoginObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtility;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@title='CONT CLIENT']")
    private WebElement myAccountLink;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@name='email']")
    private WebElement loginEmailField;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@name='password']")
    private WebElement loginPasswordField;

    @FindBy(xpath = "//div[b[text()='LOGIN CONT EXISTENT']]//input[@type='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@title='Logout']")
    private WebElement logoutLink;

    @FindBy(xpath = "//div[@class='css_info']")
    private WebElement logoutConfirmation;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement profileEmailField;


    public void login(LoginObject testData) {
        LoggerUtility.info("Navigating to account page");
        elementsMethods.clickElement(myAccountLink);
        LoggerUtility.info("Filling login form with email: " + testData.getEmail());
        elementsMethods.fillElement(loginEmailField, testData.getEmail());
        elementsMethods.fillElement(loginPasswordField, testData.getPassword());
        LoggerUtility.info("Submitting login form");
        elementsMethods.clickElement(submitButton);
    }

    public void clickLogout() {
        LoggerUtility.info("Clicking logout link");
        elementsMethods.clickElement(logoutLink);
    }

    public boolean isLogoutVisible() {
        LoggerUtility.info("Checking if logout link is visible");
        return elementsMethods.isElementDisplayed(logoutLink);
    }

    public boolean isLoggedOut() {
        LoggerUtility.info("Checking if logout confirmation is displayed");
        return elementsMethods.isElementDisplayed(logoutConfirmation);
    }

    public String getLoggedInEmail() {
        LoggerUtility.info("Getting logged in email");
        return profileEmailField.getAttribute("value");
    }
}
