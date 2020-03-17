package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.HomePage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.RegisterPage;
import org.junit.Assert;

public class RegisterSteps {

    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToRegisterPage() {
        homePage.open();
        homePage.clickAccount();
        homePage.clickRegister();
    }

    @Step
    public void setUserData(String firstName, String middleName, String lastName, String email, String pass, String confirmPass) {
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPassField(pass);
        registerPage.setConfirmPassField(confirmPass);
    }

    @Step
    public void checkNewsletterCheckbox() {
        registerPage.clickNewsletterCheckbox();
    }

    @Step
    public void clickRegister() {
        registerPage.clickRegister();
    }

    @Step
    public void checkRegister(String expected) {
        String message = myAccountPage.getRegisterMessage();
        Assert.assertEquals(expected, message);
    }


}
