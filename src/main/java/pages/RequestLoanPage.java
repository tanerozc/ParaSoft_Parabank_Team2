package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestLoanPage extends BasePage{

    @FindBy(xpath = "//div[@id='requestLoanForm']//input[@id='amount']")
    private WebElement loanAmount;

    @FindBy(xpath = "//div[@id='requestLoanForm']//input[@id='downPayment']")
    private WebElement loanDownPaymentAmount;

    @FindBy(xpath = "//div[@id='requestLoanForm']//select[@id='fromAccountId']")
    private WebElement loanFromAccount;

    @FindBy(xpath = "//div[@id='requestLoanForm']//input[@value='Apply Now']")
    private WebElement loanApplyNowBtn;

    @FindBy(xpath = "//div[@id='requestLoanForm']//select[@id='fromAccountId'][1]")
    private WebElement loanSelectAccountId;


    public RequestLoanPage(WebDriver driver) {
        super(driver);
    }
}
