package com.tmb.tests;

import com.tmb.config.BrowserStackConfig;
import com.tmb.config.factory.BrowserStackConfigFactory;

import org.testng.annotations.Test;

public class DemoTest {

    //local remote (Selenium , selenoid browserstack) : Chrome , Firefox
    @Test
    public void testName() {
        System.out.println(BrowserStackConfigFactory.getConfig().browserStackUrl());

    }
}

