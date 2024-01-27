package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    public ProductDetailsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
