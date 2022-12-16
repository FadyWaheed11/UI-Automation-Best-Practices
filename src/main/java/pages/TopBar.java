package pages;

import static locators.TopBarLocators.MEN_SECTION_LOCATOR;
import static pages.MenPage.getMenPage;
import static utils.SharedSteps.clickOnElement;

public class TopBar {

    //Prevent instance

    public static TopBar getTopBar() {
        return new TopBar();
    }

    public MenPage goToMenPage() {
        clickOnElement(MEN_SECTION_LOCATOR.by());
        return getMenPage();
    }
}
