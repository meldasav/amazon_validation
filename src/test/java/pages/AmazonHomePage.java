package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonHomePage extends BasePage {
    public AmazonHomePage() {
        super();
    }

    @FindBy(id = "nav-hamburger-menu")
    public WebElement hamburgerMenuLink;

    @FindBy(css = "a[data-menu-id='14']")
    public WebElement electronicsLink;

    @FindBy(css = "a[data-ref-tag^='nav_em_']")
    public List<WebElement> allMenuItems;

    @FindBy(css = "i[class*='hmenu-arrow-more']")
    public List<WebElement> seeALLIcons;

    @FindBy(css = "ul[data-menu-id='14'] li")
    public List<WebElement> mainMenuItems;

    public void clickOnElement(String text) {
        for (WebElement element : mainMenuItems) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }
        }
    }

}
