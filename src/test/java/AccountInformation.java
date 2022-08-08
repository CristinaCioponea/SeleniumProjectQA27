import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountInformation {
    @Test

    public void validAccountInformation() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector(".skip-active [title='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys("jula.cristina@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector(".block-content li:nth-child(2) a")).click();
        driver.findElement(By.id("current_password")).sendKeys("cristina");
        driver.findElement(By.cssSelector("li.control>label")).click();
        driver.findElement(By.id("password")).sendKeys("cristina");
        driver.findElement(By.id("confirmation")).sendKeys("cristina");
        driver.findElement(By.cssSelector(".button[title='Save']")).click();
        WebElement myAccount = driver.findElement(By.cssSelector("body"));
        Assert.assertTrue(myAccount.isDisplayed());
        WebElement verifyAccount = driver.findElement(By.cssSelector(".hello strong"));
        Assert.assertEquals("Hello, Cioponea C Cristina!", verifyAccount.getText());
        driver.quit();









    }
}
