package data_driven;

import org.json.simple.JSONObject;
import settings.ECommerceSettings;

import static utils.Helper.readJsonFile;

public class CartData {

    private final JSONObject jsonData;

    private CartData() {
        final String filePath = ECommerceSettings.cartJsonFile;
        jsonData = readJsonFile(filePath);
    }

    public static CartData getCartData(){
        return new CartData();
    }

    public String getExpectedTotalPrice() {
        return (String) jsonData.get("totalPrice");
    }

    public String getExpectedCountOfHoodies() {
        return (String) jsonData.get("numberOfItems");
    }
}
