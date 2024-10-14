package dao;
import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil;
import models.Stock;

public class StockDAO implements DAOinterface<Stock> {
	
	public static StockDAO getInstance() {
		return new StockDAO();
		
	}
	
	
	@Override
	public int Insert(Stock t) {
		// TODO Auto-generated method stub
		try {
			Connection con=JDBCUtil.getConnection();
			Statement st= con.createStatement();
			
			String sql="INSERT INTO Stock(ProductID,NameProduct,Quantity,Price)"+
						" VALUES ('"+t.getProductID()+ "','"+t.getNameProduct()+"' , '"+t.getQuantity()+"' , '"+t.getPrice()+"')";
			

			int result =st.executeUpdate(sql);
			
			System.out.println("Sql completed"+sql);
			System.out.println("Have "+ result+"Changed");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Cannot conect to database");
		}
		
		return 0;
	}

	@Override
	public int Update(Stock t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int Delete(Stock t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Stock> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stock selectById(Stock t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Stock> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
