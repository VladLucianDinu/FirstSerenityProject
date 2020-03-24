package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/men/blazers.html")

public class ProductsGridPage extends PageObject {

    @FindBy(css = "li:nth-child(1) div > div.actions > a")
    private WebElementFacade viewDetalis;

    public void clickProduct() {
        clickOn(viewDetalis);
    }

}
