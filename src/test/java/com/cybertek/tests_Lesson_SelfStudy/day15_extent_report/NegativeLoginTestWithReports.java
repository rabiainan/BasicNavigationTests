package com.cybertek.tests_Lesson_SelfStudy.day15_extent_report;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests_Lesson_SelfStudy.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReports extends TestBase {


    @Test
    public void wrongPasswordTest() {
        extentLogger = report.createTest("wrong password test");
        LoginPage loginPage = new LoginPage();

        loginPage.usernameInput.sendKeys("user1");
        extentLogger.info("enter username: user1");//her adimdan sonra report icin info yaz

        loginPage.passwordInput.sendKeys("somepassword");
        extentLogger.info("enter password :somepassword");

        loginPage.loginBtn.click();
        extentLogger.info("click login button");

        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("pass : wrong password test ");

    }

    @Test
    public void wrongUsername() {
        LoginPage loginPage = new LoginPage();
        loginPage.usernameInput.sendKeys("someusername");
        loginPage.passwordInput.sendKeys("UserUser123");
        loginPage.loginBtn.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }


}
