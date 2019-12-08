package com.cybertek.tests_Lesson_SelfStudy.day11_actions_jsexecuter;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class actionsTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDownMethod() {

        //driver.quit();
    }

    @Test

    public void hoverTest(){

        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.tagName("img"))).perform();
        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }
    @Test
    public void  dragAndDrop(){
        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
      Actions actions= new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));
        actions.dragAndDrop(source,target).perform();

    }
    @Test
    public void  dragAndDropChaning(){
        driver.get("http://demos.telerik.com/kendo-ui/dragdrop/index");
        Actions actions= new Actions(driver);
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droptarget"));

        actions.pause(1000);

        actions.moveToElement(source).clickAndHold().moveToElement(target).pause(2000).release().build().perform();
    }



}
