package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import utility.BaseDriver;

public class LoginSteps {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;

    @When("Navigate to the same webpage")
    public void navigateToTheSameWebpage(){
        driver= BaseDriver.getDriver();
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
    }

    @Then("Enter username and password")
    public void FillUsernameAndPassword(){
        homePage.clickUserNameInput("MehmetAli");
        homePage.clickPasswordInput("1234");
    }

    @Then("Click login button")
    public void clickLoginButton(){
        homePage.clickLoginBtn();
    }
    @Then("Verify Home page opened")
    public void verifyHomePageOpened(){
        loginPage.verifyMessageCreatedAccount();
    }

}
