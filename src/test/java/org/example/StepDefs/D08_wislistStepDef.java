package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_Home;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.awt.*;
import java.security.PublicKey;
import java.time.Duration;

public class D08_wislistStepDef {
    P03_Home home = new P03_Home();

    @Given("user click on wishlist button on product")
    public void click_wislistBtn() {
        home.Wishlist_Btn().get(2).click();
    }

    @Then("msg appears that product added successfully")
    public void msgAppearsThatProductAddedSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actual_msg = home.Product_added_wishlist_msg().getText();

        String excepted_msg = "The product has been added to your ";
        soft.assertTrue(actual_msg.contains(excepted_msg), "Assertion wishlist msg fail");

        String actual_background_color = home.Product_added_wishlist_msg().getCssValue("background-color");
        String excepted_background_color = "#4bb07a";
        soft.assertTrue(Color.fromString(actual_background_color).asHex().equals(excepted_background_color), "Assertion msg wishlist fail");
        soft.assertAll();
    }

    @And("enter to wishlist checj that Qty bigger than zero")
    public void enterToWishlistChecjThatQtyBiggerThanZero()  {
        WebDriverWait wait =new WebDriverWait(Hooks.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOf(home.Product_added_wishlist_msg()));
        home.Wislist_link().click();
       int actualreult_QTy= Integer.parseInt(home.Qty_txt().getAttribute("value"));
        Assert.assertTrue(actualreult_QTy >0 ,"Assertion Qty fail");


    }
}
