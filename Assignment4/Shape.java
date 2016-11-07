package Day4.Assignment4;

public class Shape {

	private double length;
	private double breadth;
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Shape(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public Shape(double side)
	{
		this.side=side;
	}
	public void displayArea()
	{
		System.out.println("Driver Class Area Fn is called.");
	}

}
