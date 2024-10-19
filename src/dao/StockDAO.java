package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import models.Stock;

public class StockDAO implements DAOinterface<Stock>{
	public static StockDAO getInstance() {
		return new StockDAO();
	}
	
	@Override
	public int Insert(Stock t) {
		// TODO Auto-generated method stub
		try {
			Connection con=JDBCUtil.getConnection();
			
			Statement st=con.createStatement();
			String sql ="INSERT INTO Stock (ProductID,NameProduct,Quantity,Price)"+
			"VALUES ("+t.getProductID()+" ,'"+t.getNameProduct()+"' , '"+t.getQuantity()+"',"+t.getPrice()+")";
			
			System.out.println("Sql excute: "+sql);
			
			int result=st.executeUpdate(sql);
			System.out.println(result+"line changed");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int Update(Stock t) {
	    try {
	        Connection con = JDBCUtil.getConnection();
	        
	        String sql = "UPDATE Stock SET NameProduct = ?, Quantity = ?, Price = ? WHERE ProductID = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setString(1, t.getNameProduct());
	        ps.setInt(2, t.getQuantity());
	        ps.setDouble(3, t.getPrice());
	        ps.setInt(4, t.getProductID());
	        
	        System.out.println("SQL to execute: " + ps.toString());
	        
	        int result = ps.executeUpdate();
	        System.out.println(result + " row(s) updated.");
	        
	        JDBCUtil.closeConnection(con);
	        return result; // Return the number of rows affected
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return 0;
	}


	@Override
	public int Delete(Stock product) {
	    try {
	        Connection con = JDBCUtil.getConnection();

	        String sql = "DELETE FROM Stock WHERE ProductID = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, product.getProductID());

	        System.out.println("SQL to execute: " + ps.toString());

	        int result = ps.executeUpdate();
	        System.out.println(result + " row(s) deleted.");

	        JDBCUtil.closeConnection(con);
	        return result; // Return the number of rows affected

	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return 0;
	}


	@Override
	public ArrayList<Stock> selectAll() {
	    ArrayList<Stock> result = new ArrayList<Stock>();
	    try {
	        Connection con = JDBCUtil.getConnection();
	        Statement st = con.createStatement();
	        String sql = "SELECT * FROM Stock";
	        System.out.println("SQL to execute: " + sql);

	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            int Id = rs.getInt("ProductID");
	            String name = rs.getString("NameProduct");
	            int quantity = rs.getInt("Quantity");
	            float price = rs.getFloat("Price");

	            // Create a new Stock object and add it to the result list
	            Stock stock = new Stock(Id, name, quantity, price);
	            result.add(stock);
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result; // Return the list of Stock objects
	}


	@Override
	public Stock selectById(Stock t) {
	    Stock stock = null;
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "SELECT * FROM Stock WHERE ProductID = ?";
	        PreparedStatement ps = con.prepareStatement(sql);
	        ps.setInt(1, t.getProductID());

	        System.out.println("SQL to execute: " + ps.toString());

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            int productId = rs.getInt("ProductID");
	            String nameProduct = rs.getString("NameProduct");
	            int quantity = rs.getInt("Quantity");
	            float price = rs.getFloat("Price");

	            // Create a Stock object with the retrieved data
	            stock = new Stock(productId, nameProduct, quantity, price);
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return stock;
	}


	@Override
	public ArrayList<Stock> selectByCondition(String condition) {
	    ArrayList<Stock> result = new ArrayList<Stock>();
	    try {
	        Connection con = JDBCUtil.getConnection();
	        String sql = "SELECT * FROM Stock WHERE " + condition;
	        Statement st = con.createStatement();

	        System.out.println("SQL to execute: " + sql);

	        ResultSet rs = st.executeQuery(sql);

	        while (rs.next()) {
	            int productId = rs.getInt("ProductID");
	            String nameProduct = rs.getString("NameProduct");
	            int quantity = rs.getInt("Quantity");
	            float price = rs.getFloat("Price");

	            // Create a Stock object and add it to the result list
	            Stock stock = new Stock(productId, nameProduct, quantity, price);
	            result.add(stock);
	        }

	        JDBCUtil.closeConnection(con);
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return result;
	}

    public boolean CheckExisted(Stock product) {
        String sql = "SELECT COUNT(*) FROM Stock WHERE ProductID = ?";
        Connection con = JDBCUtil.getConnection();
        
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, product.getProductID());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0; // Trả về true nếu sản phẩm tồn tại
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        JDBCUtil.closeConnection(con);
        return false; // Trả về false nếu không tìm thấy sản phẩm
    }


	
}