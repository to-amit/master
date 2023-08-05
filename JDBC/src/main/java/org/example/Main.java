package org.example;

//1)Import the package

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

        Integer userId = 10;
        String userName = "Ram";
        //String query = "select username from student where userid =1";
        String fetch = "select * from student";
        String put = "insert into student values(?,?)";
        //        2)Load and Register driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //        3)Create Connection
        Connection con = DriverManager.getConnection(url,name,pass);

        //        4)Create Statement
        //Statement st = con.createStatement();
        // for dynamic value using prepared Statement
        PreparedStatement st = con.prepareStatement(put);

        //fetching data
        //        5)Execute the query
        //ResultSet res = st.executeQuery(fetch);


        //String nam = res.getString("username");

        //        6)process the results
        String row;
//        while(res.next()) {
//            row = res.getInt(1) + " : " + res.getString(2);
//            System.out.println(row);
//        }
        //insert data
        st.setInt(1,userId);
        st.setString(2,userName);
        int count =st.executeUpdate();
        ResultSet res = st.executeQuery(fetch);

        //printing table row
        while(res.next()) {
            row = res.getInt(1) + " : " + res.getString(2);
            System.out.println(row);
        }
        System.out.println("rows affected : "+count);
        res.close();
        con.close();


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