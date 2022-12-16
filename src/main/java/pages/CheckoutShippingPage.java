package pages;


import static locators.CheckoutShippingLocators.NEXT_BUTTON_LOCATOR;
import static pages.CheckoutPaymentPage.getCheckPaymentPage;
import static utils.SharedSteps.clickOnElementByJavaScript;


public class CheckoutShippingPage {
    //Prevent instance
    private CheckoutShippingPage() {
    }

    public static CheckoutShippingPage getCheckoutShippingPage() {
        return new CheckoutShippingPage();
    }

    public CheckoutPaymentPage goToCheckoutPayment() {
        clickOnElementByJavaScript(NEXT_BUTTON_LOCATOR.by());
        return getCheckPaymentPage();
    }
}
