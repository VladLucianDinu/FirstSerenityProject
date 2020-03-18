package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.CartPage;
import org.fasttrackit.pages.LoginPage;
import org.fasttrackit.pages.ProductPage;
import org.junit.Assert;
import org.junit.Test;

public class ProductSteps {

    private ProductPage productPage;
    private CartPage cartPage;


    @Step
    public void addProductToCart() {
        productPage.clickColorButton();
        productPage.clickSizeButton();
        productPage.clickAddToCartButton();
    }

    @Step
    public void checkAddToCart(String expected) {
        String message = cartPage.getCartMessageParagraph();
        Assert.assertEquals(expected, message);
    }
}