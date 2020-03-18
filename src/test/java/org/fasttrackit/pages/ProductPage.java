package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/men/blazers/oxford-sport-coat-444.html")

public class ProductPage extends PageObject {

    @FindBy(css = ".swatch-label > img")
    private WebElementFacade colorButton;

    @FindBy(css = "#swatch78 > span.swatch-label")
    private WebElementFacade sizeButton;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElementFacade addToCartButton;

    public void clickColorButton() {
        clickOn(colorButton);
    }

    public void clickSizeButton() {
        clickOn(sizeButton);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }


}
