package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

    public static void main(String[] args) {

        // Setting up firefoxdriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();

        // Instantiting WebDriver and firefox
        WebDriver driver = new FirefoxDriver();

        // Navigating to a website using get () method
        driver.get("https://www.google.com/");

        // Printing out title of the webpage using getTitle() method
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());

        // Closing firefox using quit() method - closes ALL windows open by the WebDriver
        driver.quit();

    }
}
