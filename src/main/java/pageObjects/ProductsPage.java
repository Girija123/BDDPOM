package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.CommonFunctions;

import java.util.List;

public class ProductsPage {

    public ProductsPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "title")
    public WebElement productPageHeading;

    @FindBy(className = "product_sort_container")
    public WebElement sortOption;

    @FindBy(id="react-burger-menu-btn")
    public WebElement menuIcon;

    @FindBy(className = "inventory_item_name")
    public List<WebElement> productNames;

    @FindBy(className = "shopping_cart_link")
    public WebElement bagIcon;


    public void clickProductName(String productName)
    {
        for(WebElement product : productNames)
        {
            if(product.getText().equals(productName))
            {
                product.click();
            }
        }

    }

    public void verifyLoginSuccess()
    {
        CommonFunctions.isElementDisplayed(productPageHeading);
    }

}
