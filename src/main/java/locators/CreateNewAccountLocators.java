package locators;

import org.openqa.selenium.By;

public enum CreateNewAccountLocators {

    FIRST_NAME_LOCATOR(By.id("firstname")),
    LAST_NAME_LOCATOR(By.id("lastname")),
    NEWS_LETTER_CHECKBOX_LOCATOR(By.id("is_subscribed")),
    EMAIL_ADDRESS_LOCATOR(By.id("email_address")),
    PASSWORD_LOCATOR(By.id("password")),
    CONFIRM_PASSWORD_LOCATOR(By.id("password-confirmation")),
    CREATE_ACCOUNT_BUTTON_LOCATOR(By.xpath("//button[contains(.,'Create an Account')]"));
    private final By locator;

    CreateNewAccountLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
