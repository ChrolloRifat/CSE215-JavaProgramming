
public class Square extends Rectangle {
	Square(){
		super();
	}
	
	Square(double side1, double side2){
		super(side1,side2);
	}
	Square(String name, double side1, double side2) {
		super(name, side1, side2);
	}

	public String toString() {
		return super.toString() ;
	}
	
}
