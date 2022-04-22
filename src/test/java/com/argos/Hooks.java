package com.argos;

import com.argos.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

    private DriverManager driverManager = new DriverManager();

    @Before
    public void setUp(){
        driverManager.opeBrowser();
        driverManager.maxBrowser();
        driverManager.navigateUrl();
        driverManager.acceptCookies();
    }

    @After
    public void tearDown(){
        //driverManager.closeBrowser();
    }
}
