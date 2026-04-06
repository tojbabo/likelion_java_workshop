package workshop_05;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		Student[] ss = new Student[] {s1,s2,s3};
		
		for(Student s: ss) {
			System.out.printf("%s 평균: %.1f 학점: %s학점\n",s.getName(),s.getAvg(), s.getGrade());			
		}
		
		

	}

}
