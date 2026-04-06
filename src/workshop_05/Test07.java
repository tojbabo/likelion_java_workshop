package workshop_05;

public class Test07 {

	public static void main(String[] args) {
		Student2[] studentArray  = new Student2[3];
		studentArray[0] = new Student2("홍길동",15,171,81);
		studentArray[1] = new Student2("한사람",13,183,70);
		studentArray[2] = new Student2("임걱정",16,175,65);
		
		int sumage =0;
		int sumheight = 0;
		int sumweight = 0;
		
		Student2[] ages = new Student2[2];
		Student2[] heights = new Student2[2];
		Student2[] weights = new Student2[2];
		ages[0] = studentArray[0];
		heights[0] = studentArray[0];
		weights[0] = studentArray[0];
		ages[1] = studentArray[0];
		heights[1] = studentArray[0];
		weights[1] = studentArray[0];
		
	
		System.out.println("이름\t나이\t신장\t몸무게");
		for(Student2 s:studentArray) {
			String info = s.studentInfo();
			System.out.println(info);
			
			int age = s.getAge();
			int height = s.getHeight();
			int weight = s.getWeight();
			
			sumage += age;
			sumheight += height;
			sumweight += weight;
			
			
			if(age<ages[0].getAge()) ages[0] = s;
			if(age>ages[1].getAge()) ages[1] = s;
			
			if(height<heights[0].getHeight()) heights[0] = s;
			if(height>heights[1].getHeight()) heights[1] = s;
			
			if(weight<weights[0].getWeight()) weights[0] = s;
			if(weight>weights[1].getWeight()) weights[1] = s;
			
			
			
			
			
			
			
			
			
			
			
		}
		
		System.out.printf("\n나이의 평균: %.2f\n",(float)sumage/3);
		System.out.printf("신장의 평균: %.2f\n",(float)sumheight/3);
		System.out.printf("몸무게의 평균: %.2f\n\n",(float)sumweight/3);
		

		System.out.printf("나이가 가장 많은 학생: %s\n",ages[1].getName());
		System.out.printf("나이가 가장 적은 학생: %s\n",ages[0].getName());
		System.out.printf("신장이 가장 큰 학생: %s\n",heights[1].getName());
		System.out.printf("신장이 가장 작은 학생: %s\n",heights[0].getName());
		System.out.printf("몸무게가 가장 만이 나가는 학생: %s\n",weights[1].getName());
		System.out.printf("몸무게가 가장 적게 나가는 학생: %s\n",weights[0].getName());
		
		

	}

}
