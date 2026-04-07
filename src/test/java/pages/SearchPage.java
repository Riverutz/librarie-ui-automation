package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='css_cautare_inner_input']")
    private WebElement searchField;

    @FindBy(xpath = "//span[@class='css_cautare_rezultate_total']")
    private WebElement searchResultsTotal;

    public void clickSearchField(String query){
        elementsMethods.clickElement(searchField);
        elementsMethods.clearAndType(searchField, query);
        elementsMethods.pressElement(searchField, Keys.ENTER);
    }

    public boolean hasResults() {
        return elementsMethods.isElementDisplayed(searchResultsTotal);
    }
}
