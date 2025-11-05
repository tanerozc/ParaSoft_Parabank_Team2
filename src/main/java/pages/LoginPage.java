package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//a[@href='openaccount.htm']")
    private WebElement openNewAccountBtn1;

    @FindBy(xpath = "//a[@href='overview.htm']")
    private WebElement overviewBtn;

    @FindBy(xpath = "//a[@href='transfer.htm']")
    private WebElement transferBtn;

    @FindBy(xpath = "//a[@href='billpay.htm']")
    private WebElement billPayBtn;

    @FindBy(xpath = "//a[@href='findtrans.htm']")
    private WebElement findTransactionsBtn;

    @FindBy(xpath = "//a[@href='updateprofile.htm']")
    private WebElement updateBtn;

    @FindBy(xpath = "//a[@href='requestloan.htm']")
    private WebElement requestLoanBtn;

    @FindBy(xpath = "//a[@href='logout.htm']")
    private WebElement logOutBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
