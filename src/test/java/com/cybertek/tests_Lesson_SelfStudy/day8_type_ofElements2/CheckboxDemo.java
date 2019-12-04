package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxDemo {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//input[1]"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));

        Assert.assertFalse(checkbox1.isSelected(), "verify checkbox1 is unselected");
        Assert.assertTrue(checkbox2.isSelected(),"verify checkbox2 is selected");

        checkbox1.click();
        Assert.assertTrue(checkbox1.isSelected(), "verify checkbox1 is unselected");
        Assert.assertTrue(checkbox2.isSelected(),"verify checkbox2 is selected");

    }
}
