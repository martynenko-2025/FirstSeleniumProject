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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod//(enabled = false)
    public void tearDown() {
        driver.quit();

    }

    @Test
    public void FindElementByTagName() {
        //find element by tag h1
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
        // find list of elements by tag a
        List<WebElement> elements = driver.findElements(By.tagName("a")); // option - enter
        System.out.println(elements.size());

    }

    @Test
    public void findElementByOtherLocators() {
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

    @Test
    public void findElementWithCssSelector() {
        //tagName "h1" -> cssSelector "h1"
        WebElement h1 = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1.getText());

        //id" - cssSelector #city

        driver.findElements(By.cssSelector("#city"));

        // className navigation-link - > .navigation-link
        WebElement element11 = driver.findElement(By.cssSelector(".navigation-link"));
        System.out.println(element11.getText());

        // [key = 'value']

        WebElement elementKey = driver.findElement(By.cssSelector("[href='/search']"));
        System.out.println(elementKey.getText());

        //contains -> *
        driver.findElement(By.cssSelector("[class*='offers']"));

        //start  -> ^
        driver.findElement(By.cssSelector("[class^='special']"));

        //end on -> $
        driver.findElement(By.cssSelector("[class$='container']"));

        //composite cssSelector
        driver.findElement(By.cssSelector("a.logo>img[alt='logo']"));

        driver.findElement(By.cssSelector(".search-container>.subtitle"));

        driver.findElement(By.cssSelector("app-special-offers .title"));

        //tag or class or id or pair  > ntn-child(n)
        WebElement login = driver.findElement(By.cssSelector(".navigation-link:nth-child(6)"));
        System.out.println(login.getText());

    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.cssSelector("h1"));
        driver.findElement(By.xpath("//h1"));

        //? xpath
        driver.findElement(By.xpath("//input[@id='city']"));
        driver.findElement(By.xpath("//a[text()=' Let the car work ']"));
        driver.findElement(By.xpath("//a[normalize-space(text())='Let the car work']"));
        driver.findElement(By.xpath("//a[.=' Let the car work ']"));
        driver.findElement(By.xpath("//a[contains(text(), ' Let the car work ')]"));
        driver.findElement(By.xpath("//a[starts-with(text(),' Let the car')]"));
        driver.findElement(By.xpath("//a[contains(text(), ' Let the car')]"));
        driver.findElement(By.xpath("//a[contains(., ' Let the car')]"));
        driver.findElement(By.xpath("(//a[contains(.,'work')])[2]"));

    }
}

