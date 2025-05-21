package com.ait.qa58;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();

        driver.get("https://ilcarro.web.app");
       // driver.manage().window().maximize();
        //wait for all element on the site to load before starting the start

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod//(enabled = false)
    public void tearDown(){
        driver.quit();

}

@Test
    public void FindElementByTagName(){
        //find element by tag h1
    WebElement h1 = driver.findElement(By.tagName("h1"));
    System.out.println(h1.getText());
    // find list of elements by tag a
    List<WebElement> elements = driver.findElements(By.tagName("a")); // option - enter
    System.out.println(elements.size());

}

@Test
    public void findElementByOtherLocators(){
        //id
    driver.findElements(By.id("city"));
    driver.findElements(By.id("dates"));
    //className
    driver.findElements(By.className("header"));
    WebElement element = driver.findElement(By.className("navigation-link"));
    System.out.println(element.getText());
    WebElement element1 = driver.findElement(By.className("telephone"));
    System.out.println(element1.getText());
    System.out.println(element1.getDomAttribute("class"));
    //linkText
    WebElement element2 = driver.findElement(By.linkText("Let the car work"));
    System.out.println(element2.getText());
    //partialLinkText
    WebElement element3 = driver.findElement(By.partialLinkText("work"));
    System.out.println(element3.getText());
}
}

