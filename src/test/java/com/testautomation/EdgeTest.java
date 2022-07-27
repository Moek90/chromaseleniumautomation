package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeTest {
    public static void main(String[] args) {

        // Setting up edgedriver using WebDriverManager
        WebDriverManager.edgedriver().setup();

        // Instantiting WebDriver and ChromeDriver
        WebDriver driver = new EdgeDriver();

        // Navigating to a website using get () method
        driver.get("https://www.google.com/");

        // Printing out title of the webpage using getTitle() method
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());

        // Closing edge using quit() method - closes ALL windows open by the WebDriver
        driver.quit();

    }
}
