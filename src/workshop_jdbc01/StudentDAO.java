package workshop_jdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import exam2.Dto;

public class StudentDAO {
	public ArrayList<StudentDTO> getData(Connection conn){
		ArrayList<StudentDTO> slist = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		
		ResultSet result=null;
		try {
			String sql = "select * from tb_student;";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery(sql);

			while(result.next()) {
				StudentDTO student = 
						new StudentDTO(
								result.getString("student_no"),
								result.getString("department_no"),
								result.getString("student_name"),
								result.getString("student_ssn"),
								result.getString("student_address"),
								result.getString("entrance_date"),
								result.getString("absence_yn").charAt(0),
								result.getString("coach_professor_no")
								);
				slist.add(student);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}
	
	public ArrayList<StudentDTO> getData(Connection conn, String name){
		ArrayList<StudentDTO> slist = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		
		ResultSet result=null;
		try {
			String sql = "select * from tb_student where student_name like '%"+name+"%';";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery(sql);

			while(result.next()) {
				StudentDTO student = 
						new StudentDTO(
								result.getString("student_no"),
								result.getString("department_no"),
								result.getString("student_name"),
								result.getString("student_ssn"),
								result.getString("student_address"),
								result.getString("entrance_date"),
								result.getString("absence_yn").charAt(0),
								result.getString("coach_professor_no")
								);
				slist.add(student);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}
	public ArrayList<StudentDTO> getData(Connection conn, int startY, int endY){
		ArrayList<StudentDTO> slist = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		
		ResultSet result=null;
		try {
			String sql = "select * from tb_student "
							+ "where extract(year from ENTRANCE_DATE) >="+startY
							+ " and extract(year from ENTRANCE_DATE) <="+endY
									+ " order by entrance_date;";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery(sql);

			while(result.next()) {
				StudentDTO student = 
						new StudentDTO(
								result.getString("student_no"),
								result.getString("department_no"),
								result.getString("student_name"),
								result.getString("student_ssn"),
								result.getString("student_address"),
								result.getString("entrance_date"),
								result.getString("absence_yn").charAt(0),
								result.getString("coach_professor_no")
								);
				slist.add(student);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}
	
	//updateAbsence_ids
	public ArrayList<StudentDTO> getData_ids(Connection conn, String ids){
		ArrayList<StudentDTO> slist = new ArrayList<StudentDTO>();
		PreparedStatement pstmt = null;
		
		ResultSet result=null;
		try {
			String sql = "select * from tb_student where student_no in ("+ids+");";
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeQuery(sql);

			while(result.next()) {
				StudentDTO student = 
						new StudentDTO(
								result.getString("student_no"),
								result.getString("department_no"),
								result.getString("student_name"),
								result.getString("student_ssn"),
								result.getString("student_address"),
								result.getString("entrance_date"),
								result.getString("absence_yn").charAt(0),
								result.getString("coach_professor_no")
								);
				slist.add(student);
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}
	public long updateAbsence_ids(Connection conn, String ids){
		PreparedStatement pstmt = null;
	
		try {
			String sql = "update tb_student set absence_yn='Y' where student_no in ("+ids+");";
			
			pstmt = conn.prepareStatement(sql);
			return pstmt.executeLargeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	public long updateExpandDepartSize(Connection conn){
		PreparedStatement pstmt = null;
	
		try {
			String sql = "update tb_department"
					+ " set capacity= capacity +"
					+ " ( case"
					+ " when capacity < 21 then 5"
					+ " when capacity < 26 then 4"
					+ " when capacity < 31 then 3"
					+ " else 0"
					+ " end"
					+ ");";
			
			pstmt = conn.prepareStatement(sql);
			return pstmt.executeLargeUpdate(sql);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	//getStudentGrade

	public ArrayList<String> getStudentGrade(Connection conn, String id){
		PreparedStatement pstmt = null;
		ArrayList<String> slist = new ArrayList<String>();
	
		try {
			String sql = "select term_no, s.student_no, student_name, class_name, point, "
					+ "(case"
					+ "	when point >= 4.0 then 'A 학점'"
					+ "	when point >= 3.5 then 'B 학점'"
					+ "    when point >= 3.0 then 'C 학점'"
					+ "    when point >= 2.0 then 'D 학점'"
					+ "    else 'F 학점'"
					+ "end) as grade"
					+ " from tb_student as s"
					+ " join tb_grade as g using(student_no)"
					+ " join tb_class as c using(class_no)"
					+ " where student_no = '"+id+"'"
					+ " order by term_no;";
			
			pstmt = conn.prepareStatement(sql);
			ResultSet result = pstmt.executeQuery(sql);

			
			while(result.next()) {
				String s = result.getString("term_no")+"\t"+result.getString("student_no")+"\t"
				+result.getString("student_name")+"\t"+result.getString("class_name")+"\t"
				+result.getString("point")+"\t"+result.getString("grade");
				slist.add(s);
			}
			return slist;
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!= null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return slist;
	}
	
}
