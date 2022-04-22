/*package com.argos;

import com.argos.driver.DriverManager;
import com.argos.utils.Helpers;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class regressionTestSuite extends DriverManager {

    @Test
    public void searchTest() {
        driver.findElement(By.id("searchTerm")).sendKeys("nike");
        driver.findElement(By.cssSelector("._1gqeQ")).click();
        String actual = driver.findElement(By.cssSelector(".styles__SearchTerm-sc-1haccah-1")).getText();
        assertThat("nike", is(equalTo(actual)));
        String actualUrl = driver.getCurrentUrl();
        assertThat(actualUrl, endsWith("nike"));
    }

@Test
    public void basketTest() throws InterruptedException {
    driver.findElement(By.id("searchTerm")).sendKeys("nike");
    driver.findElement(By.cssSelector("._1gqeQ")).click();

    //select product
    List<WebElement> productWebElement = driver.findElements(By.cssSelector("a[id^='product-title-'"));
    int elementSize = productWebElement.size();
    System.out.println("Number of product: " + elementSize);
    int randomIndex = new Helpers().randomNumber(elementSize);
    WebElement selectedWebElement = productWebElement.get(randomIndex);
    String expected = selectedWebElement.getText();
    System.out.println("Selected Product Name" + expected);
    selectedWebElement.click();
    Thread.sleep(3000);

//add to trolley
    driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();

    //assert

    List<WebElement> trolleyElements = driver.findElements(By.cssSelector("a[data-e2e='product-name']"));
  List<String> actualList = new ArrayList<>();
  for(WebElement element: trolleyElements){
     String productNameInTrolley = element.getText();
     if(!productNameInTrolley.isEmpty()){
         actualList.add(productNameInTrolley);
     }
  }
}


}*/



