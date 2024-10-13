package test;
import java.sql.Connection;
import database.JDBCUtil;
public class testJDBCUtil {
	public static void main(String[] args) {
		Connection connection= JDBCUtil.getConnection();
		System.out.println(connection);
		JDBCUtil.printInfo(connection);
		JDBCUtil.closeConnection(connection);
		System.out.println(connection);
	}
}
