package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url); 

        SoftAssert SoftAssert = new SoftAssert();

        String loginPageText = driver.findElement(By.xpath("//input[@id='form-username']")).getText();

        SoftAssert.assertEquals(loginPageText, "login"); 

        String usernameText = driver.findElement(By.xpath("//input[@id='form-username']")).getText();

        SoftAssert.assertEquals(usernameText, "Username");

        String passwordText = driver.findElement(By.xpath("//input[@id='form-password']")).getText();

        SoftAssert.assertEquals(passwordText, "Password");

        String signInButtonText = driver .findElement(By.xpath("//button[normalize-space()='Sign In']")).getText();

        SoftAssert.assertEquals(signInButtonText, "Sign");

        String forgotPasswordLinkText = driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).getText();

        SoftAssert.assertEquals(forgotPasswordLinkText, "Forgot");

        SoftAssert.assertAll();

        driver.quit(); 



        



        

        



        
    }

}
