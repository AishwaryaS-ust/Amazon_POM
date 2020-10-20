package com.stackroute.qe.webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/*
 * Factory to instantiate a WebDriver object. It returns an instance of the driver (local invocation).
 */
public class WebDriverFactory {

    /* Browsers constants */
    public static final String CHROME = "chrome";
    

    private WebDriverFactory(){}

    public static WebDriver getInstance(String browserName) {

        WebDriver webDriver;

        
        if (CHROME.equals(browserName)) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            webDriver = new ChromeDriver(options);
           // webDriver = new ChromeDriver();

           
        }
        else {
            throw new IllegalArgumentException("Unsupported browser!");
        }

        return webDriver;
    }
}
