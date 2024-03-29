package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc3 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the eid");
            int eid=sc.nextInt();

            System.out.println("enter the name");
            String name=sc.next();

            System.out.println("enter the salary");
            int salary=sc.nextInt();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

            String cs = "jdbc:mysql://localhost:3306/db1";

            try (Connection conn = DriverManager.getConnection(cs, "root", "..shivam1998..")) {

//            Statement st = conn.createStatement();
//            int x = st.executeUpdate("insert into student values (1,'aam','ranchi',480)");
                PreparedStatement ps=conn.prepareStatement("insert into employee values(?,?,?,?)");

                ps.setInt(1,eid);
                ps.setString(2,name);
                ps.setString(3,null);
                ps.setInt(4,salary);

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
