package com.cybertek.tests_Lesson_SelfStudy.day9popups_tabs_frame;

import com.cybertek.utilities_forlesson.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class MultipleWindows {

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
    public void tets1() {

        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("before cliking the link "+ driver.getTitle());
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("after cliking the link "+ driver.getTitle());

        //driver.switchTo().window();

     String currentWindowHandle= driver.getWindowHandle();
        System.out.println("currentWindowHandle = " + currentWindowHandle);
       Set<String> windowsHandles=driver.getWindowHandles();
        System.out.println(windowsHandles.size());


        for (String handle : windowsHandles) {
            if(!currentWindowHandle.equals(handle)){

                driver.switchTo().window(handle);
            }
        }
        System.out.println("after swtching  "+ driver.getTitle());

        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }

    @Test
    public void moreThan2Windows(){

        driver.get("http://practice.cybertekschool.com/windows");

        String targetWindowsTitle="New Window";

        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getWindowHandles().size());

        Set<String> windowsHandle= driver.getWindowHandles();

        for (String handle: windowsHandle) {

          driver.switchTo().window(handle);
          if(driver.getTitle().equals(targetWindowsTitle)){

              break;
          }

        }

        System.out.println("after switching "+driver.getTitle());


    }


}