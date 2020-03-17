package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.LoginSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Test
    public void testValidLogin(){
        loginSteps.navigateToLoginPage();
        loginSteps.setCredentials("vladserenit@mailinator.com","abcdef");
        loginSteps.clickLogin();
        loginSteps.checkLoggedIn("Hello, ");
    }
}
