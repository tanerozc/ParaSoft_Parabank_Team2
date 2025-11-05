package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@id='leftPanel']//a[@href='register.htm']")
    private WebElement registerBtn;

    @FindBy(xpath = "//div[@id='leftPanel']//input[@type='text']")
    private WebElement usernameInput;

    @FindBy(xpath = "//div[@id='leftPanel']//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//div[@id='leftPanel']//input[@type='submit']")
    private WebElement logInBtn;




    public HomePage(WebDriver driver) {
        super(driver);
    }
}
