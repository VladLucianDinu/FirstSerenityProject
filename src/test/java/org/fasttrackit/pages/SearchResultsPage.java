package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".item.last")
    private List<WebElementFacade> searchResults;

    @FindBy(css = ".category-products > div.toolbar > div.sorter > div > select")
    private WebElementFacade sortBySelect;

    @FindBy(css = ".category-products > div.toolbar > div.sorter > div > a")
    private WebElementFacade sortArrow;

    @FindBy(id = "#product-price-372 > span")
    private WebElementFacade minPriceProduct;

    @FindBy(id = "#product-price-375 > span")
    private WebElementFacade maxPriceProduct;


    public boolean matchSearch(String searchText) {
        for (WebElementFacade element : searchResults) {
            String text = element.findBy(By.cssSelector(".product-name a")).getText();
            if (text.toLowerCase().contains(searchText)) {
                return true;
            }
        }
        return false;
    }

    public void clickSortByDropdownButton() {
        sortBySelect.selectByIndex(2);

    }

    public void clickSortArrowAscending() {
        String text = sortArrow.getText();
        if (text.equals("Set Ascending Direction")) {
            clickOn(sortArrow);
        }
    }

    public int setMinPriceProduct() {
        String valueOfString = minPriceProduct.getText();
       return Integer.parseInt(valueOfString);
    }

    public int setMaxPriceProduct(){
        String valueOfString = maxPriceProduct.getText();
        return Integer.parseInt(valueOfString);
    }




}
