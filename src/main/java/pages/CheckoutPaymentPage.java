package pages;

import static locators.CheckoutPaymentLocators.PLACE_ORDER_BUTTON_LOCATOR;
import static pages.SuccessPage.getSuccessPage;
import static utils.SharedSteps.clickOnElementByJavaScript;

public class CheckoutPaymentPage {

    //Prevent instance
    private CheckoutPaymentPage() {

    }

    public static CheckoutPaymentPage getCheckPaymentPage() {
        return new CheckoutPaymentPage();
    }

    public SuccessPage goToSuccessPage(){
        clickOnElementByJavaScript(PLACE_ORDER_BUTTON_LOCATOR.by());
        return getSuccessPage();
    }
}
