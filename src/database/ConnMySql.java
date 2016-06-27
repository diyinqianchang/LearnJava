package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnMySql {
	public static void main(String[] args) throws Exception {
		Statement stmt = null;
		ResultSet resultSet = null;
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/abc?characterEncoding=utf8&useSSL=true&"+"user=root&password=zhangguolin-1990");
			 stmt = conn.createStatement();    //不要导错包
			System.out.println(stmt);
			resultSet = stmt.executeQuery("select * from test");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}finally {
			if (resultSet != null) {
				resultSet.close();
				resultSet = null;
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		}
	}
}