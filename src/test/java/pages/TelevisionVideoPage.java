package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionVideoPage extends BasePage{
    public TelevisionVideoPage(){
        super();

    }

    @FindBy(linkText = "Televisions")
    public WebElement televisionLink;

    @FindBy(xpath = "//span[text()='SAMSUNG']")
    public WebElement samsungLink;
}
