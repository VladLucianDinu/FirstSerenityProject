package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.ProductPage;
import org.fasttrackit.steps.CartSteps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.steps.ProductSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;

public class CheckoutTest extends Init {

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
        productSteps.selectProductFromCategory();
        productSteps.addProductToCart();
        cartSteps.navigateToCheckoutPage();
        cartSteps.prepareOrder();
        cartSteps.checkPrepareOrder("THANK YOU FOR YOUR PURCHASE!");
    }


}
