package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.JDBCUtil;

public class LoginController {


    public String login(String email, String password) {
        Connection conn = JDBCUtil.getConnection();
        String UserType = null;  

        if (conn != null) {
            try {
                String query = "SELECT UserType FROM Users WHERE email = ? AND password = ?";
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, email);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    UserType = rs.getString("UserType");  
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return UserType;
    }
}
