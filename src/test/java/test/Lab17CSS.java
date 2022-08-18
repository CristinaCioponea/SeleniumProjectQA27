package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;

public class Lab17CSS {
    @Test
    public void CSSselectors() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
//        driver.findElement(By.cssSelector("#search_mini_form > div.input-box > button")).click();
//        driver.findElement(By.cssSelector("[title='Search']")).click();
//        driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.first.odd > td.a-center.product-cart-remove.last > a")).click();
//        driver.findElement(By.cssSelector(".a-center.product-cart-remove.last [href*=\"19512\"]")).click();
//        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.cart.display-single-price > div.cart-totals-wrapper > div > ul > li > button")).click();
//        driver.findElement(By.cssSelector(".method-checkout-cart-methods-onepage-bottom [title='Proceed to Checkout']")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select")).click();
        driver.findElement(By.cssSelector(".toolbar [title=\"Sort By\"]:not(.toolbar-bottom)")).click();










    }
}
