package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.lastName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.street']")
    private WebElement streetInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.state']")
    private WebElement stateInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.city']")
    private WebElement cityInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.zipCode']")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.phoneNumber']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.ssn']")
    private WebElement ssnInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.username']")
    private WebElement usernameInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='repeatedPassword']")
    private WebElement repeatedPasswordInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@value='Register']")
    private WebElement registerBtn;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    LoginPage loginPage;

    public void clickAndFillFirstNameInput(final String firstName){
        clickElement(firstNameInput);
        sendKeysToElement(firstNameInput,firstName);
    }

    public void clickLastNameInput(final String lastName){
        clickElement(lastNameInput);
        sendKeysToElement(lastNameInput,lastName);
    }

    public void clickStreetInput(final String streetName){
        clickElement(streetInput);
        sendKeysToElement(streetInput,streetName);
    }

    public void clickStateInput(final String stateName){
        clickElement(stateInput);
        sendKeysToElement(stateInput,stateName);
    }

    public void clickCityInput(final String cityName){
        clickElement(cityInput);
        sendKeysToElement(cityInput,cityName);
    }

    public void clickZipCodeInput(final String zipCodeNumber){
        clickElement(zipCodeInput);
        sendKeysToElement(zipCodeInput,zipCodeNumber);
    }

    public void clickPhoneNumberInput(final String phoneNumber){
        clickElement(phoneNumberInput);
        sendKeysToElement(phoneNumberInput,phoneNumber);
    }

    public void clickSsnInput(final String ssnNumber){
        clickElement(ssnInput);
        sendKeysToElement(ssnInput,ssnNumber);
    }

    public void clickUsernameInput(final String usernameName){
        clickElement(usernameInput);
        sendKeysToElement(usernameInput,usernameName);
    }

    public void clickPasswordInput(final String passwordNumber){
        clickElement(passwordInput);
        sendKeysToElement(passwordInput,passwordNumber);
    }

    public void clickRepeatedPasswordInput(final String repeatedPasswordNumber){
        clickElement(repeatedPasswordInput);
        sendKeysToElement(repeatedPasswordInput,repeatedPasswordNumber);
    }

    public void clickRegisterBtn(){
        clickElement(registerBtn);
    }

    public void verifyNewAccount(){
        verifyDisplayed(loginPage.messageCreatedAccount,"Your account was created successfully. You are now logged in.");
    }


}
