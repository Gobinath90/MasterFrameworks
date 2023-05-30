package com.tmb.driver.factory.web.remote;

import com.tmb.driver.manager.web.remote.selenoid.SelenoidChromeManager;
import com.tmb.driver.manager.web.remote.selenoid.SelenoidFirefoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class SelenoidFactory {

    private SelenoidFactory(){}
    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SelenoidChromeManager.getDriver()
                : SelenoidFirefoxManager.getDriver();

    }
}
