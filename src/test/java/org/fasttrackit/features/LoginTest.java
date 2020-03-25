package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.fasttrackit.utils.Init;
import org.junit.Test;

public class LoginTest extends Init {

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin() {
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("vladregister1@mailinator.com", "abcdef");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, Vlad Lucian Dinu!");
    }
}
