package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.RegisterSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;

public class RegisterTest extends Init {

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




