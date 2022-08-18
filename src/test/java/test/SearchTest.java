package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

public class SearchTest {
    private WebDriver driver;
    private HomePage homePage;
    @Before
    public void initialDriver() {
        //init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //init page objects
        homePage = new HomePage(driver);
        driver.get("http://testfasttrackit.info/selenium-test");


    }
@Test
    public void searchForItemTest (){

}

}
