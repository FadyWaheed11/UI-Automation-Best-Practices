package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import settings.ECommerceSettings;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static locators.CartLocators.*;
import static pages.CheckoutShippingPage.getCheckoutShippingPage;
import static utils.Helper.getRandomNumber;
import static utils.Helper.updateJsonFile;
import static utils.SharedSteps.*;

public class HoodiesAndSweatshirtsPage {
    private double totalPrice;
    private int itemCount = 0;

    //Prevent instance
    private HoodiesAndSweatshirtsPage() {

    }

    public static HoodiesAndSweatshirtsPage getHoodiesAndSweatshirtsPage() {
        return new HoodiesAndSweatshirtsPage();
    }

    public static CartSection getCartSection() {
        return new CartSection();
    }

    public HoodiesAndSweatshirtsPage chooseHoodieAndSweatshirt() {
        final int hoodiesSweatshirts = findElements(By.xpath("//li[@class='item product product-item']")).size();
        final String randomHoodieSweatshirt = Integer.toString(getRandomNumber(hoodiesSweatshirts));
        final By hoodieSweatshirtLocator = By.xpath("(//li[@class='item product product-item'])" + "[" + randomHoodieSweatshirt + "]");
        final WebElement selectedSweatshirt = findElement(hoodieSweatshirtLocator);
        moveToElement(selectedSweatshirt);
        selectRandomSize(randomHoodieSweatshirt).
                selectRandomColor(randomHoodieSweatshirt).
                addToCart(randomHoodieSweatshirt);
        totalPrice += getPrice(randomHoodieSweatshirt);
        itemCount++;
        updateCartValues(totalPrice, itemCount);
        refreshPage();
        return this;
    }

    private HoodiesAndSweatshirtsPage selectRandomSize(String sweatshirtNumber) {
        final By xsSizeLocator = By.xpath("(//div[@option-label='XS'])" + "[" + sweatshirtNumber + "]");
        final By sSizeLocator = By.xpath("(//div[@option-label='S'])" + "[" + sweatshirtNumber + "]");
        final By mSizeLocator = By.xpath("(//div[@option-label='M'])" + "[" + sweatshirtNumber + "]");
        final By lSizeLocator = By.xpath("(//div[@option-label='L'])" + "[" + sweatshirtNumber + "]");
        final By xlSizeLocator = By.xpath("(//div[@option-label='XL'])" + "[" + sweatshirtNumber + "]");
        final int randomSize = getRandomNumber(6);
        switch (randomSize) {
            case 1 -> clickOnElement(xsSizeLocator);
            case 2 -> clickOnElement(sSizeLocator);
            case 4 -> clickOnElement(mSizeLocator);
            case 5 -> clickOnElement(lSizeLocator);
            case 6 -> clickOnElement(xlSizeLocator);
        }
        return this;
    }

    private HoodiesAndSweatshirtsPage selectRandomColor(String sweatshirtNumber) {
        final By coloursListLocator = By.xpath("(//div[@aria-label='Color'])" + "[" + sweatshirtNumber + "]");
        WebElement coloursList = findElement(coloursListLocator);
        List<WebElement> availableColours = coloursList.findElements(By.xpath("*"));
        clickOnElement(availableColours.get(getRandomNumber(availableColours.size())));
        return this;
    }

    private void addToCart(String sweatshirtNumber) {
        final By addToCartButtonLocator = By.xpath("(//button[@title='Add to Cart'])" + "[" + sweatshirtNumber + "]");
        clickOnElement(addToCartButtonLocator);
    }

    private double getPrice(String sweatShirt) {
        final By priceLocator = By.xpath("(//span[@data-price-type='finalPrice'])" + "[" + sweatShirt + "]");
        return Double.parseDouble(findElement(priceLocator)
                .getAttribute("data-price-amount"));
    }

    private void updateCartValues(double totalPrice, int itemCount) {
        final String filePath = ECommerceSettings.cartJsonFile;
        Map<String, Object> cartValues = new HashMap<>();
        cartValues.put("totalPrice", "$" + String.format("%.2f", totalPrice));
        cartValues.put("numberOfItems", String.valueOf(itemCount));
        updateJsonFile(filePath, cartValues, "totalPrice");
        updateJsonFile(filePath, cartValues, "numberOfItems");
    }

    public static class CartSection {


        //Prevent instance
        private CartSection() {
        }

        public void openCartSection() {
            clickTwice(CART_LOCATOR.by());
        }

        public String getTotalPrice() {
            return findElement(TOTAL_PRICE_LOCATOR.by()).getText();
        }

        public String getHoodiesCount() {
            return findElement(HOODIES_COUNT_LOCATOR.by()).getText();
        }

        public CheckoutShippingPage goCheckoutShippingPage() {
            clickOnElement(PROCEED_TO_CHECKOUT_LOCATOR.by());
            return getCheckoutShippingPage();
        }
    }
}
