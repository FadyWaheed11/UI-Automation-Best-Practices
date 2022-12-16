package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class DriverFactory {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions actions;

    /**
     * This function checks if the webdriver object is null and,
     * If so it creates only one instance of it.
     * @param browserName is the name of browser you want to initialize a driver for.
     * @return object of the webdriver.
     */
    public static WebDriver getDriver(String browserName) {
        if (driver == null) {
            if (browserName.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
        }
        return driver;
    }

    /**
     * This method checks if the WebDriverWait is null and,
     * If so it creates only one instance of it.
     * @return object of the WebDriverWait.
     */
    public static WebDriverWait getDriverWait() {
        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }
        return wait;
    }

    /**
     * This method checks if the Actions is null and,
     * If so it creates only one instance of it.
     * @return object of the Actions.
     */
    public static Actions getDriverAction() {
        if (actions == null) {
            actions = new Actions(driver);
        }
        return actions;
    }

}
