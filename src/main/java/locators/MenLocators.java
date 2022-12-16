package locators;

import org.openqa.selenium.By;

public enum MenLocators {


    HOODIES_SWEATSHIRT_LOCATOR(By.linkText("Hoodies & Sweatshirts"));
    private final By locator;

    MenLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
