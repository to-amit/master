package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp e1 = context.getBean("emp1",Emp.class);
        Emp e2 = context.getBean("emp2",Emp.class);
        System.out.println(e1);
        System.out.println(e2);
    }
}