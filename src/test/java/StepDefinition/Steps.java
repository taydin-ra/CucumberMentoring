package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pomClasses.BasePom;
import utilities.BaseDriver;
import pomClasses.accountPage;

import java.util.concurrent.TimeUnit;

public class Steps extends BasePom {


    private WebDriver driver;


    accountPage ap = new accountPage();

    @Given("^Go to the website$")
    public void go_to_the_website() throws Throwable {
        driver = BaseDriver.getDriver();

        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Given("^Click on Sign In Tab$")
    public void click_on_Sign_In_Tab() throws Throwable {

      ap.clickOnSignInTab();
        waitMethod();
        // scrollDown();

    }


    @Given("^type to \"([^\"]*)\" and \"([^\"]*)\"$")
    public void type_to_and(String arg1, String arg2) throws Throwable {
        ap.typeTheEmail(arg1);
        ap.typeThePassword(arg2);
    }

    @Given("^Click on Sign In Button$")
    public void click_on_Sign_In_Button() throws Throwable {
        ap.clickOnSignInButton();

    }

    @Then("^Verify I am in the product page$")
    public void verify_I_am_in_the_product_page() throws Throwable {
        ap.verifyURL("controller=my-account");
    }


}
