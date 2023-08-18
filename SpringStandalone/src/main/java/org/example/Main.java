package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp e1 = context.getBean("person1",Emp.class);
                System.out.println(e1);
        System.out.println("------------------");
        System.out.println(e1.getFeeStructure());
    }
}