package com.ait.qa58;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HW {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }
       @AfterMethod
       public void tearDown(){
           driver.quit();

        }

        @Test
    public void findElementByTagNameAndOther() {
            WebElement element = driver.findElement(By.tagName("strong"));
            System.out.println(element.getText());
            WebElement element1 = driver.findElement(By.tagName("title"));
            System.out.println(element1.getText());
            List<WebElement> elements = driver.findElements(By.tagName("p"));
            System.out.println(elements.size());
            WebElement element2 = driver.findElement(By.className("ico-register"));
            System.out.println(element2.getText());
            driver.findElement(By.id("small-searchterms"));
            WebElement element3 = driver.findElement(By.linkText("Digital downloads"));
            System.out.println(element3.getText());
            WebElement element4 = driver.findElement(By.partialLinkText("Register"));
            System.out.println(element4.getText());


        }

        }


