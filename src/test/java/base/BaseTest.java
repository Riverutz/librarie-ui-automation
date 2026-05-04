package base;

import objectdata.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utils.LoggerUtility;

public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setUp() {
        LoggerUtility.info("Starting browser and navigating to librarie.net");
        driver = new ChromeDriver();
        driver.get("https://www.librarie.net/");
        driver.manage().window().maximize();

        try {
            driver.findElement(By.id("cookiescript_accept")).click();
            LoggerUtility.info("Cookie banner accepted");
        } catch (Exception ignored) {
            LoggerUtility.warn("Cookie banner not found, skipping");
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            LoggerUtility.info("Closing browser");
        }
        if (driver != null) {
            driver.quit();
            LoggerUtility.info("Browser closed successfully");
        }
    }

    public LoginPage loginAsUser() {
        LoggerUtility.info("Logging in as user");
        LoginObject loginData = new LoginObject("testdata/loginData.json");
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login(loginData);
        return loginPage;
    }
}
