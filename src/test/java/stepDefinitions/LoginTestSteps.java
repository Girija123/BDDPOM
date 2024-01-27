package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ProductsPage;
import util.CommonFunctions;

public class LoginTestSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);
    ProductsPage productsPage = new ProductsPage(driver);

    @Given("I am on Home Page {string}")
    public void openHomePage(String url) {
        CommonFunctions.navigateToUrl(url);
    }
    @When("I enter username {string}")
    public void enterUsername(String username) {
        loginPage.enterUsername(username);
    }
    @When("I enter password {string}")
    public void enterPassword(String password) {
        loginPage.enterPassword(password);
    }
    @When("I click login button")
    public void clickLoginBtn() {
        loginPage.clickLoginBtn();
    }
    @Then("I should land on products page after successful login")
    public void verifyLogin() {
        productsPage.verifyLoginSuccess();
    }
}
