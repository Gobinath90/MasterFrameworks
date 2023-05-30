package com.tmb.driver.manager;

import com.tmb.config.ConfigFactory;
import com.tmb.enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeManager {
    private ChromeManager(){}
    public static WebDriver getDriver(){
            WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
