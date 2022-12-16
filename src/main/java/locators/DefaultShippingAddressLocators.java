package locators;

import org.openqa.selenium.By;

public enum DefaultShippingAddressLocators {

    COMPANY_LOCATOR(By.id("company")),
    PHONE_NUMBER_LOCATOR(By.id("telephone")),
    STREET_ADDRESS_LOCATOR(By.id("street_1")),
    STREET_ADDRESS2_LOCATOR(By.id("street_2")),
    CITY_LOCATOR(By.id("city")),
    STATE_PROVINCE_LOCATOR(By.id("region_id")),
    ZIP_CODE_LOCATOR(By.id("zip")),
    COUNTRY_LOCATOR(By.id("country")),
    SAVE_ADDRESS_BUTTON_LOCATOR(By.xpath("//button[contains(.,'Save Address')]"));
    private final By locator;

    DefaultShippingAddressLocators(By locator) {
        this.locator = locator;
    }

    public By by() {
        return this.locator;
    }
}
