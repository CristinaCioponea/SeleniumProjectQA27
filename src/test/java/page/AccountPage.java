package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {
    private WebDriver driver;

    public AccountPage (WebDriver driver){
        this.driver = driver;
    }

    @FindBy(css = ".hello strong")
    private WebElement welcomeText;

    public String getWelcomeText (){
        return welcomeText.getText();
    }

}
