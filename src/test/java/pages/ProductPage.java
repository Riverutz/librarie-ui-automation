package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public boolean isBookTitleDisplayed() {
        return elementsMethods.isElementDisplayed(bookTitle);

    }

    public boolean isBookAuthorDisplayed() {
        return elementsMethods.isElementDisplayed(bookAuthor);
    }

    public boolean isBookPriceDisplayed() {
        return elementsMethods.isElementDisplayed(bookPrice);
    }

    public boolean isAddToCartDisplayed() {
        return elementsMethods.isElementDisplayed(addToCart);
    }

    public boolean isBookStockDisplayed() {
        return elementsMethods.isElementDisplayed(bookStock);
    }
}

