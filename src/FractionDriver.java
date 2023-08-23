
public class FractionDriver{
	public static void main(String[] args) {
		
		Fraction obj1 = new Fraction(); //referencing a fraction object 
		obj1.setNumerator(3);  // setting the values of the variables
		obj1.setDenominator(5);
		Fraction obj2 = new Fraction(1,4); // referencing and setting the value in one go
		
		//calling the methods
		obj2.add(obj1);
		obj2.sub(obj1);
		obj2.multiplication(obj1);
		obj2.division(obj1);
		
		
	}
}
