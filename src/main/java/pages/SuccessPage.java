package pages;

import static locators.SuccessLocators.CONTINUE_SHOPPING_LOCATOR;
import static utils.SharedSteps.clickOnElementByJavaScript;

public class SuccessPage {

    //Prevent instance
    private SuccessPage() {

    }

    public static SuccessPage getSuccessPage() {
        return new SuccessPage();
    }

    public void goToHomePage() {
        clickOnElementByJavaScript(CONTINUE_SHOPPING_LOCATOR.by());
    }
}
