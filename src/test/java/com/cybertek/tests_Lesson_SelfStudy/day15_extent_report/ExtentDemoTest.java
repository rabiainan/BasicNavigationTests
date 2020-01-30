package com.cybertek.tests_Lesson_SelfStudy.day15_extent_report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class ExtentDemoTest {
    ExtentReports report;

    ExtentHtmlReporter htmlReporter;

     ExtentTest extentLogger;

   @BeforeMethod
   public void setup() {
       report = new ExtentReports();

    String projectPath= System.getProperty("user.dir");
    String path=projectPath+"/test-output/report.html";


    htmlReporter=new ExtentHtmlReporter(path);

    report.attachReporter(htmlReporter);

    htmlReporter.config().setReportName("Vytrack smoke test");

    report.setSystemInfo("Environment","QA");
    report.setSystemInfo("Browser","chrome");
    report.setSystemInfo("Tester","Europe-UK testers");

   }


   @Test
public void test1(){
    extentLogger=report.createTest("TC342 Login as Driver Test");

    extentLogger.info("open chrome");
    extentLogger.info("go to url");
    extentLogger.info("oenter driver info");
    extentLogger.info("click submit");
    extentLogger.info("tc32 is passed");


   }

   @AfterMethod
   public void teardown(){
       report.flush();

   }


}
