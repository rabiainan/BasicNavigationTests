package com.cybertek.tests_Lesson_SelfStudy.day9popups_tabs_frame;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {
    WebDriver driver;

    @BeforeMethod
    public  void setUpMethod(){
      driver  = WebDriverFactory.getDriver("chrome") ;

    }
    @AfterMethod
    public  void tearDownMethod(){
        //driver.quit();

    }


    @Test
    public  void tets1(){

        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

        driver.findElement(By.xpath("//*[text()='No']")).click();

    }



    @Test

    public  void tets2(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    driver.findElement(By.xpath("//button[1]")).click();

        Alert alert=driver.switchTo().alert();

        alert.accept();// accept do click

        driver.findElement(By.xpath("//button[2]")).click();

        alert.dismiss();// click cancel yapar
        driver.findElement(By.xpath("//button[3]")).click();
        alert.sendKeys("mike smith");
        alert.accept();
    }


}
