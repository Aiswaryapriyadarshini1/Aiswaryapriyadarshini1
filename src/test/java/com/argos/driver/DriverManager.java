package com.argos.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    public static WebDriver driver;


    public void opeBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void maxBrowser() {
        driver.manage().window().maximize();
    }

    public void navigateUrl() {
        driver.get("https://www.argos.co.uk/");
    }

    public void acceptCookies() {
        driver.findElement(By.id("consent_prompt_submit")).click();
    }

    public void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void closeBrowser(){
        driver.quit();

    }

    public String getCurrentUrl(){
        return  driver.getCurrentUrl();
    }


}
