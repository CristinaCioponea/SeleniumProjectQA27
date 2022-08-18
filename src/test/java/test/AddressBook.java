package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddressBook {
    @Test
    public void addressBook(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector(".skip-active [title='My Account']")).click();
        driver.findElement(By.id("email")).sendKeys("jula.cristina@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("cristina");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.findElement(By.cssSelector(".block-content li:nth-child(3) a")).click();
        driver.findElement(By.cssSelector(".customer-account")).click();
        driver.findElement(By.id("telephone")).sendKeys("0744 444 444");
        driver.findElement(By.id("street_1")).sendKeys("1 street");
        driver.findElement(By.id("city")).sendKeys("Hawaii");
        driver.findElement(By.id("region_id")).sendKeys("Hawaii");
        driver.findElement(By.id("zip")).sendKeys("1856");
        driver.findElement(By.id("country")).sendKeys("Statele Unite ale Americii");
        driver.findElement(By.cssSelector(".button[title=\"Save Address\"]")).click();










    }
}
