package com.tmb.driver;

import com.tmb.driver.entity.MobileDriverData;
import com.tmb.driver.entity.WebDriverData;
import com.tmb.driver.factory.DriverFactory;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.tmb.config.factory.ConfigFactory.getConfig;

public final class Driver {
    private Driver(){}
    //local Web, remote web ,local mobile, remote mobile.
    public static void initDriverforWeb() { //Local DriverFactory
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            loadURL();
        }
    }
    public static void loadURL(){
        DriverManager.getDriver().get(getConfig().webUrl());
}


    public static void initDriverforMobile() { //Local DriverFactory
        MobileDriverData driverData =  new MobileDriverData(MobilePlatformType.ANDROID, getConfig().mobileRemoteMode());
        WebDriver  driver= DriverFactory
                        .getDriverForMobile(getConfig().mobileRunMode())
                .getDriver(driverData);
        DriverManager.setDriver(driver);
    }
    public static void quitDriver(){
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
