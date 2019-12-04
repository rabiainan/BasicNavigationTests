package com.cybertek.tests_Lesson_SelfStudy.day8_type_ofElements2;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {
    @Test
    public void tets1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement= driver.findElement(By.id("dropdownMenuLink"));
       // Select links = new Select(dropdownElement);// whic doesn have select tag errror verir

       dropdownElement.click();

       List<WebElement> listofLinks= driver.findElements(By.className("dropdown-item"));
        System.out.println("number of links "+listofLinks.size());
        System.out.println(listofLinks.get(0).getText());

        // print text of each link
        for (WebElement Link : listofLinks) {
            System.out.println(Link.getText());
        }

        driver.findElement(By.linkText("Yahoo")).click();
        listofLinks.get(3).click();
    }
}