package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class LoginPage {

    // Username text box
    @FindBy (xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox; 
    
    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton; 

    @FindBy(xpath = "//div[normalize-space()='Invalid Username or Password']") 
    public WebElement invalidUsernameOrPasswordMessage;

    public LoginPage() {
        PageFactory.initElements(WebDriverUtils.driver, this); 
        
    }
    

    
}
