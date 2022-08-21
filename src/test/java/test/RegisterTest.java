package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends BaseTest {

@Test
    public void validRegisterTest(){

        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector(" [title=\"Register\"]")).click();
        driver.findElement(By.id("firstname")).sendKeys("Cioponea");
        driver.findElement(By.id("middlename")).sendKeys("C");
        driver.findElement(By.id("lastname")).sendKeys("Cristina");
        driver.findElement(By.id("email_address")).sendKeys(userEmail);
        driver.findElement(By.id("password")).sendKeys(userPass);
        driver.findElement(By.id("confirmation")).sendKeys("cristina");
        driver.findElement(By.cssSelector(".button[title=\"Register\" ] span")).click();
        driver.quit();




    }
}
