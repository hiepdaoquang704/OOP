package src.main.java.com.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://mysql-277c0df0-hiepdaoquang704-cd96.i.aivencloud.com:20875";
    private static final String USER = "defaultdb";
    private static final String PASSWORD = "AVNS_IuP2XVXWP8qDaS5Nqq4";

    public static Connection Aivenconnect() {
        Connection conn = null;
        Statement sta = null;
        ResultSet reset = null;
        try {
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
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error in database connection.");
            e.printStackTrace();
        } finally {
            try {
                if (reset != null)
                    reset.close();
                if (sta != null)
                    sta.close();
                if (conn != null)
                    conn.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources.");
                e.printStackTrace();
            }
        }
        return conn; // Return the connection if you need to use it elsewhere.
    }
}
