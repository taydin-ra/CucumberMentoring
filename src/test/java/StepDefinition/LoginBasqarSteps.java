package StepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pomClasses.accountPage;
import utilities.BaseDriver;

import java.util.Map;

public class LoginBasqarSteps {
    WebDriver driver;

    @Given("^Navigate to basqar$")
    public void navigate_to_basqar() {
        driver = BaseDriver.getDriver();

        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();

    }

    @When("^Enter the username and password and click on login button$")
    public void enter_the_username_and_password_and_click_on_login_button(DataTable login) {

        Map<String, String> loginDatas = login.asMap(String.class, String.class);
        driver.findElement(By.id("mat-input-0")).sendKeys(loginDatas.get("username"));
        driver.findElement(By.id("mat-input-1")).sendKeys(loginDatas.get("password"));

        driver.findElement(By.cssSelector("button[aria-label='LOGIN']")).click();

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {

        WebElement verifyLogin = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        Assert.assertNotNull(verifyLogin);

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
