package utils;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

    @Attachment(value = "{name}", type = "image/png")
    public static byte[] takeScreenshot(WebDriver driver, String name) {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            LoggerUtility.info("Screenshot taken: " + name);
            return screenshot;
        } catch (Exception e) {
            LoggerUtility.error("Failed to take screenshot: " + e.getMessage());
            return new byte[0];
        }
    }
}