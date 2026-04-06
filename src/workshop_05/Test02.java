package workshop_05;



public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("SQL Plus",50000, 5.0);
		Book b2 = new Book("Java 2.0",40000, 3.0);
		Book b3 = new Book("JSP Servlet",60000, 6.0);
		Book[] bb = new Book[] {b1,b2,b3};
		System.out.println("책이름   가격   할인율  할인후금액");
		System.out.println("----------------------------");
		for(Book b : bb) {
			System.out.printf("%s %d원 %.1f%% %.1f원\n",
					b.getBookName(), b.getBookPrice(), b.getBookDiscountRate(), b.getDiscountBookPrice());
		}

	}

}

