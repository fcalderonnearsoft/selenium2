package com.selenium;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
/**
 * Created by fcalderon on 4/14/16.
 */
public class Selenium2AdvancedWithSelenide {
    public static void main(String[] args){
        open("http://localhost:63342/MySel20Proj/com/selenium/TestPage.html");
        getElementsByName("color",2).click();
        System.out.println(getElementsByName("color", 2).getValue());
        selectAnOption("#select", "Frank");
        clickButton(".btn");
    }

    private static void clickButton(String s) {
        $(".btn").click();
    }

    private static void selectAnOption(String id, String name) {
        $(id).selectOption(name);
    }

    private static SelenideElement getElementsByName(String name, int index) {
        return $$(By.name(name)).get(index);
    }
}
