package org.example;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentDAO dao = new StudentDAO();
        dao.connect();
       // Student s1 = dao.getStudent(10);
        Student s2 = new Student(15,"Daya");
        dao.addStudent(s2);
        dao.removeStudent(9);
        //System.out.println(s1.name);




    }
}

