package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
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

        WebElement element = driver.findElement(By.linkText("TV & Video"));
        element.click();
        WebElement element1 = driver.findElement(By.linkText("Televisions"));
        element1.click();


        actions.moveToElement(driver.findElement(By.xpath("//span[text()='SAMSUNG']"))).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        WebElement element2 = driver.findElement(By.cssSelector("#s-refinements div:nth-child(20) li:nth-child(5) i"));
        actions.moveToElement(element2);
        Waiter.waitForVisibilityOfElement(driver, element2, 3);
        element2.click();


        WebElement sortByPrice = driver.findElement(By.cssSelector("span[data-csa-interaction-events='click']"));
        sortByPrice.click();


        WebElement highLowPrice = driver.findElement(By.cssSelector("div[class='a-popover-inner']>ul>li:nth-child(3)"));
        highLowPrice.click();

        WebElement secondTv = driver.findElement(By.cssSelector("div[cel_widget_id='MAIN-SEARCH_RESULTS-2']"));
        secondTv.click();

        WebElement textMessage = driver.findElement(By.cssSelector("#featurebullets_feature_div h1"));

        Assert.assertEquals(textMessage.getText(), "About this item");

    }


}










