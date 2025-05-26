package com.ait.qa58;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HW_260525 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementsByXpatch() {
        driver.findElement(By.xpath("//input[@id='newsletter-email']"));
        driver.findElement(By.xpath("//span[contains(.,'Sign up for our newsletter:')]"));
        driver.findElement(By.xpath("//h3[contains(.,'My account')]"));
        driver.findElement(By.xpath("//strong[contains(.,'Categories')]"));
        driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
        driver.findElement(By.xpath("//input[@id='newsletter-email']"));
        driver.findElement(By.xpath("//span[contains(.,'Wishlist')]"));
        driver.findElement(By.xpath("//a[contains(.,'nopCommerce')]"));
        driver.findElement(By.xpath("//div[@id='bar-notification']"));
        driver.findElement(By.xpath("//div[@id='flyout-cart']"));


    }

}
