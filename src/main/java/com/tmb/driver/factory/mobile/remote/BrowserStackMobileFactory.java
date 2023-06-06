package com.tmb.driver.factory.mobile.remote;

import com.google.common.base.Supplier;
import com.tmb.driver.manager.mobile.remote.browserstack.BrowserStackAndroidManager;
import com.tmb.driver.manager.mobile.remote.browserstack.BrowserStackIosManager;
import com.tmb.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;

public class BrowserStackMobileFactory {

    private BrowserStackMobileFactory() {}

    private static final Map<MobilePlatformType, Supplier<WebDriver>> MAP =
            new EnumMap<>(MobilePlatformType.class);

    static {
        MAP.put(MobilePlatformType.ANDROID, BrowserStackAndroidManager::getDriver);
        MAP.put(MobilePlatformType.IOS, BrowserStackIosManager::getDriver);
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return MAP.get(mobilePlatformType).get();
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
