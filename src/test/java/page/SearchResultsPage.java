package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(css = ".products-grid .product-name")
    private List<WebElement> listOfProducts;

    public boolean isProductsInLista(String productName){
        for (WebElement element: listOfProducts){
            if (element.getText().equals(productName)){
                return true;

            }
        }


        return false;
    }
}
