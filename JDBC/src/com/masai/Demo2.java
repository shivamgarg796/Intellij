package com.masai;
//updating marks with 50

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the marks");
        int marks=sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String cs = "jdbc:mysql://localhost:3306/sb101";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {
            PreparedStatement ps=conn.prepareStatement("update student set marks =marks + ? where marks < 500");
            ps.setInt(1,marks);


           int x= ps.executeUpdate();

           if(x>0)
               System.out.println("updated...");
           else
               System.out.println("not updated...");

        } catch (SQLException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
