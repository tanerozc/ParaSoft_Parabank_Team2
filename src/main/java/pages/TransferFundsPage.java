package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransferFundsPage extends BasePage{

    @FindBy(xpath = "//input[@id='amount']")
    private WebElement transferFundsAmount;

    @FindBy(xpath = "//select[@id='fromAccountId']")
    private WebElement transferFromAccountId;

    @FindBy(xpath = "//select[@id='toAccountId']")
    private WebElement transferToAccountId;

    @FindBy(xpath = "//form[@id='transferForm']//input[@type='submit']")
    private WebElement transferSubmitBtn;

    @FindBy(xpath = "//select[@id='fromAccountId'][1]")
    private WebElement transferOption1;

    @FindBy(xpath = "//select[@id='toAccountId'][1]")
    private WebElement transferOption2;





    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }
}
