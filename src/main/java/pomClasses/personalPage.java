package pomClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomClasses.BasePom;
import utilities.BaseDriver;

public class personalPage extends BasePom {
    WebDriver driver; //driver

    public personalPage() {
        driver = BaseDriver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'My personal information')]")
    private WebElement personalInfoTab;

    public void clickOnMyPersonalInfoTab() {
        clickOnFunctionalities(personalInfoTab);
    }

    @FindBy(xpath = "//input[@id='id_gender2']")
    private WebElement socialTitleButton;

    public void clickOnSocialTitle() {

        clickOnFunctionalities(socialTitleButton);
    }


    @FindBy(xpath = "//input[@id='firstname']")
    private WebElement inputFirstname;

    public void typeFirstName(String name) {

//        inputFirstname.sendKeys(Keys.CONTROL, Keys.chord("a"));
//        inputFirstname.sendKeys(Keys.BACK_SPACE);
        inputFirstname.clear();
        sendKeysFunction(inputFirstname, name);

    }

    @FindBy(xpath = "//input[@id='lastname']")
    private WebElement inputLastName;

    public void typeLastName(String lastName) {

        inputLastName.clear();
        sendKeysFunction(inputLastName, lastName);
    }

    @FindBy(xpath = "//input[@id='email']")
    private WebElement inputEmail;

    public void typeNewEmail(String email) {

        inputEmail.clear();
        sendKeysFunction(inputEmail, email);

    }

    @FindBy(xpath = "//input[@id='old_passwd']")
    private WebElement oldPassword;

    public void typeOldPassWord(String password) {

        sendKeysFunction(oldPassword, password);
    }

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement inputNewPassWord;

    public void inputnewPassWord(String newPassWord) {


        sendKeysFunction(inputNewPassWord, newPassWord);
    }

    @FindBy(xpath = "//input[@name='confirmation']")

    private WebElement confirmation;

    public void ConfirmationBox(String confirm) {
        sendKeysFunction(confirmation, confirm);
    }

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement SaveButton;

    public void clickOnSaveButton() {
        clickOnFunctionalities(SaveButton);
    }


}
