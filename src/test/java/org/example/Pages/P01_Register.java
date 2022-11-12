package org.example.Pages;

import com.mifmif.common.regex.Generex;
import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_Register {
    public WebElement register_link() {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement select_gender() {
        return Hooks.driver.findElement(By.className("male"));
    }
    public WebElement frist_name() {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement last_name() {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    public  WebElement select_day(){
      return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public  WebElement select_month(){
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public  WebElement select_year(){
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement company() {
        return Hooks.driver.findElement(By.id("Company"));
    }

    public WebElement Password() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirm_password() {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement sucess_msg(){
        return Hooks.driver.findElement(By.className("result"));
    }

    public WebElement register_btn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
}


