package pomClasses;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BaseDriver;

import java.util.concurrent.TimeUnit;

public class BasePom {
   public  WebDriver driver;
    WebDriverWait wait;


    public void waitMethod() {

        driver = BaseDriver.getDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickOnFunctionalities(WebElement clickElement) {

        waitMethod();

        try {
            wait.until(ExpectedConditions.elementToBeClickable(clickElement));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        clickElement.click();
    }

    public void scrollDown() {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    public void sendKeysFunction(WebElement sendkeysElement, String value) {

        waitMethod();

        try {
            wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sendkeysElement.sendKeys(value);
    }

    public void verifyURL(String expectedResult){

        String URL = driver.getCurrentUrl();

        Assert.assertTrue(URL.contains( expectedResult )  );

    }

}
