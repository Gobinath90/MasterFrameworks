package com.tmb.driver.manager.mobile.local;

import com.tmb.config.factory.ConfigFactory;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public final class AndroidManager {

    private AndroidManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/android-app.apk");
        return new RemoteWebDriver(ConfigFactory.getConfig().localAppiumServerURL(),capabilities);
    }
}
