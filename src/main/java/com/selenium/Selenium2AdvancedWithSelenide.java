package com.selenium;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
/**
 * Created by fcalderon on 4/14/16.
 */
public class Selenium2AdvancedWithSelenide {
    public static void main(String[] args){
        //WebDriver driver = new FirefoxDriver();
        open("http://localhost:63342/MySel20Proj/com/selenium/TestPage.html");
        $$(By.name("color")).get(2).click();
        System.out.println($$(By.name("color")).get(2).getValue());
        $("#select").selectOption("Frank");
        $(".btn").click();
        //$("#submit").click();
        //$(".loading_progress").should(disappear); // Waits until element disappears
        //$("#username").shouldHave(text("Hello, Johny!")); // Waits until element gets text






    }
}
