package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromaTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Navigating to Chroma Tech Admin login site
        driver.get("https://chroma.mexil.it/site/login");

        // Entering username in usename textbox
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        // Clicking on 'Sign in' button 
        driver.findElement(By.xpath("//button[@class='btn']")).click(); 
        


    }

}
