package org.example;

import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class StudentDAO {

    Connection con =null;
    public void connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = getConnection("jdbc:mysql://localhost:3306/sys", "root", "Password");
    }
    public Student getStudent(int rollNo){
       try {

           String query = "select username from student where userid="+rollNo;
           Statement st = con.createStatement();
           ResultSet res = st.executeQuery(query);
           res.next();
           String name = res.getString(1);
           Student s = new Student(rollNo,name);
           return s;


       } catch (Exception ignored){
           System.out.println(ignored);
       }


        return null;
    }

    public void addStudent(Student s){
        String query = "insert into student values(?,?)";
        PreparedStatement st = null;
        try {
            st = con.prepareStatement(query);
            st.setInt(1,s.rollno);
            st.setString(2,s.name);
            st.executeUpdate();
            System.out.println("Added student with id :"+s.rollno+", name: "+s.name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
    public void removeStudent(int rollNo){
        String query = "delete from student where userid="+rollNo;

        try {
            Statement st = con.createStatement();
            st.executeUpdate(query);
            System.out.println("deleted student with id :"+rollNo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
