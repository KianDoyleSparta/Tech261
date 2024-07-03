package com.sparta.kd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    // Connection
    // Statements
    // Results

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    "root",
                    "root");
            if (connection != null) {
                System.out.println("successful");
            } else {
                System.out.println("bad");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
