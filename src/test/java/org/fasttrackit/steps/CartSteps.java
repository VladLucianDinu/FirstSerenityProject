package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.OrderPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps {

    private ProductPage productPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private OrderPage orderPage;

    @Step
    public void navigateToCheckoutPage() {
        cartPage.clickProceedToCheckout();
    }

    @Step
    public void prepareOrder() {
        checkoutPage.clickShipToThisAddressButton();
        checkoutPage.clickAddressContinueButton();
        checkoutPage.clickFreeShippingButton();
        checkoutPage.clickShoppingContinueButton();
        checkoutPage.clickCashOnDeliveryContinueButton();
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void checkPrepareOrder(String expected) {
        String message = orderPage.getConfirmMessage();
        Assert.assertEquals(expected, message);
    }


}