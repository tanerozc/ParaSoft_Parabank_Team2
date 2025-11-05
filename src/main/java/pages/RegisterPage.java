package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.firstName']")
    private WebElement firstNameInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.lastName']")
    private WebElement lastNameInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.street']']")
    private WebElement streetInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.state']")
    private WebElement stateInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.address.zipCode']")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.phoneNumber']")
    private WebElement phoneNumberInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.ssn']")
    private WebElement ssnInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='customer.password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@id='repeatedPassword']")
    private WebElement repeatedPasswordInput;

    @FindBy(xpath = "//form[@id='customerForm']//input[@value='Register']")
    private WebElement registerBtn;



    public RegisterPage(WebDriver driver) {
        super(driver);
    }
}
