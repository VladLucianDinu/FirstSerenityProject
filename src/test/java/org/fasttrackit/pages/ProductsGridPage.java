package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ProductsGridPage extends PageObject {

    @FindBy(css = "li:nth-child(1) div > div.actions > a")
    private WebElementFacade viewDetails;

    public void clickProduct() {
        clickOn(viewDetails);
    }

}
