package com.masai;

//inserting by using Statement

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.out.println("Problem with loading the driver");
//            throw new RuntimeException(e);
            }

            String cs ="jdbc:mysql://localhost:3306/sb101";

            try(Connection conn = DriverManager.getConnection(cs,"root","..shivam1998..")) {

                Statement st= conn.createStatement();
                int x =st.executeUpdate("insert into student values (1,'aam','ranchi',480)");

                if (x>0)
                    System.out.println("inserted...");
                else
                    System.out.println("not inserted...");



            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

