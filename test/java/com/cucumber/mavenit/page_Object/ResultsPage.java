package com.cucumber.mavenit.page_Object;

import com.cucumber.mavenit.driver.DriverManager;
import cucumber.api.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverManager {
    public void selectFilter(String filteroption){
        new WebDriverWait(driver,10).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector(".RadioListstyles__RadioOption-sc-4132xt-4"),5));

        List<WebElement> reviewElement =driver.findElements(By.cssSelector(".RadioListstyles__RadioOption-sc-4132xt-4"));
        for(WebElement review: reviewElement){
            String availableFilter=review.getText();
            System.out.println(availableFilter);
            if(availableFilter.equalsIgnoreCase(filteroption)){
                review.click();
                break;
            }
        }
    }
    public List<Double> getProductRating(){
        List<Double> ratingList= new ArrayList<>();
       List<WebElement> elementRating =driver.findElements(By.cssSelector(".Ratingsstyles__Stars-sc-8mrsjy-2"));
       for(WebElement rating: elementRating){
         String ratingInString = rating.getAttribute("data-star-rating");
         double ratingInDouble= Double.parseDouble(ratingInString);
         ratingList.add(ratingInDouble);
       }
       return ratingList;
    }
}
