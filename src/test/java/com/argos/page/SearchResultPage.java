package com.argos.page;

import com.argos.driver.DriverManager;
import com.argos.utils.Helpers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends DriverManager {

    public String getProductTitle(){
        return driver.findElement(By.cssSelector(".styles__SearchTerm-sc-1haccah-1")).getText();
    }

    public void selectAProduct(){
        List<WebElement> productWebElement = driver.findElements(By.cssSelector("a[id^='product-title-'"));
        int elementSize = productWebElement.size();
        System.out.println("Number of product: " + elementSize);
        int randomIndex = new Helpers().randomNumber(elementSize);
        WebElement selectedWebElement = productWebElement.get(randomIndex);
        String expected = selectedWebElement.getText();
        System.out.println("Selected Product Name" + expected);
        selectedWebElement.click();
        sleep(3000);
    }

    public void selectRating(String choice){
        List<WebElement> ratingWebElement = driver.findElements(By.cssSelector("#content-container>label"));
        for(WebElement ratingElement: ratingWebElement){
            String labelTxt = ratingElement.getText();
            if(labelTxt.startsWith(choice)){
                ratingElement.click();
                break;
            }
        }
        sleep(5000);
    }

    public List<Double> getAllProductRatings(){
        List<Double> list =new ArrayList<>();
        List<WebElement> ratingElements = driver.findElements(By.cssSelector("div[data-test='component-ratings']"));
        for(WebElement ratingElement: ratingElements){
            String ratingInString =ratingElement.getAttribute("data-star-rating");
            double ratingInDouble = Double.parseDouble((ratingInString));
            list.add(ratingInDouble);
        }
        return list;
    }

    public void selectPrice(String choice){
        List<WebElement> priceWebElement = driver.findElements(By.cssSelector("div[type='price']"));
        for(WebElement priceElement: priceWebElement){
            String labelTxt = priceElement.getText();
            if(labelTxt.startsWith(choice)){
                priceElement.click();
                break;
            }
        }
        sleep(5000);
    }

    public List<Double> getAllPriceFilter(){
        List<Double> list =new ArrayList<>();
        List<WebElement> priceElements = driver.findElements(By.cssSelector("div[data-test='component-product-card-price']"));
        for(WebElement priceElement: priceElements){
            String ratingInString =priceElement.getAttribute("data-test");
            double ratingInDouble = Double.parseDouble((ratingInString));
            list.add(ratingInDouble);
        }
        return list;
    }

}
