package pages;

import helperMethods.ElementsMethods;
import helperMethods.PageMethods;
import helperMethods.WindowsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    protected ElementsMethods elementsMethods;
    protected PageMethods pageMethods;
    protected WindowsMethods windowsMethods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementsMethods = new ElementsMethods(driver);
        pageMethods = new PageMethods(driver);
        windowsMethods = new WindowsMethods(driver);
        PageFactory.initElements(driver, this);
    }
}

