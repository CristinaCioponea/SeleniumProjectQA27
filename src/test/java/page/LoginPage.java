package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "pass")
    private WebElement passField;

    @FindBy(id = "send2")
    private WebElement loginButton;
    public void setEmailField (String email) {
        emailField.sendKeys(email);
    }
    public void setPassField(String password) {
        passField.sendKeys(password);
    }
    public void clickLoginButton () {
        loginButton.click();
    }

}
