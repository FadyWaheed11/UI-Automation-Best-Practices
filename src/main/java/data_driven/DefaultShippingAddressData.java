package data_driven;

import org.json.simple.JSONObject;
import settings.ECommerceSettings;

import java.util.List;

import static utils.Helper.getRandomNumber;
import static utils.Helper.readJsonFile;

public class DefaultShippingAddressData {
    private List<String> states;
    private List<String> countries;
    private final JSONObject jsonData;

    //Prevent instance
    private DefaultShippingAddressData() {
        final String filePath = ECommerceSettings.defaultShippingAddressJsonFile;
        jsonData = readJsonFile(filePath);
    }

    public static DefaultShippingAddressData getDefaultShippingAddressData() {
        return new DefaultShippingAddressData();
    }

    public String getCompany() {
        return (String) jsonData.get("company");
    }

    public String getPhoneNumber() {
        return (String) jsonData.get("phoneNumber");
    }

    public String getAddress1() {
        return (String) jsonData.get("address1");
    }

    public String getAddress2() {
        return (String) jsonData.get("address2");
    }

    public String getCity() {
        return (String) jsonData.get("city");
    }

    private List<String> getStates() {
        return this.states = (List<String>) jsonData.get("states");
    }

    public String getZipCode() {
        return (String) jsonData.get("zipCode");
    }

    private List<String> getCountries() {
        return this.countries = (List<String>) jsonData.get("countries");
    }

    public String getState() {
        return getStates().get(getRandomNumber(this.states.size()));
    }

    public String getCountry() {
        return getCountries().get(getRandomNumber(this.countries.size()));
    }
}
