package org.fasttrackit.utils;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class Init {

    @Managed(uniqueSession = true)
    private WebDriver driver;





}
