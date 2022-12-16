package pages;

import static locators.DefaultShippingAddressLocators.*;
import static pages.TopBar.getTopBar;
import static utils.SharedSteps.*;

public class DefaultShippingAddress {

    //Prevent instance
    private DefaultShippingAddress() {
    }

    public static DefaultShippingAddress getDefaultShippingAddress() {
        return new DefaultShippingAddress();
    }

    public DefaultShippingAddress fillCompany(String company) {
        sendTextToElement(company, COMPANY_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress fillPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNumber, PHONE_NUMBER_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress fillStreetAddress(String streetAddress) {
        sendTextToElement(streetAddress, STREET_ADDRESS_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress fillStreetAddress2(String streetAddress2) {
        sendTextToElement(streetAddress2, STREET_ADDRESS2_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress fillCity(String city) {
        sendTextToElement(city, CITY_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress selectFromStates(String state) {
        sendTextToElement(state, STATE_PROVINCE_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress fillZipCode(String zipCode) {
        sendTextToElement(zipCode, ZIP_CODE_LOCATOR.by());
        return this;
    }

    public DefaultShippingAddress selectCountry(String country) {
       selectFromDropDownByVisibleText(country, COUNTRY_LOCATOR.by());
        return this;
    }

    public TopBar clickOnSaveAddress() {
        clickOnElement(SAVE_ADDRESS_BUTTON_LOCATOR.by());
        return getTopBar();
    }
}
