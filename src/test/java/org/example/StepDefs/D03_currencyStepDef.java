package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Pages.P03_Home;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currencyStepDef {
    P03_Home home =new P03_Home();
    @Given("user select currency Euro")
        public void Select_Currency(){
        Select currency_ddl = new Select(home.select_currency());
        currency_ddl.selectByIndex(1);
        }


    @Then("Symbol \\(€) is shown on the products displayed in Home page")
    public void symbol€IsShownOnTheProductsDisplayedInHomePage() {
        int size = home.item_prices_list().size();
        for (int i=0 ; i< size ; i++){
            String excepted_result =home.item_prices_list().get(i).getText();
            Assert.assertTrue(excepted_result.contains("€"), "Assertion currency fail");
        }
    }
}
