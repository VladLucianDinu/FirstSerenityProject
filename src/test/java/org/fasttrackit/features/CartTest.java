package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductsGridPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CartTest extends Init {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private SearchSteps searchSteps;

    @Steps
    private CartSteps cartSteps;

    @Test
    public void addToCart() {
        loginSteps.login("vladregister1@mailinator.com",
                "abcdef",
                "Hello, Vlad Lucian Dinu!");
        productSteps.selectProductFromCategory();
        productSteps.addProductToCart();
        productSteps.checkAddToCart("was added to your shopping cart.");
    }

    @Test
    public void cartSummaryTest() {
        String[] searchTerms = new String[]{ "pants", "tees", "tops"};
        for (String element : searchTerms) {
            productSteps.searchToProductPage(element);
            productSteps.addProductToCart();
            productSteps.checkAddToCart("was added to your shopping cart.");
        }
        cartSteps.checkCartSummary();
    }
}
