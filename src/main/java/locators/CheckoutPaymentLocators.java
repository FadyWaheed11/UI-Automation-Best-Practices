package locators;

import org.openqa.selenium.By;

public enum CheckoutPaymentLocators {

    PLACE_ORDER_BUTTON_LOCATOR(By.xpath("//button[@title='Place Order']"));

    private final By locator;

    CheckoutPaymentLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
