package Day4.Assignment4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of Rectangle : ");
		double length = scan.nextDouble();
		System.out.println("Enter the Breadth of Rectangle : ");
		double breadth = scan.nextDouble();
		System.out.println("Enter the Side of Square : ");
		double side = scan.nextDouble();
		scan.close();

		Shape objT = new Square(side); 
		objT.displayArea();

		Shape objR = new Rectangle(length, breadth);
		objR.displayArea();

	}
}
