package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {
    public BasketPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
