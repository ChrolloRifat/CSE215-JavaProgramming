import java.util.Scanner;

public class GeometricShapeDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape shape;
		double side1, side2;
		
		System.out.println("What shape do you want to create?");
		String name = scan.nextLine();
		if(name.equals("Square") || name.equals("square")) {
			System.out.println("Enter the side of the square:");
			side1 = scan.nextDouble();
			side2 = side1;
			shape = new Square(name, side1, side2);
			System.out.println(((Square)shape).toString()); // usage of type-casting
		}
		else if(name.equals("Rectangle") || name.equals("rectangle")) {
			System.out.println("Enter side1:");
			side1 = scan.nextDouble();
			System.out.println("Enter side2:");
			side2 = scan.nextDouble();
			shape = new Rectangle(name, side1, side2);
			System.out.println(((Rectangle)shape).toString()); // usage of type-casting
		}
		else {
			System.out.println("Unrecognised shape!!!");
		}
		//System.out.println(shape.toString());  // gives the same output as the one in the if-else block

		scan.close();
	} 

}
