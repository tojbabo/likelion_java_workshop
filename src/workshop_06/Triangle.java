package workshop_06;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)this.getWidth()*this.getHeight() / 2;
	}

	@Override
	public void setResize(int size) {
		
		// TODO Auto-generated method stub
		int height = this.getHeight();
		this.setHeight(height+size);
		
	}
	public String toString() {
		return "Triangle" + "\t"+this.getArea()+"\t"+this.getColors();
	}

}
