package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPractice {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login";

        // Maximazing window
        driver.manage().window().maximize();

        // Deleting all cookies
        driver.manage().deleteAllCookies();

        // Navigating to CTSMS
        driver.get(url);

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[id='form-username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//form/button")).click();

        // Clicking on student information using linkText
        driver.findElement(By.linkText("Student Information")).click();

        // Adding 2 second wait
        Thread.sleep(2000);

        // Clicking on student admission
        driver.findElement(By.linkText("Student Admission")).click();

        // Sending admission number
        driver.findElement(By.xpath("//input[@id='admission_no']")).sendKeys("123456");

      
        // Using JavascriptExecutor interface to select a date from a calendar
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + "04/01/1990" + "');", driver.findElement(By.xpath("//input[@name='dob']")));
    }
    
}
