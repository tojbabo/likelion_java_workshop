package workshop_jdbc01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentDTO {
	private String stuNo;
	private String departNo;
	private String stuName;
	private String stuSsn;
	private String stuAddress;
	private String entDate;
	private char absYn;
	private String coachProfessorNo;
	
	public StudentDTO(String stuNo, String departNo, String stuName, String stuSsn, String stuAddress, String entDate,
			char absYn, String coachProfessorNo) {
		super();
		this.stuNo = stuNo;
		this.departNo = departNo;
		this.stuName = stuName;
		this.stuSsn = stuSsn;
		this.stuAddress = stuAddress;
		this.entDate = entDate;
		this.absYn = absYn;
		this.coachProfessorNo = coachProfessorNo;
	}
	public String getStuNo() {
		return stuNo;
	}
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getDepartNo() {
		return departNo;
	}
	public void setDepartNo(String departNo) {
		this.departNo = departNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSsn() {
		return stuSsn.substring(0,8) + "******";
	}
	public void setStuSsn(String stuSsn) {
		this.stuSsn = stuSsn;
	}
	public String getStuAddress() {
		if(this.stuAddress == null) return "***주소 미상***";
		if(this.stuAddress.length() <= 10)
			return stuAddress;
		else
			return this.stuAddress.substring(0, 10) + "...";
		
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public String getEntDate() {
		return this.entDate.replace("-", "/");
	}
	public void setEntDate(String entDate) {
		this.entDate = entDate;
	}
	public char getAbsYn() {
		return absYn;
	}
	public void setAbsYn(char absYn) {
		this.absYn = absYn;
	}
	public String getCoachProfessorNo() {
		return coachProfessorNo;
	}
	public void setCoachProfessorNo(String coachProfessorNo) {
		this.coachProfessorNo = coachProfessorNo;
	}
	
	

}
