package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

import javax.xml.stream.events.StartDocument;

public class PreparedStatementTest {

	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public void initParam(String paramFile) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(paramFile));
		driver = properties.getProperty("driver");
		url = properties.getProperty("url");
		user = properties.getProperty("user");
		pass=properties.getProperty("password");
		System.out.println(url+"user="+user+"&password="+pass);
		Class.forName(driver).newInstance();
	}
	
	public void insertUseStatement() throws Exception {
		long  start = System.currentTimeMillis();
//		for (int j = 0; j <10; j++) {
//			System.out.println("insert into haha values("+j+",'zhang"+j+"')");
//		}
		
		try {
			Connection conn = DriverManager.getConnection(url+"user="+user+"&password="+pass);
			Statement state = conn.createStatement();
			System.out.println(state);
			for (int i = 0; i < 100; i++) {
				state.executeUpdate("insert into haha values("+i+",'zhang"+i+"')");
			}
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
		PreparedStatementTest pt = new PreparedStatementTest();
		try {
			pt.initParam("mysql.ini");
			pt.insertUseStatement();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
