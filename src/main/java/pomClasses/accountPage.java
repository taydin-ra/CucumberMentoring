package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pomClasses.BasePom;
import utilities.BaseDriver;

public class accountPage  extends BasePom {
    WebDriver driver;

    public accountPage() {
        driver = BaseDriver.getDriver();
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInTab;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;

    @FindBy(xpath = "//input[@id='passwd']")
    private WebElement passwordBox;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    private WebElement submitButton;


    public void clickOnSignInTab() {

        clickOnFunctionalities(signInTab);
    }


    public void typeTheEmail(String email) {
        email = "ttorun16@gmail.com";

        sendKeysFunction(emailBox, email);
    }

    public void typeThePassword(String pswd) {
        pswd = "0123456789";
        sendKeysFunction(passwordBox, pswd);
    }

    public void clickOnSignInButton() {
        clickOnFunctionalities(submitButton);
    }
}
