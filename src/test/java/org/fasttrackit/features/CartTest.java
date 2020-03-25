package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductsGridPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;

public class CartTest extends Init {

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductSteps productSteps;

    @Steps
    private ProductPage productPage;

    @Steps
    private ProductsGridPage productsGridPage;

    @Test
    public void addToCart() {
        loginSteps.login("vladregister1@mailinator.com",
                "abcdef",
                "Hello, Vlad Lucian Dinu!");
        productSteps.navigateToProductPage();
        productSteps.addProductToCart();
        productSteps.checkAddToCart("Sullivan Sport Coat was added to your shopping cart.");
    }


}
