package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.LoggerUtility;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='css_cautare_inner_input']")
    private WebElement searchField;

    @FindBy(xpath = "//span[@class='css_cautare_rezultate_total']")
    private WebElement searchResultsTotal;

    @FindBy(xpath = "(//div[@class='css_product_grid_text_top']//a)[1]")
    private WebElement firstSearchResult;

    public void clickSearchField(String query) {
        LoggerUtility.info("Searching for: " + query);
        elementsMethods.clickElement(searchField);
        elementsMethods.clearAndType(searchField, query);
        elementsMethods.pressElement(searchField, Keys.ENTER);
    }

    public boolean hasResults() {
        LoggerUtility.info("Checking if search results are displayed");
        return elementsMethods.isElementDisplayed(searchResultsTotal);
    }

    public void clickFirstResult() {
        LoggerUtility.info("Clicking first search result");
        elementsMethods.clickElement(firstSearchResult);
    }

    public int getResultsCount() {
        LoggerUtility.info("Getting search results count");
        String text = elementsMethods.getText(searchResultsTotal);
        return Integer.parseInt(text.split(" ")[0]);
    }
}
