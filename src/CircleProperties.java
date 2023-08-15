import java.util.Scanner;

public class CircleProperties {
	/* Write a method named Circle and print the circumference and
	 * area of a circle of radius entered by user.
	 */
	public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		float radius = scan.nextFloat();
		scan.close();
		System.out.println(circle(radius));

	}
	public static String circle(float r) {
		double circumference = 2 * PI * r;
		double area = PI * r * r;
		String str = "The area of the circle of radius " + r + " is " + area + " and the circumference is " + circumference;
		return str;
	}

}
