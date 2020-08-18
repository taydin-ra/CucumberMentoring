package pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LeftNavElements extends BasePom {
    public LeftNavElements(){

        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement Setup1Button;

    @FindBy(xpath = "(//span[text()='Setup'])[4]")
    private WebElement setupButtonUnderInventory;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement ParametersButton;

    @FindBy(xpath = "//span[text()='Countries']")
    private WebElement CountriesButton;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement Nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement Fees;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement Citizenships;

    @FindBy(xpath = "//span[text()='Inventory']")
    private WebElement Inventory;

    @FindBy(xpath = "//span[text()='Item Categories']")
    private WebElement ItemCategory;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement EntranceExamsParent;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement EntranceExamsSetup;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement EntranceExamsChild;

    @FindBy(xpath = "//span[text()='Student']")
    private WebElement StudentParent;

    @FindBy(xpath = " //span[text()='Students']")
    private WebElement StudentsButton;


    /*
        We can create couple methods which is finding the element in the class

           And calling the method from the parent class.

     */

    WebElement myElement;

    public void findElementAndClickFunction(String elementName){

        switch (elementName){

            case "Setup1Button":
                myElement =Setup1Button;
                break;
            case "ParametersButton":
                myElement =ParametersButton;
                break;
            case "CountriesButton":
                myElement =CountriesButton;
                break;
            case "Nationalities":
                myElement =Nationalities;
                break;
            case "Fees":
                myElement =Fees;
                break;
            case "Citizenships":
                myElement =Citizenships;
                break;
            case "setupButtonUnderInventory":
                myElement =setupButtonUnderInventory;
                break;
            case "ItemCategory":
                myElement =ItemCategory;
                break;
            case "Inventory":
                myElement =Inventory;
                break;
            case "EntranceExamsChild":
                myElement =EntranceExamsChild;
                break;
            case "EntranceExamsSetup":
                myElement =EntranceExamsSetup;
                break;
            case "EntranceExamsParent":
                myElement =EntranceExamsParent;
                break;
            case "StudentParent":
                myElement =StudentParent;
                break;
            case "StudentsButton":
                myElement =StudentsButton;
                break;

        }

//    Call the method from the parent class.
        clickOnFunctionalities(myElement);

    }

}
