package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountPage extends BasePage{

    @FindBy(xpath = "//select[@id='type']")
    private WebElement typeAccountBtn;

    @FindBy(xpath = "//select[@id='type']//option[@value='0']")
    private WebElement checkingAccountBtn;

    @FindBy(xpath = "//select[@id='type']//option[@value='1']")
    private WebElement savingAccountBtn;

    @FindBy(xpath = "//input[@type='button']")
    private WebElement openNewAccountBtn2;

    @FindBy(xpath = "//div[@id='openAccountResult']//a[@id='newAccountId']")
    private WebElement numberId;

    @FindBy(xpath = "//div[@id='openAccountResult']//h1[@class='title']")
    private WebElement messageOpenAccount;

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }
}
