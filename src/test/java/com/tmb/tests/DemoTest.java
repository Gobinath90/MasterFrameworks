package com.tmb.tests;

import com.tmb.config.ConfigFactory;
import com.tmb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    //local remote (Selenium , selenoid browserstack) : Chrome , Firefox
    @Test
    public void testName() {
        System.out.println(ConfigFactory.getConfig().browser());
    }
}

