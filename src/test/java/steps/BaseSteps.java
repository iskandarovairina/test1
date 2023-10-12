package steps;

import io.cucumber.java.en.Then;
import roll20.pages.BasePage;

public class BaseSteps {
    BasePage basePage=new BasePage();


    @Then("Click {string} button")
    public void clickButton(String text){basePage.clickButton(text);}
}
