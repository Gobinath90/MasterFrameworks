package com.tmb.driver.factory.mobile.remote;

import com.tmb.driver.factory.web.remote.BrowserStackFactory;
import com.tmb.driver.factory.web.remote.SeleniumGridFactory;
import com.tmb.driver.factory.web.remote.SelenoidFactory;
import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import com.tmb.enums.MobilePlatformType;
import com.tmb.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {
    private RemoteMobileDriverFactory(){}

public static final Map<MobileRemoteModeType,Function<MobilePlatformType,WebDriver>> MAP = new EnumMap<>(MobileRemoteModeType.class);
    /*
     *Method 1
     */
    public static final Function<MobilePlatformType,WebDriver> BROWSERSTACK = BrowserStackMobileFactory::getDriver;

    static {
        MAP.put(MobileRemoteModeType.BROWSER_STACK,BROWSERSTACK);
       // MAP.put(MobileRemoteModeType.SAUCE_LABS, SauceLabsMobileFactory::getDriver);
    }
    public static WebDriver getDriver(MobileRemoteModeType browserRemoteModeType,
                                      MobilePlatformType platformType){
        return MAP.get(browserRemoteModeType).apply(platformType);
    }

    /* ====================================================================
     *Method 1
     */
//    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
//        if (browserRemoteModeType == BrowserRemoteModeType.SELENIUM){return SeleniumGridFactory.getDriver(browserType);}
//        else if(browserRemoteModeType == BrowserRemoteModeType.SELENOID){return SelenoidFactory.getDriver(browserType);}
//        else if (browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){return  BrowserStackFactory.getDriver(browserType);}
//        return null;
//    }

}
