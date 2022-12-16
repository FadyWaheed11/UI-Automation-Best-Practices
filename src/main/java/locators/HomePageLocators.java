package locators;

import org.openqa.selenium.By;

public enum HomePageLocators {

    CREATE_NEW_ACCOUNT(By.linkText("Create an Account"));

    private final By locator;

    HomePageLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return locator;
    }
}
