package workshop_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(100,42,57,2,1);
		list.stream().
		sorted().
		forEach(System.out::println);
		System.out.println("----------------람다식을 활용한 오름차순 정렬 출력----------------------");
		
		List<Student> slist = Arrays.asList(new Student("홍길동",100),
				new Student("이순신",90),
				new Student("유관순",50),
				new Student("강감찬",70),
				new Student("정조",95),
				new Student("선덕여왕",45)
				);
		
//		Stream<Student> stdlist = slist.stream();
//		
//		Function<Student, String> f = new Function<Student, String>(){
//			@Override
//			public String apply(Student stu) {
//				return stu.getName();
//			}
//		};
//		
//		Function<Student, String> f2 = stu->stu.getName();
//		Function<Student, String> f3 = Student::getName;
//		
//		Stream<String> streams = stdlist.map(f3);
//		
//		streams.forEach(System.out::println);
		
		slist.stream().map(Student::getName).forEach(System.out::println);
		
		Function<Student, Integer> f = new Function<Student, Integer>(){
			@Override
			public Integer apply(Student stu) {
				return stu.getGrade();
			}
		};
		
		System.out.println("--------점수를 기준으로 내림차순으로 정렬--------- ");
		slist.stream().sorted(Comparator.comparing(f, Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		System.out.println("-------앞에 두 항목을 건너뛰기-------- ");
		slist.stream().skip(2).sorted(Comparator.comparing(f, Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		Function<Student,String> f3 = Student::getName;
		
		
		


		
	}

}

class Student{
	String name;
	int grade;
	public String getName() {
		return name;
	}
	public Student(String name, int grade) {
		super();
		this.name = name;
		this.grade = grade;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String toString() {
		return this.getName();
	}	
}
