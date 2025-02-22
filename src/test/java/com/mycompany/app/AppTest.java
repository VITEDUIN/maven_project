package com.mycompany.app;

import org.junit.After; 
import org.junit.Before; 
import org.junit.Test; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
 
public class AppTest { 
    private WebDriver driver; 
 
    @Before 
    public void setUp() { 
        // Set the path for the ChromeDriver executable 
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
        driver = new ChromeDriver(); 
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
 
