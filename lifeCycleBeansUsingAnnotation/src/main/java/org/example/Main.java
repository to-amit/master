package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
        Example e1 =(Example) context.getBean("example");
        System.out.println(e1);
//        Samosa s1 =(Samosa) context.getBean("s1");
//        Pepsi p1 = (Pepsi) context.getBean("p1");
//        System.out.println(s1);
//        System.out.println("+++++++++++++++++++++++++++");
//        System.out.println(p1);
    }
}