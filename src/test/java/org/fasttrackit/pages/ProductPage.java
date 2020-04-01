package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/men/blazers/oxford-sport-coat-444.html")

public class ProductPage extends PageObject {

    @FindBy(css = "#configurable_swatch_color li:first-child img")
    private WebElementFacade colorButton;

    @FindBy(css = "#configurable_swatch_size li:first-child a")
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
