package locators;

import org.openqa.selenium.By;

public enum SuccessLocators {

    CONTINUE_SHOPPING_LOCATOR(By.xpath("//*[contains(text(),'Continue Shopping')]"));

    private final By locator;

    SuccessLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
