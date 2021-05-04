package automation.pages;

import automation.Drivers.DriverSingleton;
import automation.Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class SignInPage {
    private WebDriver driver;

    public SignInPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement password;

    @FindBy(id = "SubmitLogin")
    public WebElement signInButton;

    @FindBy(id = "email_create")
    private WebElement emailSignUpField;

    @FindBy(id = "SubmitCreate")
    private WebElement signUpButton;

    public void logIn(String email, String passwd){
        emailField.sendKeys(email);
        password.sendKeys(Utils.decode64(passwd));
        signInButton.click();
    }

    public void signUp(String email){
        emailSignUpField.sendKeys(email);
        signUpButton.click();
    }

}

