package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;
import page.SearchResultsPage;

public class BaseTest {
    //driver
    public WebDriver driver;
    //page objects
    public HomePage homePage;
    public LoginPage loginPage;
    public AccountPage accountPage;
    public SearchResultsPage searchResultsPage;


    @Before
    public void initDriver(){
        //init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //init page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        // navigate to homepage
        driver.get("http://testfasttrackit.info/selenium-test");

    }

    @After
    public void closeDriver(){

        driver.quit();
    }

}


