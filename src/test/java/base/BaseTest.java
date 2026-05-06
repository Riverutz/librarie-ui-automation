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
import utils.ScreenshotUtility;

public class BaseTest {
    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    @BeforeMethod
    public void setUp() {
        LoggerUtility.info("Starting browser and navigating to librarie.net");
        driver.set(new ChromeDriver());
        driver.get().get("https://www.librarie.net/");
        driver.get().manage().window().maximize();

        try {
            driver.get().findElement(By.id("cookiescript_accept")).click();
            LoggerUtility.info("Cookie banner accepted");
        } catch (Exception ignored) {
            LoggerUtility.warn("Cookie banner not found, skipping");
        }
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            LoggerUtility.error("Test failed: " + result.getName());
        }
        LoggerUtility.info("Closing browser");
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
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