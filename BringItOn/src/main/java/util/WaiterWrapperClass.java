package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaiterWrapperClass {

    public static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static WebElement waitForElement(WebDriver driver, WebElement webElement) {
        return new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOf(webElement));
    }
}
