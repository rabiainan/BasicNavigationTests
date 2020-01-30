package com.cybertek.tests_Lesson_SelfStudy.day14_pom_tests;

import com.cybertek.pages.LoginPage;

import com.cybertek.tests_Lesson_SelfStudy.TestBase;

import com.cybertek.utilities_forlesson.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.security.auth.login.Configuration;

public class PositiveLoginTests extends TestBase {

    @Test
    public void loginAsDriver(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");
    }
    @Test
    public void loginAsStoreManager(){
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        loginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/");
    }



}
