package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.BaseDriver;

public class AddressLocators extends BasePom {
    WebDriver driver;

    public AddressLocators() {
        PageFactory.initElements(BaseDriver.getDriver(), this);


    }

    @FindBy(xpath = "//span[text()='My addresses']")
    private WebElement myAddress;

    public void clickOnMyAddress() {

        clickOnFunctionalities(myAddress);
    }

    @FindBy(xpath = "//span[text()='Add a new address']")
    public WebElement AddANewAddress;

    public void clickOnNewAddress() {

        clickOnFunctionalities(AddANewAddress);
    }

    @FindBy(css = " input#firstname")
    public WebElement firstNAme;




    @FindBy(css = " input#lastname")
    public WebElement lastNAme;

    @FindBy(css = " input#address1")
    public WebElement address1;

    @FindBy(css = " input#city")
    public WebElement city;

    @FindBy(css = " input#postcode")
    public WebElement zipCode;

    @FindBy(css = " input#phone")
    public WebElement phone;

    @FindBy(css = " input#alias")
    public WebElement alias;

    @FindBy(css = "select#id_state")
    public WebElement state;

    @FindBy(css = "select#id_state")
    public WebElement submitButton;

    public void clickOnSave() {

        clickOnFunctionalities(submitButton);
    }
}
