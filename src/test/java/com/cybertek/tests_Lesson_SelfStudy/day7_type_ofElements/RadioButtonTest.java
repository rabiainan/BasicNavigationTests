package com.cybertek.tests_Lesson_SelfStudy.day7_type_ofElements;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
@Test
    public  void radioButton(){
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/radio_buttons");

    WebElement blueButton=driver.findElement(By.id("blue"));
    WebElement redButton=driver.findElement(By.id("red"));

    System.out.println("is blue selected "+blueButton.isSelected());
    System.out.println("is blue selected "+redButton.isSelected());

    Assert.assertTrue(blueButton.isSelected(), "verify that blue button is selected");

    Assert.assertFalse(redButton.isSelected(),"verify that red button is not selected");

    System.out.println("clicking red radio button");
    redButton.click();
    System.out.println("is blue selected "+blueButton.isSelected());
    System.out.println("is blue selected "+redButton.isSelected());

    Assert.assertFalse(blueButton.isSelected(),"verify that blue button is not selected");
    Assert.assertTrue(redButton.isSelected(),"verify that red button is selected");

}


}
