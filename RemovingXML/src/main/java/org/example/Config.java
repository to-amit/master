package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example")
public class Config {
    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean
    public Student getStudent(){
        Student s = new Student(getSamosa());
        return s;
    }

}
