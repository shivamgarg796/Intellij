package com.masai;

//Performing DRL operation (select operation)
import java.sql.*;

public class Demo3 {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Problem with loading the driver");
        }

        String cs ="jdbc:mysql://localhost:3306/sb101";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {
            PreparedStatement ps=conn.prepareStatement("select * from student");

            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                int r=rs.getInt("roll");
                String n=rs.getString("name");
                String a=rs.getString("address");
                int m=rs.getInt("marks");

                System.out.println("ROLL IS :"+r);
                System.out.println("Name is :"+n);
                System.out.println("Address is :"+a);
                System.out.println("Marks is :"+m);

                System.out.println("=================================");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
