package workshop_03;

public class Work02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이름을 배열로 관리: 홍길동, 이순신, 유관순 관리
		
		String[] names = new String[3];
		
		for(int i = 0 ; i<names.length;i++){
			System.out.println((i+1)+"번 째 이름: "+names[i]);
		}
		
		
		names[0] = "홍길동";
		names[1] = "유관순";
		names[2] = "이순신";
		
		for(int i = 0 ; i<names.length;i++){
			System.out.println((i+1)+"번 째 이름: "+names[i]);
		}
		
		

	}

}
