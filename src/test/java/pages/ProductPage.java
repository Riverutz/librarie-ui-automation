package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtility;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='css_box_big_t']//h1")
    private WebElement bookTitle;

    @FindBy(xpath = "//td[b[text()='Autor(i):']]/following-sibling::td//a")
    private WebElement bookAuthor;

    @FindBy(xpath = "//td[@class='css_box_comanda_pret' and b[text()='Preț:']]/following-sibling::td")
    private WebElement bookPrice;

    @FindBy(xpath = "//div[@class='css_box_comanda_buton']")
    private WebElement addToCart;

    @FindBy(xpath = "//li[contains(text(),'Carte')]")
    private WebElement bookStock;

    @FindBy(xpath = "//a[@title='ADAUGA IN COS']")
    private WebElement addToCartButton;

    public boolean isBookPriceDisplayed() {
        LoggerUtility.info("Checking if book price is displayed");
        return elementsMethods.isElementDisplayed(bookPrice);
    }

    public boolean isAddToCartDisplayed() {
        LoggerUtility.info("Checking if add to cart button is displayed");
        return elementsMethods.isElementDisplayed(addToCart);
    }

    public boolean isBookStockDisplayed() {
        LoggerUtility.info("Checking if book stock is displayed");
        return elementsMethods.isElementDisplayed(bookStock);
    }

    public String getBookTitle() {
        LoggerUtility.info("Getting book title");
        return elementsMethods.getText(bookTitle);
    }

    public String getBookAuthor() {
        LoggerUtility.info("Getting book author");
        return elementsMethods.getText(bookAuthor);
    }

    public String getBookPrice() {
        LoggerUtility.info("Getting book price");
        return elementsMethods.getText(bookPrice);
    }

    public void addToCart(){
        elementsMethods.clickElement(addToCartButton);
    }
}

