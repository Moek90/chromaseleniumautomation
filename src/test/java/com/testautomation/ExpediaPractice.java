package com.testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExpediaPractice {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TOPIC: Ecpedia Practice

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://www.expedia.com/";

        driver.get(url);

        // clicking on flights
        driver.findElement(By.xpath("//span[normalize-space()='Flights']")).click();

        // Clicking on 'Travelers link'
        driver.findElement(By.xpath("//button[normalize-space()='1 traveler']")).click();

        // Adding Adults
       WebElement addButton = driver.findElement(By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-align-items-center uitk-layout-flex-justify-content-space-between uitk-step-input adultStepInput uitk-step-input-mounted']//button[2]"));
      
        for(int i = 0; i <= 4; i++) { 
            addButton.click(); 

        }

        driver.quit();

    }

}
