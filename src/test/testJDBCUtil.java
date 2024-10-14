package test;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import database.JDBCUtil;
public class testJDBCUtil {
	public static void main(String[] args) {
		try {
			Connection connection= JDBCUtil.getConnection();
			Statement st=connection.createStatement();
			
			
			
			String sql = "INSERT INTO Customers (CustomerID, NameCustomer, Address, Phone, Email) "
			           + "VALUES (6, 'Tran ADdas', '18', '12', '123Ha@gmail.com')";

			int check = st.executeUpdate(sql);
			
			
			System.out.println("Số dòng thay đổi: "+check);
			if(check>0) {
				System.out.println("Add completed: ");
			} else {
				System.out.println("Can not add to database");
			}
			
			JDBCUtil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
