package workshop_06;

public class Test04 {

	public static void main(String[] args) {
		Shape[] shape = new Shape[6];
		
		shape[0] = new Triangle(7,5,"blue");
		shape[1] = new Rectangle(4,6,"blue");
		shape[2] = new Triangle(6,7,"Red");
		shape[3] = new Rectangle(8,3,"Red");
		shape[4] = new Triangle(9,8,"White");
		shape[5] = new Rectangle(5,7,"White");
		
		System.out.println("기본 정보");
		for(int i = 0; i<6;i++) {
			System.out.println(shape[i]);
		}
		
		System.out.println("\n사이즈를 변경 후 정보");
		for(int i = 0; i<6;i++) {
			if(shape[i] instanceof Triangle) {
				Triangle t = (Triangle)shape[i];
				t.setResize(5);
			} 
			else if (shape[i] instanceof Rectangle) {

				Rectangle t = (Rectangle)shape[i];
				t.setResize(5);
			}
			System.out.println(shape[i]);
		}
		
		
	}

}
