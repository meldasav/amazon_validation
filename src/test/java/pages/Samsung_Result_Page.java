package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Samsung_Result_Page extends BasePage {
    public Samsung_Result_Page(){
        super();
    }

    @FindBy(css = "div[cel_widget_id='MAIN-SEARCH_RESULTS-2']")
    public WebElement samsung_Tv_Second_Result;
}
