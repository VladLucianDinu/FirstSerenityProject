package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = ".links a[title='Register']")
    private WebElementFacade registerLink;

    public void clickRegister() {
        clickOn(registerLink);
    }

    public void clickAccount() {
        clickOn(accountLink);
    }

    public void clickLogin() {
        clickOn(loginLink);
    }

}
