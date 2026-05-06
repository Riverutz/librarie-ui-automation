package utils;

import base.BaseTest;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.ByteArrayInputStream;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();

        if (testInstance instanceof BaseTest baseTest) {
            WebDriver driver = baseTest.getDriver();

            if (driver != null) {
                byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);

                // ✅ FIXED: proper Allure attachment
                Allure.getLifecycle().addAttachment(
                        "Failure - " + result.getName(),
                        "image/png",
                        "png",
                        new ByteArrayInputStream(screenshot)
                );

                LoggerUtility.error("Screenshot captured for failed test: " + result.getName());
            }
        }
    }
}