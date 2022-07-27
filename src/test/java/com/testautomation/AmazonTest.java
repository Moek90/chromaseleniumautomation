package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // sending text using sendKeys() method
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Selenium books"); 

        // clicking using click() method
        driver.findElement(By.id("nav-search-submit-button")).click(); 

        // clicking on link using linkText()
        //driver.findElement(By.linkText("Absolute Beginner (Part 1) Java 4 Selenium WebDriver: Come Learn How To Program For Automation Testing")).click();

        // clicking on link by using partialLinkText()
        driver.findElement(By.partialLinkText("Absolute Beginner (Part 1)")).click();

        String expectedPageName = "Absolute Beginner (Part 1) Java 4 Selenium WebDriver: Come Learn How To Program For Automation Testing";

        // Using getText() method to retrive the text of the element and string it in actualPageName
        String actualPageName = driver.findElement(By.id("productTitle")).getText();
        
        // Printing actualPageName
        System.out.println(actualPageName); 
    }

}
