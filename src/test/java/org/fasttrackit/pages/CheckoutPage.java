package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")

public class CheckoutPage extends PageObject {

    @FindBy(id = "billing:use_for_shipping_yes")
    private WebElementFacade shipToThisAddressButton;

    @FindBy(css = "#billing-buttons-container button")
    private WebElementFacade addressContinueButton;

    @FindBy(id = "s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingButton;

    @FindBy(css = "#shipping-method-buttons-container button")
    private WebElementFacade shoppingContinueButton;

    @FindBy(css = "#payment-buttons-container button")
    private WebElementFacade cashOnDeliveryContinueButton;

    @FindBy(css = ".btn-checkout")
    private WebElementFacade placeOrderButton;

    public void clickShipToThisAddressButton() {
        clickOn(shipToThisAddressButton);
    }

    public void clickAddressContinueButton() {
        clickOn(addressContinueButton);
    }

    public void clickFreeShippingButton() {
        waitFor(freeShippingButton);
        clickOn(freeShippingButton);
    }

    public void clickShoppingContinueButton() {
        waitFor(shoppingContinueButton);
        clickOn(shoppingContinueButton);
    }

    public void clickCashOnDeliveryContinueButton() {
        waitFor(cashOnDeliveryContinueButton);
        clickOn(cashOnDeliveryContinueButton);
    }

    public void clickPlaceOrderButton() {
        waitFor(placeOrderButton);
        clickOn(placeOrderButton);
    }


}
