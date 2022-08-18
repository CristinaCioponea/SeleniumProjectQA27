package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

@Test
    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector(" [title=\"Register\"]")).click();
        driver.findElement(By.id("firstname")).sendKeys("Cioponea");
        driver.findElement(By.id("middlename")).sendKeys("C");
        driver.findElement(By.id("lastname")).sendKeys("Cristina");
        driver.findElement(By.id("email_address")).sendKeys("jula.cristina@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("cristina");
        driver.findElement(By.id("confirmation")).sendKeys("cristina");
        driver.findElement(By.cssSelector(".button[title=\"Register\" ] span")).click();
        driver.quit();




    }
}