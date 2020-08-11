package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import pomClasses.AddressLocators;
import pomClasses.BasePom;

import java.util.Map;

public class AddressSteps extends BasePom {
    AddressLocators addressLocators= new AddressLocators();

    @Given("^Click on My Address$")
    public void click_on_My_Address()  {
        addressLocators.clickOnMyAddress();


    }

    @Given("^Click on Add A New Address$")
    public void click_on_Add_A_New_Address() {
        addressLocators.clickOnNewAddress();


    }

    @Given("^Fill out the following$")
    public void fill_out_the_following(DataTable addressFields) {
        Map<String, String> addressData=addressFields.asMap(String.class, String.class);

        addressLocators.firstNAme.clear();
        addressLocators.sendKeysFunction(addressLocators.firstNAme,addressData.get("FirstName"));
        addressLocators.lastNAme.clear();
        addressLocators.sendKeysFunction(addressLocators.lastNAme,addressData.get("LastName"));

        addressLocators.sendKeysFunction(addressLocators.address1,addressData.get("Address"));

        addressLocators.sendKeysFunction(addressLocators.city,addressData.get("City"));
        addressLocators.sendKeysFunction(addressLocators.zipCode,addressData.get("Zipcode"));
        addressLocators.sendKeysFunction(addressLocators.phone,addressData.get("Phone"));
        addressLocators.alias.clear();
        addressLocators.sendKeysFunction(addressLocators.alias,addressData.get("Reference"));

        selectInDropDown(addressLocators.state,addressData.get("State"));






    }

    @Given("^Click on Save button on the address page$")
    public void click_on_Save_button_on_the_address_page()  {
     clickOnFunctionalities(addressLocators.submitButton);

    }


}
