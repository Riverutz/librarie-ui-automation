package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtility;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//img[@alt='COS']")
    private WebElement cartIcon;

    @FindBy(xpath = "//td[@class='css_cos_titlu']//a")
    private WebElement cartItemTitle;

    @FindBy(xpath = "//td[@class='css_cos_bucati']//input")
    private WebElement quantityInput;

    @FindBy(xpath = "//a[@title='RENUNTA LA PRODUS']")
    private WebElement removeItemButton;

    @FindBy(xpath = "//button[@class='css_cos_button_recalc']")
    private WebElement recalculateButton;

    @FindBy(xpath = "//div[@class='css_cos_gol']/b")
    private WebElement emptyCartMessage;

    public void navigateToCart() {
        LoggerUtility.info("Navigating to cart");
        elementsMethods.clickElement(cartIcon);
    }

    public String getCartItemTitle() {
        LoggerUtility.info("Getting cart item title");
        return elementsMethods.getText(cartItemTitle);
    }

    public void updateQuantity(String quantity) {
        LoggerUtility.info("Updating quantity to: " + quantity);
        elementsMethods.clearAndType(quantityInput, quantity);
    }

    public String getQuantityValue() {
        LoggerUtility.info("Getting quantity value");
        elementsMethods.waitForElementVisible(quantityInput);
        return quantityInput.getAttribute("value");
    }

    public void removeItem() {
        LoggerUtility.info("Removing item from cart");
        elementsMethods.clickElement(removeItemButton);
    }

    public void clickRecalculate() {
        LoggerUtility.info("Clicking recalculate button");
        elementsMethods.clickElement(recalculateButton);
    }

    public String getEmptyCartMessage() {
        LoggerUtility.info("Getting empty cart message");
        return elementsMethods.getText(emptyCartMessage);
    }

    public boolean isCartEmpty() {
        LoggerUtility.info("Checking if cart is empty");
        return elementsMethods.isElementDisplayed(emptyCartMessage);
    }
}
