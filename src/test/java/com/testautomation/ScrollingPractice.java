package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollingPractice {

    public static void main(String[] args) {

        // TOPIC: Scrolling Practice

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://www.expedia.com/";

        driver.get(url);

        // Using JavascriptExecutor to scroll into the view of an element

        JavascriptExecutor js = ((JavascriptExecutor) driver);

        // Scrolling into the view of the element
        js.executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(By.xpath("//a[contains(text(),'Support')]")));

        js.executeScript("arguments[0].style.border='3px solid blue'",
                driver.findElement(By.xpath("//a[contains(text(),'Support')]")));

        driver.findElement(By.xpath("//a[contains(text(),'Support')]")).click();

    }

}
