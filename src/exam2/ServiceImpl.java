package exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServiceImpl implements Service {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/testdb";
	String userid = "root";
	String passwd = "1234";
	Dao dao = null;
	public ServiceImpl() {
		try {
			Class.forName(driver);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void setDAO(Dao dao) {	
		this.dao = dao;
	}
	
	@Override
	public void insert(Dto dto) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			
					
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	
}
