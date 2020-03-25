package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import java.util.List;

public class SearchResultsPage extends PageObject {

    @FindBy(css = ".item.last")
    private List<WebElementFacade> searchResults;


    public boolean matchSearch(String searchText) {
        for (WebElementFacade element : searchResults) {
            String text = element.findBy(By.cssSelector(".product-name a")).getText();
            if (text.toLowerCase().contains(searchText)) {
                return true;
            }
        }
        return false;
    }
}
