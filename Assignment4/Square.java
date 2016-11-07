package Day4.Assignment4;

public class Square extends Shape {

	private double Area;

	public Square(double side) {
		super(side);
		// TODO Auto-generated constructor stub
	}

	public void displayArea() {
		Area = Math.pow(getSide(), 2);
		System.out.println("Area of Square : "+Area);
		}
}