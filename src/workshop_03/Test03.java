package workshop_03;

public class Test03 {
	public static void main(String[] args) {
		
		int row = 1;
		int col = 0;
		while(row < 11) {
			if(col != row) {
				System.out.print("*");	
				col++;
			}
			else {
				System.out.println();
				row++;
				col = 0;
			}
			
	
		}
		
	}

}
