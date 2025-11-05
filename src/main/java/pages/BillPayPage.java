package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPayPage extends BasePage{

    @FindBy(xpath = "//input[@name='payee.name']")
    private WebElement paymentPayeeNameInput;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    private WebElement paymentAddressInput;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    private WebElement paymentCityInput;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    private WebElement paymentStateInput;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    private WebElement paymentZipCodeInput;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    private WebElement paymentPhoneNumberInput;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    private WebElement paymentAccountNumberInput;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    private WebElement paymentVerifyAccountNumberInput;

    @FindBy(xpath = "//div[@id='billpayForm']//select[@name='fromAccountId']")
    private WebElement paymentAccountIdBtn;

    @FindBy(xpath = "//input[@value='Send Payment']")
    private WebElement paymentSendPaymentBtn;



    public BillPayPage(WebDriver driver) {
        super(driver);
    }
}
