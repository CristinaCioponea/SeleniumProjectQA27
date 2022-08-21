package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YourLanguage extends BaseTest {
    @Test
    public void selectYourLanguage(){

        driver.findElement(By.cssSelector("#select-language")).click();
        driver.findElement(By.cssSelector("#select-language")).click();
       driver.quit();

    }

}
