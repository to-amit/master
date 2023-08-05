package org.example;
import java.sql.*;

import static java.sql.DriverManager.getConnection;

//7 Steps to Connect Application to database
//        1)Import the package
//        2)Load and Register driver
//        3)Create Connection
//        4)Create Statement
//        5)Execute the query
//        6)process the results
//        7)close connection
public class Main {
    public static void main(String[] args) throws Exception{
        String url ="jdbc:mysql://localhost:3306/sys";
        //hi
        String name = "root";
        String pass = "Password";
        String query = "select username from student where userid =1";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,name,pass);
        Statement st = con.createStatement();
        ResultSet res = st.executeQuery(query);
        res.next();
        String nam = res.getString("username");
        System.out.println(nam);
    }
}