package scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;
    WebDriverWait explicitWait;
    Wait fluentWait;
    SoftAssert softAssert;
    Actions actions;
    JavascriptExecutor js;
    AmazonHomePage amazonHomePage;
    AmazonElectronicsPage amazonElectronicsPage;
    TelevisionVideoPage televisionVideoPage;
    Samsung_Page samsung_page;
    Samsung_Result_Page samsung_result_page;
    Validate_Result_Page validate_result_page;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        driver = Driver.getDriver();
        explicitWait = new WebDriverWait(driver, 30);
        fluentWait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(Exception.class);
        softAssert = new SoftAssert();
        actions = new Actions(driver);
        js = (JavascriptExecutor) driver;
        amazonHomePage = new AmazonHomePage();
        amazonElectronicsPage = new AmazonElectronicsPage();
        televisionVideoPage = new TelevisionVideoPage();
        samsung_page = new Samsung_Page();
        samsung_result_page = new Samsung_Result_Page();
        validate_result_page=new Validate_Result_Page();


    }

    @AfterMethod(alwaysRun = true)

    public void teardown() {
        softAssert.assertAll();
        Driver.quitDriver();
    }
}
