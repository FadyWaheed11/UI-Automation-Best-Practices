package locators;

import org.openqa.selenium.By;

public enum TopBarLocators {


    MEN_SECTION_LOCATOR(By.id("ui-id-5"));
    private final By locator;

    TopBarLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
