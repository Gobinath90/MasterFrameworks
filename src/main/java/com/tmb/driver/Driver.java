package com.tmb.driver;

import com.tmb.config.factory.ConfigFactory;
import com.tmb.driver.factory.web.local.LocalDriverFactory;
import org.openqa.selenium.WebDriver;

public final class Driver {

    private Driver(){}
    public void initDriver() { //Local DriverFactory
        WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        driver.get("https://www.google.com/");
    }
    public static void quitDriver(){
    /*

    */
    }
}
