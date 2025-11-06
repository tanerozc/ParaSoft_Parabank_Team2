package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.NewAccountPage;
import utility.BaseDriver;

public class OpenNewAccountSteps {

    public Logger LOGGER = LogManager.getLogger(this.getClass());

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    NewAccountPage newAccountPage;

    @When("Navigate to the webpage")
    public void navigate_to_the_webpage() {
        driver = BaseDriver.getDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        newAccountPage = new NewAccountPage(driver);

    }

    @Then("User logs in to the ParaBank website")
    public void user_logs_in_to_the_para_bank_website() {
        homePage.enterUsernameAndPassword("tester","cfZ7LFSd2Lt@u");
        homePage.clickLoginBtn();
    }

    @Then("Click on the Open New Account link from the website menu")
    public void click_on_the_link_from_the_website_menu() {
        loginPage.clickOpenNewAccountBtn();
    }

    @Then("Select Checking from the Account Type dropdown menu")
    public void select_from_the_dropdown_menu() {
//        newAccountPage.clickTypeAccountBtn();
//        newAccountPage.selectCheckingAccountBtn();
    }

    @Then("Verify message indicating that a minimum balance is required")
    public void verify_message_indicating_that_a_minimum_balance_is_required() {
//        newAccountPage.verifyMinimumBalanceMessage();
    }

    @Then("Select an existing account to transfer the initial balance from")
    public void select_an_existing_account_to_transfer_the_initial_balance_from() {
//        newAccountPage.clickAccountId();
    }

    @Then("Click the Open New Account button")
    public void click_the_button() {
        newAccountPage.clickOpenNewAccountBtn2();
    }

    @Then("Verify confirmation message and new account number are displayed")
    public void verify_confirmation_message_and_new_account_number_are_displayed() {
        newAccountPage.verifyMessageOpenAccount();
    }
}