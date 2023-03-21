package com.startjava.lesson_2_3_4.person;

public class Person {
    
    String gender = "Мужской";
    String name = "Иван";
    float height = 1.8f;
    float weight = 82.5f;
    int age = 35;

    void go() {
        System.out.println("Идти");
    }

    void sit() {
        System.out.println("Сидеть");
    }

    void run() {
        System.out.println("Бежать");
    }

    void speak() {
        System.out.println("Говорить");
    }

    void learnJava() {
        System.out.println("Учить Java");
    }
}