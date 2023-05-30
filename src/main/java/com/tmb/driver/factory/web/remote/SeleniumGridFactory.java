package com.tmb.driver.factory.web.remote;

import com.tmb.driver.manager.web.remote.selenium.SeleniumGridChromeManager;
import com.tmb.driver.manager.web.remote.selenium.SeleniumGridFirefoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class SeleniumGridFactory {

    private SeleniumGridFactory(){}

    public static WebDriver getDriver(BrowserType browserType) {
        return browserType == BrowserType.CHROME
                ? SeleniumGridChromeManager.getDriver()
                : SeleniumGridFirefoxManager.getDriver();

    }

}
