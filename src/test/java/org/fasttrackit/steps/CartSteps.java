package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.CheckoutPage;
import org.fasttrackit.pages.OrderPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;

public class CartSteps {

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

    @Step
    public void checkCartSummary() {
        int sumProducts = cartPage.stringPriceSubtotal();
        int subTotal = cartPage.setSubtotalValue();
        float tax = cartPage.setTaxValue();
        float grandTotal = cartPage.setGrandTotalValue();
        float productsPlusShipping = sumProducts + tax;
        Assert.assertEquals(sumProducts, subTotal);
        Assert.assertEquals(productsPlusShipping,grandTotal,1);
    }


}