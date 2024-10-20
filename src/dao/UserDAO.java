package dao;
import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;

public class UserDAO implements DAOinterface<User> {

    @Override
    public int Insert(User user) {
        int result = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Users (NameUser, Email, Phone, Password, UserType) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setLong(3, user.getPhone());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getUserType());  
            
            
            System.out.println("SQL to execute: " + ps.toString());  
            
            
            result = ps.executeUpdate();

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

	@Override
	public int Update(User t) {

		return 0;
	}

	@Override
	public int Delete(User t) {

		return 0;
	}

	@Override
	public ArrayList<User> selectAll() {

		return null;
	}

	@Override
	public User selectById(User t) {

		return null;
	}

	@Override
	public ArrayList<User> selectByCondition(String condition) {

		return null;
	}
}


