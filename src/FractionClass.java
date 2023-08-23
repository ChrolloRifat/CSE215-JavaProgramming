public class FractionClass{
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
// Defining the Fraction class
class Fraction {
	// Encapsulated variables
	private int numerator;
	private int denominator;
	
	// Default / no-argument constructor
	public Fraction() {
		
	}
	
	// Two arguments constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// getter methods
	public int getNumerator() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	
	// setter methods
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	//void methods 
	public void add(Fraction fraction) {
		int denominatorMultiple = denominator * fraction.getDenominator();
		int resultNumerator = (denominatorMultiple/denominator) * numerator + (denominatorMultiple/fraction.getDenominator()) * fraction.getNumerator();
		System.out.println(""  + resultNumerator + " / " + denominatorMultiple);
	}
	public void sub(Fraction fraction) {
		int denominatorMultiple = denominator * fraction.getDenominator();
		int resultNumerator = (denominatorMultiple/denominator) * numerator - (denominatorMultiple/fraction.getDenominator()) * fraction.getNumerator();
		System.out.println(""  + resultNumerator + " / " + denominatorMultiple);
	}
	public void multiplication(Fraction fraction) {
		int denominatorMultiple = denominator * fraction.getDenominator();
		int resultNumerator = numerator * fraction.getNumerator();
		System.out.println(""  + resultNumerator + " / " + denominatorMultiple);
	}
	public void division(Fraction fraction) {
		int denominatorMultiple = denominator * fraction.getNumerator();
		int resultNumerator = numerator * fraction.getDenominator();
		System.out.println(""  + resultNumerator + " / " + denominatorMultiple);
	}
	
	// toString method to print the output just the way I want it
	public String toString() {
		return "" + this.getNumerator() + " / " + this.getDenominator();
	}
}

