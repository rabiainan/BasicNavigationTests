package com.cybertek.tests_Lesson_SelfStudy.day2_webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

       String title= driver.getTitle();

        System.out.println("title = " + title);

        String currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        
        String pageSource= driver.getPageSource();
        System.out.println("pageSource = " + pageSource);




    }
}
