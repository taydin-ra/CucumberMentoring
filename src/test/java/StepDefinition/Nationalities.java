package StepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pomClasses.DialogContent;
import pomClasses.LeftNavElements;

public class Nationalities {
    DialogContent dialogContent = new DialogContent();
    LeftNavElements leftNavElements =new LeftNavElements();

    @And("^Navigate to Nationalities page$")
    public void navigate_to_Nationalities_page()  {

        leftNavElements.findElementAndClickFunction("Setup1Button");
        leftNavElements.findElementAndClickFunction("ParametersButton");
        leftNavElements.findElementAndClickFunction("Nationalities");

    }

    @When("^User create a Nationalities$")
    public void user_create_a_Nationalities() {

        dialogContent.findElementAndClickFunction("AddButton");
        dialogContent.findElementAndSendKeysFunction("NameInput" , "AliCountry");
        dialogContent.findElementAndClickFunction("SaveButton");

    }
}
