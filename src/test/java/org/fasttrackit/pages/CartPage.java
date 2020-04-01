package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")

public class CartPage extends PageObject {

    @FindBy(css = ".success-msg span")
    private WebElementFacade cartMessageParagraph;

    @FindBy(css = ".cart-totals-wrapper button > span > span")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy(css = ".product-cart-total .cart-price .price")
    private List<WebElementFacade> subtotalPriceList;

    @FindBy(css = "#shopping-cart-totals-table tr:nth-child(1) > td:nth-child(2) > span")
    private WebElementFacade subtotalValue;

    @FindBy(css = "tbody > tr:nth-child(2) > td:nth-child(2) > span")
    private WebElementFacade taxValue;

    @FindBy(css = "tfoot > tr > td:nth-child(2) > strong > span")
    private WebElementFacade grandTotalValue;

    public String getCartMessageParagraph() {
        return cartMessageParagraph.getText();
    }

    public void clickProceedToCheckout() {
        clickOn(proceedToCheckoutButton);
    }

    public int stringPriceSubtotal() {
        int sum = 0;
        for (WebElementFacade element : subtotalPriceList) {
            String priceText = element.getText().replace(",00 RON", "");
            int price = Integer.parseInt(priceText);
            sum = price + sum;
        }
        return sum;
    }

    public int setSubtotalValue() {
        String priceAsString = subtotalValue.getText().replace(",00 RON", "");
        return Integer.parseInt(priceAsString);
    }

    public float setTaxValue() {
        String priceAsString = taxValue.getText().replace( " RON", "");
       String newPriceAsString = priceAsString.replace(",",".");
        return Float.parseFloat(newPriceAsString);
    }

    public float setGrandTotalValue() {
        String priceAsString = grandTotalValue.getText().replace(" RON", "");
        String newPriceAsString = priceAsString.replace(",",".");
        return Float.parseFloat(newPriceAsString);
    }


}
