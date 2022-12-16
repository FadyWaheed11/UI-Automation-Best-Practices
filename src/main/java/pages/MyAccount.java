package pages;

import static locators.MyAccountLocators.EDIT_SHIPPING_ADDRESS_LOCATOR;
import static pages.DefaultShippingAddress.getDefaultShippingAddress;
import static utils.SharedSteps.clickOnElement;

public class MyAccount {

    //Prevent instance
    private MyAccount() {

    }

    public static MyAccount getMyAccount() {
        return new MyAccount();
    }

    public DefaultShippingAddress editShippingAddress() {
        clickOnElement(EDIT_SHIPPING_ADDRESS_LOCATOR.by());
        return getDefaultShippingAddress();
    }
}
