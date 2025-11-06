package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='openaccount.htm']")
    private WebElement openNewAccountBtn1;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='overview.htm']")
    private WebElement overviewBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='transfer.htm']")
    private WebElement transferBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='billpay.htm']")
    private WebElement billPayBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='findtrans.htm']")
    private WebElement findTransactionsBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='updateprofile.htm']")
    private WebElement updateBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='requestloan.htm']")
    private WebElement requestLoanBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='logout.htm']")
    private WebElement logOutBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOpenNewAccountBtn(){
        clickElement(openNewAccountBtn1);
    }
}