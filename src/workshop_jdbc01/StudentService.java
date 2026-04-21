package workshop_jdbc01;

import java.util.ArrayList;

public interface StudentService {
	public abstract void setDAO(StudentDAO dao);
	
	public abstract ArrayList<StudentDTO> getStudents(); 
	public abstract ArrayList<StudentDTO> getStudents(String name);  
	public abstract ArrayList<StudentDTO> getStudents(int startY, int endY);
	
	public abstract ArrayList<StudentDTO> getStudents_ids(String ids);
	
	public abstract long UpdateAbsence(String ids);
	
	public abstract long ExpandDepartSize();
	
	public abstract ArrayList<String> getStudentGrades(String id);

}
