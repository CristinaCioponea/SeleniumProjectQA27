import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountInformation {
    public void validAccountInformation(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.first > a")).click();
        driver.findElement(By.id("email")).sendKeys("jula.cristina@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#send2 > span > span")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-left.sidebar.col-left-first > div > div.block-content > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("current_password")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#form-validate > div:nth-child(1) > ul > li.control > label")).click();
        driver.findElement(By.id("password")).sendKeys("cristina");
        driver.findElement(By.id("confirmation")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();




    }
}
