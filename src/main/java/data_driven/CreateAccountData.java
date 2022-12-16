package data_driven;

import org.json.simple.JSONObject;
import settings.ECommerceSettings;

import java.util.HashMap;
import java.util.Map;

import static utils.Helper.*;
public class CreateAccountData {

    private final JSONObject jsonData;

    private CreateAccountData() {
        final String filePath = ECommerceSettings.createAccountJsonFile;
        final Map<String, Object> newEmailObject = new HashMap<>();
        final String currentDate = getCurrentDate();
        final String newEmail = "fadywaheed".concat(currentDate).concat("@gmail.com");
        newEmailObject.put("email", newEmail);
        updateJsonFile(filePath, newEmailObject, "email");
        jsonData = readJsonFile(filePath);
    }

    public static CreateAccountData getCreateAccountData() {
        return new CreateAccountData();
    }

    public String getFirstName() {
        return (String) jsonData.get("firstName");
    }

    public String getLastName() {
        return (String) jsonData.get("lastName");
    }

    public String getEmail() {
        return (String) jsonData.get("email");
    }

    public String getPassword() {
        return (String) jsonData.get("password");
    }

    public String getConfirmPassword() {
        return (String) jsonData.get("confirmPassword");
    }
}
