package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    @SuppressWarnings("exports")
    public Connection databaseLink;

    @SuppressWarnings("exports")
    public Connection getConnection() {
        String databaseName = "login_demo_db";
        String databaseUser = "root";
        String databasePassword = "Iamironman1!";
        String url = "jdbc:mysql://localhost/" + databaseName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser, databasePassword);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return databaseLink;
    }
    
}
