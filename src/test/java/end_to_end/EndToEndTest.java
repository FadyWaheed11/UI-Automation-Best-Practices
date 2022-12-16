package end_to_end;

import base.BaseTest;
import data_driven.CartData;
import data_driven.CreateAccountData;
import data_driven.DefaultShippingAddressData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HoodiesAndSweatshirtsPage;
import static data_driven.CartData.getCartData;
import static data_driven.CreateAccountData.getCreateAccountData;
import static data_driven.DefaultShippingAddressData.getDefaultShippingAddressData;
import static org.testng.Assert.assertEquals;
import static pages.HomePage.getHomePage;
import static pages.HoodiesAndSweatshirtsPage.getCartSection;

public class EndToEndTest extends BaseTest {
    HomePage homePage = getHomePage();
    CreateAccountData createAccountData = getCreateAccountData();
    DefaultShippingAddressData defaultShippingAddressData = getDefaultShippingAddressData();
    HoodiesAndSweatshirtsPage.CartSection cartSection = getCartSection();


    @Test
    public void test() {
        homePage.createNewAccount()
                .fillFirstName(createAccountData.getFirstName())
                .fillLastName(createAccountData.getLastName())
                .clickOnNewsLetterCheckbox()
                .fillEmailAddress(createAccountData.getEmail())
                .fillPassword(createAccountData.getPassword())
                .fillConfirmPassword(createAccountData.getConfirmPassword())
                .clickOnCreateAccount()
                .editShippingAddress()
                .fillCompany(defaultShippingAddressData.getCompany())
                .fillPhoneNumber(defaultShippingAddressData.getPhoneNumber())
                .fillStreetAddress(defaultShippingAddressData.getAddress1())
                .fillStreetAddress2(defaultShippingAddressData.getAddress2())
                .fillCity(defaultShippingAddressData.getCity())
                .selectFromStates(defaultShippingAddressData.getState())
                .fillZipCode(defaultShippingAddressData.getZipCode())
                .selectCountry(defaultShippingAddressData.getCountry())
                .clickOnSaveAddress()
                .goToMenPage()
                .goToHoodiesAndSweatshirts()
                .chooseHoodieAndSweatshirt()
                .chooseHoodieAndSweatshirt()
                .chooseHoodieAndSweatshirt();
        cartSection
                .openCartSection();
        CartData cartData = getCartData();
        assertEquals(cartSection.getTotalPrice(),cartData.getExpectedTotalPrice());
        assertEquals(cartSection.getHoodiesCount(),cartData.getExpectedCountOfHoodies());
    }
}
