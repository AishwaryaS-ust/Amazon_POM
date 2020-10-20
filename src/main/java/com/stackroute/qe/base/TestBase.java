package com.stackroute.qe.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
public class TestBase {
public static WebDriver driver = null;
@BeforeSuite
public void initialize() throws IOException{
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chrome\\chromedriver.exe");
driver = new ChromeDriver(options);
//To maximize browser
                driver.manage().window().maximize();
        //Implicit wait
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//To open Amazon
                driver.get("https://www.amazon.in/");
}
@AfterSuite
//Test cleanup
public void TeardownTest()
    {
        TestBase.driver.quit();
    }
 
}
