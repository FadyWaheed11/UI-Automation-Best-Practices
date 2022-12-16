package locators;

import org.openqa.selenium.By;

public enum MyAccountLocators {

    EDIT_SHIPPING_ADDRESS_LOCATOR(By.xpath("(//a[contains(.,'Edit Address')])[1]"));
    private final By locator;

    MyAccountLocators(By locator) {
        this.locator = locator;
    }

    public By by(){
        return this.locator;
    }
}
