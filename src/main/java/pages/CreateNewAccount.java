package pages;

import static locators.CreateNewAccountLocators.*;
import static pages.MyAccount.getMyAccount;
import static utils.SharedSteps.*;

public class CreateNewAccount {

    //Prevent instance
    private CreateNewAccount() {
    }

    public static CreateNewAccount getCreateNewAccount() {
        return new CreateNewAccount();
    }

    public CreateNewAccount fillFirstName(String firstName) {
        sendTextToElement(firstName, FIRST_NAME_LOCATOR.by());
        return this;
    }

    public CreateNewAccount fillLastName(String lastName) {
        sendTextToElement(lastName, LAST_NAME_LOCATOR.by());
        return this;
    }

    public CreateNewAccount clickOnNewsLetterCheckbox() {
        clickOnCheckBox(NEWS_LETTER_CHECKBOX_LOCATOR.by());
        return this;
    }

    public CreateNewAccount fillEmailAddress(String email) {
        sendTextToElement(email, EMAIL_ADDRESS_LOCATOR.by());
        return this;
    }

    public CreateNewAccount fillPassword(String password) {
        sendTextToElement(password, PASSWORD_LOCATOR.by());
        return this;
    }

    public CreateNewAccount fillConfirmPassword(String confirmPassword) {
        sendTextToElement(confirmPassword, CONFIRM_PASSWORD_LOCATOR.by());
        return this;
    }

    public MyAccount clickOnCreateAccount() {
        clickOnElement(CREATE_ACCOUNT_BUTTON_LOCATOR.by());
        return getMyAccount();
    }
}
