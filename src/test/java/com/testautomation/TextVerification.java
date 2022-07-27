package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://chroma.mexil.it/site/login"; 

        driver.get(url);

        // Maximizing widows
        driver.manage().window().maximize();

        // Deleting all cookies
        driver.manage().deleteAllCookies();

        System.out.println(driver.getTitle());

        // Asserting title of login page
        Assert.assertEquals(driver.getTitle(), "Login : Chroma Tech Academy");

        // Entering username in username textbox
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("general@teacher.com");

        // Entering password in password textbox
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");

        // Clicking on 'Sign In' button
        driver.findElement(By.xpath("//button[@class='btn']")).click();

        // Retrieving text using getText() method
        String actualHomePageName = driver.findElement(By.xpath("//nav/div/span ")).getText();

        System.out.println(actualHomePageName);

        // Asserting home page name using assetEqual() method
        Assert.assertEquals(actualHomePageName, "Chroma Tech Academy");

        // creating boolean statement using contains() method from String class
        actualHomePageName.contains("Chroma Tech Academy");

        // Asserting using assertTrue() method
        Assert.assertTrue(actualHomePageName.contains("Chroma Tech Academy"));

        // Asserting using containEquals() method from String class
        Assert.assertTrue(actualHomePageName.contentEquals("Chroma Tech Academy"));

        // Clicking on Student Information using LinkText
        driver.findElement(By.linkText("Student Information")).click();

        // Adding 2 second wait
        Thread.sleep(2000);

        // Clicking on student admission
        driver.findElement(By.linkText("Student Admission")).click();

        // Sending admission number
        driver.findElement(By.xpath("//input[@id='admission_no']")).sendKeys("1212");

        // Entering firstname in the TextBox
        driver.findElement(By.xpath("//*[@id='firstname'] ")).sendKeys("Moe");

        // Entering lastname in the TextBox
        driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Khan");

        // Entering email in the TextBox
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Thisis@fun.com");

        // Entering mobileNumber in the TextBox
        driver.findElement(By.xpath("//*[@id='custom_fields[students][1]']")).sendKeys("123654");

        // Entering Height in the TextBox
        driver.findElement(By.xpath("//*[@id='custom_fields[students][2]']")).sendKeys("5.8");

        // Entering weight in the TextBox
        driver.findElement(By.xpath("//*[@id='custom_fields[students][3]']")).sendKeys("182");

        // Entering fatherName in the TextBox
        driver.findElement(By.xpath("//*[@id='father_name']")).sendKeys("Safi");

        // Entering father phone number in the TextBox
        driver.findElement(By.xpath("//*[@id='father_phone']")).sendKeys("1236659867");

        // Entering father occupation in the TextBox
        driver.findElement(By.xpath("//*[@id='father_occupation']")).sendKeys("Giant Food");

        // Entering mother name in the TextBox
        driver.findElement(By.xpath("//*[@id='mother_name']")).sendKeys("Khan");

        // Entering mother phone number in the TextBox
        driver.findElement(By.xpath("//*[@id='mother_phone']")).sendKeys("6656985");

        // Entering mother occupation in the TextBox
        driver.findElement(By.xpath("//*[@id='mother_occupation']")).sendKeys("babysitting");

        // clicking the radio button (Other)
        driver.findElement(By.xpath("//*[@id='form1']/div/div[2]/div/div[3]/div/label[4]/input")).click();

        // Entering guardian name in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_name']")).sendKeys("Su");

        // Entering guardian relation in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_relation']")).sendKeys("Sister");

        // Entering guardian email in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_email']")).sendKeys("HomeWork@IsFun.com");

        // Entering guardian phone number in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_phone']")).sendKeys("8789963254");

        // Entering guardian occupation in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_occupation']")).sendKeys("Spa");

        // Entering guardian address in the TextBox
        driver.findElement(By.xpath("//*[@id='guardian_address']")).sendKeys("Turkey");

        // putting a 2 second pause
        Thread.sleep(2000);

        // closing out the window
        driver.quit();
        

    }

}
