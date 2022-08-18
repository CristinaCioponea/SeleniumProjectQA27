package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class LoginTest extends BaseTest{

@Test
        public void validLoginTest(){
    homePage.clickAccountLink();
    homePage.clickLoginLink();
    loginPage.setEmailField("jula.cristina@yahoo.com");
    loginPage.setPassField("cristina");
    loginPage.clickLoginButton();
    Assert.assertEquals("Hello, Cioponea C Cristina!", accountPage.getWelcomeText());



            driver.findElement(By.cssSelector(".skip-account .label")).click();
            driver.findElement(By.cssSelector("[title=\"Log In\"]")).click();
            driver.findElement(By.id("email")).sendKeys("jula.cristina@yahoo.com");
            driver.findElement(By.id("pass")).sendKeys("cristina");
            driver.findElement(By.id("send2")).click();
            WebElement welcomeText = driver.findElement(By.cssSelector(".hello strong"));
            Assert.assertEquals("Hello, Cioponea C Cristina!", welcomeText.getText());
            WebElement myAccount = driver.findElement(By.cssSelector(".hello strong"));
            Assert.assertTrue(myAccount.isDisplayed());

        }
        @Test

        public void changeLanguageTest(){
//        select-language
            Select selectLanguageDropdown = new Select(driver.findElement(By.id("select-language")));
            selectLanguageDropdown.selectByVisibleText("German");

        }
        @Test

        public void hoverOverCategoryTest(){
            Actions action = new Actions(driver);
            WebElement womenCategory = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a"));
            action.moveToElement(womenCategory).perform();
            WebElement viewAll = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > ul > li.level1.view-all > a"));
            viewAll.click();
        }
        @After
                public void closeDriver(){
            driver.quit();
        }



    }

