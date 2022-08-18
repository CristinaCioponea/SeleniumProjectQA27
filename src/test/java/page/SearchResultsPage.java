package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".products-grid .product-name")
    private List<WebElement> listOfProducts;

    public boolean isProductsInLista(String productName){
        for (WebElement element: listOfProducts){
            if (element.getText().equalsIgnoreCase(productName)){
                return true;

            }
        }


        return false;
    }
}
