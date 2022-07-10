package com.masai;

//Performing DRL operation (select operation)
//student detail search by roll
import java.sql.*;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the roll :");
        int roll =sc.nextInt();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Problem with loading the driver");
        }

        String cs ="jdbc:mysql://localhost:3306/sb101";

        try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {

            PreparedStatement ps=conn.prepareStatement("select * from student where roll=?");
            ps.setInt(1,roll);

            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                int r=rs.getInt("roll");
                String n=rs.getString("name");
                String a=rs.getString("address");
                int m=rs.getInt("marks");

                System.out.println("ROLL IS :"+r);
                System.out.println("Name is :"+n);
                System.out.println("Address is :"+a);
                System.out.println("Marks is :"+m);
            }
            else
                System.out.println("student does not exit...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
