package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login";

        // Maximizing widows
        driver.manage().window().maximize();

        // Deleting all cookies
        driver.manage().deleteAllCookies();

        // Navigating to CTSMS
        driver.get(url);

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//button[@class='btn']")).click();

        String homePageText = driver.findElement(By.xpath("//span[@class='sidebar-session']")).getText();

        System.out.println(homePageText);

        Assert.assertEquals(homePageText, "Chroma Tech Academy");

        try {
            Assert.assertEquals(homePageText, "Chroma Tech");
        } catch (AssertionError e) {

            System.out.println("ASSERTING FAILD");
            e.printStackTrace();

            System.out.println("Learing hard assertion");

        }
        driver.quit();

    }

}
