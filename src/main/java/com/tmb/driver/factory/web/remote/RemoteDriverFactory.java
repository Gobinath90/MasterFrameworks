package com.tmb.driver.factory.web.remote;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {
    private RemoteDriverFactory(){}

public static final Map<BrowserRemoteModeType,Function<BrowserType,WebDriver>> MAP = new EnumMap<>(BrowserRemoteModeType.class);
    /*
     *Method 1
     */
    public static final Function<BrowserType,WebDriver> SELENIUM = SeleniumGridFactory::getDriver;

    static {
        MAP.put(BrowserRemoteModeType.SELENIUM,SELENIUM);
        MAP.put(BrowserRemoteModeType.SELENIUM,SelenoidFactory::getDriver);
        MAP.put(BrowserRemoteModeType.SELENIUM,BrowserStackFactory::getDriver);
    }
    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
        return MAP.get(browserRemoteModeType).apply(browserType);
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
