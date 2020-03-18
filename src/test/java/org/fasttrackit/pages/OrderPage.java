package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/success/")

public class OrderPage extends PageObject {

    @FindBy(css = ".sub-title")
    private WebElementFacade confirmOrderMessage;

    public String getConfirmMessage() {
        return confirmOrderMessage.getText();
    }

}
