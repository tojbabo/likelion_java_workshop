package workshop_05;

public class Test06 {

	public static void main(String[] args) {
		Student2[] studentArray  = new Student2[3];
		studentArray[0] = new Student2("홍길동",15,171,81);
		studentArray[1] = new Student2("한사람",13,183,72);
		studentArray[2] = new Student2("임걱정",16,175,65);
		
		int sumage =0;
		int sumheight = 0;
		int sumweight = 0;
	
		for(Student2 s:studentArray) {
			sumage += s.getAge();
			sumheight += s.getHeight();
			sumweight += s.getWeight();
			
		}
		
		System.out.printf("나이의 평균: %.2f\n",(float)sumage/3);
		System.out.printf("신장의 평균: %.2f\n",(float)sumheight/3);
		System.out.printf("몸무게의 평균: %.2f\n",(float)sumweight/3);
	}

}
