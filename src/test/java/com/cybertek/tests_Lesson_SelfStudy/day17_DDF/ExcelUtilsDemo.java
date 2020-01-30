package com.cybertek.tests_Lesson_SelfStudy.day17_DDF;

import com.cybertek.utilities_forlesson.ExcelUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {


@Test
    public void readExcelFile(){

    ExcelUtils qa3short=new ExcelUtils("src/test/resources/Vytracktestdata.xlsx","QA3-short");

    System.out.println("row count "+ qa3short.rowCount());
    System.out.println("column name "+ qa3short.getColumnsNames());

    List<Map<String, String>> dataList = qa3short.getDataList();

    for (Map<String, String> onerow : dataList) {

        System.out.println(onerow);
        
    }

     String [][] dataArray=qa3short.getDataArray();

    System.out.println(Arrays.deepToString(dataArray));
}









}
