package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.ProductsGridPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

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
