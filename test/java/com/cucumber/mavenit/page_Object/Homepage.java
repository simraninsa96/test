package com.cucumber.mavenit.page_Object;

import com.cucumber.mavenit.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Homepage extends DriverManager {
    public  String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
    public void doSearch(String searchTerm){
        driver.findElement(By.cssSelector("#searchTerm")).sendKeys(searchTerm);
        driver.findElement(By.cssSelector("#searchTerm")).sendKeys(Keys.ENTER);
    }
}
