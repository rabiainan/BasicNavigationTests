package com.cybertek.tests_Lesson_SelfStudy.day17_DDF;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

@DataProvider
    public Object[][] testdata(){
    String [][] data={{"java", "4"},
        {"selenium","6"},{"sdlc","5"}};
    return data;
}

@Test(dataProvider ="testdata" )

public  void test1(String lesson, String rating){

    System.out.println(lesson+" "+ rating);
}


}
