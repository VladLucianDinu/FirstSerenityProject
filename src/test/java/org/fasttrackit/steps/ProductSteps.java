package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class ProductSteps {

    private ProductPage productPage;
    private CartPage cartPage;
    private HomePage homePage;
    private ProductsGridPage productsGridPage;
    private SearchResultsPage searchResultsPage;

    @Step
    public void selectProductFromCategory() {
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
        boolean checkString = message.contains(expected);
        Assert.assertTrue(checkString);
    }

    @Step
    public void searchToProductPage(String searchText) {
        homePage.open();
        homePage.setSearchField(searchText);
        searchResultsPage.clickViewDetails();
    }

}
