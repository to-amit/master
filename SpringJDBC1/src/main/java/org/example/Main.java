package org.example;

import org.example.dao.StudentDao;
import org.example.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting database");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        //JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //insert query
        //String query = "insert into student(id, name, city) values(?,?,?)";
        //execute query
        //int result = template.update(query,3,"Sumit","Turki");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        Student student = new Student();
//        student.setId(4);
//        student.setName("Sanoj");
//        student.setCity("Banka");

        student.setId(2);
        student.setName("Rajkumar");
        student.setCity("Mithila");


//insert
//        int result = studentDao.insert(student);
//update
//        int result = studentDao.change(student);
//delete
//        result = studentDao.delete(4);
//        Student student1 = studentDao.getStudent(2);

//        System.out.println("number of record insert "+result);
        List<Student> students = studentDao.getallStudents();

        for (Student s:students){
            System.out.println(s);
        }
    }
}