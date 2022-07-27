package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice {
    public static void main(String[] args) throws InterruptedException {

        /*
         * TOPIC: Drop downs
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        // Entering username in usename textbox
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        // Clicking on 'Sign in' button
        driver.findElement(By.xpath("//button[@class='btn']")).click();

        driver.findElement(By.linkText("Student Information")).click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Student Details")).click();

        WebElement classDropDown = driver.findElement(By.xpath("//*[@id='class_id']"));

        Select dropDown = new Select(classDropDown);

        dropDown.selectByVisibleText("SDET");

        dropDown.selectByIndex(0);

        dropDown.selectByValue("11");

        // driver.quit();

    }

}
