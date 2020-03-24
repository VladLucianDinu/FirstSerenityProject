package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class ProductSteps {

    private ProductPage productPage;
    private CartPage cartPage;
    private HomePage homePage;
    private ProductsGridPage productsGridPage;

    @Step
    public void navigateToProductPage() {
        homePage.open();
        homePage.navigateToProductsGridPage();
        productsGridPage.clickProduct();
    }

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
