package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    @Test
    public void tets1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement=driver.findElement(By.id("state"));

        Select stateList= new Select(dropdownElement);
       List<WebElement> options= stateList.getOptions(); //return all options

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        System.out.println(options.size());

    }
    @Test
    public  void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement=driver.findElement(By.id("state"));

        Select stateList= new Select(dropdownElement);
        String expectedOption="Select a State";
        String actualOption =stateList.getFirstSelectedOption().getText();
        System.out.println(actualOption);
        Assert.assertEquals(actualOption,expectedOption,"verify that firt selection is select a state");

         //   how to select options from the dropdown
        // 1 using visible text
        stateList.selectByVisibleText("Texas");
        actualOption =stateList.getFirstSelectedOption().getText();

         Assert.assertEquals(actualOption,"Texas", "verify that texas select");
       //2. option usung index number
       // total option   52
          stateList.selectByIndex(51);
        System.out.println(stateList.getFirstSelectedOption().getText());
        actualOption =stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Wyoming", "verify that wyoming select");

        // 3. option using value
      stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption());


    }
}