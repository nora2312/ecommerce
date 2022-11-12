package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Home;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_Home home = new P03_Home();
    @Given("user click on slider_1")
    public void click_Slider() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofMillis(1000));
        wait.until(ExpectedConditions.attributeToBe(home.get_Slider1(),"style","display: block;"));
        home.get_Slider1().click();
    }

    @Then("user direct to Nokia Lumia page")
    public void userDirectToNokiaLumiaPage() {
        String excepted_result="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actual_result =Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actual_result,excepted_result,"Assertion 1st slider fail");
    }

     @When("user click on slider_2")
    public void userClickOnSecondSlider() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.attributeContains(home.get_Slider2(),"style","display: block;"));
        home.get_Slider2().click();

    }

    @Then("user direct to iPhone")
    public void userDirectToIPhone() {
        String excepted_result="https://demo.nopcommerce.com/iphone-6";
        String actual_result =Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actual_result,excepted_result,"Assertion 2nd slider fail");
    }
}
