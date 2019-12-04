package com.cybertek.tests_Lesson_SelfStudy.day1_basic_navigation;

import com.github.javafaker.Faker;

public class exampleClass {

    public static void main(String[] args) {
        System.out.println("example");

        Faker faker= new Faker();

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().country());

    }

}
