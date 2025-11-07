package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import utility.BaseDriver;

public class RegisterSteps {

    WebDriver driver;
    HomePage homePage;
    RegisterPage registerPage;
    LoginPage loginPage;

    @When("Navigate to the website")
    public void navigateToTheWebsite(){
        driver= BaseDriver.getDriver();
        homePage=new HomePage(driver);
        registerPage=new RegisterPage(driver);
        loginPage=new LoginPage(driver);
    }
    @Then("Click the Register button on the homepage")
    public void clickTheRegisterButtonOnTheHomepage(){
        homePage.clickRegisterBtn();
    }

    @Then("Fill out the registration form using valid information")
    public void fillOutTheRegistrationFormUsingValidInformation(){
        registerPage.clickAndFillFirstNameInput("Mehmet");
        registerPage.clickLastNameInput("Ali");
        registerPage.clickStreetInput("AB");
        registerPage.clickStateInput("Yok");
        registerPage.clickCityInput("Turkey");
        registerPage.clickPhoneNumberInput("12345");
        registerPage.clickSsnInput("123");
        registerPage.clickZipCodeInput("123");
        registerPage.clickUsernameInput("MehmetAli");
        registerPage.clickPasswordInput("1234");
        registerPage.clickRepeatedPasswordInput("1234");
    }

    @Then("Click the Submit button")
    public void clickTheSubmitButton(){
        registerPage.clickRegisterBtn();
    }

    @Then("Verify confirmation message that new account was created")
    public void verifyConfirmationMessageThatNewAccountWasCreated(){
        loginPage.verifyMessageCreatedAccount();
    }
}
