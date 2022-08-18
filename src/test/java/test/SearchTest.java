package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.HomePage;

public class SearchTest extends BaseTest{


@Test
    public void searchForItemTest (){
        homePage.setSearchField("shirt");
        homePage.clickSearchButton();

}

}
