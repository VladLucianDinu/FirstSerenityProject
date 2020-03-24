package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutPage checkoutPage;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private ProductPage productPage;

    @Steps
    private ProductSteps productSteps;

    @Test
    public void placeOrder() {
        loginSteps.login("vladregister1@mailinator.com",
                "abcdef",
                "Hello, Vlad Lucian Dinu!");
        productSteps.navigateToProductPage();
        productSteps.addProductToCart();
        cartSteps.navigateToCheckoutPage();
        cartSteps.prepareOrder();
        cartSteps.checkPrepareOrder("THANK YOU FOR YOUR PURCHASE!");
    }


}
