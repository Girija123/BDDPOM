package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.CommonFunctions;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login_logo")
    public WebElement loginHeading;

    @FindBy(id="user-name")
    public WebElement usernameTxtFld;

    @FindBy(id="password")
    public WebElement passwordTxtFld;

    @FindBy(id="login-button")
    public WebElement loginBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errorMessageDisplay;

    public void loginPageLandingVerification()
    {
       CommonFunctions.isElementDisplayed(loginHeading);
    }

    public void enterUsername (String username)
    {
        CommonFunctions.type(usernameTxtFld, username);
    }

    public void enterPassword(String password)
    {
        CommonFunctions.type(passwordTxtFld, password);
    }

    public void clickLoginBtn()
    {
        CommonFunctions.clickElement(loginBtn);
    }

    public void verifyInvalidLogin(String expectedErrorMsg)
    {
        CommonFunctions.assertEquals(expectedErrorMsg, errorMessageDisplay.getText());
        CommonFunctions.takeScreenShot("loginError.png");
    }

}
