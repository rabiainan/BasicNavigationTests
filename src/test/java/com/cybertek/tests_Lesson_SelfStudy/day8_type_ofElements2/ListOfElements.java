package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    @Test
    public void tets1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons =driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());

        Assert.assertEquals(buttons.size(),6,"verif  we got 6 button");
    // iter short cut for for each loop

        for (WebElement button : buttons) {
            System.out.println(button.getText());

        }

    }
    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

      List<WebElement> buttons=driver.findElements(By.tagName("buttonn"));//it does not give error if locator wrong return emty list
        System.out.println("buttons.size() = " + buttons.size());//return 0 in this case


    }




}
