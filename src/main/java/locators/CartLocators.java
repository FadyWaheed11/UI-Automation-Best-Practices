package locators;

import org.openqa.selenium.By;

public enum CartLocators {
    CART_LOCATOR(By.xpath("//a[@class='action showcart']")),
    TOTAL_PRICE_LOCATOR(By.xpath("(//span[@class='price-wrapper'])[1]")),
    HOODIES_COUNT_LOCATOR(By.xpath("(//span[@class='count'])[1]")),
    PROCEED_TO_CHECKOUT_LOCATOR(By.id("top-cart-btn-checkout"));
    private final By locator;

    CartLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
