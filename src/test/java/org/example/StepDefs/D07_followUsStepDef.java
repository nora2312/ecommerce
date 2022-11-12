package org.example.StepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_Home;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_Home home = new P03_Home();

    @Given("user clicks facebook link")
    public void click_FB_link() {
        home.FB_link().click();
    }

    @Then("facebook link {string}opens successfully")
    public void facebookLinkOpensSuccessfully(String FB_link) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        String actual_result = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actual_result, FB_link, "Assertion FB_link fail");

    }

    @When("user clicks twitter link")
    public void userClicksTwitterLink() {
        home.Twitter_link().click();
    }

    @Then("twitter link {string}opens successfully")
    public void twitterLinkOpensSuccessfully(String twitter_link) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        String actual_result = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(actual_result, twitter_link, "Assertion twitter fail");
    }

    @When("user clicks rss link")
    public void userClicksRssLink() {
        home.rss_link().click();
    }

    @Then("rss link {string}opens successfully")
    public void rssLinkOpensSuccessfully(String rss_link) {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));
            ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
            Hooks.driver.switchTo().window(Tabs.get(1));
        } catch (Exception e) {
            String actual_result = Hooks.driver.getCurrentUrl();
            Assert.assertEquals(actual_result, rss_link, "Assertion rss fail");
        }
    }

    @When("user clicks Youtube link")
    public void userClicksYoutubeLink() {
        home.youtube_link().click();
    }

    @Then("Youtube link {string} opens successfully")
    public void youtubeLinkOpensSuccessfully(String youtube_link) {
        WebDriverWait wait =new WebDriverWait(Hooks.driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String > Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(Tabs.get(1));
        String actual_result= Hooks.driver.getCurrentUrl();
        System.out.println(actual_result);
        Assert.assertEquals(actual_result,youtube_link,"Assertion youtube fail");
    }
}
