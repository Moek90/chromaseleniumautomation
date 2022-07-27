package com.testautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsPractice {
    public static void main(String[] args) {
        // TOPIC: Find Elements Practice

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        String url = "https://www.expedia.com/";

        driver.get(url);

        List<WebElement> numberOfLinks = driver.findElements(By.tagName("a"));

        System.out.println(numberOfLinks.size());

        for(WebElement namesOfLinks : numberOfLinks){

            //System.out.println(namesOfLinks.getText()); 

            if(namesOfLinks.getText().contentEquals("Flights")){

                namesOfLinks.click();

                break; 

            }
        }

    }

}
