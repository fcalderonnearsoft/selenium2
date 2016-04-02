package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by root on 31/03/16.
 */
public class Selenium2Example {

    public static void main(String[] args) {

    WebDriver driver = new FirefoxDriver();
    driver.get("http://www.google.com");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("Cheese!\n"); // send also a "\n"
    element.submit();


    // wait until the google page shows the result
    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

    List<WebElement> findElements = driver.findElements(By.xpath("//a[@class='q qs']"));

    findElements.get(0).click();

    List<WebElement> image = driver.findElements(By.xpath("//img[@class='rg_i']"));
    
    image.get(3).click();
    // this are all the links you like to visit
    /*for (WebElement webElement : findElements)
    {
        System.out.println(webElement.getAttribute("href"));
    }*/
}

}
