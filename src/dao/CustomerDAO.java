package dao;
import models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
public class CustomerDAO implements DAOinterface<Customer>{

	@Override
	public int Insert(Customer t) {
	    int result = 0;
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "INSERT INTO Customers (NameCustomer, Address, Phone, Email) VALUES (?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, t.getName());
	        ps.setString(2, t.getAddress());
	        ps.setString(3, t.getPhone());
	        ps.setString(4, t.getEmail());

	        System.out.println("SQL to execute: " + ps.toString());

	        result = ps.executeUpdate();
	        System.out.println(result + " row(s) inserted.");

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the number of rows affected
	}


	@Override
	public int Update(Customer t) {
	    int result = 0;
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "UPDATE Customers SET Address = ?, Phone = ?, Email = ? WHERE NameCustomer = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, t.getAddress());
	        ps.setString(2, t.getPhone());
	        ps.setString(3, t.getEmail());
	        ps.setString(4, t.getName());

	        System.out.println("SQL to execute: " + ps.toString());

	        result = ps.executeUpdate();
	        System.out.println(result + " row(s) updated.");

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the number of rows affected
	}


	@Override
	public int Delete(Customer t) {
	    int result = 0;
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "DELETE FROM Customers WHERE NameCustomer = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, t.getName());

	        System.out.println("SQL to execute: " + ps.toString());

	        result = ps.executeUpdate();
	        System.out.println(result + " row(s) deleted.");

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the number of rows affected
	}


	@Override
	public ArrayList<Customer> selectAll() {
	    ArrayList<Customer> result = new ArrayList<Customer>();
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "SELECT * FROM Customers";
	        Statement st = con.createStatement();

	        System.out.println("SQL to execute: " + sql);

	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            String name = rs.getString("NameCustomer");
	            String address = rs.getString("Address");
	            String phone = rs.getString("Phone");
	            String email = rs.getString("Email");

	            Customer customer = new Customer();
	            customer.setName(name);
	            customer.setAddress(address);
	            customer.setPhone(phone);
	            customer.setEmail(email);

	            result.add(customer);
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the list of customers
	}


	@Override
	public Customer selectById(Customer t) {
	    Customer customer = null;
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "SELECT * FROM Customers WHERE NameCustomer = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, t.getName());

	        System.out.println("SQL to execute: " + ps.toString());

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            customer = new Customer();
	            customer.setName(rs.getString("NameCustomer"));
	            customer.setAddress(rs.getString("Address"));
	            customer.setPhone(rs.getString("Phone"));
	            customer.setEmail(rs.getString("Email"));
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return customer; // Return the customer object
	}


	@Override
	public ArrayList<Customer> selectByCondition(String condition) {
	    ArrayList<Customer> result = new ArrayList<Customer>();
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "SELECT * FROM Customers WHERE " + condition;
	        Statement st = con.createStatement();

	        System.out.println("SQL to execute: " + sql);

	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            Customer customer = new Customer();
	            customer.setName(rs.getString("NameCustomer"));
	            customer.setAddress(rs.getString("Address"));
	            customer.setPhone(rs.getString("Phone"));
	            customer.setEmail(rs.getString("Email"));

	            result.add(customer);
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the list of customers
	}

	
}
