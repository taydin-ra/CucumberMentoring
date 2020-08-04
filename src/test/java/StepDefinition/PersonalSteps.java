package StepDefinition;

import cucumber.api.java.en.Given;
import pomClasses.BasePom;
import pomClasses.personalPage;

public class PersonalSteps extends BasePom {
    personalPage ip = new personalPage();


    @Given("^Click on My Personal Information$")
    public void click_on_My_Personal_Information() throws Throwable {
        ip.clickOnMyPersonalInfoTab();
    }

    @Given("^Click on social title$")
    public void click_on_social_title() throws Throwable {
        ip.clickOnSocialTitle();

    }

    @Given("^type to\"([^\"]*)\"and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and_and(String arg1, String arg2, String arg3) throws Throwable {

        ip.typeFirstName(arg1);

        ip.typeLastName(arg2);

        ip.typeNewEmail(arg3);
        waitMethod();

        // scrollDown();
    }

    @Given("^type \"([^\"]*)\"and \"([^\"]*)\"$")
    public void type_and(String password, String newPassWord) throws Throwable {

        ip.typeOldPassWord(password);
        waitMethod();

        ip.inputnewPassWord(newPassWord);
    }

    @Given("^type in the confirm password \"([^\"]*)\"$")
    public void type_in_the_confirm_password(String confirm) throws Throwable {
        ip.ConfirmationBox(confirm);
    }

    @Given("^Click on Save button$")
    public void click_on_Save_button() throws Throwable {
        waitMethod();

        ip.clickOnSaveButton();
    }
}
