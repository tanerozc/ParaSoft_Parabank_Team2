package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPayPage extends BasePage{

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.name']")
    private WebElement paymentPayeeNameInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.street']")
    private WebElement paymentAddressInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.city']")
    private WebElement paymentCityInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.state']")
    private WebElement paymentStateInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.address.zipCode']")
    private WebElement paymentZipCodeInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.phoneNumber']")
    private WebElement paymentPhoneNumberInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='payee.accountNumber']")
    private WebElement paymentAccountNumberInput;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@name='verifyAccount']")
    private WebElement paymentVerifyAccountNumberInput;

    @FindBy(xpath = "//div[@id='billpayForm']//div[@id='billpayForm']//select[@name='fromAccountId']")
    private WebElement paymentAccountIdBtn;

    @FindBy(xpath = "//div[@id='billpayForm']//input[@value='Send Payment']")
    private WebElement paymentSendPaymentBtn;



    public BillPayPage(WebDriver driver) {
        super(driver);
    }
}
