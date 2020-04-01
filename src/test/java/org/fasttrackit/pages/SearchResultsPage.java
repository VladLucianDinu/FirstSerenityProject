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

    @FindBy(css = "li:nth-child(1) div > div.actions > a")
    private WebElementFacade viewDetails;

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

    public boolean checkPriceAscending() {
        String firstProducPriceAsString = searchResults.get(0).findBy(By.cssSelector(".price"))
                .getText().replace(",00 RON", "");
        int priceFirstProduct = Integer.parseInt(firstProducPriceAsString);
        String lastProductPriceAsString = searchResults.get(searchResults.size() - 1).findElement(By.cssSelector(".price"))
                .getText().replace(",00 RON", "");
        int priceLastProduct = Integer.parseInt(lastProductPriceAsString);
        if (priceFirstProduct <= priceLastProduct) {
            return true;
        }
        return false;
    }

    public void clickViewDetails() {
        clickOn(viewDetails);
    }
}

