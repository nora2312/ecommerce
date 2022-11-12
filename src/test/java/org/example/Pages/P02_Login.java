package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    public WebElement login_link()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement email(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement login_btn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public  WebElement My_account_tab()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public  WebElement fail_login()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}
