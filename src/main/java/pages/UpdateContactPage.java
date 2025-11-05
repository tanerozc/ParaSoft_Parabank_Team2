package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateContactPage extends BasePage{

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.firstName']")
    private WebElement updateFirstNameInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.lastName']")
    private WebElement updateLastNameInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.address.street']")
    private WebElement updateStreetInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.address.state']")
    private WebElement updateStateInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.address.zipCode']")
    private WebElement updateZipCodeInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@id='customer.phoneNumber']")
    private WebElement updatePhoneNumberInput;

    @FindBy(xpath = "//div[@id='updateProfileForm']//input[@value='Update Profile']")
    private WebElement updateProfileBtn;


    public UpdateContactPage(WebDriver driver) {
        super(driver);
    }

}
