package database;
import java.sql.Connection;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCUtil {
	public static Connection getConnection() {
		Connection c =null;
		
		try {
			//Đănng ký mysql Driver với Driver Manager
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mysql://avnadmin:AVNS_IuP2XVXWP8qDaS5Nqq4@mysql-277c0df0-hiepdaoquang704-cd96.i.aivencloud.com:20871/defaultdb?ssl-mode=REQUIRED";
			String username="avnadmin";
			String password="AVNS_IuP2XVXWP8qDaS5Nqq4";
			c= DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	public static void closeConnection(Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void printInfo(Connection c) {

			try {
				if(c!=null) {
					System.out.println(c.getMetaData().toString());
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
