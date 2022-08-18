package test;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class CartTest {
    //driver
    private WebDriver driver;
    //page objects
     private HomePage homePage;
     private LoginPage loginPage;
     private AccountPage accountPage;

     @Before
    public void initDriver(){
         //init driver
         System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         //init page objects
         HomePage homePage = new HomePage(driver);
         LoginPage loginPage = new LoginPage(driver);
         AccountPage accountPage = new AccountPage(driver);
         // navigate to homepage
         driver.get("http://testfasttrackit.info/selenium-test");

     }

}
