package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class HomePage extends PageObject {

    @FindBy(css = ".skip-account")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = ".links a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(css = ".nav-2.parent > a")
    private WebElementFacade menCategory;

    @FindBy(css = ".nav-2-5.last > a")
    private WebElementFacade blazers;

    @FindBy(id = "search")
    private WebElementFacade searchField;

    @FindBy (css = ".input-box > button")
    private WebElementFacade searchButton;

    public void clickRegister() {
        clickOn(registerLink);
    }

    public void clickAccount() {
        clickOn(accountLink);
    }

    public void clickLogin() {
        clickOn(loginLink);
    }

    public void navigateToProductsGridPage() {
        Actions action = new Actions(getDriver());

//        WebElement category = getDriver().findElement(By.cssSelector(".nav-2.parent > a"));
        action.moveToElement(menCategory).build().perform();
//        WebElement blazer = getDriver().findElement(By.cssSelector(".nav-2-5.last > a"));
        action.moveToElement(blazers).build().perform();
        clickOn(blazers);
    }

    public void setSearchField(String searchText) {
        clickOn(searchField);
        typeInto(searchField,searchText);
        clickOn(searchButton);
    }

}
