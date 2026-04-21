package exam2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	
	public int insert(Connection con, Dto dto) {
		PreparedStatement pstmt = null;
		int result=0;
		try {
			String sql = "insert into dept (deptno, dname, loc) value(?,?,?);";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			result = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
		
		
	}

}
