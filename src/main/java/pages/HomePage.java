package pages;

import static locators.HomePageLocators.CREATE_NEW_ACCOUNT;
import static pages.CreateNewAccount.getCreateNewAccount;
import static utils.SharedSteps.clickOnElement;

public class HomePage {

    //Prevent instance
    private HomePage() {
    }

    public static HomePage getHomePage() {
        return new HomePage();
    }

    public CreateNewAccount createNewAccount(){
        clickOnElement(CREATE_NEW_ACCOUNT.by());
        return getCreateNewAccount();
    }
}
