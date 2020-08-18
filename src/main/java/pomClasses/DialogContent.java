package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends BasePom {
    public DialogContent() {

        PageFactory.initElements(BaseDriver.getDriver(), this);

    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement AddButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement NameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']/input")
    private WebElement CodeInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='priority']/input")
    private WebElement PriorityInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']/input")
    private WebElement shortNameInput;

    @FindBy(xpath = "//input[@class='mat-autocomplete-trigger mat-chip-input mat-input-element']")
    private WebElement UserTypeDropdown;

    @FindBy(xpath = " (//span[@class='mat-option-text'][text()=' Everyone '])[1]")
    private WebElement everyoneUserOption;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> userTypeAllOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']/input")
    private WebElement IntegrationCode;

    @FindBy(css = "ms-save-button>button")
    private WebElement SaveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessfullyMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement ErrorMessage;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement yesButton;

//    //table/tbody/tr/td[2]
//        tr is a row of the table and td is a colomn of the table
//         //table/tbody/tr[5]/td[2] row 5 column 2

    @FindAll({
            @FindBy(xpath = "//table/tbody/tr/td[2]")
    })
    private List<WebElement> nameList;

    @FindAll({
            @FindBy(xpath = "//ms-edit-button/button")
    })
    private List<WebElement> editButtonList;

    @FindAll({
            @FindBy(css = "ms-delete-button>button")
    })
    private List<WebElement> deleteButton;

    WebElement myElement;

    //    In this method we are going to click on the element.
    public void findElementAndClickFunction(String ElementName) {

        switch (ElementName) {
            case "AddButton":
                myElement = AddButton;
                break;
            case "SaveButton":
                myElement = SaveButton;
                break;
            case "yesButton":
                myElement = yesButton;
                break;
            case "closeDialog":
                myElement = closeDialog;
                break;
            case "UserTypeDropdown":
                myElement = UserTypeDropdown;
                break;
            case "everyoneUserOption":
                myElement = everyoneUserOption;
                break;


        }

        clickOnFunctionalities(myElement);
    }

    //      In this method we are going to sendKeys to element
    public void findElementAndSendKeysFunction(String ElementName, String value) {

//        Find the element in this class and send the element to sendKeysFunction
        switch (ElementName) {
            case "NameInput":
                myElement = NameInput;
                break;
            case "CodeInput":
                myElement = CodeInput;
                break;
            case "IntegrationCode":
                myElement = IntegrationCode;
                break;
            case "PriorityInput":
                myElement = PriorityInput;
                break;
            case "shortNameInput":
                myElement = shortNameInput;
                break;

        }
//            Create a method in parentClass which is going to wait first and sendKeys
        sendKeysFunction(myElement, value);

    }


}