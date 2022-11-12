package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Home;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P03_Home home = new P03_Home();
    SoftAssert soft = new SoftAssert();

    @Given("user enter Product_Name as{string}")
    public void userEnterProduct_NameAs(String product_name) {
        home.Search_txtbox().sendKeys(product_name);

    }
    @When("user press search button")
    public void userPressSearchButton() {
        home.Search_btn().click();
    }


    @Then("result search by as {string} appear successfully")
    public void resultSearchByAsAppearSuccessfully(String product_name) {
        String actual_result = Hooks.driver.getCurrentUrl();
        String excepted_result= "https://demo.nopcommerce.com/search?q";
        soft.assertTrue(actual_result.contains(excepted_result),"assertion url search fail");
        int size = home.product_list().size();
       soft.assertTrue(size !=0 ,"Assertion search fail ,no result appear");
        for (int i=0 ; i< size ; i++)
        {
            String actul_result = home.product_list().get(i).getText().toLowerCase();
            soft.assertTrue(actul_result.contains(product_name),"assertion by product_name fail");
           // System.out.println(size);
            System.out.println(product_name);
            System.out.println(actul_result);

        }
        soft.assertAll();
    }

    @Given("user enter sku as{string}")
    public void userEnterSkuAs(String sku) {
        home.Search_txtbox().sendKeys(sku);
    }

    @Then("result search by as {string} appears successfully")
    public void resultSearchByAsAppearsSuccessfully(String sku) throws InterruptedException {
        String actual_result_sku = home.get_result_by_sku().getText();
        String except_result_sku = sku;
        Assert.assertEquals(actual_result_sku,except_result_sku,"Assertion sku fail");

    }
}
