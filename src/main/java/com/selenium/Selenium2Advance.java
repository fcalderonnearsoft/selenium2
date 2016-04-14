package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by root on 1/04/16.
 */
public class Selenium2Advance {


public static void main(String[] args){
    WebDriver driver = new FirefoxDriver();
    driver.get("http://localhost:63342/MySel20Proj/com/selenium/TestPage.html");
    List<WebElement> radio = driver.findElements(By.name("color"));
    //radio.get(2).click();
    for (WebElement element: radio) {
        if(element.isSelected())
            System.out.println(element.getAttribute("value"));
    }

    ////////////////////////

    WebElement select = driver.findElement(By.id("select"));
    List<WebElement> option = select.findElements(By.tagName("option"));
    option.get(2).click();
    Select selectElement = new Select(select);
    selectElement.selectByVisibleText("Frank");

    ////////////////////////////

    /*WebElement outTable = driver.findElement(By.tagName("table"));
    WebElement innerTable = outTable.findElement(By.tagName("table"));
    List<WebElement> row = innerTable.findElements(By.tagName("td"));
    System.out.println(row.get(0).getText());*/

    List<WebElement> row = driver.findElements(By.xpath("//td[@class='td']"));
    System.out.println(row.size());

}

}

