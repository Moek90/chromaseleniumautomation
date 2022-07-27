package com.testautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeTest {

    public static void main(String[] args) {

        // Setting up chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Instantiting WebDriver and ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigating to a website using get () method
        driver.get("https://www.google.com/");

        // Printing out title of the webpage using getTitle() method
        System.out.println(driver.getTitle());

        // Printing out current URL
        System.out.println(driver.getCurrentUrl());

        // You can use close() method to close current window open
        // driver.close();

        // Closing chrome using quit() method - closes ALL windows open by the WebDriver
        driver.quit();

    }

}
