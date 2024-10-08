package com.Database;

package com.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertData {
    private static final String URL = "jdbc:mysql://mysql-277c0df0-hiepdaoquang704-cd96.i.aivencloud.com:20875";
    private static final String USER = "defaultdb";
    private static final String PASSWORD = "AVNS_IuP2XVXWP8qDaS5Nqq4";try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(URL, USER, PASSWORD);
        sta = conn.createStatement();
        reset = sta.executeQuery("SELECT * FROM Customers");

        System.out.println("Display data from database: ");
        while (reset.next()) {
            String userID = reset.getString("userId");
            String username = reset.getString("username");
            String address = reset.getString("address");
            System.out.println(userID + " " + username + " " + address);
        }
    }catch(
    ClassNotFoundException e)
    {
        System.out.println("MySQL JDBC Driver not found.");
        e.printStackTrace();
    }catch(
    SQLException e)
    {
        System.out.println("Error in database connection.");
        e.printStackTrace();
    }

    // Method to insert data into the Customers table
    public static void insertData(String userId, String username, String address) {
        String insertSQL = "INSERT INTO Customers (userId, username, address) VALUES (?, ?, ?)";
        try (Connection conn = Aivenconnect();
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

    public static void main(String[] args) {
        // Example usage of the insertData method
        insertData("12345", "John Doe", "123 Main St, New York, NY");
    }

}