package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Amit");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s1 = (Student) context.getBean("student1");
        System.out.println(s1);


    }
}