package com.mycompany.app;

import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.browser.Browser;
import org.openqa.selenium.chrome.ChromeOptions;
public class AppTest { 
    //private WebDriver driver; 
 
    @Before 
    public void setUp() { 
        // Set the path for the ChromeDriver executable 
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
       // driver = new ChromeDriver(); 
     ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=9222"); // Enable DevTools via remote debugging

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver(options);

        // Get the DevTools instance
        DevTools devTools = ((ChromeDriver) driver).getDevTools();

        // Create a DevTools session and enable the necessary protocols
        devTools.createSession();
        devTools.send(Browser.enable());

    } 
 
    @Test 
    public void testGoogle() { 
        driver.get("http://www.google.com"); 
        assert(driver.getTitle().contains("Google")); 
    } 
 
    @After 
    public void tearDown() { 
        driver.quit(); 
    } 
} 
 
