package com.masai;
//inserting by Using Prepared statement

import java.sql.*;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll");
        int roll=sc.nextInt();

        System.out.println("enter the name");
        String name=sc.next();

        System.out.println("enter the Address");
        String address=sc.next();

        System.out.println("enter the marks");
        int marks=sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String cs = "jdbc:mysql://localhost:3306/sb101";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {

//            Statement st = conn.createStatement();
//            int x = st.executeUpdate("insert into student values (1,'aam','ranchi',480)");
            PreparedStatement ps=conn.prepareStatement("insert into student values(?,?,?,?)");

            ps.setInt(1,roll);
            ps.setString(2,name);
            ps.setString(3,address);
            ps.setInt(4,marks);

            int x=ps.executeUpdate();
            if (x > 0)
                System.out.println("inserted...");
            else
                System.out.println("not inserted...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
