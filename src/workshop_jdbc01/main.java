package workshop_jdbc01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		StudentServiceImpl ssimpl = new StudentServiceImpl();
		ssimpl.setDAO(dao);
		while(true) {
			int input = menuopen(scan);
			ArrayList<StudentDTO> students = null;
			if(input == 0) break;
			else if (input == 2) {
				System.out.print("검색할 학생명을 입력하시오 =>");
				String searchname = scan.next();
				students = ssimpl.getStudents(searchname);
			}
			else if(input == 3) {
				System.out.print("시작 입학년도 입력하시오 =>");
				int startyear = scan.nextInt();
				System.out.print("끝 입학년도 입력하시오 =>");
				int endyear = scan.nextInt();
				students = ssimpl.getStudents(startyear, endyear);
			}
			else if(input == 4) {
				System.out.print("검색할 학생의 학번을 입력하시오 =>");
				String keyword = scan.next();
				String newkeyword = Arrays.stream(keyword.split(","))
						.map(String::trim)
						.map(s->"'"+s+"'")
						.collect(Collectors.joining(","));
				
				students = ssimpl.getStudents_ids(newkeyword);
			}
			else if(input == 5) {
				System.out.print("수정할 학생의 학번을 입력하시오 =>");
				String keyword = scan.next();
				String newkeyword = Arrays.stream(keyword.split(","))
						.map(String::trim)
						.map(s->"'"+s+"'")
						.collect(Collectors.joining(","));
				
				long result = ssimpl.UpdateAbsence(newkeyword);

				System.out.printf("총 변경된 학생 수 : %d명\n\n",result);
				continue;
			}
			else if(input == 6) {
				long result = ssimpl.ExpandDepartSize();
				System.out.printf("총 변경된 학생 수 : %d명\n\n",result);
				continue;
			}
			else if(input == 7) {
				System.out.print("학생의 학번을 입력하시오 =>");
				String id = scan.next();
				ArrayList<String> list = ssimpl.getStudentGrades(id);
				list.forEach(x->{
					System.out.println(x);
				});
				
				continue;
			}
			
			else {
				students = ssimpl.getStudents();
			}
			
			
			System.out.println("=========================================================");
			System.out.println("학번\t 이름\t 주민번호\t 주소\t 입학년도\t 휴학여부");
			students.forEach((x)->{
				System.out.print(x.getStuNo() + "\t");
				System.out.print(x.getStuName() + "\t");
				System.out.print(x.getStuSsn() + "\t");
				System.out.print(x.getStuAddress() + "\t");
				System.out.print(x.getEntDate() + "\t");
				System.out.print(x.getAbsYn() + "\t\n");
			});
			System.out.printf("총 학생수 : %d명\n\n",students.size());
		}
	}
	
	static int menuopen(Scanner scan) {
		System.out.println("**************************************************");
		System.out.println("\t[학생 정보 관리 메뉴]");
		System.out.println("**************************************************");
		System.out.println("1.전체 학생 목록");
		System.out.println("2.학생 이름 검색");
		System.out.println("3.학생 입학년도 범위 검색 (예> 2000부터 2003년까지)");
		System.out.println("4.학생 학번으로 다중 검색 (쉼표 구분자)");
		System.out.println("5.학생 휴학 일괄수정");
		System.out.println("6.학과 정원 일괄수정");
		System.out.println("7.학생 학점 검색");
		System.out.println("0. 종료");
		System.out.println("**************************************************");
		System.out.print("메뉴 입력 => ");
		int menu = scan.nextInt();
		return menu;
		
	}

}
