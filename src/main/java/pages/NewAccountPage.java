package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage{

    @FindBy(xpath = "//select[@id='type']")
    private WebElement typeAccountBtn;

    @FindBy(xpath = "//select[@id='type']/option[@value='0']")
    private WebElement checkingAccountBtn;

    @FindBy(xpath = "//select[@id='type']/option[@value='1']")
    private WebElement savingAccountBtn;

    @FindBy(xpath = "//input[@type='button']")
    private WebElement openNewAccountBtn2;

    @FindBy(xpath = "//div[@id='openAccountResult']/a[@id='newAccountId']")
    private WebElement numberId;

    @FindBy(xpath = "//div[@id='openAccountResult']/h1[@class='title']")
    private WebElement messageOpenAccount;

    @FindBy(xpath = "//*[@id='OpenAccountForm']/form/p[2]")
    private WebElement minBalanceMessage;

    @FindBy(xpath = "//*[@id='fromAccountId']")
    private WebElement accountId;

    @FindBy(xpath = "//*[@id='fromAccountId/option']")
    private WebElement accountIdOption;

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void clickTypeAccountBtn(){
        clickElement(typeAccountBtn);
    }

    public void selectCheckingAccountBtn(){
        clickElement(checkingAccountBtn);
    }

    public void verifyMinimumBalanceMessage(){
        verifyDisplayed(minBalanceMessage, "Minimum");
    }

    public void clickAccountId(){
        clickElement(accountId);
        clickElement(accountIdOption);
    }

    public void clickOpenNewAccountBtn2(){
        clickElement(openNewAccountBtn2);
    }

    public void verifyMessageOpenAccount(){
        verifyDisplayed(messageOpenAccount, "Account Opened!");
        verifyDisplayed(numberId,"ID");
    }
}