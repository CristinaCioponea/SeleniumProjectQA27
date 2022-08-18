package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class CartTest extends BaseTest{
    @Test
    public void addToCartTest (){
        String productName = "Silver Desert necklace";
        int productQty = 2;

        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue(searchResultsPage.isProductsInLista(productName));
        productPage.setQtyField(productQty);
        productPage.clickAddToCartButton();
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
                , cartPage.getSuccessMessageSpan().toLowerCase());
        Assert.assertEquals(productQty + "", cartPage.getQtyField());
    }
    @Test
    public void loginAndAddToCartTest() {
        String productName = "Silver Desert necklace";
        int productQty = 2;

        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPassField(userPass);
        loginPage.clickLoginButton();
        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue(searchResultsPage.isProductsInLista(productName));
        productPage.setQtyField(productQty);
        productPage.clickAddToCartButton();
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
                , cartPage.getSuccessMessageSpan().toLowerCase());
        Assert.assertEquals(productQty + "", cartPage.getQtyField());

    }

}
