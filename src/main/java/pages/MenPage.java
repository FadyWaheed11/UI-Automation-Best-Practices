package pages;

import static locators.MenLocators.HOODIES_SWEATSHIRT_LOCATOR;
import static pages.HoodiesAndSweatshirtsPage.getHoodiesAndSweatshirtsPage;
import static utils.SharedSteps.clickOnElement;

public class MenPage {

    //Prevent instance

    public static MenPage getMenPage() {
        return new MenPage();
    }

    public HoodiesAndSweatshirtsPage goToHoodiesAndSweatshirts() {
        clickOnElement(HOODIES_SWEATSHIRT_LOCATOR.by());
        return getHoodiesAndSweatshirtsPage();
    }
}
