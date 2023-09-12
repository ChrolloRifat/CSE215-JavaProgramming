
public class Rectangle extends Shape{
	private double side1,side2;
	
	Rectangle(){
		
		this("No name",0.00,0.00);
	}
	Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}

	public Rectangle(String name, double side1, double side2) {
		super(name);
		this.side1 = side1;
		this.side2 = side2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double area() {
		return side1 * side2;
	}
	
	public double perimeter() {
		return 2 * (side1 + side2);
	}
	public String toString() {
		return super.toString() + ", Area: " + area() + ", Perimeter: " + perimeter();
				
	}
}
