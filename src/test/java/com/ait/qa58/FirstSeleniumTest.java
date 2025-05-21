package com.ait.qa58;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.SortedMap;

public class FirstSeleniumTest {

    WebDriver driver;

    // before - setUp
    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
       driver.get("https://www.google.com"); //without history
        //driver.navigate().to("https://www.google.com"); // with history
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //maximize browser to window
        driver.manage().window().maximize();
        //set parameters
        //driver.manage().window().setSize(new Dimension(1000,500));

    }
    //test
    @Test
    public void  openBrowser(){
        System.out.println("Browser opened!");
    }

    //after - tearDown
    @AfterMethod//(enabled = false)
    public void tearDown(){
        driver.quit(); //all tabs & close browser
        driver.close(); // only one tab (if tab only one  -> close browser)
    }
}
