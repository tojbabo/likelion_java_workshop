package workshop_06;

public class Rectangle extends Shape implements Resize  {

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		int width = this.getWidth();
		this.setWidth(width+size);
		
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getWidth()*this.getHeight();
	}
	
	public String toString() {
		return "Retangle" + "\t"+this.getArea()+"\t"+this.getColors();
	}
}
