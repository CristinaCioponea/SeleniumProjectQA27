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
    loginPage.setEmailField(userEmail);
    loginPage.setPassField(userPass);
    loginPage.clickLoginButton();
    Assert.assertEquals("Hello, Cioponea C Cristina!", accountPage.getWelcomeText());

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

