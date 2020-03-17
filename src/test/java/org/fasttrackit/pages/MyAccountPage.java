package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/index/")
public class MyAccountPage extends PageObject {

    @FindBy (css = ".success-msg span")
    private WebElementFacade registerMessageParagraph;

    @FindBy(css = ".hello strong")
    private WebElementFacade welcomeMessageParagraph;

    public String getRegisterMessage(){
        return registerMessageParagraph.getText();
    }

    public String getWelcomeMessage(){
        return welcomeMessageParagraph.getText();
    }
}
