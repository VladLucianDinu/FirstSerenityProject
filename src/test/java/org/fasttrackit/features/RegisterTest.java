package org.fasttrackit.features;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class RegisterTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    @Test
    public void testValidRegister() {
        registerSteps.navigateToRegisterPage();
        registerSteps.setUserData("Vlad", "Lucian", "Dinu", "vladregister1@mailinator.com", "abcdef", "abcdef");
        registerSteps.checkNewsletterCheckbox();
        registerSteps.clickRegister();
        registerSteps.checkRegister("Thank you for registering with Madison Island.");
    }


}




