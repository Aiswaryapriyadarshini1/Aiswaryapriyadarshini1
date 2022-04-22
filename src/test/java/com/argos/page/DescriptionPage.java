package com.argos.page;

import com.argos.driver.DriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DescriptionPage extends DriverManager {

    public void addToTrolley(){
        driver.findElement(By.cssSelector("button[data-test='add-to-trolley-button-button']")).click();
        sleep(5000);
    }

    public void goToTrolley(){
        driver.findElement(By.cssSelector("a[data-test='component-att-button-basket']")).click();
        sleep(3000);
    }

    public void selectQuantity(int choice){
        WebElement selectElement = driver.findElement(By.cssSelector("select[data-e2e='product-quantity']"));
        Select select = new Select(selectElement);
        select.selectByVisibleText(String.valueOf(choice));
    }



}
