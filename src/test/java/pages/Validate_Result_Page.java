package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Validate_Result_Page extends BasePage {
    public Validate_Result_Page() {
        super();
    }

    @FindBy(css = "#featurebullets_feature_div h1")
    public WebElement result_Text;
}
