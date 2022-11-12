package org.example.StepDefs;

import com.mifmif.common.regex.Generex;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.Pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    Hooks hooks = new Hooks();
    P01_Register register = new P01_Register();

    @Given("user open register page")
    public void open_browser() {
        register.register_link().click();
    }

    @And("user select gender type")
    public void select_gender() {
        register.select_gender().click();
    }

    @And("user enter fristname {string} and lastname {string}")
    public void userEnterFristnameAndLastname(String fristname, String lastname) {
        register.frist_name().sendKeys(fristname);
        register.last_name().sendKeys(lastname);
    }

    @And("user enter brithday")
    public void userEnterBrithday() {
        Select ddl_day = new Select(register.select_day());
        ddl_day.selectByIndex(22);
        Select ddl_month = new Select(register.select_month());
        ddl_month.selectByIndex(11);
        Select ddl_year = new Select(register.select_year());
        ddl_year.selectByValue("1989");
    }

    @And("user enter email")
    public void userEnterEmail() {
        String regex = "\\w{10}\\@gmail\\.com";
        register.email().sendKeys(new Generex(regex).random()); //generate random email
    }

    @And("user enter password fields {string} {string}")
    public void userEnterPasswordFields(String password, String confirm_password) {
        register.Password().sendKeys(password);
        register.confirm_password().sendKeys(confirm_password);
    }

    @When("user click register button")
    public void click_register() {
        register.register_btn().click();
    }

    @Then("user registered successfully")
    public void registered_successfully() {
        SoftAssert soft =new SoftAssert();
        String excepted_result = "Your registration completed";
        String actual_result = register.sucess_msg().getText();
        String actual_msg_color = "rgba(76, 177, 124, 1)";
        String excepted_msg_color=register.sucess_msg().getCssValue( "color");
        soft.assertTrue(actual_result.contains(excepted_result),"sucess msg asseration fail");
        soft.assertTrue(actual_msg_color.equals(excepted_msg_color),"msg color assertion fail");
        soft.assertAll();
    }
}
