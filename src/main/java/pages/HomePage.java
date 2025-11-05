package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href='register.htm']")
    private WebElement registerBtn;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement usernameInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement logInBtn;




    public HomePage(WebDriver driver) {
        super(driver);
    }
}
