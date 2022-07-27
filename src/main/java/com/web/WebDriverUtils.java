package com.web;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utils.ConfigReader;
import com.utils.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

    public static WebDriver driver;

    public static void setup() {

        // Reading the properties file we created
        ConfigReader.readProperties(FrameworkConstants.CONFIGURATION_FILE_PATH);

        if (ConfigReader.getPropertyValue("browser").equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(ConfigReader.getPropertyValue("browser").equalsIgnoreCase("firefox")){

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if(ConfigReader.getPropertyValue("browser").equalsIgnoreCase("edg")){

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else{
            throw new RuntimeException("Invalid browser name"); 
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies(); 

        // Setting an imlicit wait 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    } 

    public static void tearDown(){
        driver.quit(); 
    }

}
