package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/create/")

public class RegisterPage extends PageObject {

    @FindBy(id = "firstname")
    private WebElementFacade firstNameField;

    @FindBy(id = "middlename")
    private WebElementFacade middleNameField;

    @FindBy(id = "lastname")
    private WebElementFacade lastNameField;

    @FindBy(id = "email_address")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(id = "confirmation")
    private WebElementFacade confirmPassField;

    @FindBy(id = "is_subscribed")
    private WebElementFacade newsletterCheckbox;

    @FindBy(css = ".buttons-set button")
    private WebElementFacade registerButton;

    public void setFirstNameField(String firstName) {
        waitFor(firstNameField);
        typeInto(firstNameField, firstName);
    }

    public void setMiddleNameField(String middleName) {
        typeInto(middleNameField, middleName);
    }

    public void setLastNameField(String lastName) {
        typeInto(lastNameField, lastName);
    }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }

    public void setConfirmPassField(String passConfirm) {
        typeInto(confirmPassField, passConfirm);
    }

    public void clickNewsletterCheckbox() {
        clickOn(newsletterCheckbox);
    }

    public void clickRegister() {
        clickOn(registerButton);
    }


}
