package com.cybertek.tests_Lesson_SelfStudy.day17_DDF;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests_Lesson_SelfStudy.TestBase;
import com.cybertek.utilities_forlesson.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFLoginTest extends TestBase {

@DataProvider
    public  Object[][]   userData(){
    ExcelUtils data= new ExcelUtils("src/test/resources/Vytracktestdata.xlsx","QA3-short");
   String[][] dataArray= data.getDataArrayWithoutFirstRow();

    return dataArray;
}


@Test(dataProvider = "userData")

    public  void loginTestDDF(String username,String password, String firstname,String lastname){

    extentLogger =report.createTest("Test "+ firstname+ lastname);
    LoginPage loginPage= new LoginPage();
    loginPage.login(username, password);

    DashboardPage dashboardPage= new DashboardPage();
    dashboardPage.waitUntilLoaderScreenDisappear();

    String actualFullname= dashboardPage.getUserName();
    String expectedFullname= firstname+ " "+ lastname;

    Assert.assertEquals(actualFullname,expectedFullname, "compare name");

}


}
