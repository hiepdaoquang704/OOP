package dao;

import model.Customers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DatabaseUtil;

public class CustomerDAO {

    public void addCustomer(Customers customer) throws SQLException {
        String query = "INSERT INTO Customers (customerId, nameCustomer, address, phone, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, customer.getCustomerId());
            pstmt.setString(2, customer.getNameCustomer());
            pstmt.setString(3, customer.getAddress());
            pstmt.setInt(4, customer.getPhone());
            pstmt.setString(5, customer.getEmail());
            pstmt.executeUpdate();
        }
    }

    public List<Customers> getAllCustomers() throws SQLException {
        List<Customers> customersList = new ArrayList<>();
        String query = "SELECT * FROM Customers";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query);
                ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                Customers customer = new Customers(
                        rs.getInt("customerId"),
                        rs.getString("nameCustomer"),
                        rs.getString("address"),
                        rs.getInt("phone"),
                        rs.getString("email"));
                customersList.add(customer);
            }
        }
        return customersList;
    }

    public void updateCustomer(Customers customer) throws SQLException {
        String query = "UPDATE Customers SET nameCustomer = ?, address = ?, phone = ?, email = ? WHERE customerId = ?";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, customer.getNameCustomer());
            pstmt.setString(2, customer.getAddress());
            pstmt.setInt(3, customer.getPhone());
            pstmt.setString(4, customer.getEmail());
            pstmt.setInt(5, customer.getCustomerId());
            pstmt.executeUpdate();
        }
    }

    public void deleteCustomer(int customerId) throws SQLException {
        String query = "DELETE FROM Customers WHERE customerId = ?";
        try (Connection conn = DatabaseUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, customerId);
            pstmt.executeUpdate();
        }
    }
}
