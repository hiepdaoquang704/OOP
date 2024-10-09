package com.helpers;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public InsertData() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement sta = conn.createStatement();
                ResultSet reset = sta.executeQuery("SELECT * FROM Customers")) {

            System.out.println("Display data from database:");
            while (reset.next()) {
                String userID = reset.getString("userId");
                String username = reset.getString("username");
                String address = reset.getString("address");
                System.out.println(userID + " " + username + " " + address);
            }
        } catch (SQLException e) {
            System.out.println("Error in database connection.");
            e.printStackTrace();
        }
    }

    // Method to insert data into the Customers table
    public static void insertData(String userId, String username, String address) {
        String insertSQL = "INSERT INTO Customers (userId, username, address) VALUES (?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

            pstmt.setString(1, userId);
            pstmt.setString(2, username);
            pstmt.setString(3, address);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data successfully inserted into the Customers table.");
            }
        } catch (SQLException e) {
            System.out.println("Error inserting data into the Customers table.");
            e.printStackTrace();
        }
    }
}
