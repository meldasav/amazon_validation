package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AmazonElectronicsPage {
    public AmazonElectronicsPage() {
        super();
    }

    @FindBy(css = "ul[data-menu-id='14']>li")
    public List<WebElement> electronicsMenuItems;



    public void clickOnElement(String text) {
        for (WebElement element : electronicsMenuItems) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }

        }
    }

}
