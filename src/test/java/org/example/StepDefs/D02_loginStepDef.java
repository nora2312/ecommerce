package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_Login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;
import java.awt.*;

public class D02_loginStepDef {
    P02_Login login = new P02_Login();
    SoftAssert soft = new SoftAssert();
    @Given("user go to login page")
    public void open_loginpage() {
        login.login_link().click();
    }

    @And("user enter email {string} and password {string}")
    public void userEnterEmailAndPassword(String email, String password) {
        login.email().sendKeys(email);
        login.password().sendKeys(password);
    }

    @When("user press login button")
    public void userPressLoginButton() {
        login.login_btn().click();

    }

    @Then("user can login successfully")
    public void userCanLoginSuccessfully() {
        String excepeted_result="https://demo.nopcommerce.com/";
        String actual_result= Hooks.driver.getCurrentUrl();
        soft.assertTrue(login.My_account_tab().isDisplayed());
        soft.assertEquals(excepeted_result,actual_result);
        soft.assertAll();

    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String excepted_result = "Login was unsuccessful. Please correct the errors and try again";
        String actual_result = login.fail_login().getText();
        String actual_msg_color="#e4434b";
        String excepted_msg_color=login.fail_login().getCssValue("color");
        soft.assertTrue(actual_result.contains(excepted_result),"assertion msg invaild login fail");
        soft.assertEquals(actual_msg_color, Color.fromString(excepted_msg_color).asHex(),"assertion color fail");
       // System.out.println( "color" + Color.fromString(excepted_msg_color).asHex());
        soft.assertAll();
    }
}
