package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.SearchResultsPage;
import org.junit.Assert;


public class SearchSteps {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void searchProduct(String searchText) {
        homePage.open();
        homePage.setSearchField(searchText);
    }

    @Step
    public void checkMatchSearch(String searchText) {
        boolean foundItem = searchResultsPage.matchSearch(searchText);
        Assert.assertTrue(foundItem);

    }
}
