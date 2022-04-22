package com.argos.page;

import com.argos.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HeaderPage extends DriverManager {

    public void search(String product) {
        driver.findElement(By.id("searchTerm")).sendKeys(product);
        driver.findElement(By.cssSelector("._1gqeQ")).click();
        sleep(3000);
    }

    //1st approach
    public WebElement selectNavItem(String item, String elementValue) {
        List<WebElement> elements = driver.findElements(By.cssSelector(elementValue));
        boolean isElementFound = false;
        WebElement elementFound = null;
        for (WebElement navItemElement : elements) {
            if (navItemElement.getText().equalsIgnoreCase(item)) {
                Actions action = new Actions(driver);
                action.moveToElement(navItemElement).build().perform();
                isElementFound = true;
                elementFound = navItemElement;
                break;
            }
        }
        if (!isElementFound) {
            throw new RuntimeException("Element is not found" + item);
        }
        sleep(3000);
        return elementFound;
    }

    public void hoverItem(String item){
     selectNavItem(item,"._3rkgc");
    }

  /*  public void hoverToLeftPanel(String technology){
    selectNavItem(item, "._1Ce4i");
}

    public void hoverToProductItem(String television){
    selectNavItem(item,"._39ydj");
}*/



    public WebElement hoverToNavItem(String item){
       WebElement navElement = driver.findElement(By.linkText(item));
        Actions action = new Actions(driver);
        action.moveToElement(navElement).build().perform();
        sleep(3000);
        return navElement;
    }


}

