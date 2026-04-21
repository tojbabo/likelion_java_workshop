package workshop_jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/workshop";
	String userid = "root";
	String passwd = "1234";
	StudentDAO dao = null;
	public StudentServiceImpl() {
		try {
			Class.forName(driver);
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void setDAO(StudentDAO dao) {
		// TODO Auto-generated method stub
		this.dao = dao;
		
	}
	@Override
	public ArrayList<StudentDTO> getStudents() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.getData(conn);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return null;
	}
	@Override
	public ArrayList<StudentDTO> getStudents(String name) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.getData(conn, name);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return null;
	}
	@Override
	public ArrayList<StudentDTO> getStudents(int startY, int endY) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.getData(conn, startY, endY);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return null;
	}
	@Override
	public ArrayList<StudentDTO> getStudents_ids(String ids) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.getData_ids(conn, ids);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return null;
	}
	@Override
	public long UpdateAbsence(String ids) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.updateAbsence_ids(conn, ids);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return 0;
	}
	@Override
	public long ExpandDepartSize() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.updateExpandDepartSize(conn);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return 0;
		
	}
	@Override
	public ArrayList<String> getStudentGrades(String id) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			return dao.getStudentGrade(conn, id);
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	
}
