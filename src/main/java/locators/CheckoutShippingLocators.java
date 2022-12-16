package locators;

import org.openqa.selenium.By;

public enum CheckoutShippingLocators {

    NEXT_BUTTON_LOCATOR(By.xpath("//button[@data-role='opc-continue']"));
    private final By locator;

    CheckoutShippingLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
