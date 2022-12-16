package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import settings.ECommerceSettings;

import java.util.List;

import static utils.DriverFactory.*;

public final class SharedSteps {
    private static final WebDriver driver = getDriver(ECommerceSettings.browserName);
    private static final WebDriverWait wait = getDriverWait();

    private static final Actions action = getDriverAction();

    public static void clickOnElement(By elementPath) {
        wait.until(ExpectedConditions.elementToBeClickable(elementPath)).click();
    }

    public static void clickOnElement(WebElement elementPath) {
        wait.until(ExpectedConditions.elementToBeClickable(elementPath)).click();
    }

    public static void clickOnElementByJavaScript(By elementPath) {
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(elementPath));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public static void clickOnCheckBox(By checkBoxPath) {
        action.click(driver.findElement(checkBoxPath)).build().perform();
    }

    public static void sendTextToElement(String text, By elementPath) {
        WebElement element = driver.findElement(elementPath);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public static void selectFromDropDownByVisibleText(String value, By dropDownPath) {
        findDropDownElement(dropDownPath).selectByVisibleText(value);
    }

    public static void selectFromDropDownByIndex(int index, By dropDownPath) {
        findDropDownElement(dropDownPath).selectByIndex(index);
    }

    public static void selectFromDropDownByValue(String value, By dropDownPath) {
        findDropDownElement(dropDownPath).selectByValue(value);
    }

    public static void navigateToPage(String url) {
        driver.navigate().to(url);
    }

    public static List<WebElement> findElements(By elementsPath) {
        return wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(elementsPath)));
    }

    public static WebElement findElement(By elementsPath) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(elementsPath)));
    }

    public static void moveToElement(WebElement element) {
        action.moveToElement(element).build().perform();
    }

    public static void refreshPage() {
        driver.navigate().refresh();
    }

    private static Select findDropDownElement(By dropDownPath) {
        return new Select(driver.findElement(dropDownPath));
    }

    public static void clickTwice(By elementPath) {
        clickOnElement(elementPath);
        clickOnElement(elementPath);
    }
}
