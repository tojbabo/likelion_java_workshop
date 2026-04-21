package exam2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Dao dao  = new Dao();
		ServiceImpl s = new ServiceImpl();
		s.setDAO(dao);
		Dto dto = new Dto();
		System.out.println("부서번호를 입력하시오");
		dto.setDeptno(scan.nextInt());
		System.out.println("부서명을 입력하시오");
		dto.setDname(scan.next());
		System.out.println("부서위치를 입력하시오");
		dto.setLoc(scan.next());
		
		
		
		s.insert(dto);

	}

}
