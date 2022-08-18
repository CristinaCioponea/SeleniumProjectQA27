package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

public class SearchTest extends BaseTest{


@Test
    public void searchForItemTest (){
        homePage.setSearchField("warranty");
        homePage.clickSearchButton();
        Assert.assertTrue("Pruduct not found",searchResultsPage.isProductsInLista("3-YEAR WARRANTY"));

}
    @Test
    public void searchForItem2Test (){
        homePage.setSearchField("j");
        homePage.clickSearchButton();
        Assert.assertTrue("Pruduct not found",searchResultsPage.isProductsInLista("LUDLOW SHEATH DRESS"));

    }

}
