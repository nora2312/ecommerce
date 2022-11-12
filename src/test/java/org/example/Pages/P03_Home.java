package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Home {
    public WebElement select_currency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> item_prices_list() {
        List<WebElement> list = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

        return list;
    }

    public WebElement Search_txtbox() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement Search_btn() {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }

    public List<WebElement> product_list() {
        List<WebElement> product_list = Hooks.driver.findElements(By.cssSelector("div[class=\"product-item\"] h2[class=\"product-title\"]"));
        return product_list;
    }

    public WebElement get_result_by_sku() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("div[class=\"product-item\"] h2[class=\"product-title\"]")).click();
        Thread.sleep(2000);
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
    }

    public WebElement get_Slider1() {
        return Hooks.driver.findElement(By.cssSelector
                ("div[id=\"nivo-slider\"] a[class=\"nivo-imageLink\"]:nth-child(1)"));
    }

    public WebElement get_Slider2() {
        return Hooks.driver.findElement(By.cssSelector
                ("div[id=\"nivo-slider\"] a[class=\"nivo-imageLink\"]:nth-child(2)"));
    }

    public WebElement FB_link() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"facebook\"] a[target=\"_blank\"]"));
    }

    public WebElement Twitter_link() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"twitter\"] a[target=\"_blank\"]"));
    }

    public WebElement rss_link() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"rss\"] a[href=\"/news/rss/1\"]"));
    }

    public WebElement youtube_link() {
        return Hooks.driver.findElement(By.cssSelector("li[class=\"youtube\"] a[target=\"_blank\"]"));
    }

    public List<WebElement> Wishlist_Btn() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));

        //return Hooks.driver.findElement(By.cssSelector("div[data-productid=\"18\"] button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement Product_added_wishlist_msg()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement Wislist_link()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }
    public WebElement Qty_txt()
    {
        return Hooks.driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]/input"));

    }
    public List<WebElement> Category(){
        return Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }

    public List<WebElement> Sub_Category(int categorynum)
    {
        categorynum = categorynum+1;
        return Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"] /li["+categorynum+"] /ul[@class=\"sublist first-level\"]/li"));
    }

    public WebElement Sub_category_page_tilte(){
        return Hooks.driver.findElement(By.className("page-title"));
    }
}
