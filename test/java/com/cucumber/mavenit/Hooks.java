package com.cucumber.mavenit;

import com.cucumber.mavenit.driver.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    private DriverManager driverManager =new DriverManager();
    @Before
    public void setUp(){
     driverManager.openBrowser();
     driverManager.maxBrowser();
     driverManager.navigateTo("http://www.argos.co.uk/");
     driverManager.applyImplicitwait();
    }
    @After
    public void tearDown(){
     driverManager.closeBrowser();
    }
}
