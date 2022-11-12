package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Home;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.util.Random;

public class D05_hoverCategoriesStepDef {
    P03_Home home = new P03_Home();
    Actions action = new Actions(Hooks.driver);
    int select_item_num = 0;
    int select_Sub_item_num;
    String Sub_Item_title ;
    @Given("user havour random category")
    public void select_random_categoty() throws InterruptedException {

        select_item_num = new Random().nextInt(3); // random from 0 to 2
        System.out.println("Select_item " + select_item_num);
        action.moveToElement(home.Category().get(select_item_num)).perform();
        Thread.sleep(2000);

    }

    @When("user clicks on of selected category")
    public void userClicksOnOfSelectedCategory() {
        select_Sub_item_num = new Random().nextInt(3);
        Sub_Item_title =home.Sub_Category(select_item_num).get(select_Sub_item_num).getText().toLowerCase().trim();
        System.out.println(Sub_Item_title);
        home.Sub_Category(select_item_num).get(select_Sub_item_num).click();

    }

    @Then("check that sub-category title equal selected menu item")
    public void checkThatSubCategoryTitleEqualSelectedMenuItem() {
        String Sub_caterory_page_tilte=home.Sub_category_page_tilte().getText().toLowerCase().trim();
        System.out.println(Sub_caterory_page_tilte);
        Assert.assertTrue(Sub_Item_title.equals(Sub_caterory_page_tilte),"Assertion Subcateroty page tilte fail");


    }


}
