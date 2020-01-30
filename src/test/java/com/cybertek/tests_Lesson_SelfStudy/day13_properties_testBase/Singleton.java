package com.cybertek.tests_Lesson_SelfStudy.day13_properties_testBase;

public class Singleton {
  //  singleton class have private constructor
    // it means other classes can not create object of this class
     private  Singleton(){}

      private  static String str;

    public static String  getInstance(){
       //if str has no value initalize it and return it
   if(str==null){

       System.out.println("str is null asssigning value to it");
       str="somevalue";
   }else{
       //if str has  value return it
       System.out.println("it has value just return it");
   }
   return str;

    }


}




