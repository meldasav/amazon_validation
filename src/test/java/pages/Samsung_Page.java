package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Samsung_Page extends BasePage {
    public Samsung_Page(){
        super();
    }

    @FindBy(css = "#s-refinements div:nth-child(20) li:nth-child(5) i")
    public WebElement samsung_Tv_Link;

    @FindBy(css = "span[data-csa-interaction-events='click")
    public WebElement sort_By_Price;

    @FindBy(css = "div[class='a-popover-inner']>ul>li:nth-child(3)")
    public WebElement highLowPrice;

}
