package com.stepDefinitions;

import com.web.WebDriverUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends WebDriverUtils {

    @Before
    public void start() {
        setup();

    }
    @After
    public void end() {
        tearDown(); 

    }
}
