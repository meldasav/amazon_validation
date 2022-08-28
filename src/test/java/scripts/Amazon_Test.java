package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Samsung_Page;
import utilities.Waiter;

public class Amazon_Test extends Base {


    @Test(priority = 1, description = "Amazon URL and Title Validation")
    public void TestAmazonHomePage() {
        driver.get("https://www.amazon.com/");
        Assert.assertEquals("https://www.amazon.com/", driver.getCurrentUrl());
        Waiter.waitUntilTitleIs(driver, 2, "Amazon.com. Spend less. Smile more.");
        Assert.assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }

    @Test(priority = 2, description = "Amazon hamburger menu items Validation")
    public void TestTV_Appliances_Electronics() {
        driver.get("https://www.amazon.com/");
        amazonHomePage.hamburgerMenuLink.click();
        actions.moveToElement(amazonHomePage.electronicsLink).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Waiter.waitForVisibilityOfElement(driver, amazonHomePage.seeALLIcons.get(0), 5);
        amazonHomePage.seeALLIcons.get(0).click();

        for (WebElement electronic : amazonHomePage.allMenuItems) {
            if (electronic.getText().equals("Electronics")) {
                electronic.click();
                break;
            }
        }

        amazonHomePage.tv_Video_Link.click();
        televisionVideoPage.televisionLink.click();


        actions.moveToElement(televisionVideoPage.samsungLink).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        WebElement samsung_Link_text = samsung_page.samsung_Tv_Link;
        actions.moveToElement(samsung_Link_text);
        Waiter.waitForVisibilityOfElement(driver, samsung_Link_text, 3);
        samsung_Link_text.click();

        samsung_page.sort_By_Price.click();
        samsung_page.highLowPrice.click();

        samsung_result_page.samsung_Tv_Second_Result.click();
        validate_result_page.result_Text.click();
        WebElement actualResult = validate_result_page.result_Text;
        Assert.assertEquals(actualResult.getText(), "About this item");

    }


}










